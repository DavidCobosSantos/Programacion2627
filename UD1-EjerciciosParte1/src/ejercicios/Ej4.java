package ejercicios;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca las 2 notas: ");
		Double nota1 = teclado.nextDouble();
		System.out.print("");
		Double nota2 = teclado.nextDouble();
		
		Double media = (nota1 + nota2)/2;
		System.out.println("Su media es de " + media);
		
		
		
		teclado.close();
	}

}
