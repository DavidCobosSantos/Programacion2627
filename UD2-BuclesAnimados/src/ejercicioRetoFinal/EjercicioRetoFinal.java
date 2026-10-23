package ejercicioRetoFinal;

import java.util.Scanner;

public class EjercicioRetoFinal {
//	RETO FINAL
//	Elige dos figuras y haz que el usuario pueda repetir su ejecución
//	mediante un menú hasta seleccionar «Salir». 
//	Comprueba que las dimensiones introducidas sean positivas.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer opcion = null;
		do {
			System.out.println("Menú");
			System.out.println("1: Rombo");
			System.out.println("2: Reloj de arena");
			System.out.println("3: Salir");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Dame la altura.");
				Integer m;
				do {
					m = teclado.nextInt();
					if (m < 0) {
						System.out.println("Números positivos.");
					}
				} while (m < 0);

				for (int i = 0; i < m * 2; i++) {
					for (int j = 0; j < m * 2; j++) {
						if (i < m) {
							if (j < m) {
								if ((j + i) <= (m - 2)) {
									System.out.print(" ");
								} else {
									System.out.print("*");
								}

							} else {
								if (j > i + m - 1) {
									System.out.print(" ");
								} else {
									System.out.print("*");
								}
							}
						} else {
							if (j < m) {
								if (j + m > i) {
									System.out.print("*");
								} else {
									System.out.print(" ");
								}

							} else {
								if ((j + i) < (m * 3 - 2)) {
									System.out.print("*");
								} else {
									System.out.print(" ");
								}
							}
						}
					}
					System.out.println();
				}
				break;
			case 2:
				System.out.println("Deme la altura.");
				Integer n;
				do {
					n = teclado.nextInt();
					if (n < 0) {
						System.out.println("Números positivos.");
					}
				} while (n < 0);

				for (int i = 0; i < n * 2 - 1; i++) {
					for (int j = 0; j < n * 2; j++) {
						if (i < n) {
							if (j < n) {
								if (j < i) {
									System.out.print(" ");
								} else {
									System.out.print("*");
								}

							} else {
								if ((j + i) < n * 2 - 1) {
									System.out.print("*");
								} else {
									System.out.print(" ");
								}
							}
						} else {
							if (j <= n) {
								if ((j + i) <= (n * 2 - 3)) {
									System.out.print(" ");
								} else {
									System.out.print("*");
								}

							} else {
								if (j > i) {
									System.out.print(" ");
								} else {
									System.out.print("*");
								}
							}
						}
					}
					System.out.println();
				}
				break;
			case 3:
				System.out.println("Gracias por usar.");
				break;
			default:
				System.out.println("No es una opción.");
				break;
			}
		} while (opcion != 3);
		teclado.close();
	}
}
