package ejercicios;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduzca un numero: ");
		Integer num = teclado.nextInt();
		
		System.out.println("El número introducido es " + num);	
		teclado.close();
	}

}
