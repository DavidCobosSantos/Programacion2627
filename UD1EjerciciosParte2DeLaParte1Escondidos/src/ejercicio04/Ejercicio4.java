package ejercicio04;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

//		Dado el siguiente polinomio de segundo grado:
//			y=ax2+bx+c
//		Crea un programa que pida los coeficientes a, b y c, así como el valor 
//		de x, y calcula el valor correspondiente de y.
//			NO HAY QUE RESOLVER LA ECUACIÓN, SÓLO SUSTITUIR LOS VALORES

		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un valor para a: ");
		Integer a = sc.nextInt();
		System.out.print("Dame un valor para b: ");
		Integer b = sc.nextInt();
		System.out.print("Dame un valor para c: ");
		Integer c = sc.nextInt();
		System.out.print("Dame un valor para x: ");
		Integer x = sc.nextInt();

		System.out.println("La ecuación es y=" + a + "*" + x + "^2" + "+" + b + "*" + x + "+" + c);
		sc.close();
	}

}
