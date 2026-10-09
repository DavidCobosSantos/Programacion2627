package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
//	Pedir diez números por teclado y mostrar la media.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final Double nPeticiones = 10.0;
		Double valorTotal=0.0;
		for (int i = 0; i < nPeticiones; i++) {
			System.out.print("Introduce un número: ");
			Integer valor = sc.nextInt();
			valorTotal += valor;
			}
		valorTotal/=nPeticiones;
		System.out.println("La media es: " + valorTotal);
		sc.close();
	}
}
