/**
 */
package wissensbasismodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bauteil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wissensbasismodel.Bauteil#getID <em>ID</em>}</li>
 *   <li>{@link wissensbasismodel.Bauteil#getName <em>Name</em>}</li>
 *   <li>{@link wissensbasismodel.Bauteil#getAsset_ID <em>Asset ID</em>}</li>
 *   <li>{@link wissensbasismodel.Bauteil#getIst_Teil_von <em>Ist Teil von</em>}</li>
 *   <li>{@link wissensbasismodel.Bauteil#getRegeln <em>Regeln</em>}</li>
 *   <li>{@link wissensbasismodel.Bauteil#getRegelgruppen <em>Regelgruppen</em>}</li>
 *   <li>{@link wissensbasismodel.Bauteil#getKoroutine <em>Koroutine</em>}</li>
 *   <li>{@link wissensbasismodel.Bauteil#getMedien <em>Medien</em>}</li>
 * </ul>
 * </p>
 *
 * @see wissensbasismodel.WissensbasismodelPackage#getBauteil()
 * @model
 * @generated
 */
public interface Bauteil extends EObject {
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
	 * @see wissensbasismodel.WissensbasismodelPackage#getBauteil_ID()
	 * @model id="true"
	 * @generated
	 */
	long getID();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Bauteil#getID <em>ID</em>}' attribute.
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
	 * @see wissensbasismodel.WissensbasismodelPackage#getBauteil_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Bauteil#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Asset ID</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset ID</em>' attribute.
	 * @see #setAsset_ID(String)
	 * @see wissensbasismodel.WissensbasismodelPackage#getBauteil_Asset_ID()
	 * @model default=""
	 * @generated
	 */
	String getAsset_ID();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Bauteil#getAsset_ID <em>Asset ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset ID</em>' attribute.
	 * @see #getAsset_ID()
	 * @generated
	 */
	void setAsset_ID(String value);

	/**
	 * Returns the value of the '<em><b>Ist Teil von</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ist Teil von</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ist Teil von</em>' attribute.
	 * @see #setIst_Teil_von(String)
	 * @see wissensbasismodel.WissensbasismodelPackage#getBauteil_Ist_Teil_von()
	 * @model
	 * @generated
	 */
	String getIst_Teil_von();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Bauteil#getIst_Teil_von <em>Ist Teil von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ist Teil von</em>' attribute.
	 * @see #getIst_Teil_von()
	 * @generated
	 */
	void setIst_Teil_von(String value);

	/**
	 * Returns the value of the '<em><b>Regeln</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regeln</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regeln</em>' attribute.
	 * @see #setRegeln(String)
	 * @see wissensbasismodel.WissensbasismodelPackage#getBauteil_Regeln()
	 * @model
	 * @generated
	 */
	String getRegeln();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Bauteil#getRegeln <em>Regeln</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regeln</em>' attribute.
	 * @see #getRegeln()
	 * @generated
	 */
	void setRegeln(String value);

	/**
	 * Returns the value of the '<em><b>Regelgruppen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regelgruppen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regelgruppen</em>' attribute.
	 * @see #setRegelgruppen(String)
	 * @see wissensbasismodel.WissensbasismodelPackage#getBauteil_Regelgruppen()
	 * @model
	 * @generated
	 */
	String getRegelgruppen();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Bauteil#getRegelgruppen <em>Regelgruppen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regelgruppen</em>' attribute.
	 * @see #getRegelgruppen()
	 * @generated
	 */
	void setRegelgruppen(String value);

	/**
	 * Returns the value of the '<em><b>Koroutine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Koroutine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Koroutine</em>' attribute.
	 * @see #setKoroutine(String)
	 * @see wissensbasismodel.WissensbasismodelPackage#getBauteil_Koroutine()
	 * @model
	 * @generated
	 */
	String getKoroutine();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Bauteil#getKoroutine <em>Koroutine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Koroutine</em>' attribute.
	 * @see #getKoroutine()
	 * @generated
	 */
	void setKoroutine(String value);

	/**
	 * Returns the value of the '<em><b>Medien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medien</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medien</em>' attribute.
	 * @see #setMedien(byte)
	 * @see wissensbasismodel.WissensbasismodelPackage#getBauteil_Medien()
	 * @model
	 * @generated
	 */
	byte getMedien();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Bauteil#getMedien <em>Medien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medien</em>' attribute.
	 * @see #getMedien()
	 * @generated
	 */
	void setMedien(byte value);

} // Bauteil
