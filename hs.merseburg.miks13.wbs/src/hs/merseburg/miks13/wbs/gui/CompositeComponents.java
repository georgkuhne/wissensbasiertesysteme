package hs.merseburg.miks13.wbs.gui;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

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
		fdlabels.bottom = new FormAttachment(100);
		fdlabels.left = new FormAttachment(5);
		fdlabels.right = new FormAttachment(30);
		c_Label.setLayoutData(fdlabels);
		FormData fdtext = new FormData();
		fdtext.top = new FormAttachment(5);
		fdtext.bottom = new FormAttachment(100);
		fdtext.left = new FormAttachment(c_Label);
		fdtext.right = new FormAttachment(100);
		c_Text.setLayoutData(fdtext);
	}

	@Override
	public void save() {
		System.err.println("Components Saved");

	}
}
