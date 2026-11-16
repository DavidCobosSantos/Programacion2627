package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
//	03. Triángulo rectángulo: ángulo abajo a la izquierda
//	Pide la altura N y construye un triángulo creciente alineado a la izquierda.
//	Ejemplo de entrada: N = 5
//	Salida esperada:
//	*
//	**
//	***
//	****
//	*****
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una altura: ");
		Integer altura = sc.nextInt();
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura; j++) {
				if (i-0 == j) {
					System.out.print("1");
				}if (i-1== j) {
					System.out.print("0");
				} if (i-2==j) {
					System.out.print("1");
				}if (i-3== j) {
					System.out.print("0");
				}
			}
			System.out.println();
			sc.close();
		}
	}
}
