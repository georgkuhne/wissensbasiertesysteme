package hs.merseburg.miks13.wbs.gui;

import hs.merseburg.miks13.wbs.MainView;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class CompositeEditWBS extends Composite {
	MainView mainView;
	private long wbsid;
	TabFolder tabfolder;
	private Button b_save;
	private CompositeStatement compositeStatement;
	private CompositeRules crules;
	private CompositeComponents compositeComponents;

	public CompositeEditWBS(Composite parent, int style, MainView mainView1) {
		super(parent, style);
		this.setLayout(new FormLayout());
		mainView = mainView1;
		tabfolder = new TabFolder(this, SWT.None);
		Composite cbuttons = new Composite(this, SWT.None);
		FormData fdtabfolder = new FormData();
		fdtabfolder.top = new FormAttachment(0);
		fdtabfolder.bottom = new FormAttachment(100);
		fdtabfolder.left = new FormAttachment(0);
		fdtabfolder.right = new FormAttachment(70);

		FormData fdbutton = new FormData();
		fdbutton.top = new FormAttachment(0);
		fdbutton.bottom = new FormAttachment(100);
		fdbutton.left = new FormAttachment(tabfolder);
		fdbutton.right = new FormAttachment(100);
		tabfolder.setLayoutData(fdtabfolder);
		cbuttons.setLayoutData(fdbutton);
		cbuttons.setLayout(new RowLayout(SWT.HORIZONTAL));
		b_save = new Button(cbuttons, SWT.PUSH);

		b_save.setText("Speichern");
		b_save.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				save();
			}
		});
		Button b_close = new Button(cbuttons, SWT.PUSH);
		b_close.setText("Schließen");
		b_close.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				close();
			}
		});

		crules = new CompositeRules(tabfolder, SWT.NONE);
		compositeStatement = new CompositeStatement(tabfolder, SWT.NONE);
		compositeComponents = new CompositeComponents(tabfolder, SWT.NONE);
		TabItem tab1 = new TabItem(tabfolder, SWT.NONE);
		TabItem tab2 = new TabItem(tabfolder, SWT.NONE);
		TabItem tab3 = new TabItem(tabfolder, SWT.NONE);

		tab1.setText("Bauteil");
		tab2.setText("Aussage");
		tab3.setText("Regel");
		tab1.setControl(compositeComponents);
		tab2.setControl(compositeStatement);
		tab3.setControl(crules);
	}

	protected void close() {
		mainView.closeWBS();

	}

	protected void save() {
		TabItem[] items = tabfolder.getSelection();
		if (items != null) {
			for (int i = 0; i < items.length; i++) {
				Control control = items[i].getControl();
				if (control instanceof GlobalEditActions)
					((GlobalEditActions) control).save();
			}
		}

	}

	public void openWBS(long wbsid) {
		this.wbsid = wbsid;

	}

}
