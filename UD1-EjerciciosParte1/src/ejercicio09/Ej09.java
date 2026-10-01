package ejercicio09;

import java.util.Scanner;

public class Ej09 {
	public static void main(String[] args) {

//		Realizar una aplicación que solicite al usuario su edad y 
//		le indique si es mayor de edad (mediante un literal booleano: true o false).

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca su edad: ");
		Integer edad = teclado.nextInt();

		boolean mayor18 = edad > 17;
		String resultado = mayor18 ? "Eres mayor de edad" : "Eres menor de edad";
		System.out.println(resultado);
		teclado.close();

	}
}
