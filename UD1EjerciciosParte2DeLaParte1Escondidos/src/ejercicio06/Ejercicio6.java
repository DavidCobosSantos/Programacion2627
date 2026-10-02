package ejercicio06;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

//		Solicita al usuario tres distancias:
//			La primera, medida en milímetros.
//			La segunda, medida en centímetros.
//			La última, medida en metros.
//		Diseña un programa que muestre la suma de las tres longitudes introducidas 
//		(medida en centímetros).

		Scanner sc = new Scanner(System.in);
		System.out.print("Dame una medida en milímetros: ");
		Integer mm = sc.nextInt();
		System.out.print("Dame una medida en centímetros: ");
		Integer cm = sc.nextInt();
		System.out.print("Dame una medida en metros: ");
		Integer m = sc.nextInt();
		mm /= 10;
		m *= 100;
		Integer resultado = mm + cm + m;
		System.out.println(resultado + "cm");
		sc.close();

	}
}
