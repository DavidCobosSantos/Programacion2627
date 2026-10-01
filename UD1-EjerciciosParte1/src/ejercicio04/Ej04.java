package ejercicio04;

import java.util.Scanner;

public class Ej04 {
	public static void main(String[] args) {

//		Crear una aplicación que calcule la media aritmética de dos notas enteras. 
//		Hay que tener en cuenta que la nota media puede tener decimales.

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca las 2 notas: ");
		Double nota1 = teclado.nextDouble();
		System.out.print("");
		Double nota2 = teclado.nextDouble();

		Double media = (nota1 + nota2) / 2;
		System.out.println("Su media es de " + media);

		teclado.close();
	}

}
