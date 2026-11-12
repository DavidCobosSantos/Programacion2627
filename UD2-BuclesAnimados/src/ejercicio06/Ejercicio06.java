package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {
//	06. Triángulo rectángulo: ángulo arriba a la derecha
//	La cantidad de asteriscos disminuye mientras aumentan los espacios iniciales.
//	Ejemplo de entrada: N = 5
//	Salida esperada:
//	*****
//	 ****
//	  ***
//	   **
//	    *
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una altura: ");
		Integer altura = sc.nextInt();
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura; j++) {
				if (i <= j) {
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
