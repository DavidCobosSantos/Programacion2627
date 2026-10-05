package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

//		Pedir los coeficientes de una ecuación de segundo grado y mostrar sus soluciones reales. 
//		Si no existen, habrá que indicarlo. Hay que tener en cuenta que las soluciones de una 
//		ecuación de segundo grado
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor de a: ");
		Double a = sc.nextDouble();
		System.out.println("Introduzca el valor de b: ");
		Double b = sc.nextDouble();
		System.out.println("Introduzca el valor de c: ");
		Double c = sc.nextDouble();
		System.out.println("La ecuación es " + a + "x^2 + " + b + "x + " + c + " = 0");
		if (b * b - 4 * a * c >= 0) {
			System.out.println("Hay 2 soluciones");
			Double sol1 = (-b + Math.sqrt(b * b - 4 * a * c))/(2*a);
			Double sol2 = (-b - Math.sqrt(b * b - 4 * a * c))/(2*a);
			System.out.println("Solucion 1: " + sol1 + "\nSolucion 2: " + sol2);
		} else {
			System.out.println("No hay solucion real");
		}
		sc.close();
	}

}
