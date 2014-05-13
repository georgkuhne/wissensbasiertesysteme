package hs.merseburg.miks13.wbs;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.setFixed(true);
		layout.addStandaloneView(MainView.ID, false, IPageLayout.TOP,
				IPageLayout.RATIO_MAX, layout.getEditorArea());

	}
}
