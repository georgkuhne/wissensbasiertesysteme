package hs.merseburg.miks12.wbs.persistence.db;

import hs.merseburg.miks12.wbs.persistence.ConstantsPersistence;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;

import wissensbasismodel.impl.WissensbasismodelPackageImpl;

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
		hbds.setDataStoreProperties(properties);
		hbds.initialize();
		isInitialized = true;

	}

	private void mapEpackagesToDatastore() {
		EPackage[] packages = { WissensbasismodelPackageImpl.eINSTANCE };
		hbds.setEPackages(packages);

	}

	private void createHBDatastore() {
		hbds = HbHelper.INSTANCE
				.getDataStore(ConstantsPersistence.HBDATASTOREID);
		if (hbds == null) {
			hbds = HbHelper.INSTANCE
					.createRegisterDataStore(ConstantsPersistence.HBDATASTOREID);

		}

	}
}
