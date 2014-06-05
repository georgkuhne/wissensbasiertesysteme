/**
 */
package wissensbasismodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Literal Operatoren Praedikat</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see wissensbasismodel.WissensbasismodelPackage#getLiteralOperatorenPraedikat()
 * @model
 * @generated
 */
public enum LiteralOperatorenPraedikat implements Enumerator {
	/**
	 * The '<em><b>Gleich</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLEICH_VALUE
	 * @generated
	 * @ordered
	 */
	GLEICH(0, "gleich", "gleich"),

	/**
	 * The '<em><b>Kleinergleich</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KLEINERGLEICH_VALUE
	 * @generated
	 * @ordered
	 */
	KLEINERGLEICH(1, "kleinergleich", "kleinergleich"),

	/**
	 * The '<em><b>Kleinerals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KLEINERALS_VALUE
	 * @generated
	 * @ordered
	 */
	KLEINERALS(2, "kleinerals", "kleinerals"),

	/**
	 * The '<em><b>Groessergleich</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROESSERGLEICH_VALUE
	 * @generated
	 * @ordered
	 */
	GROESSERGLEICH(3, "groessergleich", ""),

	/**
	 * The '<em><b>Groeßerals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROESSERALS_VALUE
	 * @generated
	 * @ordered
	 */
	GROESSERALS(4, "groeßerals", "groe\u00dferals"),

	/**
	 * The '<em><b>Ungleich</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNGLEICH_VALUE
	 * @generated
	 * @ordered
	 */
	UNGLEICH(5, "ungleich", "ungleich"), /**
	 * The '<em><b>NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(6, "NULL", "NULL");

	/**
	 * The '<em><b>Gleich</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gleich</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GLEICH
	 * @model name="gleich"
	 * @generated
	 * @ordered
	 */
	public static final int GLEICH_VALUE = 0;

	/**
	 * The '<em><b>Kleinergleich</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kleinergleich</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KLEINERGLEICH
	 * @model name="kleinergleich"
	 * @generated
	 * @ordered
	 */
	public static final int KLEINERGLEICH_VALUE = 1;

	/**
	 * The '<em><b>Kleinerals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kleinerals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KLEINERALS
	 * @model name="kleinerals"
	 * @generated
	 * @ordered
	 */
	public static final int KLEINERALS_VALUE = 2;

	/**
	 * The '<em><b>Groessergleich</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Groessergleich</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROESSERGLEICH
	 * @model name="groessergleich" literal=""
	 * @generated
	 * @ordered
	 */
	public static final int GROESSERGLEICH_VALUE = 3;

	/**
	 * The '<em><b>Groeßerals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Groe�erals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROESSERALS
	 * @model name="groeßerals"
	 * @generated
	 * @ordered
	 */
	public static final int GROESSERALS_VALUE = 4;

	/**
	 * The '<em><b>Ungleich</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ungleich</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNGLEICH
	 * @model name="ungleich"
	 * @generated
	 * @ordered
	 */
	public static final int UNGLEICH_VALUE = 5;

	/**
	 * The '<em><b>NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 6;

	/**
	 * An array of all the '<em><b>Literal Operatoren Praedikat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LiteralOperatorenPraedikat[] VALUES_ARRAY =
		new LiteralOperatorenPraedikat[] {
			GLEICH,
			KLEINERGLEICH,
			KLEINERALS,
			GROESSERGLEICH,
			GROESSERALS,
			UNGLEICH,
			NULL,
		};

	/**
	 * A public read-only list of all the '<em><b>Literal Operatoren Praedikat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LiteralOperatorenPraedikat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Literal Operatoren Praedikat</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LiteralOperatorenPraedikat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LiteralOperatorenPraedikat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Literal Operatoren Praedikat</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LiteralOperatorenPraedikat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LiteralOperatorenPraedikat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Literal Operatoren Praedikat</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LiteralOperatorenPraedikat get(int value) {
		switch (value) {
			case GLEICH_VALUE: return GLEICH;
			case KLEINERGLEICH_VALUE: return KLEINERGLEICH;
			case KLEINERALS_VALUE: return KLEINERALS;
			case GROESSERGLEICH_VALUE: return GROESSERGLEICH;
			case GROESSERALS_VALUE: return GROESSERALS;
			case UNGLEICH_VALUE: return UNGLEICH;
			case NULL_VALUE: return NULL;
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
	private LiteralOperatorenPraedikat(int value, String name, String literal) {
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
	
} //LiteralOperatorenPraedikat
