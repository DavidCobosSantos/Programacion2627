package ejercicio09;

import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		
//		Un depósito contiene una cantidad de litros de agua y
//		se quiere llenar botellas de una capacidad determinada. 
//		Solicita ambos valores y calcula cuántas botellas completas 
//		pueden llenarse utilizando Math.floor().
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Cantidad litros de agua: ");
		Double litrosAgua = sc.nextDouble();
		System.out.print("Capacidad de cada botella: ");
		Double capBotella = sc.nextDouble();
		
		Double botellas = litrosAgua / capBotella;
		System.out.println("Se llenarán " + Math.round(Math.floor(botellas)*10)/10 + " botellas completas");
		sc.close();

		
	}

}
