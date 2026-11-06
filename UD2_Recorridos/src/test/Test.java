package test;

import java.util.List;

import ejercicios.Ejercicios;

public class Test {
	public static void main(String[] args) {
		System.out.println("----CONTAR PARES ENTRE----");
		System.out.println(Ejercicios.contarParesEntre(0, 20));
		System.out.println(Ejercicios.contarParesEntre(-3, 51));
		System.out.println(Ejercicios.contarParesEntre(15, 26));
		System.out.println(Ejercicios.contarParesEntre(-125, 203));
		
		System.out.println("----CONTAR PARES LISTA----");
		System.out.println(Ejercicios.contarParesLista(List.of(1,2,3,5,4,2,9)));
		System.out.println(Ejercicios.contarParesLista(List.of(6,12,14,234,43)));
	
		System.out.println("----CONTAR PRIMOS----");
		System.out.println(Ejercicios.cuentaPrimosEn(List.of(1,2,3,5,7,13,15)));
	
		System.out.println("----SUMA LISTA CON MÍNIMO----");
		System.out.println(Ejercicios.sumaListaReales(List.of(5.9, 3.2,5.5),5));
	
		System.out.println("----HAY PRIMO O NO EN LISTA----");
		System.out.println(Ejercicios.hayPrimoEn(List.of(2,6,4,8,7,2,6)));
	
		System.out.println("----SUMA DE PRIMOS ES PRIMO O NO----");
		System.out.println(Ejercicios.sumadePrimosEsPrimoEn(List.of(3,3,7,6,9)));

		System.out.println("----SUMA ENTRE PRIMOS----");
		System.out.println(Ejercicios.sumaEntrePrimos(List.of(7, 6, 8, 6, 4, 7, 4, 6, 8)));
	}

}
