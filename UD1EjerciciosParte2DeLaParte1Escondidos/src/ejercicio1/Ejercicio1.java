package ejercicio1;

import java.util.Scanner;

//Realizar un programa que pida como entrada un número con decimales y 
//lo muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round())


public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número con decimales: ");
		Double num = sc.nextDouble();
		String resultado = String.format("%.0f", num);
		
		System.out.println(resultado);
		
		
		
		sc.close();
	}

}
