package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

//		Pide al usuario su edad y utiliza el operador ternario para calcular 
//		el precio de una entrada: 6,50 € si es menor de 18 años y 9,50 € en caso contrario.
//		Muestra el precio correspondiente.

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su edad: ");
		Integer edad = sc.nextInt();
		String resultado = edad < 18 ? "Su entrada vale 6,50€" : "Su entrada vale 9,50€";
		System.out.println(resultado);
		sc.close();

	}
}
