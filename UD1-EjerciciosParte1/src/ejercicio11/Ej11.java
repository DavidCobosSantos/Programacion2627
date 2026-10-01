package ejercicio11;

import java.util.Scanner;

public class Ej11 {
	public static void main(String[] args) {

//		Realiza un conversor de pesetas a euros. 
//		Para ello, pídele al usuario que te introduzca el valor en pesetas y,
//		a posteriori, debes mostrarle el resultado de la conversión.(1€ = 166 ptas).

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un valor en pesetas: ");
		Float peseta = teclado.nextFloat();

		Float conversion = peseta / 166f;
		System.out.println("Esa cantidad son " + conversion + " €");
		teclado.close();
	}

}
