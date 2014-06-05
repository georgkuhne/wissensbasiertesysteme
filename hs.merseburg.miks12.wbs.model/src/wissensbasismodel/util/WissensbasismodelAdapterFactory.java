/**
 */
package wissensbasismodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import wissensbasismodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see wissensbasismodel.WissensbasismodelPackage
 * @generated
 */
public class WissensbasismodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WissensbasismodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WissensbasismodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WissensbasismodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WissensbasismodelSwitch<Adapter> modelSwitch =
		new WissensbasismodelSwitch<Adapter>() {
			@Override
			public Adapter caseWissensBasis(WissensBasis object) {
				return createWissensBasisAdapter();
			}
			@Override
			public Adapter caseBauteil(Bauteil object) {
				return createBauteilAdapter();
			}
			@Override
			public Adapter caseRegel(Regel object) {
				return createRegelAdapter();
			}
			@Override
			public Adapter caseAussage(Aussage object) {
				return createAussageAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseKonklusion(Konklusion object) {
				return createKonklusionAdapter();
			}
			@Override
			public Adapter caseRegelgruppe(Regelgruppe object) {
				return createRegelgruppeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link wissensbasismodel.WissensBasis <em>Wissens Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wissensbasismodel.WissensBasis
	 * @generated
	 */
	public Adapter createWissensBasisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wissensbasismodel.Bauteil <em>Bauteil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wissensbasismodel.Bauteil
	 * @generated
	 */
	public Adapter createBauteilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wissensbasismodel.Regel <em>Regel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wissensbasismodel.Regel
	 * @generated
	 */
	public Adapter createRegelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wissensbasismodel.Aussage <em>Aussage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wissensbasismodel.Aussage
	 * @generated
	 */
	public Adapter createAussageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wissensbasismodel.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wissensbasismodel.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wissensbasismodel.Konklusion <em>Konklusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wissensbasismodel.Konklusion
	 * @generated
	 */
	public Adapter createKonklusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wissensbasismodel.Regelgruppe <em>Regelgruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wissensbasismodel.Regelgruppe
	 * @generated
	 */
	public Adapter createRegelgruppeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WissensbasismodelAdapterFactory
