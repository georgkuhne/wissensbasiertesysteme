package hs.merseburg.miks13.wbs.gui;

import hs.merseburg.miks12.wbs.persistence.db.PersistenceUtility;
import hs.merseburg.miks13.wbs.gui.regelgruppe.DialogCreateNewRuleGroup;
import hs.merseburg.miks13.wbs.gui.regelgruppe.DialogEditRuleGroup;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.hibernate.Session;

import wissensbasismodel.Regel;
import wissensbasismodel.Regelgruppe;

public class CompositeRuleGroup extends Composite {

	private long wbsID;
	private static TableViewer viewer;
	private Table table;
	private Button b_new, b_edit, b_delete;

	public CompositeRuleGroup(Composite parent, int style) {
		super(parent, style);
		this.setLayout(new FormLayout());

		viewer = new TableViewer(this, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL
				| SWT.FULL_SELECTION | SWT.BORDER);
		table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		createColumns(viewer);

		FormData fdviewer = new FormData();
		fdviewer.top = new FormAttachment(0);
		fdviewer.bottom = new FormAttachment(100);
		fdviewer.left = new FormAttachment(0);
		fdviewer.right = new FormAttachment(90);
		table.setLayoutData(fdviewer);
		refreshTable();

		FormData fdButtons = new FormData();
		fdButtons.top = new FormAttachment(0);
		fdButtons.bottom = new FormAttachment(100);
		fdButtons.left = new FormAttachment(table);
		fdButtons.right = new FormAttachment(100);

		Composite cbuttons = new Composite(this, SWT.None);
		cbuttons.setLayoutData(fdButtons);
		cbuttons.setLayout(new RowLayout(SWT.HORIZONTAL));
		b_new = new Button(cbuttons, SWT.PUSH);
		b_edit = new Button(cbuttons, SWT.None);
		b_delete = new Button(cbuttons, SWT.None);
		b_delete.setText("Löschen");
		b_new.setText("Anlegen");
		b_edit.setText("Bearbeiten");
		b_edit.setEnabled(false);
		b_delete.setEnabled(false);

		table.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				b_edit.setEnabled(true);
				b_delete.setEnabled(true);

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		b_new.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				createnewRuleGroup();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		b_delete.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				deleteRulegroup();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		b_edit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				editRuleGroup();
			}
		});
		refreshTable();
	}

	protected void editRuleGroup() {
		ISelection selected = viewer.getSelection();
		StructuredSelection structuredSelection = (StructuredSelection) selected;

		Regelgruppe regelgruppe = ((Regelgruppe) structuredSelection
				.getFirstElement());

		DialogEditRuleGroup dialog = new DialogEditRuleGroup(Display
				.getCurrent().getActiveShell(), wbsID, regelgruppe);
		if (dialog.open() == DialogEditRuleGroup.OK)
			refreshTable();
	}

	public void setWBSID(long wbsid) {
		// TODO Auto-generated method stub
		this.wbsID = wbsid;
		refreshTable();
	}

	static void refreshTable() {
		Session session = PersistenceUtility.getINSTANCE().createSession();
		List list = PersistenceUtility.getAll(session, "Regelgruppe", null,
				null);
		viewer.setInput(list);
		session.close();
	}

	private void createColumns(TableViewer viewer) {
		TableViewerColumn col = createTableViewerColumn("ID", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Regelgruppe rg = (Regelgruppe) element;
				return "" + rg.getID();

			}
		});

		col = createTableViewerColumn("Name", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Regelgruppe rg = (Regelgruppe) element;
				return rg.getName();

			}
		});

		col = createTableViewerColumn("Regeln", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Regelgruppe rg = (Regelgruppe) element;
				EList<Regel> regeln = rg.getRegeln();
				StringBuffer buffer = new StringBuffer();
				for (Iterator iterator = regeln.iterator(); iterator.hasNext();) {
					Regel regel = (Regel) iterator.next();
					buffer.append(regel.getName());
					if (iterator.hasNext())
						buffer.append(", ");
				}
				return buffer.toString();

			}
		});

	}

	private TableViewerColumn createTableViewerColumn(String title, int bound,
			final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
				SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(false);
		column.setMoveable(false);
		return viewerColumn;
	}

	private void createnewRuleGroup() {
		DialogCreateNewRuleGroup dialog = new DialogCreateNewRuleGroup(Display
				.getCurrent().getActiveShell(), wbsID);
		if (dialog.open() == DialogCreateNewRuleGroup.OK) {
			refreshTable();
		}

	}

	private void deleteRulegroup() {
		// TODO Auto-generated method stub
		Session session = PersistenceUtility.getINSTANCE().createSession();
		ISelection selected = viewer.getSelection();
		StructuredSelection structuredSelection = (StructuredSelection) selected;

		Regelgruppe regelgruppe = ((Regelgruppe) structuredSelection
				.getFirstElement());

		PersistenceUtility.deleteRuleGroup(session, regelgruppe);
		session.close();
		refreshTable();
	}

}
