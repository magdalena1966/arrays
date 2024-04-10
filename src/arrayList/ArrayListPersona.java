package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListPersona {

	public static void main(String[] args) {
		
		List<Persona> lista1 = new ArrayList<>();
		List<Persona> lista2 = new ArrayList<>();
		
		Persona p1, p2, p3, p4, p5;
		p1=new Persona("Marta",30);
		p2=new Persona("Paco",22);
		p3=new Persona("Pepe",40);
		p4=new Persona("Mirian",33);
		p5=new Persona("Maria",18);
		
		//Añadir elementos Persona a lista1
		lista1.add(p1);
		lista1.add(p2);
		lista1.add(p3);
		lista1.add(p4);
		lista1.add(p5);
		
		//Incluir p5 en la posición 2
		lista1.add(2,p5);
		
		//Añadir todo el contenido de la lista1 a la lista2
		lista2.addAll(lista1);
		
		//foreach visualizar solo el nombre
		//Recorre la lista1 con el for each visualizando el nombre
		System.out.println("Las personas de la lista1 con FOR-EACH son:");
		for (Persona per: lista1) {
			System.out.println(per.getNombre());
		}
		
		//Recorre la lista2 con el for each visualizando el nombre
		System.out.println("Las personas de la lista2 con FOR son:");
		for (int i=0; i<lista2.size(); i++) {
			System.out.println(lista2.get(i).getNombre());
		}
		
		//Recorrer la lista1 con Iterator
		System.out.println("Las personas de la lista1 con Iterator:");
		Iterator<Persona> iter = lista1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().getNombre());
		}
		
		//Recorrer la lista1 con listIterator de atras a adelante
		System.out.println("Las personas de la lista1 con ListIterator de atras a adelante:");
		ListIterator<Persona> listIter = lista1.listIterator().lista1.size();
		while (listIter.hasPrevious()) {
			System.out.println(listIter.previous().getNombre());
		}
		
		//Reemplazar el elemento con indice 1 en la lista1
		lista1.set(1, new Persona("Ana",44));
		
		//Buscar el elemento p4 en la lista1
		int posicion;
		posicion=lista1.indexOf(p4);
		if (posicion==-1) {
			System.out.println("No ha encontrado el elemento");
		}
		else {
			System.out.println("EL ELEMENTO P4 ES: " + lista1.get(posicion).getNombre());
		}
		
		VerLista1(lista1);
	
	}
	
	private static void VerLista1(List<Persona> lista1) {
		System.out.println("Las personas de la lista1 con FOR-EACH son:");
		for (Persona per:lista1) {
			System.out.println(per);
		}
		
	}

}
