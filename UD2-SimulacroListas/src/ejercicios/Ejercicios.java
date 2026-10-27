package ejercicios;

import java.util.List;
import utiles.Utiles;

public class Ejercicios {

	// 1. Sumar una lista mediante for-each.
	public static Integer suma1(List<Integer> numeros) {
		Integer suma = 0;

		for (Integer numero : numeros) {
			suma += numero;
		}

		return suma;
	}

	// 2. Sumar una lista mediante for clásico (con índice).
	public static Integer suma2(List<Integer> numeros) {
		Integer suma = 0;

		for (int i = 0; i < numeros.size(); i++) {
			suma += numeros.get(i);
		}

		return suma;
	}

	// 3. Sumar una lista mediante while.
	public static Integer suma3(List<Integer> numeros) {
		Integer suma = 0;
		int i = 0;

		while (i < numeros.size()) {
			suma += numeros.get(i);
			i++;
		}

		return suma;
	}

	// 4. Contar los números pares, incluido el 0.
	public static Integer contarPares(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (numero % 2 == 0) {
				contador++;
			}
		}

		return contador;
	}

	// 5. Contar los números primos mediante la clase Utiles.
	public static Integer contarPrimos(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (Utiles.esPrimo(numero)) {
				contador++;
			}
		}

		return contador;
	}

	// 6. Contar los números perfectos mediante la clase Utiles.
	public static Integer contarPerfectos(List<Integer> numeros) {
		Integer contador = 0;

		for (Integer numero : numeros) {
			if (Utiles.esPerfecto(numero)) {
				contador++;
			}
		}

		return contador;
	}

	// 7. Calcular la media mediante for-each.
	public static Double media1(List<Integer> numeros) {
		double res = 0.0;
		Integer suma = 0;
		if (numeros.size() != 0) {
			for (Integer numero : numeros) {
				suma += numero;
			} 
			res = (double) suma / numeros.size();
		}
		return res;
	}

	// 8. Calcular la media mediante for clásico.
	public static Double media2(List<Integer> numeros) {
		double res=0.0;
		Integer suma = 0;
		if (numeros.size() !=0) {
			for (int i = 0; i < numeros.size(); i++) {
				suma += numeros.get(i);
			} 
			res = (double) suma / numeros.size();
		}
		return res;
	}

	// 9. Calcular la media mediante while.
	public static Double media3(List<Integer> numeros) {

		Integer suma = 0;
		int i = 0;
		while (i < numeros.size()) {
			suma += numeros.get(i);
			i++;
		}

		return (double) suma / numeros.size();
	}

	// TODO Hacer aquí los ejercicios del examen
	// los haremos con distintos bucles
	// Ejercicio 1 — Control de acceso al Baile de los Monstruos

	public static boolean puedeEntrar(Integer edad, boolean acompañado, String criatura) {
		Boolean entrada = false;
		if (edad > 18 || acompañado == true || criatura.equalsIgnoreCase("vampiro")) {
			entrada = true;
		}

		return entrada;
	}

	// Ejercicio 2 — Clasificador de caramelos
	public static Integer clasificador(List<String> caramelos, String tipo) {
		Integer caramelo = 0;
		for (int i = 0; i < caramelos.size(); i++) {
			if (caramelos.get(i).equalsIgnoreCase(tipo)) {
				caramelo++;
			}
		}
		return caramelo;
	}

	// Ejercicio 3 — Contador de pasos en el Laberinto
	public static Integer pasosLaberinto(List<Integer> pasos) {
		Integer pasosLab = 0;
		Integer cont = 0;
		while (pasos.get(cont) >= 0) {
			pasosLab += pasos.get(cont);
			cont++;
		}

		return pasosLab;
	}

	public static Double promedioMagia(List<Integer> niveles) {
		Double suma = 0.0;
		Integer cont = 0;
		for (int i = 0; i < niveles.size(); i++) {
			if (niveles.get(i) >= 5) {
				suma += niveles.get(i);
				cont++;
			}
		}
		return Math.ceil(suma / cont * 100) / 100;
	}

	public static void cuentaAtrasSustos(Integer n) {
//		for (int i = n; i >= 1; i--) {
//			System.out.println("Boo " + i);
//		}
//		System.out.println("¡Susto final!");
		if (n == 0) {
			System.out.println("¡Susto final!");
		} else {
			System.out.println("Boo " + n);
			cuentaAtrasSustos(n - 1);
		}
	}

	// RECURSIVIDAD FACTORIAL
	public static Integer factorial(Integer n) {
		Integer res;
		if (n == 0) {
			res = 1;
		} else {
			res = n * factorial(n - 1);
		}
		return res;
	}

	public static Integer sumaEntreCeros(List<Integer> numeros) {
		Integer suma = 0;
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == 0) {
				for (int j = i + 1; j < numeros.size(); j++) {
					suma += numeros.get(j);
					if (numeros.get(j) == 0) {
						break;
					}
				}
				break;
			}
		}
		return suma;
	}
}
