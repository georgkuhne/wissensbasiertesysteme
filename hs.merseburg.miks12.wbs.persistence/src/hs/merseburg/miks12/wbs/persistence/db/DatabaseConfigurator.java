package hs.merseburg.miks12.wbs.persistence.db;

import hs.merseburg.miks12.wbs.persistence.ConstantsPersistence;
import hs.merseburg.miks12.wbs.persistence.LIDbStateType;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.eclipse.ui.PlatformUI;
import org.h2.api.ErrorCode;

public class DatabaseConfigurator {
	private static final DatabaseConfigurator INSTANCE = new DatabaseConfigurator();
	private static boolean isInitialized = false;

	private DatabaseConfigurator() {
	}

	private void init() {
		System.setProperty("h2.lobInDatabase", "true"); //$NON-NLS-1$ //$NON-NLS-2$
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("org.h2.Driver NOT FOUND");
		}
	}

	public static DatabaseConfigurator getInstance() {
		if (isInitialized)
			INSTANCE.init();
		return INSTANCE;
	}

	public String getHibernateDialect() {
		return "org.hibernate.dialect.H2Dialect"; //$NON-NLS-1$
	}

	public Properties getHBDatastoreProperties() {
		return null;
	}

	public void persistDatabaseFolderPath(String path) {
		PlatformUI.getPreferenceStore().setValue(
				ConstantsPersistence.PREFERENCESTORE_DATABASEPATH, path);
	}

	public String getDatabaseFolderPath() {
		return PlatformUI.getPreferenceStore().getString(
				ConstantsPersistence.PREFERENCESTORE_DATABASEPATH);
	}

	public String getDatabaseName() {
		return ConstantsPersistence.PREFERENCESTORE_DATABASEPW;
	}

	private String getDatabaseURLFromPreferencestore() {
		String path = getDatabaseFolderPath();
		String dbName = getDatabaseName();
		String URL = getDatabaseURL(path, dbName);
		return URL;
	}

	private String getDatabaseURL(String path, String dbName) {

		String url = "jdbc:h2:file:" + path; //$NON-NLS-1$
		url += File.separator + dbName;
		url += ";CACHE_SIZE=131072"; //$NON-NLS-1$
		return url;
	}

	public LIDbStateType canConnectToDB() {
		String url = getDatabaseURLFromPreferencestore();
		int dbErrorCode = 0;
		Connection dbConnection = null;
		try {
			String user = ConstantsPersistence.PREFERENCESTORE_DATABASEUSERNAME;
			String password = ConstantsPersistence.PREFERENCESTORE_DATABASEPW;
			dbConnection = DriverManager.getConnection(
					url + ";IFEXISTS=TRUE", user, password); //$NON-NLS-1$

			if (dbConnection != null)
				dbErrorCode = 0;

			dbConnection.commit();
			dbConnection.close();
		} catch (SQLException e) {
			dbErrorCode = e.getErrorCode();

		} finally {
			if (dbConnection != null)
				try {
					dbConnection.close();
				} catch (SQLException e) {
				}
		}
		switch (dbErrorCode) {
		case 0:
			return LIDbStateType.DATABASE_CONNECTION_OK;
		case ErrorCode.DATABASE_NOT_FOUND_1:
			return LIDbStateType.DATABASE_NOT_FOUND;
		case ErrorCode.DATABASE_ALREADY_OPEN_1:
			return LIDbStateType.DATABASE_ALREADY_OPEN;
		default:
			return LIDbStateType.SOME_DATABASE_ERROR;
		}

	}

	public LIDbStateType canConnectToDB(String path) {
		String url = getDatabaseURL(path,
				ConstantsPersistence.PREFERENCESTORE_DATABASENAME);
		int dbErrorCode = 0;
		Connection dbConnection = null;
		try {
			String user = ConstantsPersistence.PREFERENCESTORE_DATABASEUSERNAME;
			String password = ConstantsPersistence.PREFERENCESTORE_DATABASEPW;
			dbConnection = DriverManager.getConnection(
					url + ";IFEXISTS=TRUE", user, password); //$NON-NLS-1$

			if (dbConnection != null)
				dbErrorCode = 0;

			dbConnection.commit();
			dbConnection.close();
		} catch (SQLException e) {
			dbErrorCode = e.getErrorCode();

		} finally {
			if (dbConnection != null)
				try {
					dbConnection.close();
				} catch (SQLException e) {
				}
		}
		switch (dbErrorCode) {
		case 0:
			return LIDbStateType.DATABASE_CONNECTION_OK;
		case ErrorCode.DATABASE_NOT_FOUND_1:
			return LIDbStateType.DATABASE_NOT_FOUND;
		case ErrorCode.DATABASE_ALREADY_OPEN_1:
			return LIDbStateType.DATABASE_ALREADY_OPEN;
		default:
			return LIDbStateType.SOME_DATABASE_ERROR;
		}

	}

}
