package ejercicio04;

public class Ejercicio04 {
//	Diseñar un programa que muestre la suma de los 10 primeros números impares.
	public static void main(String[] args) {
		Integer valor = 0;
		Integer contador = 10;
		for (int i = 1; i <= contador; i+=2) {
			valor+=i;
			contador++;
		}
		System.out.println("Los 10 primeros números impares suman " + valor);
	}

}
