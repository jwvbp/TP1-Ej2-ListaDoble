import ar.edu.unlu.listaDoble.ListaDoble;

public class Main {

	public static void main(String[] args) {
		
		ListaDoble lista = new ListaDoble();
		System.out.println(lista.tieneDatos());
		System.out.println(lista.longitud() + " elementos");
		lista.agregar("Habia");
		lista.agregar("una");
		lista.agregar("vez");
		lista.agregar("un");
		System.out.println(lista.longitud() + " elementos");
		System.out.println(lista.tieneDatos());
		
		System.out.println(lista);
		
	}

}
