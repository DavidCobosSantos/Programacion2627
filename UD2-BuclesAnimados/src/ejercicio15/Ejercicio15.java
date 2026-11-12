package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
//	15. Figura con diagonal principal
//	Dibuja un cuadrado de N×N en el que la diagonal principal sea # y el resto *.
//	Ejemplo de entrada: N = 5
//	Salida esperada:
//	#****
//	*#***
//	**#**
//	***#*
//	****#

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una altura.");
		Integer altura = sc.nextInt();

		for (int i = 1; i <= altura; i++) {
			System.out.println();
			for (int j = 1; j <= altura; j++) {
				if (j == i) {
					System.out.print("#");
				} else {
					System.out.print(".");
				}
			}

		}
		sc.close();
	}
}
