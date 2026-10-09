package ejercicio04;

public class Ejercicio04 {
//	Diseñar un programa que muestre la suma de los 10 primeros números impares.
	public static void main(String[] args) {
		Integer valor = 0;
		final Integer nVueltas = 10;
		for (int i = 1; i <= 2 * nVueltas; i += 2) {
			valor += i;
		}
		System.out.println("Los " + nVueltas + " primeros números impares suman " + valor);
	}
}
