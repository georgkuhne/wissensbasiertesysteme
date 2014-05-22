package hs.merseburg.miks13.wbs.gui.aussage;

import hs.merseburg.miks12.wbs.persistence.db.PersistenceUtility;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.hibernate.Session;

import wissensbasismodel.Aussage;
import wissensbasismodel.WertebereichTyp;

public class DialogEditAussage extends Dialog {
	private Text text_Name;
	private Text text_Fragetext;
	private Text text_Diagnose;
	private long IDAussage;
	private StyledText styledText;
	private Combo combo;
	private Session session;
	private Aussage aussage;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 * @param session
	 */
	public DialogEditAussage(Shell parentShell, long IDAussage, Session session) {
		super(parentShell);
		this.IDAussage = IDAussage;
		this.session = session;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());

		Composite compTop = new Composite(container, SWT.NONE);
		compTop.setLayout(new FillLayout(SWT.HORIZONTAL));
		FormData fd_compTop = new FormData();
		fd_compTop.left = new FormAttachment(0);
		fd_compTop.right = new FormAttachment(100);
		fd_compTop.height = 30;

		compTop.setLayoutData(fd_compTop);

		Composite compleft = new Composite(container, SWT.NONE);
		compleft.setLayout(new GridLayout(2, true));
		FormData fd_compleft = new FormData();
		fd_compleft.right = new FormAttachment(compTop, 0, SWT.RIGHT);
		fd_compleft.top = new FormAttachment(compTop);
		fd_compleft.height = 150;
		fd_compleft.left = new FormAttachment(0);
		compleft.setLayoutData(fd_compleft);

		Group grpWertebereich = new Group(container, SWT.NONE);
		grpWertebereich.setText("Wertebereich");
		FormData fd_grpWertebereich = new FormData();
		fd_grpWertebereich.left = new FormAttachment(0);
		fd_grpWertebereich.top = new FormAttachment(compleft);
		fd_grpWertebereich.right = new FormAttachment(100);
		fd_grpWertebereich.bottom = new FormAttachment(100);

		Label lblErstellenSieEine = new Label(compTop, SWT.NONE);
		lblErstellenSieEine.setAlignment(SWT.CENTER);
		lblErstellenSieEine
				.setText("Erstellen Sie eine Aussage und speichern Sie diese durch Bet\u00E4tigen des \"OK\"-Buttons.");
		fd_grpWertebereich.right = new FormAttachment(100, -10);

		Label lblName = new Label(compleft, SWT.NONE);
		lblName.setFont(SWTResourceManager.getFont("Tahoma", 11, SWT.BOLD));
		lblName.setLayoutData(new GridData(SWT.LEFT, SWT.LEFT, false, false, 1,
				1));
		lblName.setText("Name:");

		text_Name = new Text(compleft, SWT.BORDER);
		GridData gd_text_Name = new GridData(GridData.FILL);
		gd_text_Name.horizontalAlignment = SWT.FILL;
		gd_text_Name.grabExcessHorizontalSpace = true;
		text_Name.setLayoutData(gd_text_Name);

		Label lblFragetext = new Label(compleft, SWT.NONE);
		lblFragetext.setText("Fragetext:");
		lblFragetext
				.setFont(SWTResourceManager.getFont("Tahoma", 11, SWT.BOLD));
		text_Fragetext = new Text(compleft, SWT.BORDER);
		text_Fragetext.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		Label labelDiagnosetext = new Label(compleft, SWT.NONE);
		labelDiagnosetext.setText("Diagnosetext:");
		labelDiagnosetext.setFont(SWTResourceManager.getFont("Tahoma", 11,
				SWT.BOLD));

		text_Diagnose = new Text(compleft, SWT.BORDER);
		text_Diagnose.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		Label lblWertebereich = new Label(compleft, SWT.NONE);
		lblWertebereich.setText("Wertebereich:");
		lblWertebereich.setFont(SWTResourceManager.getFont("Tahoma", 11,
				SWT.BOLD));

		combo = new Combo(compleft, SWT.NONE);
		GridData gdcombo = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gdcombo.widthHint = 100;
		combo.setLayoutData(gdcombo);

