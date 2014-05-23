/**
 */
package wissensbasismodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import wissensbasismodel.Konklusion;
import wissensbasismodel.Literal;
import wissensbasismodel.Regel;
import wissensbasismodel.WissensbasismodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wissensbasismodel.impl.RegelImpl#getID <em>ID</em>}</li>
 *   <li>{@link wissensbasismodel.impl.RegelImpl#getName <em>Name</em>}</li>
 *   <li>{@link wissensbasismodel.impl.RegelImpl#getPraemisse <em>Praemisse</em>}</li>
 *   <li>{@link wissensbasismodel.impl.RegelImpl#getKonklusion <em>Konklusion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegelImpl extends MinimalEObjectImpl.Container implements Regel {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPraemisse() <em>Praemisse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPraemisse()
	 * @generated
	 * @ordered
	 */
	protected EList<Literal> praemisse;

	/**
	 * The cached value of the '{@link #getKonklusion() <em>Konklusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKonklusion()
	 * @generated
	 * @ordered
	 */
	protected Konklusion konklusion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WissensbasismodelPackage.Literals.REGEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.REGEL__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.REGEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Literal> getPraemisse() {
		if (praemisse == null) {
			praemisse = new EObjectContainmentEList<Literal>(Literal.class, this, WissensbasismodelPackage.REGEL__PRAEMISSE);
		}
		return praemisse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Konklusion getKonklusion() {
		return konklusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKonklusion(Konklusion newKonklusion, NotificationChain msgs) {
		Konklusion oldKonklusion = konklusion;
		konklusion = newKonklusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.REGEL__KONKLUSION, oldKonklusion, newKonklusion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKonklusion(Konklusion newKonklusion) {
		if (newKonklusion != konklusion) {
			NotificationChain msgs = null;
			if (konklusion != null)
				msgs = ((InternalEObject)konklusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WissensbasismodelPackage.REGEL__KONKLUSION, null, msgs);
			if (newKonklusion != null)
				msgs = ((InternalEObject)newKonklusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WissensbasismodelPackage.REGEL__KONKLUSION, null, msgs);
			msgs = basicSetKonklusion(newKonklusion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.REGEL__KONKLUSION, newKonklusion, newKonklusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WissensbasismodelPackage.REGEL__PRAEMISSE:
				return ((InternalEList<?>)getPraemisse()).basicRemove(otherEnd, msgs);
			case WissensbasismodelPackage.REGEL__KONKLUSION:
				return basicSetKonklusion(null, msgs);
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
			case WissensbasismodelPackage.REGEL__ID:
				return getID();
			case WissensbasismodelPackage.REGEL__NAME:
				return getName();
			case WissensbasismodelPackage.REGEL__PRAEMISSE:
				return getPraemisse();
			case WissensbasismodelPackage.REGEL__KONKLUSION:
				return getKonklusion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WissensbasismodelPackage.REGEL__ID:
				setID((Long)newValue);
				return;
			case WissensbasismodelPackage.REGEL__NAME:
				setName((String)newValue);
				return;
			case WissensbasismodelPackage.REGEL__PRAEMISSE:
				getPraemisse().clear();
				getPraemisse().addAll((Collection<? extends Literal>)newValue);
				return;
			case WissensbasismodelPackage.REGEL__KONKLUSION:
				setKonklusion((Konklusion)newValue);
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
			case WissensbasismodelPackage.REGEL__ID:
				setID(ID_EDEFAULT);
				return;
			case WissensbasismodelPackage.REGEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WissensbasismodelPackage.REGEL__PRAEMISSE:
				getPraemisse().clear();
				return;
			case WissensbasismodelPackage.REGEL__KONKLUSION:
				setKonklusion((Konklusion)null);
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
			case WissensbasismodelPackage.REGEL__ID:
				return id != ID_EDEFAULT;
			case WissensbasismodelPackage.REGEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WissensbasismodelPackage.REGEL__PRAEMISSE:
				return praemisse != null && !praemisse.isEmpty();
			case WissensbasismodelPackage.REGEL__KONKLUSION:
				return konklusion != null;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RegelImpl
