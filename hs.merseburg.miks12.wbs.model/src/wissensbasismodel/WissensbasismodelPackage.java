/**
 */
package wissensbasismodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see wissensbasismodel.WissensbasismodelFactory
 * @model kind="package"
 * @generated
 */
public interface WissensbasismodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wissensbasismodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "hs.merseburg.miks13.wbs.wissensbasismodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "www.";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WissensbasismodelPackage eINSTANCE = wissensbasismodel.impl.WissensbasismodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link wissensbasismodel.impl.WissensBasisImpl <em>Wissens Basis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wissensbasismodel.impl.WissensBasisImpl
	 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getWissensBasis()
	 * @generated
	 */
	int WISSENS_BASIS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WISSENS_BASIS__NAME = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WISSENS_BASIS__ID = 1;

	/**
	 * The feature id for the '<em><b>Bauteile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WISSENS_BASIS__BAUTEILE = 2;

	/**
	 * The feature id for the '<em><b>Regeln</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WISSENS_BASIS__REGELN = 3;

	/**
	 * The feature id for the '<em><b>Aussagen</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WISSENS_BASIS__AUSSAGEN = 4;

	/**
	 * The number of structural features of the '<em>Wissens Basis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WISSENS_BASIS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Wissens Basis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WISSENS_BASIS_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link wissensbasismodel.impl.BauteilImpl <em>Bauteil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wissensbasismodel.impl.BauteilImpl
	 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getBauteil()
	 * @generated
	 */
	int BAUTEIL = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUTEIL__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUTEIL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Asset ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUTEIL__ASSET_ID = 2;

	/**
	 * The feature id for the '<em><b>Ist Teil von</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUTEIL__IST_TEIL_VON = 3;

	/**
	 * The feature id for the '<em><b>Regeln</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUTEIL__REGELN = 4;

	/**
	 * The feature id for the '<em><b>Regelgruppen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUTEIL__REGELGRUPPEN = 5;

	/**
	 * The feature id for the '<em><b>Koroutine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUTEIL__KOROUTINE = 6;

	/**
	 * The feature id for the '<em><b>Medien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUTEIL__MEDIEN = 7;

	/**
	 * The number of structural features of the '<em>Bauteil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUTEIL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Bauteil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUTEIL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link wissensbasismodel.impl.RegelImpl <em>Regel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wissensbasismodel.impl.RegelImpl
	 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getRegel()
	 * @generated
	 */
	int REGEL = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Preamisse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEL__PREAMISSE = 2;

	/**
	 * The feature id for the '<em><b>Konklusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEL__KONKLUSION = 3;

	/**
	 * The number of structural features of the '<em>Regel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Regel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wissensbasismodel.impl.AussageImpl <em>Aussage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wissensbasismodel.impl.AussageImpl
	 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getAussage()
	 * @generated
	 */
	int AUSSAGE = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSAGE__ID = 0;

	/**
	 * The feature id for the '<em><b>Wertebereich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSAGE__WERTEBEREICH = 1;

	/**
	 * The feature id for the '<em><b>Fragetext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSAGE__FRAGETEXT = 2;

	/**
	 * The feature id for the '<em><b>Diagnosetext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSAGE__DIAGNOSETEXT = 3;

	/**
	 * The number of structural features of the '<em>Aussage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Aussage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSAGE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link wissensbasismodel.WissensBasis <em>Wissens Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wissens Basis</em>'.
	 * @see wissensbasismodel.WissensBasis
	 * @generated
	 */
	EClass getWissensBasis();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.WissensBasis#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wissensbasismodel.WissensBasis#getName()
	 * @see #getWissensBasis()
	 * @generated
	 */
	EAttribute getWissensBasis_Name();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.WissensBasis#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see wissensbasismodel.WissensBasis#getID()
	 * @see #getWissensBasis()
	 * @generated
	 */
	EAttribute getWissensBasis_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link wissensbasismodel.WissensBasis#getBauteile <em>Bauteile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bauteile</em>'.
	 * @see wissensbasismodel.WissensBasis#getBauteile()
	 * @see #getWissensBasis()
	 * @generated
	 */
	EReference getWissensBasis_Bauteile();

	/**
	 * Returns the meta object for the containment reference list '{@link wissensbasismodel.WissensBasis#getRegeln <em>Regeln</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regeln</em>'.
	 * @see wissensbasismodel.WissensBasis#getRegeln()
	 * @see #getWissensBasis()
	 * @generated
	 */
	EReference getWissensBasis_Regeln();

	/**
	 * Returns the meta object for the reference list '{@link wissensbasismodel.WissensBasis#getAussagen <em>Aussagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aussagen</em>'.
	 * @see wissensbasismodel.WissensBasis#getAussagen()
	 * @see #getWissensBasis()
	 * @generated
	 */
	EReference getWissensBasis_Aussagen();

	/**
	 * Returns the meta object for class '{@link wissensbasismodel.Bauteil <em>Bauteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bauteil</em>'.
	 * @see wissensbasismodel.Bauteil
	 * @generated
	 */
	EClass getBauteil();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Bauteil#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see wissensbasismodel.Bauteil#getID()
	 * @see #getBauteil()
	 * @generated
	 */
	EAttribute getBauteil_ID();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Bauteil#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wissensbasismodel.Bauteil#getName()
	 * @see #getBauteil()
	 * @generated
	 */
	EAttribute getBauteil_Name();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Bauteil#getAsset_ID <em>Asset ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset ID</em>'.
	 * @see wissensbasismodel.Bauteil#getAsset_ID()
	 * @see #getBauteil()
	 * @generated
	 */
	EAttribute getBauteil_Asset_ID();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Bauteil#getIst_Teil_von <em>Ist Teil von</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ist Teil von</em>'.
	 * @see wissensbasismodel.Bauteil#getIst_Teil_von()
	 * @see #getBauteil()
	 * @generated
	 */
	EAttribute getBauteil_Ist_Teil_von();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Bauteil#getRegeln <em>Regeln</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regeln</em>'.
	 * @see wissensbasismodel.Bauteil#getRegeln()
	 * @see #getBauteil()
	 * @generated
	 */
	EAttribute getBauteil_Regeln();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Bauteil#getRegelgruppen <em>Regelgruppen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regelgruppen</em>'.
	 * @see wissensbasismodel.Bauteil#getRegelgruppen()
	 * @see #getBauteil()
	 * @generated
	 */
	EAttribute getBauteil_Regelgruppen();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Bauteil#getKoroutine <em>Koroutine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Koroutine</em>'.
	 * @see wissensbasismodel.Bauteil#getKoroutine()
	 * @see #getBauteil()
	 * @generated
	 */
	EAttribute getBauteil_Koroutine();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Bauteil#getMedien <em>Medien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medien</em>'.
	 * @see wissensbasismodel.Bauteil#getMedien()
	 * @see #getBauteil()
	 * @generated
	 */
	EAttribute getBauteil_Medien();

	/**
	 * Returns the meta object for class '{@link wissensbasismodel.Regel <em>Regel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regel</em>'.
	 * @see wissensbasismodel.Regel
	 * @generated
	 */
	EClass getRegel();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Regel#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see wissensbasismodel.Regel#getID()
	 * @see #getRegel()
	 * @generated
	 */
	EAttribute getRegel_ID();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Regel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wissensbasismodel.Regel#getName()
	 * @see #getRegel()
	 * @generated
	 */
	EAttribute getRegel_Name();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Regel#getPreamisse <em>Preamisse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preamisse</em>'.
	 * @see wissensbasismodel.Regel#getPreamisse()
	 * @see #getRegel()
	 * @generated
	 */
	EAttribute getRegel_Preamisse();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Regel#getKonklusion <em>Konklusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Konklusion</em>'.
	 * @see wissensbasismodel.Regel#getKonklusion()
	 * @see #getRegel()
	 * @generated
	 */
	EAttribute getRegel_Konklusion();

	/**
	 * Returns the meta object for class '{@link wissensbasismodel.Aussage <em>Aussage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aussage</em>'.
	 * @see wissensbasismodel.Aussage
	 * @generated
	 */
	EClass getAussage();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Aussage#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see wissensbasismodel.Aussage#getID()
	 * @see #getAussage()
	 * @generated
	 */
	EAttribute getAussage_ID();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Aussage#getWertebereich <em>Wertebereich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wertebereich</em>'.
	 * @see wissensbasismodel.Aussage#getWertebereich()
	 * @see #getAussage()
	 * @generated
	 */
	EAttribute getAussage_Wertebereich();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Aussage#getFragetext <em>Fragetext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fragetext</em>'.
	 * @see wissensbasismodel.Aussage#getFragetext()
	 * @see #getAussage()
	 * @generated
	 */
	EAttribute getAussage_Fragetext();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Aussage#getDiagnosetext <em>Diagnosetext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagnosetext</em>'.
	 * @see wissensbasismodel.Aussage#getDiagnosetext()
	 * @see #getAussage()
	 * @generated
	 */
	EAttribute getAussage_Diagnosetext();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WissensbasismodelFactory getWissensbasismodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link wissensbasismodel.impl.WissensBasisImpl <em>Wissens Basis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wissensbasismodel.impl.WissensBasisImpl
		 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getWissensBasis()
		 * @generated
		 */
		EClass WISSENS_BASIS = eINSTANCE.getWissensBasis();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WISSENS_BASIS__NAME = eINSTANCE.getWissensBasis_Name();
		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WISSENS_BASIS__ID = eINSTANCE.getWissensBasis_ID();
		/**
		 * The meta object literal for the '<em><b>Bauteile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WISSENS_BASIS__BAUTEILE = eINSTANCE.getWissensBasis_Bauteile();
		/**
		 * The meta object literal for the '<em><b>Regeln</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WISSENS_BASIS__REGELN = eINSTANCE.getWissensBasis_Regeln();
		/**
		 * The meta object literal for the '<em><b>Aussagen</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WISSENS_BASIS__AUSSAGEN = eINSTANCE.getWissensBasis_Aussagen();
		/**
		 * The meta object literal for the '{@link wissensbasismodel.impl.BauteilImpl <em>Bauteil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wissensbasismodel.impl.BauteilImpl
		 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getBauteil()
		 * @generated
		 */
		EClass BAUTEIL = eINSTANCE.getBauteil();
		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAUTEIL__ID = eINSTANCE.getBauteil_ID();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAUTEIL__NAME = eINSTANCE.getBauteil_Name();
		/**
		 * The meta object literal for the '<em><b>Asset ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAUTEIL__ASSET_ID = eINSTANCE.getBauteil_Asset_ID();
		/**
		 * The meta object literal for the '<em><b>Ist Teil von</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAUTEIL__IST_TEIL_VON = eINSTANCE.getBauteil_Ist_Teil_von();
		/**
		 * The meta object literal for the '<em><b>Regeln</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAUTEIL__REGELN = eINSTANCE.getBauteil_Regeln();
		/**
		 * The meta object literal for the '<em><b>Regelgruppen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAUTEIL__REGELGRUPPEN = eINSTANCE.getBauteil_Regelgruppen();
		/**
		 * The meta object literal for the '<em><b>Koroutine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAUTEIL__KOROUTINE = eINSTANCE.getBauteil_Koroutine();
		/**
		 * The meta object literal for the '<em><b>Medien</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BAUTEIL__MEDIEN = eINSTANCE.getBauteil_Medien();
		/**
		 * The meta object literal for the '{@link wissensbasismodel.impl.RegelImpl <em>Regel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wissensbasismodel.impl.RegelImpl
		 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getRegel()
		 * @generated
		 */
		EClass REGEL = eINSTANCE.getRegel();
		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGEL__ID = eINSTANCE.getRegel_ID();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGEL__NAME = eINSTANCE.getRegel_Name();
		/**
		 * The meta object literal for the '<em><b>Preamisse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGEL__PREAMISSE = eINSTANCE.getRegel_Preamisse();
		/**
		 * The meta object literal for the '<em><b>Konklusion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGEL__KONKLUSION = eINSTANCE.getRegel_Konklusion();
		/**
		 * The meta object literal for the '{@link wissensbasismodel.impl.AussageImpl <em>Aussage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wissensbasismodel.impl.AussageImpl
		 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getAussage()
		 * @generated
		 */
		EClass AUSSAGE = eINSTANCE.getAussage();
		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSSAGE__ID = eINSTANCE.getAussage_ID();
		/**
		 * The meta object literal for the '<em><b>Wertebereich</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSSAGE__WERTEBEREICH = eINSTANCE.getAussage_Wertebereich();
		/**
		 * The meta object literal for the '<em><b>Fragetext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSSAGE__FRAGETEXT = eINSTANCE.getAussage_Fragetext();
		/**
		 * The meta object literal for the '<em><b>Diagnosetext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSSAGE__DIAGNOSETEXT = eINSTANCE.getAussage_Diagnosetext();

	}

} //WissensbasismodelPackage
