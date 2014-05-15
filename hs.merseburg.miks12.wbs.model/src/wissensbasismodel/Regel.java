/**
 */
package wissensbasismodel;

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
 *   <li>{@link wissensbasismodel.Regel#getPreamisse <em>Preamisse</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(long)
	 * @see wissensbasismodel.WissensbasismodelPackage#getRegel_ID()
	 * @model
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
	 * Returns the value of the '<em><b>Preamisse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preamisse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preamisse</em>' attribute.
	 * @see #setPreamisse(String)
	 * @see wissensbasismodel.WissensbasismodelPackage#getRegel_Preamisse()
	 * @model
	 * @generated
	 */
	String getPreamisse();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Regel#getPreamisse <em>Preamisse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preamisse</em>' attribute.
	 * @see #getPreamisse()
	 * @generated
	 */
	void setPreamisse(String value);

	/**
	 * Returns the value of the '<em><b>Konklusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Konklusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Konklusion</em>' attribute.
	 * @see #setKonklusion(String)
	 * @see wissensbasismodel.WissensbasismodelPackage#getRegel_Konklusion()
	 * @model
	 * @generated
	 */
	String getKonklusion();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Regel#getKonklusion <em>Konklusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Konklusion</em>' attribute.
	 * @see #getKonklusion()
	 * @generated
	 */
	void setKonklusion(String value);

} // Regel
