package hs.merseburg.miks13.wbs;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.createFolder("left", IPageLayout.LEFT, 0.2f,
				IPageLayout.ID_EDITOR_AREA);
		;
		layout.createFolder("right", IPageLayout.RIGHT, 0.6f,
				IPageLayout.ID_EDITOR_AREA);
		;
		layout.createFolder("bottom", IPageLayout.BOTTOM, 0.8f,
				IPageLayout.ID_EDITOR_AREA);
		;
		layout.createFolder("top", IPageLayout.TOP, 0.6f,
				IPageLayout.ID_EDITOR_AREA);
		;

	}
}
