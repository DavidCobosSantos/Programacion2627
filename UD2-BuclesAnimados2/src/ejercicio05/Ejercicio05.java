package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
//	05. Triángulo rectángulo: ángulo abajo a la derecha
//	Utiliza espacios iniciales para alinear los asteriscos a la derecha.
//	Ejemplo de entrada: N = 5
//	Salida esperada:
//	    *
//	   **
//	  ***
//	 ****
//	*****
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una altura: ");
		Integer altura = sc.nextInt();
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura; j++) {
				if (i+j>=altura-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		sc.close();
	}

}
