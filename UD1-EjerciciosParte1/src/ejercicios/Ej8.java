package ejercicios;

import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca su nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Introduzca su edad: ");
		String edad = teclado.nextLine();
		
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		teclado.close();
	}
	
}
