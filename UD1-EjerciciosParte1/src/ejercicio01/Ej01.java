package ejercicio01;

import java.util.Scanner;

public class Ej01 {
	public static void main(String[] args) {

//		Diseña un programa que pida un número al usuario y a continuación lo muestre.

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		Integer num = teclado.nextInt();

		System.out.println("El número introducido es " + num);
		teclado.close();
	}

}
