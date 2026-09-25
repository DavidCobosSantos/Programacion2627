package ejercicios;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca su edad: ");
		Integer edad = teclado.nextInt();
		
		boolean mayor18 = edad > 17;
		String resultado = mayor18 ? "Eres mayor de edad" : "Eres menor de edad";
		System.out.println(resultado);
		teclado.close();
		
	}
}
