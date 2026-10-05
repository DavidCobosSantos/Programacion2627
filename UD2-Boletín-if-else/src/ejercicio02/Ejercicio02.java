package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
//		Escribir un programa que pida al usuario tres números enteros, 
//		y que muestre por pantalla el mayor de los 3.
//		Supondremos que los tres números son distintos.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor de a: ");
		Integer a = sc.nextInt();
		System.out.println("Introduzca el valor de b: ");
		Integer b = sc.nextInt();
		System.out.println("Introduzca el valor de c: ");
		Integer c = sc.nextInt();
		Integer res = c;
		if (a > b) {
			if (a > c) {
				res = a;
			}
		} else if (b > c) {
			res = b;
		}
		System.out.println("El número mayor es: " + res);

		sc.close();

	}
}
