/**
 */
package wissensbasismodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Konklusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wissensbasismodel.Konklusion#getKonklusionTyp <em>Konklusion Typ</em>}</li>
 *   <li>{@link wissensbasismodel.Konklusion#getDiagnoseText <em>Diagnose Text</em>}</li>
 *   <li>{@link wissensbasismodel.Konklusion#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see wissensbasismodel.WissensbasismodelPackage#getKonklusion()
 * @model
 * @generated
 */
public interface Konklusion extends EObject {
	/**
	 * Returns the value of the '<em><b>Konklusion Typ</b></em>' attribute.
	 * The literals are from the enumeration {@link wissensbasismodel.KonklusionsTyp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Konklusion Typ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Konklusion Typ</em>' attribute.
	 * @see wissensbasismodel.KonklusionsTyp
	 * @see #setKonklusionTyp(KonklusionsTyp)
	 * @see wissensbasismodel.WissensbasismodelPackage#getKonklusion_KonklusionTyp()
	 * @model
	 * @generated
	 */
	KonklusionsTyp getKonklusionTyp();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Konklusion#getKonklusionTyp <em>Konklusion Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Konklusion Typ</em>' attribute.
	 * @see wissensbasismodel.KonklusionsTyp
	 * @see #getKonklusionTyp()
	 * @generated
	 */
	void setKonklusionTyp(KonklusionsTyp value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(Literal)
	 * @see wissensbasismodel.WissensbasismodelPackage#getKonklusion_Literal()
	 * @model containment="true"
	 * @generated
	 */
	Literal getLiteral();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Konklusion#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(Literal value);

	/**
	 * Returns the value of the '<em><b>Diagnose Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnose Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnose Text</em>' attribute.
	 * @see #setDiagnoseText(String)
	 * @see wissensbasismodel.WissensbasismodelPackage#getKonklusion_DiagnoseText()
	 * @model
	 * @generated
	 */
	String getDiagnoseText();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Konklusion#getDiagnoseText <em>Diagnose Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnose Text</em>' attribute.
	 * @see #getDiagnoseText()
	 * @generated
	 */
	void setDiagnoseText(String value);

} // Konklusion
