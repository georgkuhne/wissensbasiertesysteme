/**
 */
package wissensbasismodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import wissensbasismodel.Aussage;
import wissensbasismodel.Konklusion;
import wissensbasismodel.KonklusionsTyp;
import wissensbasismodel.Literal;
import wissensbasismodel.WissensbasismodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Konklusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wissensbasismodel.impl.KonklusionImpl#getKonklusionTyp <em>Konklusion Typ</em>}</li>
 *   <li>{@link wissensbasismodel.impl.KonklusionImpl#getTextausgabe <em>Textausgabe</em>}</li>
 *   <li>{@link wissensbasismodel.impl.KonklusionImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link wissensbasismodel.impl.KonklusionImpl#getDiagnoseaussage <em>Diagnoseaussage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KonklusionImpl extends MinimalEObjectImpl.Container implements Konklusion {
	/**
	 * The default value of the '{@link #getKonklusionTyp() <em>Konklusion Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKonklusionTyp()
	 * @generated
	 * @ordered
	 */
	protected static final KonklusionsTyp KONKLUSION_TYP_EDEFAULT = KonklusionsTyp.LITERAL;

	/**
	 * The cached value of the '{@link #getKonklusionTyp() <em>Konklusion Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKonklusionTyp()
	 * @generated
	 * @ordered
	 */
	protected KonklusionsTyp konklusionTyp = KONKLUSION_TYP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextausgabe() <em>Textausgabe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextausgabe()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTAUSGABE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextausgabe() <em>Textausgabe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextausgabe()
	 * @generated
	 * @ordered
	 */
	protected String textausgabe = TEXTAUSGABE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected Literal literal;

	/**
	 * The cached value of the '{@link #getDiagnoseaussage() <em>Diagnoseaussage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnoseaussage()
	 * @generated
	 * @ordered
	 */
	protected Aussage diagnoseaussage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KonklusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WissensbasismodelPackage.Literals.KONKLUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KonklusionsTyp getKonklusionTyp() {
		return konklusionTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKonklusionTyp(KonklusionsTyp newKonklusionTyp) {
		KonklusionsTyp oldKonklusionTyp = konklusionTyp;
		konklusionTyp = newKonklusionTyp == null ? KONKLUSION_TYP_EDEFAULT : newKonklusionTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.KONKLUSION__KONKLUSION_TYP, oldKonklusionTyp, konklusionTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextausgabe() {
		return textausgabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextausgabe(String newTextausgabe) {
		String oldTextausgabe = textausgabe;
		textausgabe = newTextausgabe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.KONKLUSION__TEXTAUSGABE, oldTextausgabe, textausgabe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteral(Literal newLiteral, NotificationChain msgs) {
		Literal oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.KONKLUSION__LITERAL, oldLiteral, newLiteral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(Literal newLiteral) {
		if (newLiteral != literal) {
			NotificationChain msgs = null;
			if (literal != null)
				msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WissensbasismodelPackage.KONKLUSION__LITERAL, null, msgs);
			if (newLiteral != null)
				msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WissensbasismodelPackage.KONKLUSION__LITERAL, null, msgs);
			msgs = basicSetLiteral(newLiteral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.KONKLUSION__LITERAL, newLiteral, newLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussage getDiagnoseaussage() {
		if (diagnoseaussage != null && diagnoseaussage.eIsProxy()) {
			InternalEObject oldDiagnoseaussage = (InternalEObject)diagnoseaussage;
			diagnoseaussage = (Aussage)eResolveProxy(oldDiagnoseaussage);
			if (diagnoseaussage != oldDiagnoseaussage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WissensbasismodelPackage.KONKLUSION__DIAGNOSEAUSSAGE, oldDiagnoseaussage, diagnoseaussage));
			}
		}
		return diagnoseaussage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussage basicGetDiagnoseaussage() {
		return diagnoseaussage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnoseaussage(Aussage newDiagnoseaussage) {
		Aussage oldDiagnoseaussage = diagnoseaussage;
		diagnoseaussage = newDiagnoseaussage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.KONKLUSION__DIAGNOSEAUSSAGE, oldDiagnoseaussage, diagnoseaussage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WissensbasismodelPackage.KONKLUSION__LITERAL:
				return basicSetLiteral(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WissensbasismodelPackage.KONKLUSION__KONKLUSION_TYP:
				return getKonklusionTyp();
			case WissensbasismodelPackage.KONKLUSION__TEXTAUSGABE:
				return getTextausgabe();
			case WissensbasismodelPackage.KONKLUSION__LITERAL:
				return getLiteral();
			case WissensbasismodelPackage.KONKLUSION__DIAGNOSEAUSSAGE:
				if (resolve) return getDiagnoseaussage();
				return basicGetDiagnoseaussage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WissensbasismodelPackage.KONKLUSION__KONKLUSION_TYP:
				setKonklusionTyp((KonklusionsTyp)newValue);
				return;
			case WissensbasismodelPackage.KONKLUSION__TEXTAUSGABE:
				setTextausgabe((String)newValue);
				return;
			case WissensbasismodelPackage.KONKLUSION__LITERAL:
				setLiteral((Literal)newValue);
				return;
			case WissensbasismodelPackage.KONKLUSION__DIAGNOSEAUSSAGE:
				setDiagnoseaussage((Aussage)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WissensbasismodelPackage.KONKLUSION__KONKLUSION_TYP:
				setKonklusionTyp(KONKLUSION_TYP_EDEFAULT);
				return;
			case WissensbasismodelPackage.KONKLUSION__TEXTAUSGABE:
				setTextausgabe(TEXTAUSGABE_EDEFAULT);
				return;
			case WissensbasismodelPackage.KONKLUSION__LITERAL:
				setLiteral((Literal)null);
				return;
			case WissensbasismodelPackage.KONKLUSION__DIAGNOSEAUSSAGE:
				setDiagnoseaussage((Aussage)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WissensbasismodelPackage.KONKLUSION__KONKLUSION_TYP:
				return konklusionTyp != KONKLUSION_TYP_EDEFAULT;
			case WissensbasismodelPackage.KONKLUSION__TEXTAUSGABE:
				return TEXTAUSGABE_EDEFAULT == null ? textausgabe != null : !TEXTAUSGABE_EDEFAULT.equals(textausgabe);
			case WissensbasismodelPackage.KONKLUSION__LITERAL:
				return literal != null;
			case WissensbasismodelPackage.KONKLUSION__DIAGNOSEAUSSAGE:
				return diagnoseaussage != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (konklusionTyp: ");
		result.append(konklusionTyp);
		result.append(", Textausgabe: ");
		result.append(textausgabe);
		result.append(')');
		return result.toString();
	}

} //KonklusionImpl
