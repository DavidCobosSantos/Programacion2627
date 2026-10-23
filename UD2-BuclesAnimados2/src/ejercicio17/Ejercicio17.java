package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
//		17. Triángulo de números
//		En la fila i muestra los números desde 1 hasta i, sin espacios entre ellos.
//		Ejemplo de entrada: N = 5
//		Salida esperada:
//		1
//		12
//		123
//		1234
//		12345
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una altura: ");
		Integer altura = sc.nextInt();
		for (int i = 0; i < altura; i++) {
			for (int j = 1; j <= altura - (altura - 1) + i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}
