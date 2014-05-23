/**
 */
package wissensbasismodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see wissensbasismodel.WissensbasismodelPackage
 * @generated
 */
public interface WissensbasismodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WissensbasismodelFactory eINSTANCE = wissensbasismodel.impl.WissensbasismodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Wissens Basis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wissens Basis</em>'.
	 * @generated
	 */
	WissensBasis createWissensBasis();

	/**
	 * Returns a new object of class '<em>Bauteil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bauteil</em>'.
	 * @generated
	 */
	Bauteil createBauteil();

	/**
	 * Returns a new object of class '<em>Regel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regel</em>'.
	 * @generated
	 */
	Regel createRegel();

	/**
	 * Returns a new object of class '<em>Aussage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aussage</em>'.
	 * @generated
	 */
	Aussage createAussage();

	/**
	 * Returns a new object of class '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>Konklusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Konklusion</em>'.
	 * @generated
	 */
	Konklusion createKonklusion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WissensbasismodelPackage getWissensbasismodelPackage();

} //WissensbasismodelFactory
