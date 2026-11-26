package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
//		07. Pirámide centrada
//		Dibuja una pirámide de N niveles. 
//		Ejemplo de entrada: N = 5
//		Salida esperada:
//		    *
//		   ***
//		  *****
//		 *******
//		*********
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número de niveles: ");
		Integer niveles = sc.nextInt();
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n * 2; j++) {
//				if (j < n ) {
//					if (i + j >= n - 1) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//
//					}
//
//				} else {
//					if(j > i + n - 1){
//						System.out.print(" ");
//
//					} else {
//						System.out.print("*");
//					}
//				}
//			}
//			System.out.println();
//
//		}
		for (int i = 0; i < niveles; i++) {
			for (int j = 0; j < 2 * niveles - 1; j++) {
				if (i + j >= niveles - 1 && j <= niveles + i - 1) {
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
