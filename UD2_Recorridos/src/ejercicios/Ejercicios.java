package ejercicios;

import java.util.ArrayList;
import java.util.List;

import utiles.Utiles;

public class Ejercicios {

//CONTADOR
	// Método para contar pares desde un número hasta otro. Suponemos que a<b (0 es
	// un número par)
	public static Integer contarParesEntre(Integer min, Integer max) {
		Integer cont = 0;
		for (int i = min; i <= max; i++) {
			if (i % 2 == 0) {
				cont++;
			}
		}
		return cont;
	}

	// Contar pares de una lista
	// for clasico
//	public static Integer contarParesLista(List<Integer> lis) {
//		Integer cont = 0;
//		for (int i = 0; i < lis.size(); i++) {
//			if (lis.get(i) % 2 == 0) {
//				cont++;
//			}
//		}
//		return cont;
//	}
	// for extendido
	public static Integer contarParesLista(List<Integer> lis) {
		Integer cont = 0;
		for (Integer i : lis) {
			if (i % 2 == 0) {
				cont++;
			}
		}
		return cont;
	}

	// CONTAR PRIMOS
	public static Integer cuentaPrimosEn(List<Integer> lis) {
		Integer cont = 0;
		for (Integer i : lis) {
			if (Utiles.esPrimo(i)) {
				cont++;
			}
		}
		return cont;
	}

//SUMA
	// SUMA DE UNA LISTA DE NÚMEROS
	// foreach
	public static Double sumaListaReales(List<Double> lis, Integer min) {
		Double suma = 0.0;
		for (Double n : lis) {
			if (n > min) {
				suma += n;
			}
		}
		return suma;
	}
	// forclasico
//	public static Double sumaListaReales(List<Double> lis) {
//		Double suma = 0.0;
//		for (int=0;i<lis.size();i++) {
//			suma += lis.get(i);
//		}
//		return suma;
//	}

//SIEMPRE QUE SE REALIZA UNA BÚSQUEDA SE PONE UN BOOLEAN FALSE, Y SI ES TRUE SE PONE UN BREAK Y UN BUCLE WHILE
	// BÚSQUEDA (EXISTE)
	// DEVOLVER SI TIENE O NO ALGUN NÚMERO PRIMO DADA UNA LISTA
//	public static Boolean hayPrimoEn(List<Integer> lis) {
//		Boolean hay = false;
//		Integer i=0;
//		while (i<lis.size()) {
//			if (Utiles.esPrimo(i)) {
//				hay=true;
//				break;
//			}
//			i++;
//		}
//		return hay;
//	}
	public static Boolean hayPrimoEn(List<Integer> lis) {
		Boolean hay = false;
		for (Integer i : lis) {
			if (Utiles.esPrimo(i)) {
				hay = true;
				break;
			}
		}

		return hay;
	}

	// LA SUMA DE LOS PRIMOS DE UNA LISTA ES PRIMO?
	public static Boolean sumadePrimosEsPrimoEn(List<Integer> lis) {
		Boolean res = false;
		Integer suma = 0;
		for (Integer i : lis) {
			if (Utiles.esPrimo(i)) {
				suma += i;
			}
		}
		if (Utiles.esPrimo(suma)) {
			res = true;
		}
		return res;
	}

	// COMPROBACION (PARA TODOS) (empezando con boolean=true)
	// METODO QUE DE VUELVA UNA LISTA COMO PARAMETRO COMPRUEBE SI TODOS SUS
	// ELEMENTOS SON PRIMOS
	public static Boolean TodosSonPrimosEn(List<Integer> lis) {
		Boolean res = true;
		for (Integer i : lis) {
			if (!Utiles.esPrimo(i)) {
				res = false;
				break;
			}
		}

		return res;
	}

	// METODO PARA COMPROBAR SI UNA LISTA ES CRECIENTE
	// si la lista tiene 0 o 1 elemento se considera que es creciente
	public static Boolean crecienteEn(List<Integer> lis) {
		Boolean res = true;
//		for (int i = 0; i < lis.size() - 1; i++) {
//			if (lis.get(i) >= lis.get(i + 1)) {
//				res = false;
//				break;
//			}
//		}
		// mejor con while al no saber cuando se va a acabar
		Integer i = 0;
		while (i < lis.size() - 1) {
			if (lis.get(i) >= lis.get(i + 1)) {
				res = false;
				break;
			}
			i++;
		}
		return res;
	}

	// METODO PARA SUMAR NÚMEROS ENTRE 2 PRIMOS
	public static Integer sumaEntrePrimos(List<Integer> lis) {
		Integer suma = 0;
		for (int i = 0; i < lis.size(); i++) {
			if (Utiles.esPrimo(lis.get(i))) {
				for (int j = i + 1; j < lis.size(); j++) {
					if (Utiles.esPrimo(lis.get(j))) {
						break;
					}
					suma += lis.get(j);
				}
				break;
			}
		}
		return suma;
	}
	//DADA UNA LISTA HACER UN METODO QUE ME DEVUELVA OTRA LISTA CON LOS PRIMOS
		
	public static List<Integer> seleccionaPrimos(List<Integer> lis) {
		List<Integer> res = new ArrayList<>();
		for (Integer i : lis) {
			if (Utiles.esPrimo(i)) {
				res.add(i);
			}
		}
		return res;
	
	}

}


