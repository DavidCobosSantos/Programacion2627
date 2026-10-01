package ejercicio05;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

//		Escribe un programa que solicite un número real y 
//		muestre su valor absoluto y su raíz cuadrada 
//		utilizando métodos de la clase Math.
//		Prueba el programa con diferentes valores positivos.

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		Double num = sc.nextDouble();
		System.out.println("Valor absoluto: " + Math.abs(num));
		System.out.println("Raíz cuadrada: " + Math.sqrt(num));
		sc.close();
	}

}
