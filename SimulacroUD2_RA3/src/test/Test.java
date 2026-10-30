package test;

import java.util.List;

import ejercicios.Ejercicios;

public class Test {
	public static void main(String[] args) {
		//Ejercicio 1:
		System.out.println("\n--- LA TAQUILLA DEL CINE ---");
		System.out.println(Ejercicios.precioEntrada(10, "SABADO", true)); //7
		System.out.println(Ejercicios.precioEntrada(35, "LUNES", false)); //8
		System.out.println(Ejercicios.precioEntrada(66,"VIERNES", true)); //5
		System.out.println(Ejercicios.precioEntrada(-1, "LUNES", false)); //-1
		
		//Ejercicio 2:
		System.out.println("\n--- DIBUJO Z ---");
		Ejercicios.dibujarZ(5);
		

		//Ejercicio 3:
		System.out.println("\n--- SUMA NUMEROS ESPECIALES---");
		System.out.println(Ejercicios.sumaPrimerosEspeciales(1, 10, 3));
		System.out.println(Ejercicios.sumaPrimerosEspeciales(1, 10, 5));
		System.out.println(Ejercicios.sumaPrimerosEspeciales(8, 15, 2));
		
		//Ejercicio 4:
		System.out.println("\n--- FACTORIAL CON SALTOS ---");
		System.out.println(Ejercicios.factorialConSaltos(7, 2));
		
		//Ejercicio 5:
		System.out.println("\n--- PICOS ---");
		System.out.println(Ejercicios.contarPicos(List.of(2, 5, 1, 6, 3, 9, 7), 2)); 
		System.out.println(Ejercicios.contarPicos(List.of(2, 5, 4, 7, 4), 3));
		System.out.println(Ejercicios.contarPicos(List.of(1, 2), 1));
		
	}
	
}
