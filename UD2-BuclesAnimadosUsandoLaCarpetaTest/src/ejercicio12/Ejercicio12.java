package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
//	12. Tablero de ajedrez
//	Alterna * y # tanto por filas como por columnas. Puedes estudiar la paridad de fila + columna.
//	Ejemplo de entrada: 6 filas, 8 columnas
//	Salida esperada:
//	*#*#*#*#
//	#*#*#*#*
//	*#*#*#*#
//	#*#*#*#*
//	*#*#*#*#
//	#*#*#*#*

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número de filas: ");
		Integer filas = sc.nextInt();
		System.out.println("Introduzca un número de columnas: ");
		Integer columnas = sc.nextInt();

		for (int i = 1; i <= filas; i++) {
			System.out.println();
			for (int j = 1; j <= columnas; j++) {
				if (i % 2 != 0) {
					if (j % 2 != 0) {
						System.out.print("*");
					} else {
						System.out.print("#");
					}
				} else {
					if (j % 2 == 0) {
						System.out.print("*");
					} else {
						System.out.print("#");
					}
				}
			}
		}
		sc.close();
	}
}
