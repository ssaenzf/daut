/*
 * generated by Xtext 2.26.0
 */
package cuestionario.scoping;

import java.util.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

import cuestionario.Cuestionario;
import cuestionario.CuestionarioPackage;
import cuestionario.*;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class CuestionarioScopeProvider extends AbstractCuestionarioScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		// TODO Auto-generated method stub
		if (context instanceof Pregunta && reference == CuestionarioPackage.Literals.PREGUNTA__SIGUIENTE_PREGUNTA_ACIERTO) {
			Cuestionario cuestionario = (Cuestionario)EcoreUtil2.getRootContainer(context);
			Categoria categoria = ((Pregunta)context).getCategoria();
			List<Pregunta> preguntas = new ArrayList<>();
			for (Pregunta preg : cuestionario.getPreguntas()) {
				Categoria c = preg.getCategoria();
				if (c != categoria && c.getDificultad() >= categoria.getDificultad())
					preguntas.add(preg);
			}
			return Scopes.scopeFor(preguntas);
		}
		
		if (context instanceof Pregunta && reference == CuestionarioPackage.Literals.PREGUNTA__SIGUIENTE_PREGUNTA_ERROR) {
			Cuestionario cuestionario = (Cuestionario)EcoreUtil2.getRootContainer(context);
			Categoria categoria = ((Pregunta)context).getCategoria();
			List<Pregunta> preguntas = new ArrayList<>();
			for (Pregunta preg : cuestionario.getPreguntas()) {
				Categoria c = preg.getCategoria();
				if (c == categoria )
					preguntas.add(preg);
			}
			return Scopes.scopeFor(preguntas);
		}
		
		if (context instanceof PreguntaUnica && reference == CuestionarioPackage.Literals.PREGUNTA_UNICA__CORRECTA) {
			List<Respuesta> respuestas = new ArrayList<>();
			PreguntaUnica preg = ((PreguntaUnica)context);
			respuestas.addAll(preg.getRespuestas());
			return Scopes.scopeFor(respuestas);
		}
		
		if (context instanceof PreguntaMultiple && reference == CuestionarioPackage.Literals.PREGUNTA_MULTIPLE__CORRECTAS) {
			List<Respuesta> respuestas = new ArrayList<>();
			PreguntaMultiple preg = ((PreguntaMultiple)context);
			respuestas.addAll(preg.getRespuestas());
			return Scopes.scopeFor(respuestas);
		}
		
		if (context instanceof Cuestionario && reference == CuestionarioPackage.Literals.CUESTIONARIO__PREGUNTAS_FINALES) {
			Cuestionario cuestionario = (Cuestionario)EcoreUtil2.getRootContainer(context);
			List<Pregunta> preguntas = new ArrayList<>();
			for (Pregunta preg : cuestionario.getPreguntas()) {
				if (preg.isIsInicial() == false)
					preguntas.add(preg);
			}
			return Scopes.scopeFor(preguntas);
		}
		
		if (context instanceof Cuestionario && reference == CuestionarioPackage.Literals.CUESTIONARIO__PREGUNTA_INICIAL) {
			Cuestionario cuestionario = (Cuestionario)EcoreUtil2.getRootContainer(context);
			List<Pregunta> preguntas = new ArrayList<>();
			for (Pregunta preg : cuestionario.getPreguntas()) {
				if (preg.isIsInicial())
					preguntas.add(preg);
			}
			return Scopes.scopeFor(preguntas);
		}
		
		return super.getScope(context, reference);
	}
}
