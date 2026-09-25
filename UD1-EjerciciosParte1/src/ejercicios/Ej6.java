package ejercicios;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	System.out.print("Introduzca dos números: ");
	Double num1 = teclado.nextDouble();
	System.out.print("");
	Double num2 = teclado.nextDouble();
	
	Double suma = num1 + num2;
	Double resta = num1 - num2;
	Double multiplicacion = num1 * num2;
	Double division = num1 / num2;
	
	System.out.println("Suma: " + suma + "\nResta: " + resta + "\nMultiplicacion: " + multiplicacion + "\nDivision: " + division);
	teclado.close();
	}
}
