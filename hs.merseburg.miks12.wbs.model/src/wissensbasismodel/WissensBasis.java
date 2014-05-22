/**
 */
package wissensbasismodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wissens Basis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wissensbasismodel.WissensBasis#getName <em>Name</em>}</li>
 *   <li>{@link wissensbasismodel.WissensBasis#getID <em>ID</em>}</li>
 *   <li>{@link wissensbasismodel.WissensBasis#getBauteile <em>Bauteile</em>}</li>
 *   <li>{@link wissensbasismodel.WissensBasis#getRegeln <em>Regeln</em>}</li>
 *   <li>{@link wissensbasismodel.WissensBasis#getAussagen <em>Aussagen</em>}</li>
 * </ul>
 * </p>
 *
 * @see wissensbasismodel.WissensbasismodelPackage#getWissensBasis()
 * @model
 * @generated
 */
public interface WissensBasis extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wissensbasismodel.WissensbasismodelPackage#getWissensBasis_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wissensbasismodel.WissensBasis#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(long)
	 * @see wissensbasismodel.WissensbasismodelPackage#getWissensBasis_ID()
	 * @model id="true"
	 * @generated
	 */
	long getID();

	/**
	 * Sets the value of the '{@link wissensbasismodel.WissensBasis#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(long value);

	/**
	 * Returns the value of the '<em><b>Bauteile</b></em>' containment reference list.
	 * The list contents are of type {@link wissensbasismodel.Bauteil}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bauteile</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bauteile</em>' containment reference list.
	 * @see wissensbasismodel.WissensbasismodelPackage#getWissensBasis_Bauteile()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bauteil> getBauteile();

	/**
	 * Returns the value of the '<em><b>Regeln</b></em>' containment reference list.
	 * The list contents are of type {@link wissensbasismodel.Regel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regeln</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regeln</em>' containment reference list.
	 * @see wissensbasismodel.WissensbasismodelPackage#getWissensBasis_Regeln()
	 * @model containment="true"
	 * @generated
	 */
	EList<Regel> getRegeln();

	/**
	 * Returns the value of the '<em><b>Aussagen</b></em>' containment reference list.
	 * The list contents are of type {@link wissensbasismodel.Aussage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aussagen</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aussagen</em>' containment reference list.
	 * @see wissensbasismodel.WissensbasismodelPackage#getWissensBasis_Aussagen()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aussage> getAussagen();
} // WissensBasis
