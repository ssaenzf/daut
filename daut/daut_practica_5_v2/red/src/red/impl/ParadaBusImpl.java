/**
 */
package red.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import red.ParadaBus;
import red.RedPackage;
import red.util.RedValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parada Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ParadaBusImpl extends ParadaImpl implements ParadaBus {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParadaBusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.PARADA_BUS;
	}

	/**
	 * The cached validation expression for the '{@link #nonDuplicateNombreParada(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Duplicate Nombre Parada</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #nonDuplicateNombreParada(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NON_DUPLICATE_NOMBRE_PARADA_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"\t\t\tParadaBus.allInstances()->isUnique(nombre)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nonDuplicateNombreParada(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			RedValidator.validate
				(RedPackage.Literals.PARADA_BUS,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 RedPackage.Literals.PARADA_BUS___NON_DUPLICATE_NOMBRE_PARADA__DIAGNOSTICCHAIN_MAP,
				 NON_DUPLICATE_NOMBRE_PARADA_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 RedValidator.DIAGNOSTIC_SOURCE,
				 RedValidator.PARADA_BUS__NON_DUPLICATE_NOMBRE_PARADA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RedPackage.PARADA_BUS___NON_DUPLICATE_NOMBRE_PARADA__DIAGNOSTICCHAIN_MAP:
				return nonDuplicateNombreParada((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ParadaBusImpl
