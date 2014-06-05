/**
 */
package wissensbasismodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case WissensbasismodelPackage.BAUTEIL: return createBauteil();
			case WissensbasismodelPackage.REGEL: return createRegel();
			case WissensbasismodelPackage.AUSSAGE: return createAussage();
			case WissensbasismodelPackage.LITERAL: return createLiteral();
			case WissensbasismodelPackage.KONKLUSION: return createKonklusion();
			case WissensbasismodelPackage.REGELGRUPPE: return createRegelgruppe();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WissensbasismodelPackage.WERTEBEREICH_TYP:
				return createWertebereichTypFromString(eDataType, initialValue);
			case WissensbasismodelPackage.LITERAL_OPERATOREN_PRAEDIKAT:
				return createLiteralOperatorenPraedikatFromString(eDataType, initialValue);
			case WissensbasismodelPackage.LITERAL_OPERATOREN_LOGIK:
				return createLiteralOperatorenLogikFromString(eDataType, initialValue);
			case WissensbasismodelPackage.KONKLUSIONS_TYP:
				return createKonklusionsTypFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WissensbasismodelPackage.WERTEBEREICH_TYP:
				return convertWertebereichTypToString(eDataType, instanceValue);
			case WissensbasismodelPackage.LITERAL_OPERATOREN_PRAEDIKAT:
				return convertLiteralOperatorenPraedikatToString(eDataType, instanceValue);
			case WissensbasismodelPackage.LITERAL_OPERATOREN_LOGIK:
				return convertLiteralOperatorenLogikToString(eDataType, instanceValue);
			case WissensbasismodelPackage.KONKLUSIONS_TYP:
				return convertKonklusionsTypToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public Bauteil createBauteil() {
		BauteilImpl bauteil = new BauteilImpl();
		return bauteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regel createRegel() {
		RegelImpl regel = new RegelImpl();
		return regel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussage createAussage() {
		AussageImpl aussage = new AussageImpl();
		return aussage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Konklusion createKonklusion() {
		KonklusionImpl konklusion = new KonklusionImpl();
		return konklusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regelgruppe createRegelgruppe() {
		RegelgruppeImpl regelgruppe = new RegelgruppeImpl();
		return regelgruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WertebereichTyp createWertebereichTypFromString(EDataType eDataType, String initialValue) {
		WertebereichTyp result = WertebereichTyp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWertebereichTypToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralOperatorenPraedikat createLiteralOperatorenPraedikatFromString(EDataType eDataType, String initialValue) {
		LiteralOperatorenPraedikat result = LiteralOperatorenPraedikat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLiteralOperatorenPraedikatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralOperatorenLogik createLiteralOperatorenLogikFromString(EDataType eDataType, String initialValue) {
		LiteralOperatorenLogik result = LiteralOperatorenLogik.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLiteralOperatorenLogikToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KonklusionsTyp createKonklusionsTypFromString(EDataType eDataType, String initialValue) {
		KonklusionsTyp result = KonklusionsTyp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKonklusionsTypToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
