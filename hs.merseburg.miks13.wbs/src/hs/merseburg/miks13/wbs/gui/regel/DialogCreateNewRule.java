package hs.merseburg.miks13.wbs.gui.regel;

import hs.merseburg.miks12.wbs.persistence.db.PersistenceUtility;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.hibernate.Session;

import wissensbasismodel.Aussage;
import wissensbasismodel.Konklusion;
import wissensbasismodel.KonklusionsTyp;
import wissensbasismodel.Literal;
import wissensbasismodel.LiteralOperatorenPraedikat;
import wissensbasismodel.Regel;
import wissensbasismodel.WertebereichTyp;
import wissensbasismodel.WissensBasis;
import wissensbasismodel.WissensbasismodelFactory;

public class DialogCreateNewRule extends Dialog {
	private Text text_name;
	private Long wbsID;
	private ContainerTableviewerRegelPraemisse praemisseContainer;
	private long wbsId;
	protected Session session;
	private TabFolder tabFolder;
	private StyledText styledText;
	private ComboViewer comboviewerstatement_2;
	private Combo combo_wert;
	private Combo combo_operator;
	private Combo combo_prefix;
	private ComboViewer comboviewerstatement;
	private EList<Aussage> aussagen;

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

		session = PersistenceUtility.getINSTANCE().createSession();

		Label lblName = new Label(container, SWT.NONE);
		GridData gd_lblName = new GridData(SWT.LEFT, SWT.CENTER, false, false,
				1, 1);
		gd_lblName.widthHint = 303;
		lblName.setLayoutData(gd_lblName);
		lblName.setText("Name:");

		text_name = new Text(container, SWT.BORDER);
		text_name.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		Group groupkonklusion = new Group(container, SWT.NONE);
		groupkonklusion.setText("Konklusion:");
		groupkonklusion.setLayout(new FillLayout(SWT.VERTICAL));
		GridData gd_groupkonklusion = new GridData(SWT.FILL, SWT.CENTER, false,
				false, 2, 1);
		gd_groupkonklusion.heightHint = 150;
		groupkonklusion.setLayoutData(gd_groupkonklusion);

		tabFolder = new TabFolder(groupkonklusion, SWT.NONE);

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

		combo_prefix = new Combo(composite_1, SWT.NONE);
		combo_prefix.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		combo_prefix.setItems(LiteralRepresentation.getNegation());
		Combo combo_statement = new Combo(composite_1, SWT.NONE);
		combo_statement.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		comboviewerstatement = new ComboViewer(combo_statement);

		comboviewerstatement.setContentProvider(ArrayContentProvider
				.getInstance());

