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
	 * The number of structural features of the '<em>Wissens Basis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WISSENS_BASIS_FEATURE_COUNT = 3;

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
	 * The number of structural features of the '<em>Bauteil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUTEIL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bauteil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAUTEIL_OPERATION_COUNT = 0;


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

	}

} //WissensbasismodelPackage
