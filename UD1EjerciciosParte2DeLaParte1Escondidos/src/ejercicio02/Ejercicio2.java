package ejercicio02;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

//		Escribe un programa que tome como entrada un número entero e
//		indique qué cantidad hay que sumarle para que sea múltiplo de 7.
//		Por ejemplo, a 2 hay que sumarle 5 para que sea múltiplo de 7. 
//		En el caso de 13 habría que sumarle 1. Usa el operador módulo (%) 
//		para calcularlo.

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		Integer num = sc.nextInt();

		Integer numeroSumado = (7 - (num % 7)) % 7;

		System.out.println("Hay que sumar " + numeroSumado + " para que sea múltiplo de 7");
		sc.close();
	}

}
