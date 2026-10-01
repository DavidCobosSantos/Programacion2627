package ejercicio06;

import java.util.Scanner;

public class Ej06 {
	public static void main(String[] args) {

//		Escribir un programa que le pida dos números al usuario. 
//		A continuación, debe mostrar la suma, la resta, la multiplicación y 
//		la división de ambos números. Debe mostrarse el resultado de cada operación
//		en una línea distinta.

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca dos números: ");
		Double num1 = teclado.nextDouble();
		System.out.print("");
		Double num2 = teclado.nextDouble();

		Double suma = num1 + num2;
		Double resta = num1 - num2;
		Double multiplicacion = num1 * num2;
		Double division = num1 / num2;

		System.out.println("Suma: " + suma + "\nResta: " + resta + "\nMultiplicacion: " + multiplicacion
				+ "\nDivision: " + division);
		teclado.close();
	}
}
