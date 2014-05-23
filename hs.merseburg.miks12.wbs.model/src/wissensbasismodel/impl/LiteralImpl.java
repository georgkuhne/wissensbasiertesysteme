/**
 */
package wissensbasismodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import wissensbasismodel.Aussage;
import wissensbasismodel.Literal;
import wissensbasismodel.LiteralOperatorenLogik;
import wissensbasismodel.LiteralOperatorenPraedikat;
import wissensbasismodel.WissensbasismodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wissensbasismodel.impl.LiteralImpl#getAussage <em>Aussage</em>}</li>
 *   <li>{@link wissensbasismodel.impl.LiteralImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link wissensbasismodel.impl.LiteralImpl#getPraedikat <em>Praedikat</em>}</li>
 *   <li>{@link wissensbasismodel.impl.LiteralImpl#getID <em>ID</em>}</li>
 *   <li>{@link wissensbasismodel.impl.LiteralImpl#getInnerLogikOperator <em>Inner Logik Operator</em>}</li>
 *   <li>{@link wissensbasismodel.impl.LiteralImpl#getOutLogicOperator <em>Out Logic Operator</em>}</li>
 *   <li>{@link wissensbasismodel.impl.LiteralImpl#isNOT <em>NOT</em>}</li>
 *   <li>{@link wissensbasismodel.impl.LiteralImpl#isKlammerAuf <em>Klammer Auf</em>}</li>
 *   <li>{@link wissensbasismodel.impl.LiteralImpl#isKlammerZu <em>Klammer Zu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralImpl extends MinimalEObjectImpl.Container implements Literal {
	/**
	 * The cached value of the '{@link #getAussage() <em>Aussage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAussage()
	 * @generated
	 * @ordered
	 */
	protected Aussage aussage;

	/**
	 * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected static final String WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected String wert = WERT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPraedikat() <em>Praedikat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPraedikat()
	 * @generated
	 * @ordered
	 */
	protected static final LiteralOperatorenPraedikat PRAEDIKAT_EDEFAULT = LiteralOperatorenPraedikat.NULL;

	/**
	 * The cached value of the '{@link #getPraedikat() <em>Praedikat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPraedikat()
	 * @generated
	 * @ordered
	 */
	protected LiteralOperatorenPraedikat praedikat = PRAEDIKAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInnerLogikOperator() <em>Inner Logik Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerLogikOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LiteralOperatorenLogik INNER_LOGIK_OPERATOR_EDEFAULT = LiteralOperatorenLogik.NULL;

	/**
	 * The cached value of the '{@link #getInnerLogikOperator() <em>Inner Logik Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerLogikOperator()
	 * @generated
	 * @ordered
	 */
	protected LiteralOperatorenLogik innerLogikOperator = INNER_LOGIK_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutLogicOperator() <em>Out Logic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutLogicOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LiteralOperatorenLogik OUT_LOGIC_OPERATOR_EDEFAULT = LiteralOperatorenLogik.NULL;

	/**
	 * The cached value of the '{@link #getOutLogicOperator() <em>Out Logic Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutLogicOperator()
	 * @generated
	 * @ordered
	 */
	protected LiteralOperatorenLogik outLogicOperator = OUT_LOGIC_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isNOT() <em>NOT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNOT()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNOT() <em>NOT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNOT()
	 * @generated
	 * @ordered
	 */
	protected boolean not = NOT_EDEFAULT;

	/**
	 * The default value of the '{@link #isKlammerAuf() <em>Klammer Auf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKlammerAuf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KLAMMER_AUF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKlammerAuf() <em>Klammer Auf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKlammerAuf()
	 * @generated
	 * @ordered
	 */
	protected boolean klammerAuf = KLAMMER_AUF_EDEFAULT;

	/**
	 * The default value of the '{@link #isKlammerZu() <em>Klammer Zu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKlammerZu()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KLAMMER_ZU_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKlammerZu() <em>Klammer Zu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKlammerZu()
	 * @generated
	 * @ordered
	 */
	protected boolean klammerZu = KLAMMER_ZU_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WissensbasismodelPackage.Literals.LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussage getAussage() {
		if (aussage != null && aussage.eIsProxy()) {
			InternalEObject oldAussage = (InternalEObject)aussage;
			aussage = (Aussage)eResolveProxy(oldAussage);
			if (aussage != oldAussage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WissensbasismodelPackage.LITERAL__AUSSAGE, oldAussage, aussage));
			}
		}
		return aussage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussage basicGetAussage() {
		return aussage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAussage(Aussage newAussage) {
		Aussage oldAussage = aussage;
		aussage = newAussage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.LITERAL__AUSSAGE, oldAussage, aussage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWert() {
		return wert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWert(String newWert) {
		String oldWert = wert;
		wert = newWert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.LITERAL__WERT, oldWert, wert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralOperatorenPraedikat getPraedikat() {
		return praedikat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPraedikat(LiteralOperatorenPraedikat newPraedikat) {
		LiteralOperatorenPraedikat oldPraedikat = praedikat;
		praedikat = newPraedikat == null ? PRAEDIKAT_EDEFAULT : newPraedikat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.LITERAL__PRAEDIKAT, oldPraedikat, praedikat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(long newID) {
		long oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.LITERAL__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralOperatorenLogik getInnerLogikOperator() {
		return innerLogikOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerLogikOperator(LiteralOperatorenLogik newInnerLogikOperator) {
		LiteralOperatorenLogik oldInnerLogikOperator = innerLogikOperator;
		innerLogikOperator = newInnerLogikOperator == null ? INNER_LOGIK_OPERATOR_EDEFAULT : newInnerLogikOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.LITERAL__INNER_LOGIK_OPERATOR, oldInnerLogikOperator, innerLogikOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralOperatorenLogik getOutLogicOperator() {
		return outLogicOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutLogicOperator(LiteralOperatorenLogik newOutLogicOperator) {
		LiteralOperatorenLogik oldOutLogicOperator = outLogicOperator;
		outLogicOperator = newOutLogicOperator == null ? OUT_LOGIC_OPERATOR_EDEFAULT : newOutLogicOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.LITERAL__OUT_LOGIC_OPERATOR, oldOutLogicOperator, outLogicOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNOT() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNOT(boolean newNOT) {
		boolean oldNOT = not;
		not = newNOT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.LITERAL__NOT, oldNOT, not));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKlammerAuf() {
		return klammerAuf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKlammerAuf(boolean newKlammerAuf) {
		boolean oldKlammerAuf = klammerAuf;
		klammerAuf = newKlammerAuf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.LITERAL__KLAMMER_AUF, oldKlammerAuf, klammerAuf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKlammerZu() {
		return klammerZu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKlammerZu(boolean newKlammerZu) {
		boolean oldKlammerZu = klammerZu;
		klammerZu = newKlammerZu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.LITERAL__KLAMMER_ZU, oldKlammerZu, klammerZu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WissensbasismodelPackage.LITERAL__AUSSAGE:
				if (resolve) return getAussage();
				return basicGetAussage();
			case WissensbasismodelPackage.LITERAL__WERT:
				return getWert();
			case WissensbasismodelPackage.LITERAL__PRAEDIKAT:
				return getPraedikat();
			case WissensbasismodelPackage.LITERAL__ID:
				return getID();
			case WissensbasismodelPackage.LITERAL__INNER_LOGIK_OPERATOR:
				return getInnerLogikOperator();
			case WissensbasismodelPackage.LITERAL__OUT_LOGIC_OPERATOR:
				return getOutLogicOperator();
			case WissensbasismodelPackage.LITERAL__NOT:
				return isNOT();
			case WissensbasismodelPackage.LITERAL__KLAMMER_AUF:
				return isKlammerAuf();
			case WissensbasismodelPackage.LITERAL__KLAMMER_ZU:
				return isKlammerZu();
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
			case WissensbasismodelPackage.LITERAL__AUSSAGE:
				setAussage((Aussage)newValue);
				return;
			case WissensbasismodelPackage.LITERAL__WERT:
				setWert((String)newValue);
				return;
			case WissensbasismodelPackage.LITERAL__PRAEDIKAT:
				setPraedikat((LiteralOperatorenPraedikat)newValue);
				return;
			case WissensbasismodelPackage.LITERAL__ID:
				setID((Long)newValue);
				return;
			case WissensbasismodelPackage.LITERAL__INNER_LOGIK_OPERATOR:
				setInnerLogikOperator((LiteralOperatorenLogik)newValue);
				return;
			case WissensbasismodelPackage.LITERAL__OUT_LOGIC_OPERATOR:
				setOutLogicOperator((LiteralOperatorenLogik)newValue);
				return;
			case WissensbasismodelPackage.LITERAL__NOT:
				setNOT((Boolean)newValue);
				return;
			case WissensbasismodelPackage.LITERAL__KLAMMER_AUF:
				setKlammerAuf((Boolean)newValue);
				return;
			case WissensbasismodelPackage.LITERAL__KLAMMER_ZU:
				setKlammerZu((Boolean)newValue);
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
			case WissensbasismodelPackage.LITERAL__AUSSAGE:
				setAussage((Aussage)null);
				return;
			case WissensbasismodelPackage.LITERAL__WERT:
				setWert(WERT_EDEFAULT);
				return;
			case WissensbasismodelPackage.LITERAL__PRAEDIKAT:
				setPraedikat(PRAEDIKAT_EDEFAULT);
				return;
			case WissensbasismodelPackage.LITERAL__ID:
				setID(ID_EDEFAULT);
				return;
			case WissensbasismodelPackage.LITERAL__INNER_LOGIK_OPERATOR:
				setInnerLogikOperator(INNER_LOGIK_OPERATOR_EDEFAULT);
				return;
			case WissensbasismodelPackage.LITERAL__OUT_LOGIC_OPERATOR:
				setOutLogicOperator(OUT_LOGIC_OPERATOR_EDEFAULT);
				return;
			case WissensbasismodelPackage.LITERAL__NOT:
				setNOT(NOT_EDEFAULT);
				return;
			case WissensbasismodelPackage.LITERAL__KLAMMER_AUF:
				setKlammerAuf(KLAMMER_AUF_EDEFAULT);
				return;
			case WissensbasismodelPackage.LITERAL__KLAMMER_ZU:
				setKlammerZu(KLAMMER_ZU_EDEFAULT);
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
			case WissensbasismodelPackage.LITERAL__AUSSAGE:
				return aussage != null;
			case WissensbasismodelPackage.LITERAL__WERT:
				return WERT_EDEFAULT == null ? wert != null : !WERT_EDEFAULT.equals(wert);
			case WissensbasismodelPackage.LITERAL__PRAEDIKAT:
				return praedikat != PRAEDIKAT_EDEFAULT;
			case WissensbasismodelPackage.LITERAL__ID:
				return id != ID_EDEFAULT;
			case WissensbasismodelPackage.LITERAL__INNER_LOGIK_OPERATOR:
				return innerLogikOperator != INNER_LOGIK_OPERATOR_EDEFAULT;
			case WissensbasismodelPackage.LITERAL__OUT_LOGIC_OPERATOR:
				return outLogicOperator != OUT_LOGIC_OPERATOR_EDEFAULT;
			case WissensbasismodelPackage.LITERAL__NOT:
				return not != NOT_EDEFAULT;
			case WissensbasismodelPackage.LITERAL__KLAMMER_AUF:
				return klammerAuf != KLAMMER_AUF_EDEFAULT;
			case WissensbasismodelPackage.LITERAL__KLAMMER_ZU:
				return klammerZu != KLAMMER_ZU_EDEFAULT;
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
		result.append(" (wert: ");
		result.append(wert);
		result.append(", praedikat: ");
		result.append(praedikat);
		result.append(", ID: ");
		result.append(id);
		result.append(", innerLogikOperator: ");
		result.append(innerLogikOperator);
		result.append(", outLogicOperator: ");
		result.append(outLogicOperator);
		result.append(", NOT: ");
		result.append(not);
		result.append(", klammerAuf: ");
		result.append(klammerAuf);
		result.append(", klammerZu: ");
		result.append(klammerZu);
		result.append(')');
		return result.toString();
	}

} //LiteralImpl
