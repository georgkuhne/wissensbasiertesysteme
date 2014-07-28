/**
 */
package wissensbasismodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wissensbasismodel.Regel#getID <em>ID</em>}</li>
 *   <li>{@link wissensbasismodel.Regel#getName <em>Name</em>}</li>
 *   <li>{@link wissensbasismodel.Regel#getPraemisse <em>Praemisse</em>}</li>
 *   <li>{@link wissensbasismodel.Regel#getKonklusion <em>Konklusion</em>}</li>
 * </ul>
 * </p>
 *
 * @see wissensbasismodel.WissensbasismodelPackage#getRegel()
 * @model
 * @generated
 */
public interface Regel extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(long)
	 * @see wissensbasismodel.WissensbasismodelPackage#getRegel_ID()
	 * @model default="0" id="true"
	 * @generated
	 */
	long getID();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Regel#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(long value);

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
	 * @see wissensbasismodel.WissensbasismodelPackage#getRegel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Regel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Praemisse</b></em>' containment reference list.
	 * The list contents are of type {@link wissensbasismodel.Literal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Praemisse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Praemisse</em>' containment reference list.
	 * @see wissensbasismodel.WissensbasismodelPackage#getRegel_Praemisse()
	 * @model containment="true"
	 * @generated
	 */
	EList<Literal> getPraemisse();

	/**
	 * Returns the value of the '<em><b>Konklusion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Konklusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Konklusion</em>' reference.
	 * @see #setKonklusion(Konklusion)
	 * @see wissensbasismodel.WissensbasismodelPackage#getRegel_Konklusion()
	 * @model
	 * @generated
	 */
	Konklusion getKonklusion();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Regel#getKonklusion <em>Konklusion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Konklusion</em>' reference.
	 * @see #getKonklusion()
	 * @generated
	 */
	void setKonklusion(Konklusion value);

} // Regel
