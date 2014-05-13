/**
 */
package wissensbasismodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wissensbasismodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WissensbasismodelFactoryImpl extends EFactoryImpl implements WissensbasismodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WissensbasismodelFactory init() {
		try {
			WissensbasismodelFactory theWissensbasismodelFactory = (WissensbasismodelFactory)EPackage.Registry.INSTANCE.getEFactory(WissensbasismodelPackage.eNS_URI);
			if (theWissensbasismodelFactory != null) {
				return theWissensbasismodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WissensbasismodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WissensbasismodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WissensbasismodelPackage.WISSENS_BASIS: return createWissensBasis();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WissensBasis createWissensBasis() {
		WissensBasisImpl wissensBasis = new WissensBasisImpl();
		return wissensBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WissensbasismodelPackage getWissensbasismodelPackage() {
		return (WissensbasismodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WissensbasismodelPackage getPackage() {
		return WissensbasismodelPackage.eINSTANCE;
	}

} //WissensbasismodelFactoryImpl
