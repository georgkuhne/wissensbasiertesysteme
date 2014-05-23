package hs.merseburg.miks13.wbs.gui;

import hs.merseburg.miks12.wbs.persistence.db.PersistenceUtility;
import hs.merseburg.miks13.wbs.gui.aussage.DialogCreateNewAussage;
import hs.merseburg.miks13.wbs.gui.regel.DialogCreateNewRule;

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
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

import wissensbasismodel.Regel;

public class CompositeRules extends Composite implements GlobalEditActions {

	private TableViewer viewer;
	private Table table;
	private Button b_new, b_edit;
	private long wbsID;

	public CompositeRules(Composite parent, int style) {
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
		b_new.setText("Anlegen");
		b_edit.setText("Bearbeiten");
		b_edit.setEnabled(false);

		table.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				b_edit.setEnabled(true);

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		b_new.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				createnewRule();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
	}

	public void refreshTable() {
		List list = PersistenceUtility.getINSTANCE()
				.getAll("Regel", null, null);
		viewer.setInput(list);
	}

	private void createColumns(TableViewer viewer) {
		TableViewerColumn col = createTableViewerColumn("ID", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Regel wb = (Regel) element;
				return "" + wb.getID();

			}
		});

		col = createTableViewerColumn("Name", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Regel wb = (Regel) element;
				return wb.getName();

			}
		});

		col = createTableViewerColumn("Praemisse", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Regel wb = (Regel) element;
				return wb.getPreamisse();

			}
		});
		col = createTableViewerColumn("Konklusion", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Regel wb = (Regel) element;
				return wb.getKonklusion();

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
		System.err.println("Rules Saved");

		// String Name = T_Name.getText().trim();
		// String Praemisse = T_Praemisse.getText().trim();
		// String Konklusion = T_Konklusion.getText().trim();
		//
		// WissensbasismodelFactory wb = WissensbasismodelFactory.eINSTANCE;
		// Regel regel = wb.createRegel();
		// regel.setName(Name);
		// regel.setKonklusion(Konklusion);
		// regel.setPreamisse(Praemisse);
		//
		// PersistenceUtility.getINSTANCE().save(regel);
		//
		// refreshTable();

	}

	@Override
	public void setWBSID(long wbsID) {
		this.wbsID = wbsID;
		refreshTable();

	}

	private void createnewRule() {
		DialogCreateNewRule dialog = new DialogCreateNewRule(Display
				.getCurrent().getActiveShell(), wbsID);
		if (dialog.open() == DialogCreateNewAussage.OK) {
			refreshTable();
		}
	}

}
