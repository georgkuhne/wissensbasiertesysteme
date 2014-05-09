package hs.merseburg.miks12.wbs.persistence.db;

import java.util.Properties;

import org.eclipse.emf.teneo.hibernate.HbDataStore;

public class PersistenceUtility {
	private static PersistenceUtility INSTANCE = new PersistenceUtility();
	HbDataStore hbds;
	private boolean isInitialized = false;

	private PersistenceUtility() {

	}

	public static PersistenceUtility getINSTANCE() {
		return INSTANCE;
	}

	public void init() {
		if (isInitialized)
			throw new ExceptionInInitializerError(
					"try to init the PersistenceUtility several times");

		createHBDatastore();
		mapEpackagesToDatastore();
		Properties properties = DatabaseConfigurator.getInstance()
				.getHBDatastoreProperties();
		isInitialized = true;

	}

	private void mapEpackagesToDatastore() {
		// TODO Auto-generated method stub

	}

	private void createHBDatastore() {
		// TODO Auto-generated method stub

	}
}
