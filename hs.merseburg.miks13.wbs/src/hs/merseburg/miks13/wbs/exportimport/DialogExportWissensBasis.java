package hs.merseburg.miks13.wbs.exportimport;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class DialogExportWissensBasis extends Dialog {
	private Text textExport;
	long wbsid;
	protected String selectedDir;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public DialogExportWissensBasis(Shell parentShell, long wbsid) {
		super(parentShell);
		this.wbsid = wbsid;

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

		textExport = new Text(container, SWT.BORDER | SWT.READ_ONLY);
		FormData fd_textExport = new FormData();
		fd_textExport.top = new FormAttachment(0, 31);
		fd_textExport.left = new FormAttachment(0, 10);
		fd_textExport.right = new FormAttachment(0, 287);
		textExport.setLayoutData(fd_textExport);

		Button btnBrowse = new Button(container, SWT.NONE);
		FormData fd_btnBrowse = new FormData();
		fd_btnBrowse.right = new FormAttachment(textExport, 56, SWT.RIGHT);
		fd_btnBrowse.left = new FormAttachment(textExport, 6);
		fd_btnBrowse.top = new FormAttachment(0, 29);
		btnBrowse.setLayoutData(fd_btnBrowse);
		btnBrowse.setText("browse");
		btnBrowse.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				DirectoryDialog dirDialog = new DirectoryDialog(getShell());
				dirDialog.setText("Wähle ein Verzeichnis");
				String blubb;
				blubb = dirDialog.open();

				if (blubb != null) {
					selectedDir = blubb;
					textExport.setText(blubb);
					getButton(OK).setEnabled(true);
				} else {
					getButton(OK).setEnabled(false);
					textExport.setText("");
					selectedDir = "";

				}
			}
		});
		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "Export", true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(371, 177);
	}

	@Override
	protected void okPressed() {
		ExportWissensBasis exp = new ExportWissensBasis(wbsid, selectedDir);
		super.okPressed();
	}
}
