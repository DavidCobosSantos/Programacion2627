package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

//	Escribir un programa que pida al usuario tres números enteros, 
//	y que muestre por pantalla si la suma de dos de esos números 
//	da como resultado el otro número.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor de a: ");
		Integer a = sc.nextInt();
		System.out.println("Introduzca el valor de b: ");
		Integer b = sc.nextInt();
		System.out.println("Introduzca el valor de c: ");
		Integer c = sc.nextInt();

		Boolean res = false;
		if (a + b == c || b + c == a || c + a == b) {
			res = true;
		}
		System.out.println(res);

		sc.close();
	}

}
