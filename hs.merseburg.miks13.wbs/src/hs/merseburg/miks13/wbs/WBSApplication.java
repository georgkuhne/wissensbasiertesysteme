package hs.merseburg.miks13.wbs;

import hs.merseburg.miks12.wbs.persistence.db.PersistenceUtility;
import hs.merseburg.miks12.wbs.persistence.dialog.DialogDatabaseConfiguration;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

/**
 * This class controls all aspects of the application's execution
 */
public class WBSApplication implements IApplication {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.
	 * IApplicationContext)
	 */
	public Object start(IApplicationContext context) {
		Display display = PlatformUI.createDisplay();
		PlatformUI.getPreferenceStore().setDefault(
				ConstantsGUI.PREFERENCE_ISFIRSTSTART, true);
		boolean isFirstStart = PlatformUI.getPreferenceStore().getBoolean(
				ConstantsGUI.PREFERENCE_ISFIRSTSTART);
		if (isFirstStart) {
			DialogDatabaseConfiguration dialog = new DialogDatabaseConfiguration(
					new Shell(Display.getCurrent(), SWT.None));
			if (dialog.open() != Window.OK)
				return IApplication.EXIT_OK;
			PlatformUI.getPreferenceStore().setValue(
					ConstantsGUI.PREFERENCE_ISFIRSTSTART, false);

		}
		PersistenceUtility.getINSTANCE().init();

		try {

			int returnCode = PlatformUI.createAndRunWorkbench(display,
					new ApplicationWorkbenchAdvisor());
			if (returnCode == PlatformUI.RETURN_RESTART) {
				return IApplication.EXIT_RESTART;
			}
			return IApplication.EXIT_OK;
		} finally {
			display.dispose();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
		if (!PlatformUI.isWorkbenchRunning())
			return;
		final IWorkbench workbench = PlatformUI.getWorkbench();
		final Display display = workbench.getDisplay();
		display.syncExec(new Runnable() {
			public void run() {
				if (!display.isDisposed())
					workbench.close();
			}
		});
	}
}
