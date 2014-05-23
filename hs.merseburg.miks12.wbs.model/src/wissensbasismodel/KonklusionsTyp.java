/**
 */
package wissensbasismodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Konklusions Typ</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see wissensbasismodel.WissensbasismodelPackage#getKonklusionsTyp()
 * @model
 * @generated
 */
public enum KonklusionsTyp implements Enumerator {
	/**
	 * The '<em><b>Literal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	LITERAL(0, "Literal", "Literal"), /**
	 * The '<em><b>Textausgabe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTAUSGABE_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTAUSGABE(1, "Textausgabe", "Textausgabe"), /**
	 * The '<em><b>Diagnoseausgabe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSEAUSGABE_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSEAUSGABE(2, "Diagnoseausgabe", "Diagnoseausgabe")
	;

	/**
	 * The '<em><b>Literal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Literal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LITERAL
	 * @model name="Literal"
	 * @generated
	 * @ordered
	 */
	public static final int LITERAL_VALUE = 0;

/**
	 * The '<em><b>Textausgabe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Textausgabe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXTAUSGABE
	 * @model name="Textausgabe"
	 * @generated
	 * @ordered
	 */
	public static final int TEXTAUSGABE_VALUE = 1;

/**
	 * The '<em><b>Diagnoseausgabe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diagnoseausgabe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSEAUSGABE
	 * @model name="Diagnoseausgabe"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSEAUSGABE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Konklusions Typ</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KonklusionsTyp[] VALUES_ARRAY =
		new KonklusionsTyp[] {
			LITERAL,
			TEXTAUSGABE,
			DIAGNOSEAUSGABE,
		};

	/**
	 * A public read-only list of all the '<em><b>Konklusions Typ</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KonklusionsTyp> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Konklusions Typ</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KonklusionsTyp get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KonklusionsTyp result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Konklusions Typ</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KonklusionsTyp getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KonklusionsTyp result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Konklusions Typ</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KonklusionsTyp get(int value) {
		switch (value) {
			case LITERAL_VALUE: return LITERAL;
			case TEXTAUSGABE_VALUE: return TEXTAUSGABE;
			case DIAGNOSEAUSGABE_VALUE: return DIAGNOSEAUSGABE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private KonklusionsTyp(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //KonklusionsTyp
