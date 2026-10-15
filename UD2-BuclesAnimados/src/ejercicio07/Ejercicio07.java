package ejercicio07;

import java.util.Iterator;
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
		Integer n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i<n) {
					if (i+j>=n-1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
						
					}
					
				} else {

				}
			}
			System.out.println();
		}
		

	}

}
