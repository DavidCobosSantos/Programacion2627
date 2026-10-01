package ejercicio05;

import java.util.Scanner;

public class Ej05 {
	public static void main(String[] args) {

//		Diseñar una aplicación que calcule la longitud y el área de una circunferencia. 
//		Para ello, el usuario debe introducir el radio, que puede contener decimales. 
//		Usa Math.PI para tomar el valor de PI. (longitud = 2πr, área=πr2)

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el radio de la circunferencia: ");
		Double radio = teclado.nextDouble();

		Double longitud = 2 * Math.PI * radio;
		Double area = Math.PI * radio * radio;

		System.out.println("La longitud de la circunferencia es de " + longitud);
		System.out.println("El area de la circunferencia es de " + area);

		teclado.close();
	}
}
