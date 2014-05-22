package hs.merseburg.miks13.wbs.gui;

import hs.merseburg.miks12.wbs.persistence.db.PersistenceUtility;
import hs.merseburg.miks13.wbs.gui.aussage.DialogCreateNewAussage;
import hs.merseburg.miks13.wbs.gui.aussage.DialogEditAussage;

import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
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

import wissensbasismodel.Aussage;
import wissensbasismodel.WissensBasis;

public class CompositeStatement extends Composite implements GlobalEditActions {

	long wbsID;
	private TableViewer viewer;
	private Table table;
	private Button b_new, b_edit;

	public CompositeStatement(Composite parent, int style) {
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
		b_new.setText("Anlegen");
		b_edit.setText("Bearbeiten");
		b_edit.setEnabled(false);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection S = (IStructuredSelection) viewer
						.getSelection();
				if (S.getFirstElement() != null) {
					b_edit.setEnabled(true);
				} else {
					b_edit.setEnabled(false);
				}
			}
		});

		b_new.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				createnewStatement();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		b_edit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				editSelectedStatement();
			}
		});

	}

	protected void editSelectedStatement() {
		IStructuredSelection s = (IStructuredSelection) viewer.getSelection();
		Aussage aussage = (Aussage) s.getFirstElement();
		Session session = PersistenceUtility.getINSTANCE().createSession();
		DialogEditAussage dialog = new DialogEditAussage(Display.getCurrent()
				.getActiveShell(), aussage.getID(), session);
		if (dialog.open() == Dialog.OK) {
			refreshTable();
		}
		session.close();
	}

	public void refreshTable() {
		Session session = PersistenceUtility.getINSTANCE().createSession();
		WissensBasis wb = PersistenceUtility
				.getWissensBasisById(wbsID, session);
		List list = wb.getAussagen();
		viewer.setInput(list);
		session.close();
	}

	private void createColumns(TableViewer viewer) {
		TableViewerColumn col = createTableViewerColumn("ID", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Aussage wb = (Aussage) element;
				return "" + wb.getID();

			}
		});

		col = createTableViewerColumn("Name", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Aussage wb = (Aussage) element;
				return wb.getName();

			}
		});

		col = createTableViewerColumn("Fragetext", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Aussage wb = (Aussage) element;
				return wb.getFragetext();

			}
		});
		col = createTableViewerColumn("Diagnosetext", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Aussage wb = (Aussage) element;
				return wb.getDiagnosetext();

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

	public void save() {
		System.err.println("Statements Saved");
		refreshTable();
	}

	private void createnewStatement() {

		DialogCreateNewAussage dialog = new DialogCreateNewAussage(Display
				.getCurrent().getActiveShell(), wbsID);
		if (dialog.open() == DialogCreateNewAussage.OK) {
			refreshTable();
		}
	}

	@Override
	public void setWBSID(long wbsID) {
		this.wbsID = wbsID;
		refreshTable();
	}
}
