/**
 */
package wissensbasismodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import wissensbasismodel.Aussage;
import wissensbasismodel.Bauteil;
import wissensbasismodel.Konklusion;
import wissensbasismodel.KonklusionsTyp;
import wissensbasismodel.Literal;
import wissensbasismodel.LiteralOperatorenLogik;
import wissensbasismodel.LiteralOperatorenPraedikat;
import wissensbasismodel.Regel;
import wissensbasismodel.WertebereichTyp;
import wissensbasismodel.WissensBasis;
import wissensbasismodel.WissensbasismodelFactory;
import wissensbasismodel.WissensbasismodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WissensbasismodelPackageImpl extends EPackageImpl implements WissensbasismodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wissensBasisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bauteilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aussageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass konklusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wertebereichTypEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum literalOperatorenPraedikatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum literalOperatorenLogikEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum konklusionsTypEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see wissensbasismodel.WissensbasismodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WissensbasismodelPackageImpl() {
		super(eNS_URI, WissensbasismodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WissensbasismodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WissensbasismodelPackage init() {
		if (isInited) return (WissensbasismodelPackage)EPackage.Registry.INSTANCE.getEPackage(WissensbasismodelPackage.eNS_URI);

		// Obtain or create and register package
		WissensbasismodelPackageImpl theWissensbasismodelPackage = (WissensbasismodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WissensbasismodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WissensbasismodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWissensbasismodelPackage.createPackageContents();

		// Initialize created meta-data
		theWissensbasismodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWissensbasismodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WissensbasismodelPackage.eNS_URI, theWissensbasismodelPackage);
		return theWissensbasismodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWissensBasis() {
		return wissensBasisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWissensBasis_Name() {
		return (EAttribute)wissensBasisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWissensBasis_ID() {
		return (EAttribute)wissensBasisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWissensBasis_Bauteile() {
		return (EReference)wissensBasisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWissensBasis_Regeln() {
		return (EReference)wissensBasisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWissensBasis_Aussagen() {
		return (EReference)wissensBasisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBauteil() {
		return bauteilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBauteil_ID() {
		return (EAttribute)bauteilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBauteil_Name() {
		return (EAttribute)bauteilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBauteil_Asset_ID() {
		return (EAttribute)bauteilEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBauteil_Ist_Teil_von() {
		return (EAttribute)bauteilEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBauteil_Regeln() {
		return (EAttribute)bauteilEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBauteil_Regelgruppen() {
		return (EAttribute)bauteilEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBauteil_Koroutine() {
		return (EAttribute)bauteilEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBauteil_Medien() {
		return (EAttribute)bauteilEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegel() {
		return regelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegel_ID() {
		return (EAttribute)regelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegel_Name() {
		return (EAttribute)regelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegel_Praemisse() {
		return (EReference)regelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegel_Konklusion() {
		return (EReference)regelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAussage() {
		return aussageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAussage_ID() {
		return (EAttribute)aussageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAussage_Wertebereich() {
		return (EAttribute)aussageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAussage_Fragetext() {
		return (EAttribute)aussageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAussage_Diagnosetext() {
		return (EAttribute)aussageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAussage_Name() {
		return (EAttribute)aussageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAussage_ListWertebereich() {
		return (EAttribute)aussageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteral_Aussage() {
		return (EReference)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Wert() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Praedikat() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_ID() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_InnerLogikOperator() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_OutLogicOperator() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_NOT() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_KlammerAuf() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_KlammerZu() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKonklusion() {
		return konklusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKonklusion_KonklusionTyp() {
		return (EAttribute)konklusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKonklusion_Literal() {
		return (EReference)konklusionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKonklusion_DiagnoseText() {
		return (EAttribute)konklusionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWertebereichTyp() {
		return wertebereichTypEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLiteralOperatorenPraedikat() {
		return literalOperatorenPraedikatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLiteralOperatorenLogik() {
		return literalOperatorenLogikEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKonklusionsTyp() {
		return konklusionsTypEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WissensbasismodelFactory getWissensbasismodelFactory() {
		return (WissensbasismodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		wissensBasisEClass = createEClass(WISSENS_BASIS);
		createEAttribute(wissensBasisEClass, WISSENS_BASIS__NAME);
		createEAttribute(wissensBasisEClass, WISSENS_BASIS__ID);
		createEReference(wissensBasisEClass, WISSENS_BASIS__BAUTEILE);
		createEReference(wissensBasisEClass, WISSENS_BASIS__REGELN);
		createEReference(wissensBasisEClass, WISSENS_BASIS__AUSSAGEN);

		bauteilEClass = createEClass(BAUTEIL);
		createEAttribute(bauteilEClass, BAUTEIL__ID);
		createEAttribute(bauteilEClass, BAUTEIL__NAME);
		createEAttribute(bauteilEClass, BAUTEIL__ASSET_ID);
		createEAttribute(bauteilEClass, BAUTEIL__IST_TEIL_VON);
		createEAttribute(bauteilEClass, BAUTEIL__REGELN);
		createEAttribute(bauteilEClass, BAUTEIL__REGELGRUPPEN);
		createEAttribute(bauteilEClass, BAUTEIL__KOROUTINE);
		createEAttribute(bauteilEClass, BAUTEIL__MEDIEN);

		regelEClass = createEClass(REGEL);
		createEAttribute(regelEClass, REGEL__ID);
		createEAttribute(regelEClass, REGEL__NAME);
		createEReference(regelEClass, REGEL__PRAEMISSE);
		createEReference(regelEClass, REGEL__KONKLUSION);

		aussageEClass = createEClass(AUSSAGE);
		createEAttribute(aussageEClass, AUSSAGE__ID);
		createEAttribute(aussageEClass, AUSSAGE__WERTEBEREICH);
		createEAttribute(aussageEClass, AUSSAGE__FRAGETEXT);
		createEAttribute(aussageEClass, AUSSAGE__DIAGNOSETEXT);
		createEAttribute(aussageEClass, AUSSAGE__NAME);
		createEAttribute(aussageEClass, AUSSAGE__LIST_WERTEBEREICH);

		literalEClass = createEClass(LITERAL);
		createEReference(literalEClass, LITERAL__AUSSAGE);
		createEAttribute(literalEClass, LITERAL__WERT);
		createEAttribute(literalEClass, LITERAL__PRAEDIKAT);
		createEAttribute(literalEClass, LITERAL__ID);
		createEAttribute(literalEClass, LITERAL__INNER_LOGIK_OPERATOR);
		createEAttribute(literalEClass, LITERAL__OUT_LOGIC_OPERATOR);
		createEAttribute(literalEClass, LITERAL__NOT);
		createEAttribute(literalEClass, LITERAL__KLAMMER_AUF);
		createEAttribute(literalEClass, LITERAL__KLAMMER_ZU);

		konklusionEClass = createEClass(KONKLUSION);
		createEAttribute(konklusionEClass, KONKLUSION__KONKLUSION_TYP);
		createEAttribute(konklusionEClass, KONKLUSION__DIAGNOSE_TEXT);
		createEReference(konklusionEClass, KONKLUSION__LITERAL);

		// Create enums
		wertebereichTypEEnum = createEEnum(WERTEBEREICH_TYP);
		literalOperatorenPraedikatEEnum = createEEnum(LITERAL_OPERATOREN_PRAEDIKAT);
		literalOperatorenLogikEEnum = createEEnum(LITERAL_OPERATOREN_LOGIK);
		konklusionsTypEEnum = createEEnum(KONKLUSIONS_TYP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(wissensBasisEClass, WissensBasis.class, "WissensBasis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWissensBasis_Name(), ecorePackage.getEString(), "Name", null, 0, 1, WissensBasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWissensBasis_ID(), ecorePackage.getELong(), "ID", null, 0, 1, WissensBasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWissensBasis_Bauteile(), this.getBauteil(), null, "bauteile", null, 0, -1, WissensBasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWissensBasis_Regeln(), this.getRegel(), null, "regeln", null, 0, -1, WissensBasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWissensBasis_Aussagen(), this.getAussage(), null, "aussagen", null, 0, -1, WissensBasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bauteilEClass, Bauteil.class, "Bauteil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBauteil_ID(), ecorePackage.getELong(), "ID", null, 0, 1, Bauteil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBauteil_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Bauteil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBauteil_Asset_ID(), ecorePackage.getEString(), "Asset_ID", "", 0, 1, Bauteil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBauteil_Ist_Teil_von(), ecorePackage.getEString(), "ist_Teil_von", null, 0, 1, Bauteil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBauteil_Regeln(), ecorePackage.getEString(), "Regeln", null, 0, 1, Bauteil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBauteil_Regelgruppen(), ecorePackage.getEString(), "Regelgruppen", null, 0, 1, Bauteil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBauteil_Koroutine(), ecorePackage.getEString(), "Koroutine", null, 0, 1, Bauteil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBauteil_Medien(), ecorePackage.getEString(), "Medien", null, 0, 1, Bauteil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regelEClass, Regel.class, "Regel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegel_ID(), ecorePackage.getELong(), "ID", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegel_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegel_Praemisse(), this.getLiteral(), null, "praemisse", null, 0, -1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegel_Konklusion(), this.getKonklusion(), null, "konklusion", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aussageEClass, Aussage.class, "Aussage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAussage_ID(), ecorePackage.getELong(), "ID", null, 0, 1, Aussage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAussage_Wertebereich(), this.getWertebereichTyp(), "wertebereich", null, 0, 1, Aussage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAussage_Fragetext(), ecorePackage.getEString(), "Fragetext", null, 0, 1, Aussage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAussage_Diagnosetext(), ecorePackage.getEString(), "Diagnosetext", null, 0, 1, Aussage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAussage_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Aussage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAussage_ListWertebereich(), ecorePackage.getEString(), "listWertebereich", null, 0, -1, Aussage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteral_Aussage(), this.getAussage(), null, "aussage", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_Wert(), ecorePackage.getEString(), "wert", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_Praedikat(), this.getLiteralOperatorenPraedikat(), "praedikat", "NULL", 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_ID(), ecorePackage.getELong(), "ID", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_InnerLogikOperator(), this.getLiteralOperatorenLogik(), "innerLogikOperator", "NULL", 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_OutLogicOperator(), this.getLiteralOperatorenLogik(), "outLogicOperator", "NULL", 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_NOT(), ecorePackage.getEBoolean(), "NOT", "false", 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_KlammerAuf(), ecorePackage.getEBoolean(), "klammerAuf", "false", 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_KlammerZu(), ecorePackage.getEBoolean(), "klammerZu", "false", 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(konklusionEClass, Konklusion.class, "Konklusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKonklusion_KonklusionTyp(), this.getKonklusionsTyp(), "konklusionTyp", null, 0, 1, Konklusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKonklusion_DiagnoseText(), ecorePackage.getEString(), "diagnoseText", null, 0, 1, Konklusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKonklusion_Literal(), this.getLiteral(), null, "literal", null, 0, 1, Konklusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(wertebereichTypEEnum, WertebereichTyp.class, "WertebereichTyp");
		addEEnumLiteral(wertebereichTypEEnum, WertebereichTyp.BOOLEAN);
		addEEnumLiteral(wertebereichTypEEnum, WertebereichTyp.INTEGER);
		addEEnumLiteral(wertebereichTypEEnum, WertebereichTyp.REAL);
		addEEnumLiteral(wertebereichTypEEnum, WertebereichTyp.STRINGLIST);

		initEEnum(literalOperatorenPraedikatEEnum, LiteralOperatorenPraedikat.class, "LiteralOperatorenPraedikat");
		addEEnumLiteral(literalOperatorenPraedikatEEnum, LiteralOperatorenPraedikat.GLEICH);
		addEEnumLiteral(literalOperatorenPraedikatEEnum, LiteralOperatorenPraedikat.KLEINERGLEICH);
		addEEnumLiteral(literalOperatorenPraedikatEEnum, LiteralOperatorenPraedikat.KLEINERALS);
		addEEnumLiteral(literalOperatorenPraedikatEEnum, LiteralOperatorenPraedikat.GROESSERGLEICH);
		addEEnumLiteral(literalOperatorenPraedikatEEnum, LiteralOperatorenPraedikat.GROESSERALS);
		addEEnumLiteral(literalOperatorenPraedikatEEnum, LiteralOperatorenPraedikat.UNGLEICH);
		addEEnumLiteral(literalOperatorenPraedikatEEnum, LiteralOperatorenPraedikat.NULL);

		initEEnum(literalOperatorenLogikEEnum, LiteralOperatorenLogik.class, "LiteralOperatorenLogik");
		addEEnumLiteral(literalOperatorenLogikEEnum, LiteralOperatorenLogik.AND);
		addEEnumLiteral(literalOperatorenLogikEEnum, LiteralOperatorenLogik.OR);
		addEEnumLiteral(literalOperatorenLogikEEnum, LiteralOperatorenLogik.NULL);

		initEEnum(konklusionsTypEEnum, KonklusionsTyp.class, "KonklusionsTyp");
		addEEnumLiteral(konklusionsTypEEnum, KonklusionsTyp.LITERAL);
		addEEnumLiteral(konklusionsTypEEnum, KonklusionsTyp.TEXTAUSGABE);
		addEEnumLiteral(konklusionsTypEEnum, KonklusionsTyp.DIAGNOSEAUSGABE);

		// Create resource
		createResource(eNS_URI);
	}

} //WissensbasismodelPackageImpl
