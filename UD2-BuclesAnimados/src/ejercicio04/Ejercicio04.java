package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
//	04. Triángulo rectángulo: ángulo arriba a la izquierda
//	La primera fila tiene N asteriscos y cada fila siguiente uno menos.
//	Ejemplo de entrada: N = 5
//	Salida esperada:
//	*****
//	****
//	***
//	**
//	*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la altura: ");
		Integer altura = sc.nextInt();
		Integer n=altura;
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");				
			}
			n--;
			System.out.println();
		}
		sc.close();
	}

}
