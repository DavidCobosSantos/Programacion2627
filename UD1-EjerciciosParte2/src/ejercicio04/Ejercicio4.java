package ejercicio04;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

//		Pide al usuario un número real y muestra:
//		el entero inmediatamente inferior mediante Math.floor(), 
//		el entero inmediatamente superior mediante Math.ceil() y
//		el entero más cercano mediante Math.round().

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		Double num = sc.nextDouble();
		System.out.println("Entero superior: " + Math.ceil(num));
		System.out.println("Entero inferior: " + Math.floor(num));
		System.out.println("Entero redondeado: " + Math.round(num * 100.0) / 100);
		sc.close();
	}
}
