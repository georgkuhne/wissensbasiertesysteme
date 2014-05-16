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
import wissensbasismodel.WissensBasis;
import wissensbasismodel.WissensbasismodelFactory;
import wissensbasismodel.impl.BauteilImpl;

public class CompositeComponents extends Composite implements GlobalEditActions {

	private TableViewer viewer;
	private Table table;

	private Text T_Name;
	private Text T_Asset_ID;
	private Text T_ist_Teil_von;
	private Text T_regeln;
	private Text T_regelgruppen;
	private Text T_Koroutine;
	private Text T_medien;

	private Label L_Name;
	private Label L_Asset_ID;
	private Label L_ist_Teil_von;
	private Label L_regeln;
	private Label L_regelgruppen;
	private Label L_Koroutine;
	private Label L_medien;

	public CompositeComponents(Composite parent, int style) {
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
		L_Asset_ID = new Label(c_Label, SWT.None);
		L_ist_Teil_von = new Label(c_Label, SWT.None);
		L_regeln = new Label(c_Label, SWT.None);
		L_regelgruppen = new Label(c_Label, SWT.None);
		L_Koroutine = new Label(c_Label, SWT.None);
		L_medien = new Label(c_Label, SWT.None);
		Composite c_Text = new Composite(this, SWT.None);
		c_Text.setLayout(new RowLayout(SWT.VERTICAL));
		T_Name = new Text(c_Text, SWT.None);
		T_Asset_ID = new Text(c_Text, SWT.None);
		T_ist_Teil_von = new Text(c_Text, SWT.None);
		T_regeln = new Text(c_Text, SWT.None);
		T_regelgruppen = new Text(c_Text, SWT.None);
		T_Koroutine = new Text(c_Text, SWT.None);
		T_medien = new Text(c_Text, SWT.None);

		// Setzen der Labeltexte
		L_Name.setText("Name: ");
		L_Asset_ID.setText("Asset ID: ");
		L_ist_Teil_von.setText("ist Teil von: ");
		L_regeln.setText("Regeln: ");
		L_regelgruppen.setText("Regelgruppen: ");
		L_Koroutine.setText("Koroutine: ");
		L_medien.setText("Medien: ");
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
		List list = PersistenceUtility.getINSTANCE().getAll("Bauteil",
				null, null);
		viewer.setInput(list);
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
		
		col = createTableViewerColumn("Asset ID", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				WissensBasis wb = (WissensBasis) element;
				return wb.getName();

			}
		});
		col = createTableViewerColumn("ist Teil von", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				WissensBasis wb = (WissensBasis) element;
				return wb.getName();

			}
		});
		col = createTableViewerColumn("Regeln", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				WissensBasis wb = (WissensBasis) element;
				return wb.getName();

			}
		});
		col = createTableViewerColumn("Regelgruppen", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				WissensBasis wb = (WissensBasis) element;
				return wb.getName();

			}
		});
		col = createTableViewerColumn("Koroutine", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				WissensBasis wb = (WissensBasis) element;
				return wb.getName();

			}
		});
		col = createTableViewerColumn("Medien", 100, 0);
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

	
	@Override
	public void save() {
		System.err.println("Components Saved");
		
		
		String Name = T_Name.getText().trim();
		String AssetID = T_Asset_ID.getText().trim();
		String istTeil = T_ist_Teil_von.getText().trim();
		String regeln = T_regeln.getText().trim();
		String regelgruppen = T_regelgruppen.getText().trim();
		String koroutine = T_Koroutine.getText().trim();
		String medien = T_medien.getText().trim();
		
		Bauteil bauteil = WissensbasismodelFactory.eINSTANCE.createBauteil();
		bauteil.setName(Name);
		bauteil.setAsset_ID(AssetID);
		bauteil.setIst_Teil_von(istTeil);
		bauteil.setRegeln(regeln);
		bauteil.setRegelgruppen(regelgruppen);
		bauteil.setKoroutine(koroutine);
		bauteil.setMedien(medien);
		
		PersistenceUtility.getINSTANCE().save(bauteil);
		
		refreshTable();
		
//		String wmname = dialog.getWBSName();
//		WissensBasis wissensbasis = WissensbasismodelFactory.eINSTANCE
//				.createWissensBasis();
//		wissensbasis.setName(wmname);
//		PersistenceUtility.getINSTANCE().save(wissensbasis);
//		refreshTable();
		
		
	}
}
