package ejercicio03;

import java.util.Scanner;

public class Ej03 {
	public static void main(String[] args) {

//		Escribir una aplicación que pida el año actual y 
//		el año de nacimiento del usuario. Debe calcular su edad.

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el año en el que estamos: ");
		Integer anio = teclado.nextInt();
		System.out.print("Introduzca el año de nacimiento: ");
		Integer anioNac = teclado.nextInt();

		Integer edad = anio - anioNac;
		System.out.println("Su edad es de " + edad + " años.");

		teclado.close();
	}

}
