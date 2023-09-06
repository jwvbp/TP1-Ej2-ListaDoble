package ar.edu.unlu.listaDoble;

public class ListaDoble {

	private Nodo primero = null;

	public void agregar(Object dato) {
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.setDato(dato);
		if (primero == null) {
			primero = nuevoNodo;
		} else {
			Nodo nodoAux = primero;
			while (nodoAux.getProximo() != null) {
				nodoAux = nodoAux.getProximo();
			}
			nodoAux.setProximo(nuevoNodo);
			nuevoNodo.setAnterior(nodoAux);
		}

	}

	
	public String tieneDatos() {
		if (estaVacia()) {
			return "esta vacia";
		} else {
			return "tiene datos";
		}
	}

	public Boolean estaVacia() {
		if (primero == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public Integer longitud() {
		Integer contador = 0;
		Nodo nodoAux = primero;
		if (primero == null) {
			return contador;
		} else {
			while (nodoAux != null) {
				contador++;
				nodoAux = nodoAux.getProximo();
			}
		}
		return contador;
	}
	public String toString() {
		String acumulador = "";
		Integer i = 1;
		Nodo nodoAux = primero;
		if (primero == null) {
			acumulador = "Lista Vacia";
		} else {
			while (nodoAux != null) {
				acumulador += "Nodo " + i + " " + nodoAux.getDato() + "\n";
				i++;
				nodoAux = nodoAux.getProximo();
			}
		}
		return acumulador;
	}
}
