package ejercicioRetoFinal;

import java.util.Scanner;

public class EjercicioRetoFinal {
	public static void main(String[] args) {
		System.out.println("Menú");
		Scanner sc = new Scanner(System.in);
		Integer opcion;
		do {
			System.out.println("Deme a: ");
			Integer a = sc.nextInt();
			System.out.println("Deme b: ");
			Integer b = sc.nextInt();
			System.out.println("1: Hacer suma");
			System.out.println("2: Hacer producto");
			System.out.println("3: salir");
			System.out.println("Deme una opción:");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("La suma es: " + (a + b));
				break;
			case 2:
				System.out.println("El producto es: " + (a * b));
			
			}
		} while (opcion!=3);
	}
}
