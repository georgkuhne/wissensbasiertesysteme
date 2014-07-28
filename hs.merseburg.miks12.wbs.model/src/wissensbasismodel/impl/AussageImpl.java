/**
 */
package wissensbasismodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import wissensbasismodel.Aussage;
import wissensbasismodel.WertebereichTyp;
import wissensbasismodel.WissensbasismodelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Aussage</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link wissensbasismodel.impl.AussageImpl#getID <em>ID</em>}</li>
 * <li>{@link wissensbasismodel.impl.AussageImpl#getWertebereich <em>
 * Wertebereich</em>}</li>
 * <li>{@link wissensbasismodel.impl.AussageImpl#getFragetext <em>Fragetext
 * </em>}</li>
 * <li>{@link wissensbasismodel.impl.AussageImpl#getDiagnosetext <em>
 * Diagnosetext</em>}</li>
 * <li>{@link wissensbasismodel.impl.AussageImpl#getName <em>Name</em>}</li>
 * <li>{@link wissensbasismodel.impl.AussageImpl#getListWertebereich <em>List
 * Wertebereich</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AussageImpl extends MinimalEObjectImpl.Container implements
		Aussage {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWertebereich()
	 * <em>Wertebereich</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getWertebereich()
	 * @generated
	 * @ordered
	 */
	protected static final WertebereichTyp WERTEBEREICH_EDEFAULT = WertebereichTyp.BOOLEAN;

	/**
	 * The cached value of the '{@link #getWertebereich() <em>Wertebereich</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWertebereich()
	 * @generated
	 * @ordered
	 */
	protected WertebereichTyp wertebereich = WERTEBEREICH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFragetext() <em>Fragetext</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFragetext()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAGETEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFragetext() <em>Fragetext</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFragetext()
	 * @generated
	 * @ordered
	 */
	protected String fragetext = FRAGETEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagnosetext()
	 * <em>Diagnosetext</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDiagnosetext()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGNOSETEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagnosetext() <em>Diagnosetext</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDiagnosetext()
	 * @generated
	 * @ordered
	 */
	protected String diagnosetext = DIAGNOSETEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListWertebereich()
	 * <em>List Wertebereich</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getListWertebereich()
	 * @generated
	 * @ordered
	 */
	protected EList<String> listWertebereich;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AussageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WissensbasismodelPackage.Literals.AUSSAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public long getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setID(long newID) {
		long oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WissensbasismodelPackage.AUSSAGE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WertebereichTyp getWertebereich() {
		return wertebereich;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setWertebereich(WertebereichTyp newWertebereich) {
		WertebereichTyp oldWertebereich = wertebereich;
		wertebereich = newWertebereich == null ? WERTEBEREICH_EDEFAULT
				: newWertebereich;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WissensbasismodelPackage.AUSSAGE__WERTEBEREICH,
					oldWertebereich, wertebereich));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFragetext() {
		return fragetext;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFragetext(String newFragetext) {
		String oldFragetext = fragetext;
		fragetext = newFragetext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WissensbasismodelPackage.AUSSAGE__FRAGETEXT, oldFragetext,
					fragetext));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDiagnosetext() {
		return diagnosetext;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDiagnosetext(String newDiagnosetext) {
		String oldDiagnosetext = diagnosetext;
		diagnosetext = newDiagnosetext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WissensbasismodelPackage.AUSSAGE__DIAGNOSETEXT,
					oldDiagnosetext, diagnosetext));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					WissensbasismodelPackage.AUSSAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getListWertebereich() {
		if (listWertebereich == null) {
			listWertebereich = new EDataTypeUniqueEList<String>(String.class,
					this, WissensbasismodelPackage.AUSSAGE__LIST_WERTEBEREICH);
		}
		return listWertebereich;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WissensbasismodelPackage.AUSSAGE__ID:
			return getID();
		case WissensbasismodelPackage.AUSSAGE__WERTEBEREICH:
			return getWertebereich();
		case WissensbasismodelPackage.AUSSAGE__FRAGETEXT:
			return getFragetext();
		case WissensbasismodelPackage.AUSSAGE__DIAGNOSETEXT:
			return getDiagnosetext();
		case WissensbasismodelPackage.AUSSAGE__NAME:
			return getName();
		case WissensbasismodelPackage.AUSSAGE__LIST_WERTEBEREICH:
			return getListWertebereich();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WissensbasismodelPackage.AUSSAGE__ID:
			setID((Long) newValue);
			return;
		case WissensbasismodelPackage.AUSSAGE__WERTEBEREICH:
			setWertebereich((WertebereichTyp) newValue);
			return;
		case WissensbasismodelPackage.AUSSAGE__FRAGETEXT:
			setFragetext((String) newValue);
			return;
		case WissensbasismodelPackage.AUSSAGE__DIAGNOSETEXT:
			setDiagnosetext((String) newValue);
			return;
		case WissensbasismodelPackage.AUSSAGE__NAME:
			setName((String) newValue);
			return;
		case WissensbasismodelPackage.AUSSAGE__LIST_WERTEBEREICH:
			getListWertebereich().clear();
			getListWertebereich().addAll(
					(Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WissensbasismodelPackage.AUSSAGE__ID:
			setID(ID_EDEFAULT);
			return;
		case WissensbasismodelPackage.AUSSAGE__WERTEBEREICH:
			setWertebereich(WERTEBEREICH_EDEFAULT);
			return;
		case WissensbasismodelPackage.AUSSAGE__FRAGETEXT:
			setFragetext(FRAGETEXT_EDEFAULT);
			return;
		case WissensbasismodelPackage.AUSSAGE__DIAGNOSETEXT:
			setDiagnosetext(DIAGNOSETEXT_EDEFAULT);
			return;
		case WissensbasismodelPackage.AUSSAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WissensbasismodelPackage.AUSSAGE__LIST_WERTEBEREICH:
			getListWertebereich().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WissensbasismodelPackage.AUSSAGE__ID:
			return id != ID_EDEFAULT;
		case WissensbasismodelPackage.AUSSAGE__WERTEBEREICH:
			return wertebereich != WERTEBEREICH_EDEFAULT;
		case WissensbasismodelPackage.AUSSAGE__FRAGETEXT:
			return FRAGETEXT_EDEFAULT == null ? fragetext != null
					: !FRAGETEXT_EDEFAULT.equals(fragetext);
		case WissensbasismodelPackage.AUSSAGE__DIAGNOSETEXT:
			return DIAGNOSETEXT_EDEFAULT == null ? diagnosetext != null
					: !DIAGNOSETEXT_EDEFAULT.equals(diagnosetext);
		case WissensbasismodelPackage.AUSSAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case WissensbasismodelPackage.AUSSAGE__LIST_WERTEBEREICH:
			return listWertebereich != null && !listWertebereich.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: "); //$NON-NLS-1$
		result.append(id);
		result.append(", wertebereich: "); //$NON-NLS-1$
		result.append(wertebereich);
		result.append(", Fragetext: "); //$NON-NLS-1$
		result.append(fragetext);
		result.append(", Diagnosetext: "); //$NON-NLS-1$
		result.append(diagnosetext);
		result.append(", Name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", listWertebereich: "); //$NON-NLS-1$
		result.append(listWertebereich);
		result.append(')');
		return result.toString();
	}

} // AussageImpl
