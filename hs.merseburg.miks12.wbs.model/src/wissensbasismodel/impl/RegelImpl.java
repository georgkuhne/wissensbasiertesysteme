/**
 */
package wissensbasismodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link wissensbasismodel.impl.RegelImpl#getPreamisse <em>Preamisse</em>}</li>
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
	 * The default value of the '{@link #getPreamisse() <em>Preamisse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreamisse()
	 * @generated
	 * @ordered
	 */
	protected static final String PREAMISSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreamisse() <em>Preamisse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreamisse()
	 * @generated
	 * @ordered
	 */
	protected String preamisse = PREAMISSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKonklusion() <em>Konklusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKonklusion()
	 * @generated
	 * @ordered
	 */
	protected static final String KONKLUSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKonklusion() <em>Konklusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKonklusion()
	 * @generated
	 * @ordered
	 */
	protected String konklusion = KONKLUSION_EDEFAULT;

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
	public String getPreamisse() {
		return preamisse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreamisse(String newPreamisse) {
		String oldPreamisse = preamisse;
		preamisse = newPreamisse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.REGEL__PREAMISSE, oldPreamisse, preamisse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKonklusion() {
		return konklusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKonklusion(String newKonklusion) {
		String oldKonklusion = konklusion;
		konklusion = newKonklusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.REGEL__KONKLUSION, oldKonklusion, konklusion));
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
			case WissensbasismodelPackage.REGEL__PREAMISSE:
				return getPreamisse();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WissensbasismodelPackage.REGEL__ID:
				setID((Long)newValue);
				return;
			case WissensbasismodelPackage.REGEL__NAME:
				setName((String)newValue);
				return;
			case WissensbasismodelPackage.REGEL__PREAMISSE:
				setPreamisse((String)newValue);
				return;
			case WissensbasismodelPackage.REGEL__KONKLUSION:
				setKonklusion((String)newValue);
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
			case WissensbasismodelPackage.REGEL__PREAMISSE:
				setPreamisse(PREAMISSE_EDEFAULT);
				return;
			case WissensbasismodelPackage.REGEL__KONKLUSION:
				setKonklusion(KONKLUSION_EDEFAULT);
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
			case WissensbasismodelPackage.REGEL__PREAMISSE:
				return PREAMISSE_EDEFAULT == null ? preamisse != null : !PREAMISSE_EDEFAULT.equals(preamisse);
			case WissensbasismodelPackage.REGEL__KONKLUSION:
				return KONKLUSION_EDEFAULT == null ? konklusion != null : !KONKLUSION_EDEFAULT.equals(konklusion);
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
		result.append(", Preamisse: ");
		result.append(preamisse);
		result.append(", Konklusion: ");
		result.append(konklusion);
		result.append(')');
		return result.toString();
	}

} //RegelImpl
