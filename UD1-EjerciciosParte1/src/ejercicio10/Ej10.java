package ejercicio10;

import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {

//		Escribir un programa que pida un número al usuario e indique 
//		mediante un literal booleano (true o false) si el número es par.

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		Integer num = teclado.nextInt();

		Boolean par = num % 2 == 0;
		String resultado = par ? "El numero es par" : "El numero es impar";
		System.out.println(resultado);
		teclado.close();
	}
}
