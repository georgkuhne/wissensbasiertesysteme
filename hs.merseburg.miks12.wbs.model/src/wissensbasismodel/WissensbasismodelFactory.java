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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WissensbasismodelPackage getWissensbasismodelPackage();

} //WissensbasismodelFactory
