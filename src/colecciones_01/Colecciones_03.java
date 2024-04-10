package colecciones_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Colecciones_03 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String cadena="";
		
		Collection<String> colec = new ArrayList<>();
		
		//Vamos pidiendo cadenas al usuario y las vamos almacenando
		//Salimos cuando la cadena es FIN
		while (!cadena.equals("FIN")) {
			System.out.println("Dame una cadena");
			cadena = sc.nextLine();
			if (!cadena.equals("FIN"))
					colec.add(cadena);
		}
		
		//Pedimos una letra al usuario
		System.out.println("Introduce una letra");
		String sLetra=sc.next();
		char letra=sLetra.charAt(0);
		
		//Recorremos con un Iterator la colección y borramos
		//las cadenas por esa letra
		Iterator<String> iter = colec.iterator();
		String sElemento;
		while (iter.hasNext()) {
			sElemento=iter.next();
			if (sElemento.charAt(0)==letra) {
				iter.remove();
			}
		}
		
		//Visualizar la colección
		iter=colec.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
		
		
	}


}
