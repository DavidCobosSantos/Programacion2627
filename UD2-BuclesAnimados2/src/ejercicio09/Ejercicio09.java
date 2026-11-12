package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {
//	09. Rombo
//	Combina una pirámide de N niveles con una pirámide invertida sin repetir la fila central.
//	Ejemplo de entrada: N = 4
//	Salida esperada:
//	   *
//	  ***
//	 *****
//	*******
//	 *****
//	  ***
//	   *

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una altura: ");
		Integer altura = sc.nextInt();

		for (int i = 0; i < altura * 2; i++) {
			System.out.println();
			for (int j = 0; j < altura * 2; j++) {
				if (i < altura) {
					if (j < altura) {
						if ((j + i) <= (altura - 2)) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}

					} else {
						if (j > i + altura - 1) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
				} else {
					if (j < altura) {
						if (j + altura > i) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}

					} else {
						if ((j + i) < (altura * 3 - 2)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
				}
			}
		}
		sc.close();
	}
}
