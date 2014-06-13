package hs.merseburg.miks13.wbs.gui.regel;

import java.util.ArrayList;
import java.util.Collection;

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
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import wissensbasismodel.Aussage;
import wissensbasismodel.Literal;
import wissensbasismodel.LiteralOperatorenLogik;
import wissensbasismodel.WertebereichTyp;
import wissensbasismodel.WissensbasismodelFactory;

public class ContainerTableviewerRegelPraemisse {
	private TableViewer viewer;
	private long wbsID;
	private Table table;
	Collection<Aussage> aussagen;
	ArrayList<Literal> literale = new ArrayList<Literal>();

	public ContainerTableviewerRegelPraemisse(Composite parent, long wbsID,
			Collection<Aussage> aussagen) {
		viewer = new TableViewer(parent);
		this.aussagen = aussagen;
		table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		this.wbsID = wbsID;
		createColumns();

	}

	public void createNewLiteral() {
		literale.add(WissensbasismodelFactory.eINSTANCE.createLiteral());
		viewer.setInput(literale);

	}

	public void deleteLiteral() {

	}

	private void createColumns() {
		TableViewerColumn col = createTableViewerColumn("OP", 50, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {

				if (element instanceof Literal) {
					Literal lit = (Literal) element;
					return LiteralRepresentation.getLogikOperatoren()[LiteralRepresentation
							.getIndexOfLogicOperator(lit.getOutLogicOperator())];

				}
				return "";

			}
		});

		col.setEditingSupport(new EdditingSupportOPVorKlammer(viewer));

