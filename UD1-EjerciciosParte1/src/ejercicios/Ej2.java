package ejercicios;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca su edad: ");
		Integer edad = teclado.nextInt();
		
		edad++;
		
		System.out.println("El próximo año su edad sera " + edad);
		
		
		teclado.close();
	}

}
