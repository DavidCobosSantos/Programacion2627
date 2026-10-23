package test;

import ejercicios.Primos;

public class TestPrimos {
	public static void main(String[] args) {
		System.out.println("Ejercicio de números primos");
		Boolean b = Primos.esPrimo(7);
		if (b) {
			System.out.println("El 7 es primo");
		} else {
			System.out.println("El 7 no es primo");
		}
		System.out.println(Primos.esPrimo(13));
		Primos.imprimePrimosHasta(100);
		System.out.println();
		Primos.imprimePrimosHasta(20);
	}

}
