package test;


import java.util.List;

import ejercicios.Ejercicios;

public class TestEjercicios {
	public static void main(String[] args) {
		
		System.out.println("----CLASIFICAR TRIANGULO----");
		System.out.println(Ejercicios.clasificarTriangulo(3, 4, 5)); //-->RECTANGULO
		System.out.println(Ejercicios.clasificarTriangulo(5, 5, 5)); //-->EQUILATERO
		System.out.println(Ejercicios.clasificarTriangulo(5, 5, 8)); //-->ISOSCELES
		System.out.println(Ejercicios.clasificarTriangulo(4, 6, 9)); //-->ESCALENO
		System.out.println(Ejercicios.clasificarTriangulo(2, 2, 4)); //-->INVALIDO

		System.out.println("----EVEN AND ODD NUMBERS----");
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(2, 3, 8, 5))); //-->true 
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(1, 4, 7, 10))); //-->true 
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(2, 3, 5, 8))); //-->false
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(2, 4, 7, 8))); //-->false
		System.out.println(Ejercicios.alternatesEvenOdd(List.of(3))); //-->true
		System.out.println(Ejercicios.alternatesEvenOdd(List.of())); //-->true
		
		System.out.println("----TRIANGULO ALTERNO----");
		Ejercicios.trianguloAlterno(5);
		
		System.out.println("----PRIMERO CON DIVISORES----");
		System.out.println(Ejercicios.primeroConDivisores(10, 20, 4));
		System.out.println(Ejercicios.primeroConDivisores(2, 10, 3));
		System.out.println(Ejercicios.primeroConDivisores(13, 13, 2));
		System.out.println(Ejercicios.primeroConDivisores(10, 10, 3));
		
		System.out.println("----TRIBONACCI RECURSIVO----");
		System.out.println(Ejercicios.tribonacci(0));
		System.out.println(Ejercicios.tribonacci(1));
		System.out.println(Ejercicios.tribonacci(2));
		System.out.println(Ejercicios.tribonacci(3));
		System.out.println(Ejercicios.tribonacci(5));
		System.out.println(Ejercicios.tribonacci(7));
		
		System.out.println("----LISTA CASI CRECIENETE----");
		System.out.println(Ejercicios.esCasiCreciente(List.of(2,4,6,8))); //-->true
		System.out.println(Ejercicios.esCasiCreciente(List.of(2,5,3,7,9))); //-->true
		System.out.println(Ejercicios.esCasiCreciente(List.of(2,5,3,7,4))); //-->false
		System.out.println(Ejercicios.esCasiCreciente(List.of(1,3,3,5))); //-->true
		System.out.println(Ejercicios.esCasiCreciente(List.of(1,2,2,3,3,5))); //-->false
		System.out.println(Ejercicios.esCasiCreciente(List.of(1,2,3,2,3,0))); //-->false
		
		System.out.println("----PRIMERA VENTANA QUE ALCANZA OBJETIVO----");
		System.out.println(Ejercicios.primeraVentanaObjetivo(List.of(2,1,5,3,2), 3, 9));
		System.out.println(Ejercicios.primeraVentanaObjetivo(List.of(2,1,5,3,2), 3, 11));
		System.out.println(Ejercicios.primeraVentanaObjetivo(List.of(4,4,1,6), 2, 8));
		System.out.println(Ejercicios.primeraVentanaObjetivo(List.of(5,2,2), 2, 6)); //-->0
		System.out.println(Ejercicios.primeraVentanaObjetivo(List.of(1,4,5,13,7), 2, 18)); //-->2

	}

}