		grpWertebereich.setLayout(new FormLayout());
		fd_grpWertebereich.bottom = new FormAttachment(100, -10);
		grpWertebereich.setLayoutData(fd_grpWertebereich);
		Label lblGebenSieDen = new Label(grpWertebereich, SWT.NONE);
		FormData fd_lblGebenSieDen = new FormData();
		fd_lblGebenSieDen.top = new FormAttachment(0);
		fd_lblGebenSieDen.height = 20;
		fd_lblGebenSieDen.right = new FormAttachment(100);
		lblGebenSieDen.setLayoutData(fd_lblGebenSieDen);
		lblGebenSieDen
				.setText("Geben Sie den Wertebereich als Liste von Strings ein. Trennen Sie die Elemente mit einen \",\" (Komma )");

		styledText = new StyledText(grpWertebereich, SWT.BORDER);
		FormData fd_styledText = new FormData();
		fd_styledText.bottom = new FormAttachment(100);
		fd_styledText.right = new FormAttachment(100, -3);
		fd_styledText.top = new FormAttachment(lblGebenSieDen);
		fd_styledText.left = new FormAttachment(0);
		styledText.setLayoutData(fd_styledText);

		container.layout();

		combo.add("bool", 0);
		combo.add("integer", 1);
		combo.add("real", 2);
		combo.add("list", 3);
		combo.pack();
		combo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (combo.getSelectionIndex() == 3) {
					styledText.setEditable(true);
					Color bg = Display.getDefault().getSystemColor(
							SWT.COLOR_WHITE);
					styledText.setBackground(bg);
				} else {
					styledText.setEditable(false);
					Color bg = Display.getDefault().getSystemColor(
							SWT.COLOR_GRAY);
					styledText.setBackground(bg);
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		init();
		return container;

	}

	private void init() {
		aussage = PersistenceUtility.getAussageByID(IDAussage, session);
		text_Diagnose.setText(aussage.getDiagnosetext());
		text_Fragetext.setText(aussage.getFragetext());
		text_Name.setText(aussage.getName());

		if (!aussage.getListWertebereich().isEmpty()) {
			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < aussage.getListWertebereich().size(); i++) {
				String wbwert = aussage.getListWertebereich().get(i);
				buffer.append(wbwert);
				if (i < aussage.getListWertebereich().size() - 1)
					buffer.append(",");

			}
			styledText.setText(buffer.toString());
		}
		combo.select(aussage.getWertebereich().getValue());
		aussage.setWertebereich(WertebereichTyp.STRINGLIST);

		if (combo.getSelectionIndex() == 3) {
			styledText.setEditable(true);
			Color bg = Display.getDefault().getSystemColor(SWT.COLOR_WHITE);
			styledText.setBackground(bg);
		} else {
			styledText.setEditable(false);
			Color bg = Display.getDefault().getSystemColor(SWT.COLOR_GRAY);
			styledText.setBackground(bg);
		}

	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	@Override
	protected void okPressed() {
		if (validateInput()) {
			save();
			super.okPressed();
		}
	}

	private void save() {

		String Name = text_Name.getText().trim();
		String FrageText = text_Fragetext.getText().trim();
		String DiagnoseText = text_Diagnose.getText().trim();
		String Wertebereich = combo.getText().trim();
		aussage.getListWertebereich().clear();
		switch (combo.getSelectionIndex()) {
		case 0:
			aussage.setWertebereich(WertebereichTyp.BOOLEAN);
			break;
		case 1:
			aussage.setWertebereich(WertebereichTyp.INTEGER);
			break;
		case 2:
			aussage.setWertebereich(WertebereichTyp.REAL);
			break;

		case 3:
			aussage.setWertebereich(WertebereichTyp.STRINGLIST);
			String s = styledText.getText();
			String stringarray[] = s.split(",");
			for (int i = 0; i < stringarray.length; i++) {
				aussage.getListWertebereich().add(stringarray[i]);
			}
			break;
		default:
			break;
		}
		aussage.setName(Name);
		aussage.setFragetext(FrageText);
		aussage.setDiagnosetext(DiagnoseText);
		session.flush();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean validateInput() {
		return true;
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(741, 664);
	}
}
