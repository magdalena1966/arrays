package arrayList_02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) {
		
		List<Object> lista = new ArrayList<>();
		
		lista.add(3);
		lista.add(3.5);
		lista.add(1,"hola");
		lista.add(45);
		System.out.println("---VER LISTA---");
		verLista(lista);
		
		//Sustituir el elemento de la posición 2 por "b"
		lista.set(2, 'b');
		
		//Borrar el elemento de la posición 3
		lista.remove(3);		
		System.out.println("---VER LISTA---");
		verLista(lista);
		
		//Borrar el elemento 'hola'
		lista.remove("hola");				
		System.out.println("---VER LISTA---");
		verLista(lista);
		

	}

	private static void verLista(List<Object> lista) {
		ListIterator<Object> iter = lista.listIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
	}

}