		col = createTableViewerColumn("(", 20, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof Literal) {
					Literal lit = (Literal) element;
					if (lit.isKlammerAuf())
						return LiteralRepresentation.getKlammerauf()[1];
					return LiteralRepresentation.getKlammerauf()[0];

				}
				return "";
			}
		});
		col.setEditingSupport(new EdditingSupportKlammerAUF(viewer));

		col = createTableViewerColumn("OP", 50, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof Literal) {
					Literal lit = (Literal) element;
					return LiteralRepresentation.getLogikOperatoren()[LiteralRepresentation
							.getIndexOfLogicOperator(lit
									.getInnerLogikOperator())];

				}
				return "";

			}
		});
		col.setEditingSupport(new EdditingSupportOPNachKlammer(viewer));
		col = createTableViewerColumn("NOT", 50, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Literal lit = (Literal) element;
				if (lit.isNOT())
					return LiteralRepresentation.getNegation()[1];
				return LiteralRepresentation.getNegation()[0];
			}
		});
		col.setEditingSupport(new EdditingSupportKlammerNOT(viewer));

		col = createTableViewerColumn("Aussage", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Literal lit = (Literal) element;
				Aussage aussage = lit.getAussage();
				if (aussage == null)
					return "";
				return aussage.getName();

			}
		});
		col.setEditingSupport(new EdditingSupportAussage(viewer));
		col = createTableViewerColumn("OP", 50, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return "";

			}
		});

		col = createTableViewerColumn("Wert", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return "";

			}
		});

		col = createTableViewerColumn(")", 20, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof Literal) {
					Literal lit = (Literal) element;
					if (lit.isKlammerZu())
						return LiteralRepresentation.getKlammerzu()[1];
					return LiteralRepresentation.getKlammerzu()[0];

				}
				return "";

			}
		});
		col.setEditingSupport(new EdditingSupportKlammerZU(viewer));
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

	public final class EdditingSupportOPVorKlammer extends EditingSupport {

		private ComboBoxViewerCellEditor cellEditor = null;

		private EdditingSupportOPVorKlammer(ColumnViewer viewer) {
			super(viewer);
			cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer()
					.getControl(), SWT.READ_ONLY);
			cellEditor.setLabelProvider(new LabelProvider());
			cellEditor.setContenProvider(new ArrayContentProvider());
			cellEditor.setInput(LiteralRepresentation.getLogikOperatoren());
			cellEditor.getControl().pack();

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
			Literal lit;
			if (element instanceof Literal) {
				lit = (Literal) element;
				LiteralOperatorenLogik op = lit.getOutLogicOperator();
				return LiteralRepresentation.getIndexOfLogicOperator(op);
			}
			return 1;

		}

		@Override
		protected void setValue(Object element, Object value) {
			if (element instanceof Literal) {
				Literal lit = (Literal) element;
				String v = (String) value;
				LiteralOperatorenLogik newop = LiteralRepresentation
						.getLogicOperatorByName(v);
				lit.setOutLogicOperator(newop);
				viewer.refresh();
			}
		}

	}

	public final class EdditingSupportOPNachKlammer extends EditingSupport {

		private ComboBoxViewerCellEditor cellEditor = null;

		private EdditingSupportOPNachKlammer(ColumnViewer viewer) {
			super(viewer);
			cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer()
					.getControl(), SWT.READ_ONLY);
			cellEditor.setLabelProvider(new LabelProvider());
			cellEditor.setContenProvider(new ArrayContentProvider());
			cellEditor.setInput(LiteralRepresentation.getLogikOperatoren());
			cellEditor.getControl().pack();

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
			Literal lit;
			if (element instanceof Literal) {
				lit = (Literal) element;
				LiteralOperatorenLogik op = lit.getInnerLogikOperator();
				return LiteralRepresentation.getIndexOfLogicOperator(op);
			}
			return 1;

		}

		@Override
		protected void setValue(Object element, Object value) {
			if (element instanceof Literal) {
				Literal lit = (Literal) element;
				String v = (String) value;
				LiteralOperatorenLogik newop = LiteralRepresentation
						.getLogicOperatorByName(v);
				lit.setInnerLogikOperator(newop);
				viewer.refresh();
			}
		}

	}

	public final class EdditingSupportKlammerAUF extends EditingSupport {

		private ComboBoxViewerCellEditor cellEditor = null;

		private EdditingSupportKlammerAUF(ColumnViewer viewer) {
			super(viewer);
			cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer()
					.getControl(), SWT.READ_ONLY);
			cellEditor.setLabelProvider(new LabelProvider());
			cellEditor.setContenProvider(new ArrayContentProvider());
			cellEditor.setInput(LiteralRepresentation.getKlammerauf());
			cellEditor.getControl().pack();

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
			Literal lit;
			if (element instanceof Literal) {
				lit = (Literal) element;
				if (lit.isKlammerAuf())
					return 1;
				return 0;
			}
			return 0;

		}

		@Override
		protected void setValue(Object element, Object value) {
			if (element instanceof Literal) {
				Literal lit = (Literal) element;
				String v = (String) value;

				boolean klammerauf = LiteralRepresentation
						.getLogicKlammeraufByName(v);
				if (klammerauf != lit.isKlammerAuf()) {
					lit.setKlammerAuf(klammerauf);
					viewer.refresh();
				}
			}
		}

	}

	public final class EdditingSupportKlammerZU extends EditingSupport {

		private ComboBoxViewerCellEditor cellEditor = null;

		private EdditingSupportKlammerZU(ColumnViewer viewer) {
			super(viewer);
			cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer()
					.getControl(), SWT.READ_ONLY);
			cellEditor.setLabelProvider(new LabelProvider());
			cellEditor.setContenProvider(new ArrayContentProvider());
			cellEditor.setInput(LiteralRepresentation.getKlammerzu());
			cellEditor.getControl().pack();

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
			Literal lit;
			if (element instanceof Literal) {
				lit = (Literal) element;
				if (lit.isKlammerZu())
					return 1;
				return 0;
			}
			return 0;

		}

		@Override
		protected void setValue(Object element, Object value) {
			if (element instanceof Literal) {
				Literal lit = (Literal) element;
				String v = (String) value;

				boolean klammerzu = LiteralRepresentation
						.getLogicKlammerZUByName(v);
				if (klammerzu != lit.isKlammerZu()) {
					lit.setKlammerZu(klammerzu);
					viewer.refresh();
				}
			}
		}

	}

	public final class EdditingSupportKlammerNOT extends EditingSupport {

		private ComboBoxViewerCellEditor cellEditor = null;

		private EdditingSupportKlammerNOT(ColumnViewer viewer) {
			super(viewer);
			cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer()
					.getControl(), SWT.READ_ONLY);
			cellEditor.setLabelProvider(new LabelProvider());
			cellEditor.setContenProvider(new ArrayContentProvider());
			cellEditor.setInput(LiteralRepresentation.getNegation());
			cellEditor.getControl().pack();

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
			Literal lit;
			if (element instanceof Literal) {
				lit = (Literal) element;
				if (lit.isNOT())
					return 1;
				return 0;
			}
			return 0;

		}

		@Override
		protected void setValue(Object element, Object value) {
			if (element instanceof Literal) {
				Literal lit = (Literal) element;
				String va = (String) value;

				boolean not = LiteralRepresentation.getNOTByName(va);
				if (not != lit.isNOT()) {
					lit.setNOT(not);
					viewer.refresh();
				}
			}
		}

	}

	public final class EdditingSupportAussage extends EditingSupport {

		private ComboBoxViewerCellEditor cellEditor = null;

		private EdditingSupportAussage(ColumnViewer viewer) {
			super(viewer);
			cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer()
					.getControl(), SWT.READ_ONLY);
			cellEditor.setLabelProvider(new LabelProvider() {
				@Override
				public String getText(Object element) {
					if (element == null)
						return "";
					Aussage aussage = (Aussage) element;
					return aussage.getName();
				}
			});
			cellEditor.setContenProvider(new ArrayContentProvider());
			cellEditor.setInput(aussagen);
			cellEditor.getControl().pack();

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
			Literal lit;
			if (element instanceof Literal) {
				lit = (Literal) element;
				return lit.getAussage();
			}
			return null;

		}

		@Override
		protected void setValue(Object element, Object value) {
			if (element instanceof Literal) {
				Literal lit = (Literal) element;
				Aussage v = (Aussage) value;
				lit.setAussage(v);
				viewer.refresh();
			}
		}

	}

	// For TESTING
	public static void main(String[] args) {

		ArrayList<Aussage> testaussagen = new ArrayList<Aussage>();
		Aussage aussage1 = WissensbasismodelFactory.eINSTANCE.createAussage();
		aussage1.setName("BooleanAussage");
		aussage1.setWertebereich(WertebereichTyp.BOOLEAN);
		testaussagen.add(aussage1);
		aussage1 = WissensbasismodelFactory.eINSTANCE.createAussage();
		aussage1.setName("Custom Aussage");
		aussage1.setWertebereich(WertebereichTyp.STRINGLIST);
		aussage1.getListWertebereich().add("wert1");
		aussage1.getListWertebereich().add("wert2");
		testaussagen.add(aussage1);
		aussage1 = WissensbasismodelFactory.eINSTANCE.createAussage();
		aussage1.setName("IntegerAussage");
		aussage1.setWertebereich(WertebereichTyp.INTEGER);
		testaussagen.add(aussage1);
		aussage1 = WissensbasismodelFactory.eINSTANCE.createAussage();
		aussage1.setName("REALAussage");
		aussage1.setWertebereich(WertebereichTyp.REAL);

		testaussagen.add(aussage1);

		Display d = new Display();

		Shell s = new Shell(d, SWT.DEFAULT);

		s.setLayout(new FillLayout());
		ContainerTableviewerRegelPraemisse container = new ContainerTableviewerRegelPraemisse(
				s, 0, testaussagen);

		s.open();
		container.createNewLiteral();
		while (!s.isDisposed()) {
			if (!d.readAndDispatch())
				d.sleep();
		}
		d.dispose();
	}

}
