package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {
//	Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
	public static void main(String[] args) {
		final Integer alumnos = 5;
		Scanner sc = new Scanner(System.in);
		Boolean suspenso = false;
		for (int i = 0; i < alumnos; i++) {
			System.out.println("Introduzca su nota: ");
			Integer nota = sc.nextInt();
			if (nota<5) {
				suspenso = true;
				break;
			}		
		}
		String existeSuspenso = suspenso ? "Hay algún alumno suspenso" : "No hay alumnos suspensos";
		System.out.println(existeSuspenso);
		sc.close();
	}

}
