/**
 */
package wissensbasismodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Aussagen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WISSENS_BASIS__AUSSAGEN = 4;

	/**
	 * The feature id for the '<em><b>Regel Gruppen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WISSENS_BASIS__REGEL_GRUPPEN = 5;

	/**
	 * The number of structural features of the '<em>Wissens Basis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WISSENS_BASIS_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Praemisse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGEL__PRAEMISSE = 2;

	/**
	 * The feature id for the '<em><b>Konklusion</b></em>' containment reference.
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSAGE__NAME = 4;

	/**
	 * The feature id for the '<em><b>List Wertebereich</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSAGE__LIST_WERTEBEREICH = 5;

	/**
	 * The number of structural features of the '<em>Aussage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSAGE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Aussage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSAGE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link wissensbasismodel.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wissensbasismodel.impl.LiteralImpl
	 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Aussage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__AUSSAGE = 0;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__WERT = 1;

	/**
	 * The feature id for the '<em><b>Praedikat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__PRAEDIKAT = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__ID = 3;

	/**
	 * The feature id for the '<em><b>Inner Logik Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__INNER_LOGIK_OPERATOR = 4;

	/**
	 * The feature id for the '<em><b>Out Logic Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__OUT_LOGIC_OPERATOR = 5;

	/**
	 * The feature id for the '<em><b>NOT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NOT = 6;

	/**
	 * The feature id for the '<em><b>Klammer Auf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__KLAMMER_AUF = 7;

	/**
	 * The feature id for the '<em><b>Klammer Zu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__KLAMMER_ZU = 8;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wissensbasismodel.impl.KonklusionImpl <em>Konklusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wissensbasismodel.impl.KonklusionImpl
	 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getKonklusion()
	 * @generated
	 */
	int KONKLUSION = 5;

	/**
	 * The feature id for the '<em><b>Konklusion Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONKLUSION__KONKLUSION_TYP = 0;

	/**
	 * The feature id for the '<em><b>Textausgabe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONKLUSION__TEXTAUSGABE = 1;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONKLUSION__LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Diagnoseaussage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONKLUSION__DIAGNOSEAUSSAGE = 3;

	/**
	 * The number of structural features of the '<em>Konklusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONKLUSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Konklusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONKLUSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wissensbasismodel.impl.RegelgruppeImpl <em>Regelgruppe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wissensbasismodel.impl.RegelgruppeImpl
	 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getRegelgruppe()
	 * @generated
	 */
	int REGELGRUPPE = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGELGRUPPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGELGRUPPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Regeln</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGELGRUPPE__REGELN = 2;

	/**
	 * The number of structural features of the '<em>Regelgruppe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGELGRUPPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Regelgruppe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGELGRUPPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wissensbasismodel.WertebereichTyp <em>Wertebereich Typ</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wissensbasismodel.WertebereichTyp
	 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getWertebereichTyp()
	 * @generated
	 */
	int WERTEBEREICH_TYP = 7;


	/**
	 * The meta object id for the '{@link wissensbasismodel.LiteralOperatorenPraedikat <em>Literal Operatoren Praedikat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wissensbasismodel.LiteralOperatorenPraedikat
	 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getLiteralOperatorenPraedikat()
	 * @generated
	 */
	int LITERAL_OPERATOREN_PRAEDIKAT = 8;

	/**
	 * The meta object id for the '{@link wissensbasismodel.LiteralOperatorenLogik <em>Literal Operatoren Logik</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wissensbasismodel.LiteralOperatorenLogik
	 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getLiteralOperatorenLogik()
	 * @generated
	 */
	int LITERAL_OPERATOREN_LOGIK = 9;

	/**
	 * The meta object id for the '{@link wissensbasismodel.KonklusionsTyp <em>Konklusions Typ</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wissensbasismodel.KonklusionsTyp
	 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getKonklusionsTyp()
	 * @generated
	 */
	int KONKLUSIONS_TYP = 10;


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
	 * Returns the meta object for the containment reference list '{@link wissensbasismodel.WissensBasis#getAussagen <em>Aussagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aussagen</em>'.
	 * @see wissensbasismodel.WissensBasis#getAussagen()
	 * @see #getWissensBasis()
	 * @generated
	 */
	EReference getWissensBasis_Aussagen();

	/**
	 * Returns the meta object for the containment reference list '{@link wissensbasismodel.WissensBasis#getRegelGruppen <em>Regel Gruppen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Regel Gruppen</em>'.
	 * @see wissensbasismodel.WissensBasis#getRegelGruppen()
	 * @see #getWissensBasis()
	 * @generated
	 */
	EReference getWissensBasis_RegelGruppen();

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
	 * Returns the meta object for the containment reference list '{@link wissensbasismodel.Regel#getPraemisse <em>Praemisse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Praemisse</em>'.
	 * @see wissensbasismodel.Regel#getPraemisse()
	 * @see #getRegel()
	 * @generated
	 */
	EReference getRegel_Praemisse();

	/**
	 * Returns the meta object for the containment reference '{@link wissensbasismodel.Regel#getKonklusion <em>Konklusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Konklusion</em>'.
	 * @see wissensbasismodel.Regel#getKonklusion()
	 * @see #getRegel()
	 * @generated
	 */
	EReference getRegel_Konklusion();

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
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Aussage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wissensbasismodel.Aussage#getName()
	 * @see #getAussage()
	 * @generated
	 */
	EAttribute getAussage_Name();

	/**
	 * Returns the meta object for the attribute list '{@link wissensbasismodel.Aussage#getListWertebereich <em>List Wertebereich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Wertebereich</em>'.
	 * @see wissensbasismodel.Aussage#getListWertebereich()
	 * @see #getAussage()
	 * @generated
	 */
	EAttribute getAussage_ListWertebereich();

	/**
	 * Returns the meta object for class '{@link wissensbasismodel.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see wissensbasismodel.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the reference '{@link wissensbasismodel.Literal#getAussage <em>Aussage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aussage</em>'.
	 * @see wissensbasismodel.Literal#getAussage()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_Aussage();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Literal#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see wissensbasismodel.Literal#getWert()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Wert();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Literal#getPraedikat <em>Praedikat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Praedikat</em>'.
	 * @see wissensbasismodel.Literal#getPraedikat()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Praedikat();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Literal#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see wissensbasismodel.Literal#getID()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_ID();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Literal#getInnerLogikOperator <em>Inner Logik Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner Logik Operator</em>'.
	 * @see wissensbasismodel.Literal#getInnerLogikOperator()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_InnerLogikOperator();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Literal#getOutLogicOperator <em>Out Logic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Logic Operator</em>'.
	 * @see wissensbasismodel.Literal#getOutLogicOperator()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_OutLogicOperator();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Literal#isNOT <em>NOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NOT</em>'.
	 * @see wissensbasismodel.Literal#isNOT()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_NOT();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Literal#isKlammerAuf <em>Klammer Auf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Klammer Auf</em>'.
	 * @see wissensbasismodel.Literal#isKlammerAuf()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_KlammerAuf();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Literal#isKlammerZu <em>Klammer Zu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Klammer Zu</em>'.
	 * @see wissensbasismodel.Literal#isKlammerZu()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_KlammerZu();

	/**
	 * Returns the meta object for class '{@link wissensbasismodel.Konklusion <em>Konklusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Konklusion</em>'.
	 * @see wissensbasismodel.Konklusion
	 * @generated
	 */
	EClass getKonklusion();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Konklusion#getKonklusionTyp <em>Konklusion Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Konklusion Typ</em>'.
	 * @see wissensbasismodel.Konklusion#getKonklusionTyp()
	 * @see #getKonklusion()
	 * @generated
	 */
	EAttribute getKonklusion_KonklusionTyp();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Konklusion#getTextausgabe <em>Textausgabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textausgabe</em>'.
	 * @see wissensbasismodel.Konklusion#getTextausgabe()
	 * @see #getKonklusion()
	 * @generated
	 */
	EAttribute getKonklusion_Textausgabe();

	/**
	 * Returns the meta object for the containment reference '{@link wissensbasismodel.Konklusion#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see wissensbasismodel.Konklusion#getLiteral()
	 * @see #getKonklusion()
	 * @generated
	 */
	EReference getKonklusion_Literal();

	/**
	 * Returns the meta object for the reference '{@link wissensbasismodel.Konklusion#getDiagnoseaussage <em>Diagnoseaussage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagnoseaussage</em>'.
	 * @see wissensbasismodel.Konklusion#getDiagnoseaussage()
	 * @see #getKonklusion()
	 * @generated
	 */
	EReference getKonklusion_Diagnoseaussage();

	/**
	 * Returns the meta object for class '{@link wissensbasismodel.Regelgruppe <em>Regelgruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regelgruppe</em>'.
	 * @see wissensbasismodel.Regelgruppe
	 * @generated
	 */
	EClass getRegelgruppe();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Regelgruppe#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see wissensbasismodel.Regelgruppe#getID()
	 * @see #getRegelgruppe()
	 * @generated
	 */
	EAttribute getRegelgruppe_ID();

	/**
	 * Returns the meta object for the attribute '{@link wissensbasismodel.Regelgruppe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wissensbasismodel.Regelgruppe#getName()
	 * @see #getRegelgruppe()
	 * @generated
	 */
	EAttribute getRegelgruppe_Name();

	/**
	 * Returns the meta object for the reference list '{@link wissensbasismodel.Regelgruppe#getRegeln <em>Regeln</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regeln</em>'.
	 * @see wissensbasismodel.Regelgruppe#getRegeln()
	 * @see #getRegelgruppe()
	 * @generated
	 */
	EReference getRegelgruppe_Regeln();

	/**
	 * Returns the meta object for enum '{@link wissensbasismodel.WertebereichTyp <em>Wertebereich Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wertebereich Typ</em>'.
	 * @see wissensbasismodel.WertebereichTyp
	 * @generated
	 */
	EEnum getWertebereichTyp();

	/**
	 * Returns the meta object for enum '{@link wissensbasismodel.LiteralOperatorenPraedikat <em>Literal Operatoren Praedikat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Literal Operatoren Praedikat</em>'.
	 * @see wissensbasismodel.LiteralOperatorenPraedikat
	 * @generated
	 */
	EEnum getLiteralOperatorenPraedikat();

	/**
	 * Returns the meta object for enum '{@link wissensbasismodel.LiteralOperatorenLogik <em>Literal Operatoren Logik</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Literal Operatoren Logik</em>'.
	 * @see wissensbasismodel.LiteralOperatorenLogik
	 * @generated
	 */
	EEnum getLiteralOperatorenLogik();

	/**
	 * Returns the meta object for enum '{@link wissensbasismodel.KonklusionsTyp <em>Konklusions Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Konklusions Typ</em>'.
	 * @see wissensbasismodel.KonklusionsTyp
	 * @generated
	 */
	EEnum getKonklusionsTyp();

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
		 * The meta object literal for the '<em><b>Aussagen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WISSENS_BASIS__AUSSAGEN = eINSTANCE.getWissensBasis_Aussagen();
		/**
		 * The meta object literal for the '<em><b>Regel Gruppen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WISSENS_BASIS__REGEL_GRUPPEN = eINSTANCE.getWissensBasis_RegelGruppen();
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
		 * The meta object literal for the '<em><b>Praemisse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGEL__PRAEMISSE = eINSTANCE.getRegel_Praemisse();
		/**
		 * The meta object literal for the '<em><b>Konklusion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGEL__KONKLUSION = eINSTANCE.getRegel_Konklusion();
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
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSSAGE__NAME = eINSTANCE.getAussage_Name();
		/**
		 * The meta object literal for the '<em><b>List Wertebereich</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSSAGE__LIST_WERTEBEREICH = eINSTANCE.getAussage_ListWertebereich();
		/**
		 * The meta object literal for the '{@link wissensbasismodel.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wissensbasismodel.impl.LiteralImpl
		 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();
		/**
		 * The meta object literal for the '<em><b>Aussage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL__AUSSAGE = eINSTANCE.getLiteral_Aussage();
		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__WERT = eINSTANCE.getLiteral_Wert();
		/**
		 * The meta object literal for the '<em><b>Praedikat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__PRAEDIKAT = eINSTANCE.getLiteral_Praedikat();
		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__ID = eINSTANCE.getLiteral_ID();
		/**
		 * The meta object literal for the '<em><b>Inner Logik Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__INNER_LOGIK_OPERATOR = eINSTANCE.getLiteral_InnerLogikOperator();
		/**
		 * The meta object literal for the '<em><b>Out Logic Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__OUT_LOGIC_OPERATOR = eINSTANCE.getLiteral_OutLogicOperator();
		/**
		 * The meta object literal for the '<em><b>NOT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__NOT = eINSTANCE.getLiteral_NOT();
		/**
		 * The meta object literal for the '<em><b>Klammer Auf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__KLAMMER_AUF = eINSTANCE.getLiteral_KlammerAuf();
		/**
		 * The meta object literal for the '<em><b>Klammer Zu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__KLAMMER_ZU = eINSTANCE.getLiteral_KlammerZu();
		/**
		 * The meta object literal for the '{@link wissensbasismodel.impl.KonklusionImpl <em>Konklusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wissensbasismodel.impl.KonklusionImpl
		 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getKonklusion()
		 * @generated
		 */
		EClass KONKLUSION = eINSTANCE.getKonklusion();
		/**
		 * The meta object literal for the '<em><b>Konklusion Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONKLUSION__KONKLUSION_TYP = eINSTANCE.getKonklusion_KonklusionTyp();
		/**
		 * The meta object literal for the '<em><b>Textausgabe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONKLUSION__TEXTAUSGABE = eINSTANCE.getKonklusion_Textausgabe();
		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONKLUSION__LITERAL = eINSTANCE.getKonklusion_Literal();
		/**
		 * The meta object literal for the '<em><b>Diagnoseaussage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONKLUSION__DIAGNOSEAUSSAGE = eINSTANCE.getKonklusion_Diagnoseaussage();
		/**
		 * The meta object literal for the '{@link wissensbasismodel.impl.RegelgruppeImpl <em>Regelgruppe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wissensbasismodel.impl.RegelgruppeImpl
		 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getRegelgruppe()
		 * @generated
		 */
		EClass REGELGRUPPE = eINSTANCE.getRegelgruppe();
		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGELGRUPPE__ID = eINSTANCE.getRegelgruppe_ID();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGELGRUPPE__NAME = eINSTANCE.getRegelgruppe_Name();
		/**
		 * The meta object literal for the '<em><b>Regeln</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGELGRUPPE__REGELN = eINSTANCE.getRegelgruppe_Regeln();
		/**
		 * The meta object literal for the '{@link wissensbasismodel.WertebereichTyp <em>Wertebereich Typ</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wissensbasismodel.WertebereichTyp
		 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getWertebereichTyp()
		 * @generated
		 */
		EEnum WERTEBEREICH_TYP = eINSTANCE.getWertebereichTyp();
		/**
		 * The meta object literal for the '{@link wissensbasismodel.LiteralOperatorenPraedikat <em>Literal Operatoren Praedikat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wissensbasismodel.LiteralOperatorenPraedikat
		 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getLiteralOperatorenPraedikat()
		 * @generated
		 */
		EEnum LITERAL_OPERATOREN_PRAEDIKAT = eINSTANCE.getLiteralOperatorenPraedikat();
		/**
		 * The meta object literal for the '{@link wissensbasismodel.LiteralOperatorenLogik <em>Literal Operatoren Logik</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wissensbasismodel.LiteralOperatorenLogik
		 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getLiteralOperatorenLogik()
		 * @generated
		 */
		EEnum LITERAL_OPERATOREN_LOGIK = eINSTANCE.getLiteralOperatorenLogik();
		/**
		 * The meta object literal for the '{@link wissensbasismodel.KonklusionsTyp <em>Konklusions Typ</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wissensbasismodel.KonklusionsTyp
		 * @see wissensbasismodel.impl.WissensbasismodelPackageImpl#getKonklusionsTyp()
		 * @generated
		 */
		EEnum KONKLUSIONS_TYP = eINSTANCE.getKonklusionsTyp();

	}

} //WissensbasismodelPackage
