package ejercicio01;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

//		Escribe un programa que solicite al usuario la base y
//		la altura de un rectángulo (pueden contener decimales). 
//		Debe calcular y mostrar su perímetro y su área.

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el valor de la base: ");
		Double base = sc.nextDouble();
		System.out.print("Introduce el valor de la altura: ");
		Double altura = sc.nextDouble();
		Double perimetro = base * 2 + altura * 2;
		Double area = base * altura;
		System.out.println("Perímetro: " + perimetro + "\nÁrea: " + area);
		sc.close();
	}

}
