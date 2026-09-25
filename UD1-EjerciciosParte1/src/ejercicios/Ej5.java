package ejercicios;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el radio de la circunferencia: ");
		Double radio = teclado.nextDouble();
		
		Double longitud = 2*Math.PI*radio;
		Double area = Math.PI*radio*radio;
		
		System.out.println("La longitud de la circunferencia es de " + longitud);
		System.out.println("El area de la circunferencia es de " + area);
		
		teclado.close();
	}
}
