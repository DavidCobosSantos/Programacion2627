package ejercicios;

import java.util.Scanner;

public class Ej11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un valor en pesetas: ");
		Float peseta = teclado.nextFloat();
		
		Float conversion = peseta / 166f;
		System.out.println("Esa cantidad son " + conversion + " €");
		teclado.close();
	}
	
}
