package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

//		Diseña un programa que determine si una persona puede alquilar un vehículo.
//		Solicita su edad y dos valores booleanos que indiquen si posee permiso de conducir
//		y si tiene una sanción que le impida conducir. Podrá alquilarlo si es mayor de edad, 
//		tiene permiso y no tiene dicha sanción. Muestra únicamente el resultado booleano.

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca su edad: ");
		Integer edad = sc.nextInt();
		System.out.println("¿Tiene permiso de conducir?");
		Boolean permiso = sc.nextBoolean();
		System.out.println("¿Tiene sancion?");
		Boolean sancion = sc.nextBoolean();

		Boolean alquiler = (edad >= 18 && permiso && !sancion);

		System.out.println("¿Puedes alquilar? -->" + alquiler);
		sc.close();

	}

}
