package ejercicios;

import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		Integer num = teclado.nextInt();
		
		boolean par = num%2 == 0;
		String resultado = par ? "El numero es par" : "El numero es impar";
		System.out.println(resultado);
		teclado.close();
	}
}
