/**
 */
package wissensbasismodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import wissensbasismodel.Aussage;
import wissensbasismodel.Bauteil;
import wissensbasismodel.Regel;
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
	public EAttribute getRegel_Preamisse() {
		return (EAttribute)regelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegel_Konklusion() {
		return (EAttribute)regelEClass.getEStructuralFeatures().get(3);
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
		createEAttribute(regelEClass, REGEL__PREAMISSE);
		createEAttribute(regelEClass, REGEL__KONKLUSION);

		aussageEClass = createEClass(AUSSAGE);
		createEAttribute(aussageEClass, AUSSAGE__ID);
		createEAttribute(aussageEClass, AUSSAGE__WERTEBEREICH);
		createEAttribute(aussageEClass, AUSSAGE__FRAGETEXT);
		createEAttribute(aussageEClass, AUSSAGE__DIAGNOSETEXT);
		createEAttribute(aussageEClass, AUSSAGE__NAME);
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
		initEReference(getWissensBasis_Aussagen(), this.getAussage(), null, "aussagen", null, 0, -1, WissensBasis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getRegel_ID(), ecorePackage.getELong(), "ID", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegel_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegel_Preamisse(), ecorePackage.getEString(), "Preamisse", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegel_Konklusion(), ecorePackage.getEString(), "Konklusion", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aussageEClass, Aussage.class, "Aussage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAussage_ID(), ecorePackage.getELong(), "ID", null, 0, 1, Aussage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAussage_Wertebereich(), ecorePackage.getEString(), "Wertebereich", null, 0, 1, Aussage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAussage_Fragetext(), ecorePackage.getEString(), "Fragetext", null, 0, 1, Aussage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAussage_Diagnosetext(), ecorePackage.getEString(), "Diagnosetext", null, 0, 1, Aussage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAussage_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Aussage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WissensbasismodelPackageImpl
