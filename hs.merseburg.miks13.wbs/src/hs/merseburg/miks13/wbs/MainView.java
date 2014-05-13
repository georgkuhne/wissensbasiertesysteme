package hs.merseburg.miks13.wbs;

import hs.merseburg.miks13.wbs.gui.CompositeBrowseWBS;
import hs.merseburg.miks13.wbs.gui.CompositeEditWBS;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class MainView extends ViewPart {

	public static final String ID = "hs.merseburg.miks13.wbs.view";

	CompositeBrowseWBS cBrowseWBS;
	CompositeEditWBS ceEditWBS;
	StackLayout stacklayout = new StackLayout();

	private Composite parent;

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		this.parent=parent;
		parent.setLayout(stacklayout);
		cBrowseWBS = new CompositeBrowseWBS(parent, SWT.None, this);
		ceEditWBS = new CompositeEditWBS(parent, SWT.None, this);
		stacklayout.topControl = cBrowseWBS;
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {

	}

	public void openWBS(long wbsid) {
		ceEditWBS.openWBS(wbsid);
		stacklayout.topControl = ceEditWBS;
		parent.layout();

	}

	public void closeWBS() {
		stacklayout.topControl = cBrowseWBS;
		parent.layout();


	}
}