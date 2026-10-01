package ejercicio02;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

//		Diseña una aplicación que solicite al usuario que
//		introduzca una cantidad de segundos. 
//		La aplicación debe mostrar cuántas horas, minutos y segundos
//		hay en el número de segundos introducidos por el usuario.

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una cantidad de segundos: ");
		Integer sec = sc.nextInt();
		Integer horas = (sec / 3600);
		Integer min = ((sec % 3600) / 60);
		Integer sec2 = ((sec % 3600) % 60);
		System.out.println("Horas: " + horas + "\nMinutos: " + min + "\nSegundos: " + sec2);
		sc.close();
	}

}
