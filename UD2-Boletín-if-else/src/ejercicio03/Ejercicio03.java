package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
//		Escribir un programa que pida al usuario un mes y un año y que muestre
//		por pantalla el número total de días que tiene ese mes de ese año. 
//		Hay que considerar que los meses de febrero pueden tener 29 o 28 días 
//		según el año sea o no bisiesto
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduca un mes: ");
		Integer mes = sc.nextInt();
		System.out.println("Introduzca un año: ");
		Integer a = sc.nextInt();
		Integer dias = null;
		Boolean bisiesto = (a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0));
		if (mes != 2) {
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				dias = 30;
			} else {
				dias = 31;
			}

		} else if (bisiesto) {
			dias = 29;

		} else {
			dias = 28;
		}
		System.out.println("Este mes tiene: " + dias + " días.");
		sc.close();
	}
}
