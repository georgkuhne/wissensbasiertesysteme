package hs.merseburg.miks13.wbs.gui;

import hs.merseburg.miks12.wbs.persistence.db.PersistenceUtility;
import hs.merseburg.miks12.wbs.persistence.dialog.NewDatabaseDialog;
import hs.merseburg.miks13.wbs.MainView;

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

import wissensbasismodel.WissensBasis;
import wissensbasismodel.WissensbasismodelFactory;

public class CompositeBrowseWBS extends Composite {
	MainView mainView;
	private TableViewer viewer;
	private Table table;
	private Button b_open;
	private Button b_new;

	public CompositeBrowseWBS(Composite parent, int style, MainView mainView1) {
		super(parent, style);
		// define the TableViewer
		viewer = new TableViewer(this, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL
				| SWT.FULL_SELECTION | SWT.BORDER);

		// create the columns
		// not yet implemented
		createColumns(viewer);
		this.setLayout(new FormLayout());
		table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		Composite c_buttons = new Composite(this, SWT.None);
		c_buttons.setLayout(new RowLayout(SWT.HORIZONTAL));
		b_open = new Button(c_buttons, SWT.None);
		b_open.setText("Open");
		b_new = new Button(c_buttons, SWT.None);
		b_new.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				createNewWBS();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
			}
		});
		b_new.setText("New");
		FormData fdviewer = new FormData();
		fdviewer.top = new FormAttachment(0);
		fdviewer.bottom = new FormAttachment(100);
		fdviewer.left = new FormAttachment(0);
		fdviewer.right = new FormAttachment(70);

		FormData fdbutton = new FormData();
		fdbutton.top = new FormAttachment(0);
		fdbutton.bottom = new FormAttachment(100);
		fdbutton.left = new FormAttachment(table);
		fdbutton.right = new FormAttachment(100);
		table.setLayoutData(fdviewer);
		c_buttons.setLayoutData(fdbutton);

	}

	protected void createNewWBS() {
		DiaLogCreateNewWBS dialog = new DiaLogCreateNewWBS();
		if (dialog.open() == NewDatabaseDialog.OK) {
			String wmname=dialog.getWBSName();
		WissensBasis wissensbasis = WissensbasismodelFactory.eINSTANCE.createWissensBasis();
		wissensbasis.setName(wmname);
		PersistenceUtility.getINSTANCE().save(wissensbasis);
		refreshTable();
		}
	}

	private void createColumns(TableViewer viewer) {
		TableViewerColumn col = createTableViewerColumn("ID", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				WissensBasis wb = (WissensBasis) element;
				return "" + wb.getID();

			}
		});
		col = createTableViewerColumn("Name", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				WissensBasis wb = (WissensBasis) element;
				return wb.getName();

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

	public void refreshTable() {
		List list = PersistenceUtility.getINSTANCE().getAll("WissensBasis",
				null, null);
		viewer.setInput(list);
	}
}
