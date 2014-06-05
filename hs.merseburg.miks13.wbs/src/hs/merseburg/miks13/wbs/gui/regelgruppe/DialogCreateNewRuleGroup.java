package hs.merseburg.miks13.wbs.gui.regelgruppe;

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

public class DialogCreateNewRuleGroup extends Dialog {
	private Text text;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 * @param wbsID
	 */
	public DialogCreateNewRuleGroup(Shell parentShell, Object wbsID) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout gl_container = new GridLayout(3, true);
		container.setLayout(gl_container);

		Label lblName = new Label(container, SWT.NONE);
		lblName.setText("Name:");

		text = new Text(container, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));

		Label lblRegeln = new Label(container, SWT.NONE);
		lblRegeln.setText("Regeln:");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		List listviewadd = new List(container, SWT.BORDER | SWT.MULTI);
		listviewadd.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false, 1, 6));
		new Label(container, SWT.NONE);

		List listviewselected = new List(container, SWT.BORDER);
		listviewselected.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false, 1, 6));
		ListViewer vieweradd = new ListViewer(listviewadd);
		ListViewer viewerselected = new ListViewer(listviewselected);
		Button btnAddAll = new Button(container, SWT.NONE);
		btnAddAll.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
				false, 1, 1));
		btnAddAll.setText("Alle Hinzufügen >>");

		Button btnAdd = new Button(container, SWT.NONE);
		btnAdd.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false,
				1, 1));
		btnAdd.setText("Hinzufügen >");

		Button btnRemove = new Button(container, SWT.NONE);
		btnRemove.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
				false, 1, 1));
		btnRemove.setText("< Entfernen");

		Button btnRemoveAll = new Button(container, SWT.NONE);
		btnRemoveAll.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false,
				false, 1, 1));
		btnRemoveAll.setText("<< Alle Entfernen");
		new Label(container, SWT.NONE);

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
		return new Point(507, 377);
	}

}
