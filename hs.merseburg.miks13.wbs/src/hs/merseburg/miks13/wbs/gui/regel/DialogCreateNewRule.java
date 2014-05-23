package hs.merseburg.miks13.wbs.gui.regel;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class DialogCreateNewRule extends Dialog {
	private Text text;
	private Long wbsID;
	private ContainerTableviewerRegelPraemisse praemisseContainer;
	private long wbsId;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public DialogCreateNewRule(Shell parentShell, Long WBSID) {
		super(parentShell);
		setShellStyle(SWT.BORDER | SWT.RESIZE | SWT.TITLE);
		wbsID = WBSID;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(2, true));

		Label lblName = new Label(container, SWT.NONE);
		GridData gd_lblName = new GridData(SWT.LEFT, SWT.CENTER, false, false,
				1, 1);
		gd_lblName.widthHint = 303;
		lblName.setLayoutData(gd_lblName);
		lblName.setText("Name:");

		text = new Text(container, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Group groupkonklusion = new Group(container, SWT.NONE);
		groupkonklusion.setText("Konklusion:");
		groupkonklusion.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupkonklusion = new GridData(SWT.FILL, SWT.CENTER, false,
				false, 2, 1);
		gd_groupkonklusion.heightHint = 100;
		groupkonklusion.setLayoutData(gd_groupkonklusion);

		TabFolder tabFolder = new TabFolder(groupkonklusion, SWT.NONE);

		TabItem tbtmLiteral = new TabItem(tabFolder, SWT.NONE);
		tbtmLiteral.setText("Literal");

		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmLiteral.setControl(composite_1);
		composite_1.setLayout(new GridLayout(4, false));

		Label lblPraefix = new Label(composite_1, SWT.NONE);
		lblPraefix.setText("Pr\u00E4fix:");

		Label lblAussage_1 = new Label(composite_1, SWT.NONE);
		lblAussage_1.setText("Aussage:");

		Label lblOperator = new Label(composite_1, SWT.NONE);
		lblOperator.setText("Operator:");

		Label lblWert = new Label(composite_1, SWT.NONE);
		lblWert.setText("Wert:");

		Combo combo_1 = new Combo(composite_1, SWT.NONE);
		combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		Combo combo_2 = new Combo(composite_1, SWT.NONE);
		combo_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		Combo combo_3 = new Combo(composite_1, SWT.NONE);
		combo_3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		Combo combo_4 = new Combo(composite_1, SWT.NONE);
		combo_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		TabItem tbtmDiagnosausgabe = new TabItem(tabFolder, SWT.NONE);
		tbtmDiagnosausgabe.setText("Diagnoseausgabe");

		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmDiagnosausgabe.setControl(composite);
		composite.setLayout(new GridLayout(2, false));

		Label lblAussage = new Label(composite, SWT.NONE);
		lblAussage.setText("Aussage:");

		Combo combo = new Combo(composite, SWT.NONE);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);

		Label lblAussageinhalt = new Label(composite, SWT.CENTER);
		GridData gd_lblAussageinhalt = new GridData(SWT.CENTER, SWT.CENTER,
				false, false, 2, 1);
		gd_lblAussageinhalt.heightHint = 58;
		lblAussageinhalt.setLayoutData(gd_lblAussageinhalt);
		lblAussageinhalt.setText("neuer text zum testen");
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);

		TabItem tbtmTextausgabe = new TabItem(tabFolder, SWT.NONE);
		tbtmTextausgabe.setText("Textausgabe");

		StyledText styledTextTextausgabe = new StyledText(tabFolder, SWT.BORDER);
		tbtmTextausgabe.setControl(styledTextTextausgabe);

		Group grpPrmisse = new Group(container, SWT.NONE);
		grpPrmisse.setLayout(new FormLayout());
		GridData gd_grpPrmisse = new GridData(SWT.FILL, SWT.FILL, false, false,
				2, 1);
		gd_grpPrmisse.heightHint = 250;
		gd_grpPrmisse.minimumHeight = 500;
		grpPrmisse.setLayoutData(gd_grpPrmisse);
		grpPrmisse.setText("Pr\u00E4misse");

		StyledText styledText = new StyledText(grpPrmisse, SWT.BORDER
				| SWT.READ_ONLY);
		styledText.setAlignment(SWT.CENTER);
		styledText.setText("asdasdasd");
		styledText.setBackground(SWTResourceManager
				.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));
		styledText.setSelectionForeground(SWTResourceManager
				.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));
		styledText.setMarginColor(SWTResourceManager
				.getColor(SWT.COLOR_TITLE_INACTIVE_FOREGROUND));
		styledText.setSelectionBackground(SWTResourceManager
				.getColor(SWT.COLOR_GRAY));
		styledText.setEditable(false);
		FormData fd_styledText = new FormData();
		fd_styledText.bottom = new FormAttachment(100);
		fd_styledText.right = new FormAttachment(100);
		fd_styledText.left = new FormAttachment(0);
		fd_styledText.height = 50;
		styledText.setLayoutData(fd_styledText);

		Composite compTableviewer = new Composite(grpPrmisse, SWT.NONE);
		compTableviewer.setLayout(new FillLayout(SWT.HORIZONTAL));
		FormData fd_compTableviewer = new FormData();
		fd_compTableviewer.top = new FormAttachment(0);
		fd_compTableviewer.left = new FormAttachment(0);
		fd_compTableviewer.bottom = new FormAttachment(styledText);
		fd_compTableviewer.right = new FormAttachment(80);
		compTableviewer.setLayoutData(fd_compTableviewer);

		Composite cmpPraemisseButtons = new Composite(grpPrmisse, SWT.NONE);
		cmpPraemisseButtons.setLayout(new RowLayout(SWT.VERTICAL));
		FormData fd_cmpPraemisseButtons = new FormData();
		fd_cmpPraemisseButtons.top = new FormAttachment(0);
		fd_cmpPraemisseButtons.left = new FormAttachment(compTableviewer);
		fd_cmpPraemisseButtons.right = new FormAttachment(100);

		fd_cmpPraemisseButtons.bottom = new FormAttachment(styledText);
		cmpPraemisseButtons.setLayoutData(fd_cmpPraemisseButtons);
		praemisseContainer = new ContainerTableviewerRegelPraemisse(
				compTableviewer, wbsId);
		Button btnNewLiteral = new Button(cmpPraemisseButtons, SWT.NONE);
		btnNewLiteral.setText("New Literal");

		Button btnDelete = new Button(cmpPraemisseButtons, SWT.NONE);
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnDelete.setLayoutData(new RowData(66, SWT.DEFAULT));
		btnDelete.setText("Delete");

		return container;
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

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(633, 531);
	}
}
