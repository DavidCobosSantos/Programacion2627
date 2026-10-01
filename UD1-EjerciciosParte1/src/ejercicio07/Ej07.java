package ejercicio07;

import java.util.Scanner;

public class Ej07 {
	public static void main(String[] args) {

//		Escribir un programa que le pida al usuario su nombre, dirección y teléfono.
//		Guarda cada dato en variables distintas. 
//		A continuación, muestra los datos de la siguiente forma:
//			Nombre: Elena
//			Dirección: Calle Inventada
//			Teléfono: 987654321

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca su nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Introduzca su direccion: ");
		String direccion = teclado.nextLine();
		System.out.print("Introduzca su telefono: ");
		String telefono = teclado.nextLine();

		System.out.println("Nombre: " + nombre + "\nDireccion: " + direccion + "\nTelefono: " + telefono);
		teclado.close();
	}
}
