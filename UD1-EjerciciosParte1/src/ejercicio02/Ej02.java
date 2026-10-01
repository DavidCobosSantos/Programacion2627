package ejercicio02;

import java.util.Scanner;

public class Ej02 {
	public static void main(String[] args) {

//		Pedir al usuario su edad y mostrar la edad que tendrá el próximo año.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca su edad: ");
		Integer edad = teclado.nextInt();

		edad++;

		System.out.println("El próximo año su edad sera " + edad);

		teclado.close();
	}

}
