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
		Integer altura = sc.nextInt();

		for (int i = 0; i < altura * 2-1; i++) {
			System.out.println();
			for (int j = 0; j < altura * 2; j++) {
				if (i < altura) {
					if (j < altura) {
						if (j<i) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}

					} else {
						if ((j + i) < altura*2-1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
				} else {
					if (j <= altura) {
						if ((j + i) <= (altura*2 - 3)) {
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
