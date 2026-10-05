package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
//	Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999.
//	La aplicación tendrá que indicar si el número introducido es capicúa. 
//	Un número es capicúa si se lee igual de izquierda a derecha que de derecha a izquierda.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entre 0 y 9999: ");
		Integer num = sc.nextInt();
		Boolean esCapicua = false;
		if (num <= 9) {
			esCapicua = true;
		} else if (num >= 10 && num <= 99) {
			Integer unidades = num % 10;
			Integer decenas = (num / 10);
			if (unidades == decenas) {
				esCapicua = true;
			}
		} else if (num >= 100 && num <= 999) {
			Integer unidades = num % 10;
			Integer centenas = num / 100;
			if (unidades == centenas) {
				esCapicua = true;
			}
		} else {
			Integer unidades = num % 10;
			Integer decenas = (num / 10) % 10;
			Integer centenas = (num / 100) % 10;
			Integer millar = num / 1000;
			if (decenas == centenas && unidades == millar) {
				esCapicua = true;
			}

		}
		System.out.println(esCapicua);
		sc.close();
	}

}
