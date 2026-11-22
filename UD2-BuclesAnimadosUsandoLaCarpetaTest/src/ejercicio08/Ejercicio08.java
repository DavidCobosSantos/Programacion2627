package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número de niveles:");
		Integer niveles = sc.nextInt();
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < 2*n-1; j++) {
//				if (j>=i && j<2*n-1-i) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		for (int i = 0; i < niveles; i++) {
			for (int j = 0; j < 2 * niveles - 1; j++) {
				if (j < i || j >= 2 * niveles - 1 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
