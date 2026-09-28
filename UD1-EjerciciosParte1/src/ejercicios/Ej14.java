package ejercicios;

import java.util.Scanner;

public class Ej14 {
//	Escribir un programa que solicite las notas del primer, segundo y tercer trimestre 
//	(notas enteras que se solicitarán al usuario). 
//	El programa debe mostrar la nota media del curso como se utiliza 
//	en el boletín de calificaciones (solo la parte entera) 
//	y como se usa en el expediente académico (con decimales).
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame la nota de tu primer trimestre: ");
		Integer prim = sc.nextInt();
		System.out.print("Dame la nota de tu segundo trimestre: ");
		Integer sec = sc.nextInt();
		System.out.print("Dame la nota de tu tercer trimestre: ");
		Integer ter = sc.nextInt();
		
		Double media = (prim + sec + ter)/ 3.0;
		Long mediaBole = Math.round(media);
		
		
		System.out.println("Nota en el boletín: " + mediaBole);
		Double mediaExpe = Math.round(media * 100.0)/100.0;

		System.out.println("Media para el expediente académico: " + mediaExpe);
		
		sc.close();
	}
	


}
