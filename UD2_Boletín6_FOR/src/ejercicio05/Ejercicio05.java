package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
//	Pedir un número y calcular su factorial. 
//	Por ejemplo, el factorial de 5 se denota 5! y es igual a 5x4x3x2x1 = 120.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		Integer n = sc.nextInt();
		Long valorFactorial = 1L;
		for (int i = 1; i <= n; i++) {
			valorFactorial*=i;
		}
		System.out.println("El valor factorial de " + n + " es " + valorFactorial);
		sc.close();
	}
}