		comboviewerstatement.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				Aussage aussage = (Aussage) element;
				return aussage.getName();
			}
		});

		WissensBasis wbs = PersistenceUtility.getWissensBasisById(wbsID,
				session);
		aussagen = wbs.getAussagen();
		comboviewerstatement.setInput(aussagen);

		combo_operator = new Combo(composite_1, SWT.NONE);
		combo_operator.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		combo_wert = new Combo(composite_1, SWT.NONE);
		combo_wert.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		comboviewerstatement
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						// TODO Auto-generated method stub
						IStructuredSelection selection = (IStructuredSelection) event
								.getSelection();
						if (selection.size() > 0) {
							WertebereichTyp wertebereich = ((Aussage) selection
									.getFirstElement()).getWertebereich();
							if (wertebereich == WertebereichTyp.BOOLEAN) {
								combo_operator.setEnabled(false);
								combo_wert.setEnabled(false);
								combo_operator.removeAll();
								combo_wert.removeAll();
							} else if (wertebereich == WertebereichTyp.INTEGER) {
								combo_operator.setEnabled(true);
								combo_wert.setEnabled(true);
								combo_operator.removeAll();
								combo_wert.removeAll();
								String op[] = LiteralRepresentation
										.getPraedikatFunktionen();
								combo_operator.setItems(op);

							} else if (wertebereich == WertebereichTyp.REAL) {
								combo_operator.setEnabled(true);
								combo_wert.setEnabled(true);
								combo_operator.removeAll();
								combo_wert.removeAll();
								String op[] = LiteralRepresentation
										.getPraedikatFunktionen();
								combo_operator.setItems(op);
							} else if (wertebereich == WertebereichTyp.STRINGLIST) {
								combo_operator.setEnabled(true);
								combo_wert.setEnabled(true);
								combo_operator.removeAll();
								combo_wert.removeAll();
								String op[] = LiteralRepresentation
										.getBinaerePraedikatFunktionen();
								combo_operator.setItems(op);
								EList<String> werteliste = ((Aussage) selection
										.getFirstElement())
										.getListWertebereich();
								for (int i = 0; i < werteliste.size(); i++) {
									combo_wert.add(werteliste.get(i));
								}
							}
						}
					}
				});
		TabItem tbtmDiagnosausgabe = new TabItem(tabFolder, SWT.NONE);
		tbtmDiagnosausgabe.setText("Diagnoseausgabe");

		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmDiagnosausgabe.setControl(composite);
		composite.setLayout(new GridLayout(2, false));

		Label lblAussage = new Label(composite, SWT.NONE);
		lblAussage.setText("Aussage:");

		Combo combo_statement_2 = new Combo(composite, SWT.NONE);
		combo_statement_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				true, false, 1, 1));
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);

		final Label lblAussageinhalt = new Label(composite, SWT.NONE);
		lblAussageinhalt.setText("Diagnoseausgabe der Aussage");
		GridData gd_lblAussageinhalt = new GridData(SWT.CENTER, SWT.CENTER,
				false, false, 2, 1);
		gd_lblAussageinhalt.heightHint = 58;
		lblAussageinhalt.setLayoutData(gd_lblAussageinhalt);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);

		comboviewerstatement_2 = new ComboViewer(combo_statement_2);
		comboviewerstatement_2.setContentProvider(ArrayContentProvider
				.getInstance());
		comboviewerstatement_2.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				Aussage aussage = (Aussage) element;
				return aussage.getName();
			}
		});

		comboviewerstatement_2.setInput(aussagen);

		comboviewerstatement_2
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {

						IStructuredSelection selection = (IStructuredSelection) event
								.getSelection();
						if (selection.size() > 0) {
							String diagnoseText = ((Aussage) selection
									.getFirstElement()).getDiagnosetext();
							lblAussageinhalt.setText(diagnoseText);
						}
					}
				});

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

		styledText = new StyledText(grpPrmisse, SWT.BORDER | SWT.READ_ONLY);
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
				compTableviewer, wbsId, aussagen);
		Button btnNewLiteral = new Button(cmpPraemisseButtons, SWT.NONE);
		btnNewLiteral.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				createNewPraemisseLiteral();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btnNewLiteral.setText("New Literal");

		Button btnDelete = new Button(cmpPraemisseButtons, SWT.NONE);
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deleteSelectedLiteralPraemisse();
			}
		});
		btnDelete.setLayoutData(new RowData(66, SWT.DEFAULT));
		btnDelete.setText("Delete");

		return container;
	}

	protected void createNewPraemisseLiteral() {
		praemisseContainer.createNewLiteral();
	}

	protected void deleteSelectedLiteralPraemisse() {
		praemisseContainer.deleteLiteral();

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

	@Override
	protected void okPressed() {
		String wert;
		if (!validateInput())
			return;
		String Name = text_name.getText().trim();
		Regel regel = WissensbasismodelFactory.eINSTANCE.createRegel();
		Konklusion konklusion = WissensbasismodelFactory.eINSTANCE
				.createKonklusion();
		regel.setName(Name);
		WissensBasis wbs = PersistenceUtility.getWissensBasisById(wbsID,
				session);
		int index = tabFolder.getSelectionIndex();

		switch (index) {
		case 0:
			konklusion.setKonklusionTyp(KonklusionsTyp.LITERAL);
			Literal literal = WissensbasismodelFactory.eINSTANCE
					.createLiteral();
			if (combo_wert.getText() != null) {
				wert = combo_wert.getText();
			} else {
				wert = "";
			}
			String prefix = combo_prefix.getText();

			IStructuredSelection statementselection = (IStructuredSelection) comboviewerstatement
					.getSelection();
			Aussage aussage = ((Aussage) statementselection.getFirstElement());
			if (aussage == null) {
				MessageDialog.openWarning(
						Display.getCurrent().getActiveShell(), "Warnung",
						"Keine Aussage gewählt.");
				return;
			} else {
				literal.setAussage(aussage);
			}
			if (prefix.equals("")) {
				literal.setNOT(false);
			} else {
				literal.setNOT(true);
			}
			int operator = combo_operator.getSelectionIndex();

			switch (operator) {
			case 0:
				literal.setPraedikat(LiteralOperatorenPraedikat.GLEICH);
				break;
			case 1:
				literal.setPraedikat(LiteralOperatorenPraedikat.UNGLEICH);
				break;
			case 2:
				literal.setPraedikat(LiteralOperatorenPraedikat.KLEINERGLEICH);
				break;
			case 3:
				literal.setPraedikat(LiteralOperatorenPraedikat.GROESSERGLEICH);
				break;
			case 4:
				literal.setPraedikat(LiteralOperatorenPraedikat.KLEINERALS);
				break;
			case 5:
				literal.setPraedikat(LiteralOperatorenPraedikat.GROESSERALS);
				break;
			default:
				literal.setPraedikat(null);
				break;
			}

			literal.setWert(wert);
			konklusion.setLiteral(literal);
			break;
		case 1:
			konklusion.setKonklusionTyp(KonklusionsTyp.DIAGNOSEAUSGABE);
			IStructuredSelection selection = (IStructuredSelection) comboviewerstatement_2
					.getSelection();
			Aussage diagnoseaussage = ((Aussage) selection.getFirstElement());
			if (diagnoseaussage == null) {
				MessageDialog.openWarning(
						Display.getCurrent().getActiveShell(), "Warnung",
						"Keine Aussage gewählt.");
				return;
			} else {
				konklusion.setDiagnoseaussage(diagnoseaussage);
			}

			break;
		case 2:
			konklusion.setKonklusionTyp(KonklusionsTyp.TEXTAUSGABE);
			String text = styledText.getText().trim();
			konklusion.setTextausgabe(text);
			break;
		default:
			break;
		}
		regel.setKonklusion(konklusion);
		regel.getPraemisse().clear();
		regel.getPraemisse().addAll(praemisseContainer.literale);

		wbs.getRegeln().add(regel);
		session.flush();
		session.close();
		super.okPressed();
	}

	private boolean validateInput() {
		// TODO Auto-generated method stub
		return true;
	}
}
