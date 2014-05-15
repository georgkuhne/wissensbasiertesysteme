/**
 */
package wissensbasismodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import wissensbasismodel.Bauteil;
import wissensbasismodel.WissensbasismodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bauteil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wissensbasismodel.impl.BauteilImpl#getID <em>ID</em>}</li>
 *   <li>{@link wissensbasismodel.impl.BauteilImpl#getName <em>Name</em>}</li>
 *   <li>{@link wissensbasismodel.impl.BauteilImpl#getAsset_ID <em>Asset ID</em>}</li>
 *   <li>{@link wissensbasismodel.impl.BauteilImpl#getIst_Teil_von <em>Ist Teil von</em>}</li>
 *   <li>{@link wissensbasismodel.impl.BauteilImpl#getRegeln <em>Regeln</em>}</li>
 *   <li>{@link wissensbasismodel.impl.BauteilImpl#getRegelgruppen <em>Regelgruppen</em>}</li>
 *   <li>{@link wissensbasismodel.impl.BauteilImpl#getKoroutine <em>Koroutine</em>}</li>
 *   <li>{@link wissensbasismodel.impl.BauteilImpl#getMedien <em>Medien</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BauteilImpl extends MinimalEObjectImpl.Container implements Bauteil {
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
	 * The default value of the '{@link #getAsset_ID() <em>Asset ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset_ID()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAsset_ID() <em>Asset ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset_ID()
	 * @generated
	 * @ordered
	 */
	protected String asset_ID = ASSET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIst_Teil_von() <em>Ist Teil von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIst_Teil_von()
	 * @generated
	 * @ordered
	 */
	protected static final String IST_TEIL_VON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIst_Teil_von() <em>Ist Teil von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIst_Teil_von()
	 * @generated
	 * @ordered
	 */
	protected String ist_Teil_von = IST_TEIL_VON_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegeln() <em>Regeln</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegeln()
	 * @generated
	 * @ordered
	 */
	protected static final String REGELN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegeln() <em>Regeln</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegeln()
	 * @generated
	 * @ordered
	 */
	protected String regeln = REGELN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegelgruppen() <em>Regelgruppen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegelgruppen()
	 * @generated
	 * @ordered
	 */
	protected static final String REGELGRUPPEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegelgruppen() <em>Regelgruppen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegelgruppen()
	 * @generated
	 * @ordered
	 */
	protected String regelgruppen = REGELGRUPPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getKoroutine() <em>Koroutine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKoroutine()
	 * @generated
	 * @ordered
	 */
	protected static final String KOROUTINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKoroutine() <em>Koroutine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKoroutine()
	 * @generated
	 * @ordered
	 */
	protected String koroutine = KOROUTINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMedien() <em>Medien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedien()
	 * @generated
	 * @ordered
	 */
	protected static final byte MEDIEN_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getMedien() <em>Medien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedien()
	 * @generated
	 * @ordered
	 */
	protected byte medien = MEDIEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BauteilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WissensbasismodelPackage.Literals.BAUTEIL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.BAUTEIL__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.BAUTEIL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAsset_ID() {
		return asset_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsset_ID(String newAsset_ID) {
		String oldAsset_ID = asset_ID;
		asset_ID = newAsset_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.BAUTEIL__ASSET_ID, oldAsset_ID, asset_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIst_Teil_von() {
		return ist_Teil_von;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIst_Teil_von(String newIst_Teil_von) {
		String oldIst_Teil_von = ist_Teil_von;
		ist_Teil_von = newIst_Teil_von;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.BAUTEIL__IST_TEIL_VON, oldIst_Teil_von, ist_Teil_von));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegeln() {
		return regeln;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegeln(String newRegeln) {
		String oldRegeln = regeln;
		regeln = newRegeln;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.BAUTEIL__REGELN, oldRegeln, regeln));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegelgruppen() {
		return regelgruppen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegelgruppen(String newRegelgruppen) {
		String oldRegelgruppen = regelgruppen;
		regelgruppen = newRegelgruppen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.BAUTEIL__REGELGRUPPEN, oldRegelgruppen, regelgruppen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKoroutine() {
		return koroutine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKoroutine(String newKoroutine) {
		String oldKoroutine = koroutine;
		koroutine = newKoroutine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.BAUTEIL__KOROUTINE, oldKoroutine, koroutine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getMedien() {
		return medien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedien(byte newMedien) {
		byte oldMedien = medien;
		medien = newMedien;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WissensbasismodelPackage.BAUTEIL__MEDIEN, oldMedien, medien));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WissensbasismodelPackage.BAUTEIL__ID:
				return getID();
			case WissensbasismodelPackage.BAUTEIL__NAME:
				return getName();
			case WissensbasismodelPackage.BAUTEIL__ASSET_ID:
				return getAsset_ID();
			case WissensbasismodelPackage.BAUTEIL__IST_TEIL_VON:
				return getIst_Teil_von();
			case WissensbasismodelPackage.BAUTEIL__REGELN:
				return getRegeln();
			case WissensbasismodelPackage.BAUTEIL__REGELGRUPPEN:
				return getRegelgruppen();
			case WissensbasismodelPackage.BAUTEIL__KOROUTINE:
				return getKoroutine();
			case WissensbasismodelPackage.BAUTEIL__MEDIEN:
				return getMedien();
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
			case WissensbasismodelPackage.BAUTEIL__ID:
				setID((Long)newValue);
				return;
			case WissensbasismodelPackage.BAUTEIL__NAME:
				setName((String)newValue);
				return;
			case WissensbasismodelPackage.BAUTEIL__ASSET_ID:
				setAsset_ID((String)newValue);
				return;
			case WissensbasismodelPackage.BAUTEIL__IST_TEIL_VON:
				setIst_Teil_von((String)newValue);
				return;
			case WissensbasismodelPackage.BAUTEIL__REGELN:
				setRegeln((String)newValue);
				return;
			case WissensbasismodelPackage.BAUTEIL__REGELGRUPPEN:
				setRegelgruppen((String)newValue);
				return;
			case WissensbasismodelPackage.BAUTEIL__KOROUTINE:
				setKoroutine((String)newValue);
				return;
			case WissensbasismodelPackage.BAUTEIL__MEDIEN:
				setMedien((Byte)newValue);
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
			case WissensbasismodelPackage.BAUTEIL__ID:
				setID(ID_EDEFAULT);
				return;
			case WissensbasismodelPackage.BAUTEIL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WissensbasismodelPackage.BAUTEIL__ASSET_ID:
				setAsset_ID(ASSET_ID_EDEFAULT);
				return;
			case WissensbasismodelPackage.BAUTEIL__IST_TEIL_VON:
				setIst_Teil_von(IST_TEIL_VON_EDEFAULT);
				return;
			case WissensbasismodelPackage.BAUTEIL__REGELN:
				setRegeln(REGELN_EDEFAULT);
				return;
			case WissensbasismodelPackage.BAUTEIL__REGELGRUPPEN:
				setRegelgruppen(REGELGRUPPEN_EDEFAULT);
				return;
			case WissensbasismodelPackage.BAUTEIL__KOROUTINE:
				setKoroutine(KOROUTINE_EDEFAULT);
				return;
			case WissensbasismodelPackage.BAUTEIL__MEDIEN:
				setMedien(MEDIEN_EDEFAULT);
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
			case WissensbasismodelPackage.BAUTEIL__ID:
				return id != ID_EDEFAULT;
			case WissensbasismodelPackage.BAUTEIL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WissensbasismodelPackage.BAUTEIL__ASSET_ID:
				return ASSET_ID_EDEFAULT == null ? asset_ID != null : !ASSET_ID_EDEFAULT.equals(asset_ID);
			case WissensbasismodelPackage.BAUTEIL__IST_TEIL_VON:
				return IST_TEIL_VON_EDEFAULT == null ? ist_Teil_von != null : !IST_TEIL_VON_EDEFAULT.equals(ist_Teil_von);
			case WissensbasismodelPackage.BAUTEIL__REGELN:
				return REGELN_EDEFAULT == null ? regeln != null : !REGELN_EDEFAULT.equals(regeln);
			case WissensbasismodelPackage.BAUTEIL__REGELGRUPPEN:
				return REGELGRUPPEN_EDEFAULT == null ? regelgruppen != null : !REGELGRUPPEN_EDEFAULT.equals(regelgruppen);
			case WissensbasismodelPackage.BAUTEIL__KOROUTINE:
				return KOROUTINE_EDEFAULT == null ? koroutine != null : !KOROUTINE_EDEFAULT.equals(koroutine);
			case WissensbasismodelPackage.BAUTEIL__MEDIEN:
				return medien != MEDIEN_EDEFAULT;
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
		result.append(", Asset_ID: ");
		result.append(asset_ID);
		result.append(", ist_Teil_von: ");
		result.append(ist_Teil_von);
		result.append(", Regeln: ");
		result.append(regeln);
		result.append(", Regelgruppen: ");
		result.append(regelgruppen);
		result.append(", Koroutine: ");
		result.append(koroutine);
		result.append(", Medien: ");
		result.append(medien);
		result.append(')');
		return result.toString();
	}

} //BauteilImpl
