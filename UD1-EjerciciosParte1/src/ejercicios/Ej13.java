package ejercicios;

import java.util.Scanner;

public class Ej13 {
//	Diseñar un algoritmo que nos indique si podemos salir a la calle.
//	Existen aspectos que influirán en esta decisión: 
//	solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. 
//	Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle: 
//	el hecho de tener que ir a la biblioteca.
//	Solicitar al usuario (mediante un booleano) si llueve, 
//	si ha finalizado las tareas y si necesita ir a la biblioteca.
//	El algoritmo debe mostrar mediante un booleano (true o false) 
//	si es posible que se le otorgue permiso para salir a la calle.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Está lloviendo?");
		Boolean lluvia = sc.nextBoolean();
		System.out.println("¿Tienes tarea?");
		Boolean tarea = sc.nextBoolean();
		System.out.println("¿Necesitas ir a la biblioteca?");
		Boolean biblio = sc.nextBoolean();
		
		
		String fin = (!lluvia && !tarea) || biblio ? "Puedes salir" : "No puedes salir";
		System.out.println(fin);
		sc.close();
		
	}
	

}
