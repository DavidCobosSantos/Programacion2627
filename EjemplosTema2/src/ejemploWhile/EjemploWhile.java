package ejemploWhile;

import java.util.Scanner;

public class EjemploWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deme un número entre 1 y 10");
		Integer n = sc.nextInt();
		
		while (n<1 || n>10) {
			System.err.println("Venga illooooooooooooo entre y 10");
			n = sc.nextInt();
		}
		System.out.println("El número es: " + n);
	}
}
