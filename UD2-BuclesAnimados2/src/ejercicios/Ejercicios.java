package ejercicios;

import java.util.Scanner;

import utiles.Utiles;

public class Ejercicios {
	public static void ejercicio01() {
		Scanner sc = new Scanner(System.in);
		Integer filas = Utiles.leerEntero("Introduzca el número de filas: ", sc);
		Integer columnas = Utiles.leerEntero("Introduzca el número de columnas", sc);
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	public static void ejercicio02() {
		Scanner sc = new Scanner(System.in);
		Integer filas = Utiles.leerEntero("Introduzca el número de filas: ", sc);
		Integer columnas = Utiles.leerEntero("Introduzca el número de columnas", sc);
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (i == 0 || i == filas-1 || j == 0 || j == columnas-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		sc.close();
	}

}
