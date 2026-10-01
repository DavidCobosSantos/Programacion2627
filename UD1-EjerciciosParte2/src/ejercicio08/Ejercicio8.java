package ejercicio08;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

//		Una empresa guarda productos en cajas con una capacidad determinada. 
//		Pide al usuario el número de productos y la capacidad de cada caja.
//		Calcula cuántas cajas son necesarias para guardar todos los productos utilizando Math.ceil(). 
//		El resultado final debe mostrarse como un número entero.

		Scanner sc = new Scanner(System.in);
		System.out.print("Número de productos: ");
		Double prod = sc.nextDouble();
		System.out.print("Capacidad de cada caja: ");
		Double cap = sc.nextDouble();

		Double cajas = prod / cap;
		System.out.println("Hacen falta " + Math.round(Math.ceil(cajas)*10)/10 + " cajas");
		sc.close();
	}

}
