package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
//	16. Figura con dos diagonales
//	Dibuja un cuadrado con # en las dos diagonales y puntos (.) en el resto.
//	Ejemplo de entrada: N = 7
//	Salida esperada:
//	#.....#
//	.#...#.
//	..#.#..
//	...#...
//	..#.#..
//	.#...#.
//	#.....#
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una altura: ");
		Integer altura = sc.nextInt();
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura; j++) {
				if (i == j || (i + j) == altura - 1) {
					System.out.print("#");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
