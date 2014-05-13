package hs.merseburg.miks13.wbs.gui;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class DiaLogCreateNewWBS extends MessageDialog{

	private Text tNewWBS;
	private Label tInfo;
	private String wbsName;

	public String getWBSName(){
		return wbsName.trim();
	}
	private DiaLogCreateNewWBS(Shell parentShell, String dialogTitle,
			Image dialogTitleImage, String dialogMessage, int dialogImageType,
			String[] dialogButtonLabels, int defaultIndex) {
		super(parentShell, dialogTitle, dialogTitleImage, dialogMessage,
				dialogImageType, dialogButtonLabels, defaultIndex);
		// TODO Auto-generated constructor stub
	}
	
	public DiaLogCreateNewWBS(){
		super(Display.getCurrent().getActiveShell(), "Create New WBS", null, "Create New WBS",
				0, new String[] { IDialogConstants.OK_LABEL,
						IDialogConstants.CANCEL_LABEL }, 0);
		
	}
@Override
public void create() {
	super.create();
	checkWBSName();
	
}
	@Override
	protected Control createCustomArea(Composite parent) {
		GridData gd = new GridData();

		Label lNewDbName = new Label(parent, SWT.NONE);
		lNewDbName.setText("Wissensbasis Name");
		lNewDbName.setLayoutData(gd);

		gd = new GridData(GridData.FILL_HORIZONTAL);

		tNewWBS = new Text(parent, SWT.BORDER);
		tNewWBS.setLayoutData(gd);
		tNewWBS.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				checkWBSName();
			}
		});

		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;

		

		tInfo = new Label(parent, SWT.NONE);
		tInfo.setForeground(ColorConstants.red);
		tInfo.setLayoutData(gd);
		return super.createCustomArea(parent);

	}
	
	
	private void checkWBSName() {
		String sNewDbName = tNewWBS.getText();
		

		if (sNewDbName.length() == 0) {
			tInfo
					.setText("The knowkedgebase name must not be empty! Choose a database name.");
			tInfo.pack();
			getButton(OK).setEnabled(false);
			return;
		} else if (sNewDbName.startsWith(" ")) { //$NON-NLS-1$
			tInfo
					.setText("The knowkedgebase name must not be empty! Choose a database name.");
			tInfo.pack();
			getButton(OK).setEnabled(false);
			return;
		}
		getButton(OK).setEnabled(true);
		wbsName=tNewWBS.getText();
}
	}
