package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

//		Pide al usuario una cantidad de dinero con decimales. 
//		Mediante un cast a int obtén la cantidad de euros enteros. 
//		A partir de la parte decimal, calcula también los céntimos y redondéalos correctamente.

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una cantidad de dinero: ");
		Double precio = sc.nextDouble();

		Integer precioEntero = (int) Math.floor(precio);
		Double precioDecimalCalculo = precio - precioEntero;
		Integer precioDecimalRedondeo = (int) Math.round(precioDecimalCalculo * 100.0);
		System.out.println("Euros: " + precioEntero + " €\nCéntimos: " + precioDecimalRedondeo + " cent");
		sc.close();

	}

}
