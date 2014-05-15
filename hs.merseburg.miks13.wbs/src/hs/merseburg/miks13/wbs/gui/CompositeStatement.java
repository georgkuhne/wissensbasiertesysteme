package hs.merseburg.miks13.wbs.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class CompositeStatement extends Composite {

	Label L_Name;
	Label L_Wertebereich;
	Label L_Fragetext;
	Label L_Diagnosetext;
	Text T_Name;
	Text T_Wertebereich;
	Text T_Fragetext;
	Text T_Diagnosetext;

	public CompositeStatement(Composite parent, int style) {
		super(parent, style);
		this.setLayout(new FormLayout());

		// Initialisieren der Elemente und Zuweisung zu einem vertikalen Layout
		Composite c_Label = new Composite(this, SWT.None);
		c_Label.setLayout(new RowLayout(SWT.VERTICAL));
		L_Name = new Label(c_Label, SWT.None);
		L_Wertebereich = new Label(c_Label, SWT.None);
		L_Fragetext = new Label(c_Label, SWT.None);
		L_Diagnosetext = new Label(c_Label, SWT.None);
		Composite c_Text = new Composite(this, SWT.None);
		c_Text.setLayout(new RowLayout(SWT.VERTICAL));
		T_Name = new Text(c_Text, SWT.None);
		T_Wertebereich = new Text(c_Text, SWT.None);
		T_Fragetext = new Text(c_Text, SWT.None);
		T_Diagnosetext = new Text(c_Text, SWT.None);

		// Setzen der Labeltexte
		L_Name.setText("Name: ");
		L_Wertebereich.setText("Wertebereich: ");
		L_Fragetext.setText("Fragetext: ");
		L_Diagnosetext.setText("Diagnosetext: ");

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
