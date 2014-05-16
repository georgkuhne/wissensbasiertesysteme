package hs.merseburg.miks13.wbs.gui;

import hs.merseburg.miks12.wbs.persistence.db.PersistenceUtility;

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import wissensbasismodel.Bauteil;
import wissensbasismodel.Regel;
import wissensbasismodel.WissensbasismodelFactory;

public class CompositeRules extends Composite implements GlobalEditActions {

	private Text T_Name;
	private Text T_Praemisse;
	private Text T_Konklusion;
	private Label L_Name;
	private Label L_Praemisse;
	private Label L_Konklusion;
	private TableViewer viewer;
	private Table table;

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

		// Initialisieren der Elemente und Zuweisung zu einem vertikalen Layout
		Composite c_Label = new Composite(this, SWT.None);
		c_Label.setLayout(new RowLayout(SWT.VERTICAL));
		L_Name = new Label(c_Label, SWT.None);
		L_Praemisse = new Label(c_Label, SWT.None);
		L_Konklusion = new Label(c_Label, SWT.None);
		Composite c_Text = new Composite(this, SWT.None);
		c_Text.setLayout(new RowLayout(SWT.VERTICAL));
		T_Name = new Text(c_Text, SWT.None);
		T_Praemisse = new Text(c_Text, SWT.None);
		T_Konklusion = new Text(c_Text, SWT.None);

		// Setzen der Labeltexte
		L_Name.setText("Name: ");
		L_Praemisse.setText("Prämisse: ");
		L_Konklusion.setText("Konklusion: ");

		// Erstellen von FormData zum besseren Anordnen der Elementgruppen
		FormData fdlabels = new FormData();
		fdlabels.top = new FormAttachment(5);
		fdlabels.bottom = new FormAttachment(50);
		fdlabels.left = new FormAttachment(5);
		fdlabels.right = new FormAttachment(30);
		c_Label.setLayoutData(fdlabels);
		
		FormData fdtext = new FormData();
		fdtext.top = new FormAttachment(5);
		fdtext.bottom = new FormAttachment(50);
		fdtext.left = new FormAttachment(c_Label);
		fdtext.right = new FormAttachment(100);
		c_Text.setLayoutData(fdtext);
		
		FormData fdviewer = new FormData();
		fdviewer.top = new FormAttachment(60);
		fdviewer.bottom = new FormAttachment(100);
		fdviewer.left = new FormAttachment(0);
		fdviewer.right = new FormAttachment(100);
		table.setLayoutData(fdviewer);
		refreshTable();
	}

	public void refreshTable() {
		List list = PersistenceUtility.getINSTANCE().getAll("Regel",
				null, null);
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

	@Override
	public void save() {
		System.err.println("Rules Saved");
		
		String Name = T_Name.getText().trim();
		String Praemisse = T_Praemisse.getText().trim();
		String Konklusion = T_Konklusion.getText().trim();
					
		WissensbasismodelFactory wb = WissensbasismodelFactory.eINSTANCE;
		Regel regel = wb.createRegel();
		regel.setName(Name);
		regel.setKonklusion(Konklusion);
		regel.setPreamisse(Praemisse);
				
		PersistenceUtility.getINSTANCE().save(regel);
		
		refreshTable();

	}

}
