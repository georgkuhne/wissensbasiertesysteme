package hs.merseburg.miks13.wbs;

import org.eclipse.core.expressions.PropertyTester;

public class PropertyTesterWBSActive extends PropertyTester {

	public PropertyTesterWBSActive() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		return MainView.getInstance().isWBSActive();

	}

}
