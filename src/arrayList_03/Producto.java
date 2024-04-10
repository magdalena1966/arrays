package arrayList_03;

import java.util.LinkedList;
import java.util.ListIterator;

public class Producto {
	
	private String nombre;
	private String marca;
	private double precio;
	
	public Producto() {
		super();
	}
	
	public Producto(String nombre, String marca, double precio) {
		super();
		this.nombre= nombre;
		this.marca = marca;
		this.precio = precio;
	}
	
	public void modificarPrecio(double precioNuevo) {
		precio = precioNuevo;
	}
	
	public void mostrarProducto() {
		System.out.println(nombre + " de " + marca + ". Precio: " + precio);
	}
	
	
	

	public static void main(String[] args) {
		
		LinkedList<Producto> lista = new LinkedList<>();
		
		Producto pro1 = new Producto ("Leche", "Pascual",2);
		Producto pro2 = new Producto ("Mayonesa", "Hellmans",6);
		Producto pro3 = new Producto ("Tomate", "solis",4);
		Producto pro4 = new Producto ("Pan molde", "Bombo",1.5);
		Producto pro5 = new Producto ("Yogur", "Danone",1.75);
		
		//qñadir elementos a la lista
		lista.add(pro1);
		lista.add(pro2);
		lista.add(pro3);
		lista.add(pro4);
		
		verLista(lista);
		lista.addFirst(pro5);
		System.out.println("--- añadir al principio");
		verLista(lista);
		
		lista.getLast().modificarPrecio(20);
		System.out.println("--- modificar precio");
		verLista(lista);
		

	}

	private static void verLista(LinkedList<Producto> lista) {
		
		//Recorro la lista con ListIterator
		ListIterator<Producto> iter = lista.listIterator();
		while(iter.hasNext()) {
		//	iter.next().mostrarProducto();
			System.out.println(iter.next());
		}
		
//	public void mostrarProducto() {
//		System.out.println(nombre + " de " + marca + ". Precio: " + precio);
//	} 
		
		
	}

}
