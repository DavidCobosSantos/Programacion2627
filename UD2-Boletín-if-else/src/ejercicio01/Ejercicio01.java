package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	
//	Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		Integer num = sc.nextInt();
		if (num%2==0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar ");
		}
		sc.close();
	}

}
