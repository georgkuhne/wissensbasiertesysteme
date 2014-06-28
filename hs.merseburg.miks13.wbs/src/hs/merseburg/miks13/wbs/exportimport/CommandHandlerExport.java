package hs.merseburg.miks13.wbs.exportimport;

import hs.merseburg.miks13.wbs.MainView;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.swt.widgets.Display;

public class CommandHandlerExport implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		DialogExportWissensBasis dialog = new DialogExportWissensBasis(Display
				.getCurrent().getActiveShell(), MainView.getInstance()
				.getWBSID());
		dialog.open();
		return null;
	}

	@Override
	public boolean isEnabled() {
		return MainView.getInstance().isWBSActive();

	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
