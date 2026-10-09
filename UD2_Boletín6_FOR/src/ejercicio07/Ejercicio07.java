package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {
//	Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número entero positivo: ");
		Integer n = sc.nextInt();
		Boolean esPrimo;
		if (n == 1) {
			esPrimo = false;
		} else {
			esPrimo = true;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					esPrimo = false;
					break;
				}
			}
		}
		String resolucion = esPrimo ? "Es primo" : "No es primo";
		System.out.println(resolucion);
		sc.close();

	}

}
