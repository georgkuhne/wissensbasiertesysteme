package hs.merseburg.miks13.wbs.gui.regel;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import wissensbasismodel.Bauteil;

public class ContainerTableviewerRegelPraemisse {
	private TableViewer viewer;
	private long wbsID;
	private Table table;

	public ContainerTableviewerRegelPraemisse(Composite parent, long wbsID) {
		viewer = new TableViewer(parent);
		table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		this.wbsID = wbsID;
		createColumns();
	}

	private void createColumns() {
		TableViewerColumn col = createTableViewerColumn("OP", 50, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Bauteil wb = (Bauteil) element;
				return "" + wb.getID();

			}
		});
		col = createTableViewerColumn("(", 20, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Bauteil wb = (Bauteil) element;
				return "" + wb.getID();

			}
		});

		col = createTableViewerColumn("OP", 50, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Bauteil wb = (Bauteil) element;
				return "" + wb.getID();

			}
		});
		col = createTableViewerColumn("NOT", 50, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Bauteil wb = (Bauteil) element;
				return "" + wb.getID();

			}
		});

		col = createTableViewerColumn("Aussage", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Bauteil wb = (Bauteil) element;
				return "" + wb.getID();

			}
		});
		col = createTableViewerColumn("OP", 50, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Bauteil wb = (Bauteil) element;
				return "" + wb.getID();

			}
		});

		col = createTableViewerColumn("Wert", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Bauteil wb = (Bauteil) element;
				return "" + wb.getID();

			}
		});

		col = createTableViewerColumn(")", 20, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Bauteil wb = (Bauteil) element;
				return "" + wb.getID();

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

	public static enum Value {
		value1, value2, value3;
	}

	public final class ExampleEditingSupport extends EditingSupport {

		private ComboBoxViewerCellEditor cellEditor = null;

		private ExampleEditingSupport(ColumnViewer viewer) {
			super(viewer);
			cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer()
					.getControl(), SWT.READ_ONLY);
			cellEditor.setLabelProvider(new LabelProvider());
			cellEditor.setContenProvider(new ArrayContentProvider());
			cellEditor.setInput(Value.values());
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			return cellEditor;
		}

		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		@Override
		protected Object getValue(Object element) {

			return Value.value1;

		}

		@Override
		protected void setValue(Object element, Object value) {

		}

	}

	// For TESTING
	public static void main(String[] args) {
		Display d = new Display();
		Shell s = new Shell(d, SWT.DEFAULT);
		s.open();
		DialogCreateNewRule dialog = new DialogCreateNewRule(s, 1l);
		dialog.open();
		s.close();
		while (!s.isDisposed()) {
			if (!d.readAndDispatch())
				d.sleep();
		}
		d.dispose();
	}

}
