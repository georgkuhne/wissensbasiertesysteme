package hs.merseburg.miks13.wbs.gui.bauteil;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class DialogCreateNewComponent extends Dialog {
	private Text textName;
	private Text textAssetID;
	private Text textKoroutine;
	private Long wbsID;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public DialogCreateNewComponent(Shell parentShell, Long WBSID) {
		super(parentShell);
		setShellStyle(SWT.RESIZE);
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
		container.setLayout(new GridLayout(3, true));

		Label lblName = new Label(container, SWT.NONE);
		lblName.setText("Name:");

		textName = new Text(container, SWT.BORDER);
		textName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				2, 1));

		Label lblAssetId = new Label(container, SWT.NONE);
		lblAssetId.setText("Asset ID:");

		textAssetID = new Text(container, SWT.BORDER);
		textAssetID.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1));

		Label lblRegeln = new Label(container, SWT.NONE);
		lblRegeln.setText("Regeln:");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		ListViewer listViewer_1 = new ListViewer(container, SWT.BORDER
				| SWT.V_SCROLL);
		List listvieweradded = listViewer_1.getList();
		listvieweradded.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false, 1, 6));
		new Label(container, SWT.NONE);

		ListViewer listViewer = new ListViewer(container, SWT.BORDER
				| SWT.V_SCROLL);
		List listviewerSelect = listViewer.getList();
		listviewerSelect.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false, 1, 6));

		Button btnAddAll = new Button(container, SWT.NONE);
		btnAddAll.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
				false, 1, 1));
		btnAddAll.setText("Alle Hinzufügen >>");

		Button btnAdd = new Button(container, SWT.NONE);
		btnAdd.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false,
				1, 1));
		btnAdd.setText("Hinzufügen >");

		Button btnDelete = new Button(container, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
				false, 1, 1));
		btnDelete.setText("< Entfernen");

		Button btnDeleteAll = new Button(container, SWT.NONE);
		btnDeleteAll.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
				false, 1, 1));
		btnDeleteAll.setText("<< Alle Entfernen");
		new Label(container, SWT.NONE);

		Label lblKoroutine = new Label(container, SWT.NONE);
		lblKoroutine.setText("Koroutine:");

		textKoroutine = new Text(container, SWT.BORDER);
		textKoroutine.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1));

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
		return new Point(513, 399);
	}

}
