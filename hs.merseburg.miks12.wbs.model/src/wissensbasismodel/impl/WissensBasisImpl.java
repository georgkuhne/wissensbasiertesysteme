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
import wissensbasismodel.Aussage;
import wissensbasismodel.Bauteil;
import wissensbasismodel.Regel;
import wissensbasismodel.WissensBasis;
import wissensbasismodel.WissensbasismodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wissens Basis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wissensbasismodel.impl.WissensBasisImpl#getName <em>Name</em>}</li>
 *   <li>{@link wissensbasismodel.impl.WissensBasisImpl#getID <em>ID</em>}</li>
 *   <li>{@link wissensbasismodel.impl.WissensBasisImpl#getBauteile <em>Bauteile</em>}</li>
 *   <li>{@link wissensbasismodel.impl.WissensBasisImpl#getRegeln <em>Regeln</em>}</li>
 *   <li>{@link wissensbasismodel.impl.WissensBasisImpl#getAussagen <em>Aussagen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WissensBasisImpl extends MinimalEObjectImpl.Container implements WissensBasis {
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
	 * The cached value of the '{@link #getBauteile() <em>Bauteile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBauteile()
	 * @generated
	 * @ordered
	 */
	protected EList<Bauteil> bauteile;

	/**
	 * The cached value of the '{@link #getRegeln() <em>Regeln</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegeln()
	 * @generated
	 * @ordered
	 */
	protected EList<Regel> regeln;
	/**
	 * The cached value of the '{@link #getAussagen() <em>Aussagen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAussagen()
	 * @generated
	 * @ordered
	 */
	protected EList<Aussage> aussagen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WissensBasisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WissensbasismodelPackage.Literals.WISSENS_BASIS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.WISSENS_BASIS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.WISSENS_BASIS__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bauteil> getBauteile() {
		if (bauteile == null) {
			bauteile = new EObjectContainmentEList<Bauteil>(Bauteil.class, this, WissensbasismodelPackage.WISSENS_BASIS__BAUTEILE);
		}
		return bauteile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regel> getRegeln() {
		if (regeln == null) {
			regeln = new EObjectContainmentEList<Regel>(Regel.class, this, WissensbasismodelPackage.WISSENS_BASIS__REGELN);
		}
		return regeln;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aussage> getAussagen() {
		if (aussagen == null) {
			aussagen = new EObjectContainmentEList<Aussage>(Aussage.class, this, WissensbasismodelPackage.WISSENS_BASIS__AUSSAGEN);
		}
		return aussagen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WissensbasismodelPackage.WISSENS_BASIS__BAUTEILE:
				return ((InternalEList<?>)getBauteile()).basicRemove(otherEnd, msgs);
			case WissensbasismodelPackage.WISSENS_BASIS__REGELN:
				return ((InternalEList<?>)getRegeln()).basicRemove(otherEnd, msgs);
			case WissensbasismodelPackage.WISSENS_BASIS__AUSSAGEN:
				return ((InternalEList<?>)getAussagen()).basicRemove(otherEnd, msgs);
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
			case WissensbasismodelPackage.WISSENS_BASIS__NAME:
				return getName();
			case WissensbasismodelPackage.WISSENS_BASIS__ID:
				return getID();
			case WissensbasismodelPackage.WISSENS_BASIS__BAUTEILE:
				return getBauteile();
			case WissensbasismodelPackage.WISSENS_BASIS__REGELN:
				return getRegeln();
			case WissensbasismodelPackage.WISSENS_BASIS__AUSSAGEN:
				return getAussagen();
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
			case WissensbasismodelPackage.WISSENS_BASIS__NAME:
				setName((String)newValue);
				return;
			case WissensbasismodelPackage.WISSENS_BASIS__ID:
				setID((Long)newValue);
				return;
			case WissensbasismodelPackage.WISSENS_BASIS__BAUTEILE:
				getBauteile().clear();
				getBauteile().addAll((Collection<? extends Bauteil>)newValue);
				return;
			case WissensbasismodelPackage.WISSENS_BASIS__REGELN:
				getRegeln().clear();
				getRegeln().addAll((Collection<? extends Regel>)newValue);
				return;
			case WissensbasismodelPackage.WISSENS_BASIS__AUSSAGEN:
				getAussagen().clear();
				getAussagen().addAll((Collection<? extends Aussage>)newValue);
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
			case WissensbasismodelPackage.WISSENS_BASIS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WissensbasismodelPackage.WISSENS_BASIS__ID:
				setID(ID_EDEFAULT);
				return;
			case WissensbasismodelPackage.WISSENS_BASIS__BAUTEILE:
				getBauteile().clear();
				return;
			case WissensbasismodelPackage.WISSENS_BASIS__REGELN:
				getRegeln().clear();
				return;
			case WissensbasismodelPackage.WISSENS_BASIS__AUSSAGEN:
				getAussagen().clear();
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
			case WissensbasismodelPackage.WISSENS_BASIS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WissensbasismodelPackage.WISSENS_BASIS__ID:
				return id != ID_EDEFAULT;
			case WissensbasismodelPackage.WISSENS_BASIS__BAUTEILE:
				return bauteile != null && !bauteile.isEmpty();
			case WissensbasismodelPackage.WISSENS_BASIS__REGELN:
				return regeln != null && !regeln.isEmpty();
			case WissensbasismodelPackage.WISSENS_BASIS__AUSSAGEN:
				return aussagen != null && !aussagen.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //WissensBasisImpl
