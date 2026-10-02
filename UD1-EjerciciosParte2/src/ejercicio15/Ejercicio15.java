package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
	
	public static void main(String[] args) {
	
//	Solicita tres números enteros a, b y c. Calcula y muestra 
//	el resultado de las expresiones a + b * c y (a + b) * c. 
//	Comprueba que los resultados pueden ser distintos y explica 
//	mediante un comentario en el código el motivo.
	
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Introduce el valor de a: ");
	 Integer a = sc.nextInt();
	 System.out.print("Introduce el valor de b: ");
	 Integer b = sc.nextInt();
	 System.out.print("Introduce el valor de c: ");
	 Integer c = sc.nextInt();
	 Integer calculo1 = a + b * c;
	 Integer calculo2 = (a + b) * c;
	 System.out.println("Calculo 1: " + calculo1);
	 System.out.println("Calculo 2: " + calculo2);
	 sc.close();
	
	}
}
