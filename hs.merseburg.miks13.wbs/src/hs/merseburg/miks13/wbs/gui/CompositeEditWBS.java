package hs.merseburg.miks13.wbs.gui;

import hs.merseburg.miks13.wbs.MainView;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class CompositeEditWBS extends Composite {
	MainView mainView;

	public CompositeEditWBS(Composite parent, int style, MainView mainView1) {
		super(parent, style);
		this.setLayout(new FillLayout());
		new Label(this, SWT.None).setText("EDIT WBS");
		mainView = mainView1;
	}

	public void openWBS(long wbsid) {

	}

}
