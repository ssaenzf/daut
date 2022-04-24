/**
 */
package red;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transbordos</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see red.RedPackage#getTransbordos()
 * @model
 * @generated
 */
public enum Transbordos implements Enumerator {
	/**
	 * The '<em><b>Corto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORTO_VALUE
	 * @generated
	 * @ordered
	 */
	CORTO(0, "Corto", "Corto"),

	/**
	 * The '<em><b>Largo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGO_VALUE
	 * @generated
	 * @ordered
	 */
	LARGO(1, "Largo", "Largo"),

	/**
	 * The '<em><b>No Permitido</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_PERMITIDO_VALUE
	 * @generated
	 * @ordered
	 */
	NO_PERMITIDO(2, "NoPermitido", "NoPermitido");

	/**
	 * The '<em><b>Corto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORTO
	 * @model name="Corto"
	 * @generated
	 * @ordered
	 */
	public static final int CORTO_VALUE = 0;

	/**
	 * The '<em><b>Largo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGO
	 * @model name="Largo"
	 * @generated
	 * @ordered
	 */
	public static final int LARGO_VALUE = 1;

	/**
	 * The '<em><b>No Permitido</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_PERMITIDO
	 * @model name="NoPermitido"
	 * @generated
	 * @ordered
	 */
	public static final int NO_PERMITIDO_VALUE = 2;

	/**
	 * An array of all the '<em><b>Transbordos</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Transbordos[] VALUES_ARRAY =
		new Transbordos[] {
			CORTO,
			LARGO,
			NO_PERMITIDO,
		};

	/**
	 * A public read-only list of all the '<em><b>Transbordos</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Transbordos> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transbordos</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Transbordos get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Transbordos result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transbordos</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Transbordos getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Transbordos result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transbordos</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Transbordos get(int value) {
		switch (value) {
			case CORTO_VALUE: return CORTO;
			case LARGO_VALUE: return LARGO;
			case NO_PERMITIDO_VALUE: return NO_PERMITIDO;
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
	private Transbordos(int value, String name, String literal) {
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
	
} //Transbordos
