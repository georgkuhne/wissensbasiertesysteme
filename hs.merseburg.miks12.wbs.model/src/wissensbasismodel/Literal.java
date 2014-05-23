/**
 */
package wissensbasismodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wissensbasismodel.Literal#getAussage <em>Aussage</em>}</li>
 *   <li>{@link wissensbasismodel.Literal#getWert <em>Wert</em>}</li>
 *   <li>{@link wissensbasismodel.Literal#getPraedikat <em>Praedikat</em>}</li>
 *   <li>{@link wissensbasismodel.Literal#getID <em>ID</em>}</li>
 *   <li>{@link wissensbasismodel.Literal#getInnerLogikOperator <em>Inner Logik Operator</em>}</li>
 *   <li>{@link wissensbasismodel.Literal#getOutLogicOperator <em>Out Logic Operator</em>}</li>
 *   <li>{@link wissensbasismodel.Literal#isNOT <em>NOT</em>}</li>
 *   <li>{@link wissensbasismodel.Literal#isKlammerAuf <em>Klammer Auf</em>}</li>
 *   <li>{@link wissensbasismodel.Literal#isKlammerZu <em>Klammer Zu</em>}</li>
 * </ul>
 * </p>
 *
 * @see wissensbasismodel.WissensbasismodelPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends EObject {
	/**
	 * Returns the value of the '<em><b>Aussage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aussage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aussage</em>' reference.
	 * @see #setAussage(Aussage)
	 * @see wissensbasismodel.WissensbasismodelPackage#getLiteral_Aussage()
	 * @model required="true"
	 * @generated
	 */
	Aussage getAussage();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Literal#getAussage <em>Aussage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aussage</em>' reference.
	 * @see #getAussage()
	 * @generated
	 */
	void setAussage(Aussage value);

	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wert</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #setWert(String)
	 * @see wissensbasismodel.WissensbasismodelPackage#getLiteral_Wert()
	 * @model
	 * @generated
	 */
	String getWert();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Literal#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #getWert()
	 * @generated
	 */
	void setWert(String value);

	/**
	 * Returns the value of the '<em><b>Praedikat</b></em>' attribute.
	 * The default value is <code>"NULL"</code>.
	 * The literals are from the enumeration {@link wissensbasismodel.LiteralOperatorenPraedikat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Praedikat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Praedikat</em>' attribute.
	 * @see wissensbasismodel.LiteralOperatorenPraedikat
	 * @see #setPraedikat(LiteralOperatorenPraedikat)
	 * @see wissensbasismodel.WissensbasismodelPackage#getLiteral_Praedikat()
	 * @model default="NULL"
	 * @generated
	 */
	LiteralOperatorenPraedikat getPraedikat();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Literal#getPraedikat <em>Praedikat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Praedikat</em>' attribute.
	 * @see wissensbasismodel.LiteralOperatorenPraedikat
	 * @see #getPraedikat()
	 * @generated
	 */
	void setPraedikat(LiteralOperatorenPraedikat value);

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
	 * @see wissensbasismodel.WissensbasismodelPackage#getLiteral_ID()
	 * @model id="true"
	 * @generated
	 */
	long getID();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Literal#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(long value);

	/**
	 * Returns the value of the '<em><b>Inner Logik Operator</b></em>' attribute.
	 * The default value is <code>"NULL"</code>.
	 * The literals are from the enumeration {@link wissensbasismodel.LiteralOperatorenLogik}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Logik Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Logik Operator</em>' attribute.
	 * @see wissensbasismodel.LiteralOperatorenLogik
	 * @see #setInnerLogikOperator(LiteralOperatorenLogik)
	 * @see wissensbasismodel.WissensbasismodelPackage#getLiteral_InnerLogikOperator()
	 * @model default="NULL"
	 * @generated
	 */
	LiteralOperatorenLogik getInnerLogikOperator();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Literal#getInnerLogikOperator <em>Inner Logik Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Logik Operator</em>' attribute.
	 * @see wissensbasismodel.LiteralOperatorenLogik
	 * @see #getInnerLogikOperator()
	 * @generated
	 */
	void setInnerLogikOperator(LiteralOperatorenLogik value);

	/**
	 * Returns the value of the '<em><b>Out Logic Operator</b></em>' attribute.
	 * The default value is <code>"NULL"</code>.
	 * The literals are from the enumeration {@link wissensbasismodel.LiteralOperatorenLogik}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Logic Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Logic Operator</em>' attribute.
	 * @see wissensbasismodel.LiteralOperatorenLogik
	 * @see #setOutLogicOperator(LiteralOperatorenLogik)
	 * @see wissensbasismodel.WissensbasismodelPackage#getLiteral_OutLogicOperator()
	 * @model default="NULL"
	 * @generated
	 */
	LiteralOperatorenLogik getOutLogicOperator();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Literal#getOutLogicOperator <em>Out Logic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Logic Operator</em>' attribute.
	 * @see wissensbasismodel.LiteralOperatorenLogik
	 * @see #getOutLogicOperator()
	 * @generated
	 */
	void setOutLogicOperator(LiteralOperatorenLogik value);

	/**
	 * Returns the value of the '<em><b>NOT</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NOT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NOT</em>' attribute.
	 * @see #setNOT(boolean)
	 * @see wissensbasismodel.WissensbasismodelPackage#getLiteral_NOT()
	 * @model default="false"
	 * @generated
	 */
	boolean isNOT();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Literal#isNOT <em>NOT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NOT</em>' attribute.
	 * @see #isNOT()
	 * @generated
	 */
	void setNOT(boolean value);

	/**
	 * Returns the value of the '<em><b>Klammer Auf</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Klammer Auf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Klammer Auf</em>' attribute.
	 * @see #setKlammerAuf(boolean)
	 * @see wissensbasismodel.WissensbasismodelPackage#getLiteral_KlammerAuf()
	 * @model default="false"
	 * @generated
	 */
	boolean isKlammerAuf();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Literal#isKlammerAuf <em>Klammer Auf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Klammer Auf</em>' attribute.
	 * @see #isKlammerAuf()
	 * @generated
	 */
	void setKlammerAuf(boolean value);

	/**
	 * Returns the value of the '<em><b>Klammer Zu</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Klammer Zu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Klammer Zu</em>' attribute.
	 * @see #setKlammerZu(boolean)
	 * @see wissensbasismodel.WissensbasismodelPackage#getLiteral_KlammerZu()
	 * @model default="false"
	 * @generated
	 */
	boolean isKlammerZu();

	/**
	 * Sets the value of the '{@link wissensbasismodel.Literal#isKlammerZu <em>Klammer Zu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Klammer Zu</em>' attribute.
	 * @see #isKlammerZu()
	 * @generated
	 */
	void setKlammerZu(boolean value);

} // Literal
