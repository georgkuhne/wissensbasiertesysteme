/**
 */
package wissensbasismodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import wissensbasismodel.Regel;
import wissensbasismodel.Regelgruppe;
import wissensbasismodel.WissensbasismodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regelgruppe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wissensbasismodel.impl.RegelgruppeImpl#getID <em>ID</em>}</li>
 *   <li>{@link wissensbasismodel.impl.RegelgruppeImpl#getName <em>Name</em>}</li>
 *   <li>{@link wissensbasismodel.impl.RegelgruppeImpl#getRegeln <em>Regeln</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegelgruppeImpl extends MinimalEObjectImpl.Container implements Regelgruppe {
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
	 * The cached value of the '{@link #getRegeln() <em>Regeln</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegeln()
	 * @generated
	 * @ordered
	 */
	protected EList<Regel> regeln;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegelgruppeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WissensbasismodelPackage.Literals.REGELGRUPPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.REGELGRUPPE__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.REGELGRUPPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regel> getRegeln() {
		if (regeln == null) {
			regeln = new EObjectResolvingEList<Regel>(Regel.class, this, WissensbasismodelPackage.REGELGRUPPE__REGELN);
		}
		return regeln;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WissensbasismodelPackage.REGELGRUPPE__ID:
				return getID();
			case WissensbasismodelPackage.REGELGRUPPE__NAME:
				return getName();
			case WissensbasismodelPackage.REGELGRUPPE__REGELN:
				return getRegeln();
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
			case WissensbasismodelPackage.REGELGRUPPE__ID:
				setID((Long)newValue);
				return;
			case WissensbasismodelPackage.REGELGRUPPE__NAME:
				setName((String)newValue);
				return;
			case WissensbasismodelPackage.REGELGRUPPE__REGELN:
				getRegeln().clear();
				getRegeln().addAll((Collection<? extends Regel>)newValue);
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
			case WissensbasismodelPackage.REGELGRUPPE__ID:
				setID(ID_EDEFAULT);
				return;
			case WissensbasismodelPackage.REGELGRUPPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WissensbasismodelPackage.REGELGRUPPE__REGELN:
				getRegeln().clear();
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
			case WissensbasismodelPackage.REGELGRUPPE__ID:
				return id != ID_EDEFAULT;
			case WissensbasismodelPackage.REGELGRUPPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WissensbasismodelPackage.REGELGRUPPE__REGELN:
				return regeln != null && !regeln.isEmpty();
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

} //RegelgruppeImpl
