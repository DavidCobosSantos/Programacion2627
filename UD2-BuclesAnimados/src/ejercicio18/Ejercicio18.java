package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {
//	18. Reto: reloj de arena
//	Une una pirámide invertida con otra creciente, evitando duplicar la fila más estrecha.
//	Ejemplo de entrada: N = 4
//	Salida esperada:
//	*******
//	 *****
//	  ***
//	   *
//	  ***
//	 *****
//	*******

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame la altura.");
		Integer n = sc.nextInt();

		for (int i = 0; i < n * 2-1; i++) {
			System.out.println();
			for (int j = 0; j < n * 2; j++) {
				if (i < n) {
					if (j < n) {
						if (j<i) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}

					} else {
						if ((j + i) < n*2-1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
				} else {
					if (j <= n) {
						if ((j + i) <= (n*2 - 3)) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}

					} else {
						if (j > i ) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					}
				}
			}
			
		}
		sc.close();
	}
}
