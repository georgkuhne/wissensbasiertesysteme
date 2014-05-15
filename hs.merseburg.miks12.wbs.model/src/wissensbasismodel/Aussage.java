/**
 */
package wissensbasismodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aussage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wissensbasismodel.Aussage#getID <em>ID</em>}</li>
 *   <li>{@link wissensbasismodel.Aussage#getWertebereich <em>Wertebereich</em>}</li>
 *   <li>{@link wissensbasismodel.Aussage#getFragetext <em>Fragetext</em>}</li>
 *   <li>{@link wissensbasismodel.Aussage#getDiagnosetext <em>Diagnosetext</em>}</li>
 * </ul>
 * </p>
 *
 * @see wissensbasismodel.WissensbasismodelPackage#getAussage()
 * @model
 * @generated
 */
public interface Aussage extends EObject {
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
	 * @see wissensbasismodel.WissensbasismodelPackage#getAussage_ID()
	 * @model
	 * @generated
	 */
	long getID();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Aussage#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(long value);

	/**
	 * Returns the value of the '<em><b>Wertebereich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wertebereich</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wertebereich</em>' attribute.
	 * @see #setWertebereich(String)
	 * @see wissensbasismodel.WissensbasismodelPackage#getAussage_Wertebereich()
	 * @model
	 * @generated
	 */
	String getWertebereich();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Aussage#getWertebereich <em>Wertebereich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wertebereich</em>' attribute.
	 * @see #getWertebereich()
	 * @generated
	 */
	void setWertebereich(String value);

	/**
	 * Returns the value of the '<em><b>Fragetext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragetext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragetext</em>' attribute.
	 * @see #setFragetext(String)
	 * @see wissensbasismodel.WissensbasismodelPackage#getAussage_Fragetext()
	 * @model
	 * @generated
	 */
	String getFragetext();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Aussage#getFragetext <em>Fragetext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragetext</em>' attribute.
	 * @see #getFragetext()
	 * @generated
	 */
	void setFragetext(String value);

	/**
	 * Returns the value of the '<em><b>Diagnosetext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosetext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosetext</em>' attribute.
	 * @see #setDiagnosetext(String)
	 * @see wissensbasismodel.WissensbasismodelPackage#getAussage_Diagnosetext()
	 * @model
	 * @generated
	 */
	String getDiagnosetext();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Aussage#getDiagnosetext <em>Diagnosetext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnosetext</em>' attribute.
	 * @see #getDiagnosetext()
	 * @generated
	 */
	void setDiagnosetext(String value);

} // Aussage
