package ejercicios;

import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {
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
