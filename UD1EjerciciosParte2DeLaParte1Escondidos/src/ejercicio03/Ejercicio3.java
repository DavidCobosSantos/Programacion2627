package ejercicio03;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

//		Modifica el ejercicio anterior para que, indicando dos números, 
//		por ejemplo, num1 y num2, diga qué cantidad hay que sumarle a num1 
//		para que sea múltiplo de num2.

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		Integer num1 = sc.nextInt();
		System.out.print("Introduzca otro número: ");
		Integer num2 = sc.nextInt();

		Integer numeroSumado = (num2 - (num1 % num2)) % num2;

		System.out.println("Hay que sumar " + numeroSumado + " para que sea múltiplo de " + num2);
		sc.close();

	}

}
