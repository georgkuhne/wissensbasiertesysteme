package hs.merseburg.miks13.wbs.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class CompositeRules extends Composite {

	private Text T_Name;
	private Text T_Praemisse;
	private Text T_Konklusion;
	private Label L_Name;
	private Label L_Praemisse;
	private Label L_Konklusion;

	public CompositeRules(Composite parent, int style) {
		super(parent, style);

		this.setLayout(new FormLayout());

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

}
