package ejercicio01;

import java.util.Scanner;

//Realizar un programa que pida como entrada un número con decimales y 
//lo muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round())


public class Ejercicio1 {
	public static void main(String[] args) {
		
// Hay 2 formas:
// La primera:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número con decimales: ");
		Double num = sc.nextDouble();
		String resultado = String.format("%.0f", num);
		
		System.out.println(resultado);
		
// Y la segunda:
		
		System.out.println("Dame un número con decimales: ");
		Double num2 = sc.nextDouble();
		Double suelo = Math.floor(num2);
		Double techo = Math.ceil(num2);
		Double resultado2 = num2+0.5 >= techo ? techo : suelo;
		System.out.println(resultado2);
		
		sc.close();
	}

}
