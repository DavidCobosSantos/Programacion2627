package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
//	01. Rectángulo macizo
//	Pide filas y columnas. Dibuja un rectángulo de asteriscos.
//	Ejemplo de entrada: 4 filas, 7 columnas
//	Salida esperada:
//	*******
//	*******
//	*******
//	*******
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número de filas: ");
		Integer filas = sc.nextInt();
		System.out.print("Introduzca un número de columnas: ");
		Integer col = sc.nextInt();
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}


	

}
