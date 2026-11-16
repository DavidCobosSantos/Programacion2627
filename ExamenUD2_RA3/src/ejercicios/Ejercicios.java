package ejercicios;

import java.util.List;

import utiles.Utiles;

public class Ejercicios {

	// Ejercicio 1
//	Recibes tres longitudes enteras positivas. Debes decidir si pueden formar un triángulo y, si es 
//	posible, clasificarlo. Un triángulo solo es válido cuando la suma de dos lados cualesquiera es mayor 
//	que el tercero. Si no se cumple esa condición, el resultado será "INVALIDO". 
//	Para un triángulo válido, devuelve "RECTANGULO" si cumple el teorema de Pitágoras. Si no es 
//	rectángulo, devuelve "EQUILATERO" cuando los tres lados son iguales, "ISOSCELES" cuando 
//	exactamente dos son iguales y "ESCALENO" cuando todos son distintos. 

	public static String clasificarTriangulo(Integer a, Integer b, Integer c) {
		String res = "Null";
		if (a + b > c && a + c > b && c + b > a) {
			if ((a * a + b * b) == c * c) {
				res = "RECTANGULO";
			} else {
				if (a == b && a == c) {
					res = "EQUILATERO";
				}
				if (a == b && a != c || b == c && b != a) {
					res = "ISOSCELES";
				}
				if (a != b && a != c) {
					res = "ESCALENO";
				}
			}

		} else {
			res = "INVALIDO";
		}
		return res;
	}

	// Exercise 7
	public static Boolean alternatesEvenOdd(List<Integer> numbers) {
		Boolean res = true;
		Integer i = 0;
		while (i < numbers.size() - 1) {
			if (Utiles.isItPar(numbers.get(i)) == Utiles.isItPar(numbers.get(i + 1))) {
				res = false;
				break;
			}
			i++;
		}
		return res;
	}

	// Ejercicio 2

	public static void trianguloAlterno(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j) {
					if (Utiles.isItPar(i + j)) {
						System.out.print("1");
					} else {
						System.out.print("0");
					}

				}
			}
			System.out.println();
		}
	}

	// Ejercicio 3
//	Los divisores propios de un número son todos menos él mismo. Por ejemplo, los divisores propios de 
//	12 son 1, 2, 3, 4 y 6 (cinco divisores). Recorre los enteros del intervalo [inicio, fin] en orden 
//	ascendente y busca el PRIMER número que tenga al menos minimoDivisores divisores propios. 
//	Puedes suponer que inicio <= fin  y que minimoDivisores es positivo. Si  ninguno cumple la condición, 
//	devuelve -1. 

	public static Integer primeroConDivisores(Integer inicio, Integer fin, Integer minimoDivisores) {
		Integer res = -1;
		for (int i = inicio; i <= fin; i++) {
			if (Utiles.contarDivisores(i) >= minimoDivisores) {
				res = i;
				break;
			}
		}
		return res;
	}

	// Ejercicio 4
//	La sucesión de Tribonacci es parecida a Fibonacci, pero cada término se obtiene sumando los TRES 
//	anteriores. Sus tres primeros valores son T(0) = 0, T(1) = 1 y T(2) = 1. A partir de ahí, T(n) = T(n-1) + 
//	T(n-2) + T(n-3), para n >= 3. 
//	Por tanto, los primeros términos son: 0, 1, 1, 2, 4, 7, 13, 24, 44... Por ejemplo, T(5) = T(4) + T(3) + 
//	T(2) = 4 + 2 + 1 = 7. 
//	Escribe un método que reciba la posición n (comenzando en 0) y devuelva el término 
//	correspondiente de la sucesión. Debe resolverse obligatoriamente mediante recursividad, como el 
//	Fibonacci visto en clase. Puedes suponer que n está entre 0 y 12. 
//	Comenta brevemente el código. 
	public static Integer tribonacci(Integer n) {
		Integer res = 0;
		if (n == 0) { // caso base 1
			res = 0;
		} else if (n == 1) { // caso base 2
			res = 1;
		} else if (n == 2) { // caso base 3
			res = 1;
		} else {
			res = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3); // caso recursivo
		}
		return res;
	}

	// Ejercicio 5
//	Una lista de enteros es casi creciente cuando, al recorrerla de izquierda a derecha, sus valores 
//	aumentan, pero se permite como máximo una ruptura. Se produce una ruptura si un elemento es 
//	menor o igual que el anterior. Por tanto, dos valores consecutivos iguales también cuentan como 
//	ruptura. 
//	Escribe un método que devuelva true si la lista tiene cero o una ruptura, y false si tiene dos o más. 
//	Puedes suponer que la lista no contiene elementos null. Una lista vacía o con un solo elemento se 
//	considera casi creciente. 
//	Incluye al menos dos pruebas propias distintas de los ejemplos: indica en comentarios el resultado 
//	obtenido. 
	public static Boolean esCasiCreciente(List<Integer> datos) {
		Boolean res = true;
		Integer i = 0;
		Integer cont = 0;
		while (i < datos.size() - 1) {
			if (datos.get(i) >= datos.get(i + 1)) {
				cont++;
				if (cont == 2) {
					res = false;
					break;
				}
			}
			i++;
		}
		return res;
	}

	// Ejercicio 6
//	Una lista contiene las ventas diarias de una tienda. Queremos encontrar el primer grupo de 
//	longitud días consecutivos cuya suma sea mayor o igual que objetivo. Cada grupo se llama 
//	ventana. Devuelve la posición (empezando en 0) del primer día de la primera ventana 
//	válida. 
//	Ejemplo: ventas = [2, 1, 5, 3, 2], longitud = 3 y objetivo = 9. 
//	Primera ventana, posiciones 0 a 2: [2, 1, 5] → suma 8 (no vale). 
//	Segunda ventana, posiciones 1 a 3: [1, 5, 3] → suma 9 (sí vale). 
//	Resultado: 1, porque la primera ventana válida empieza en la posición 1. 
//	Devuelve -1 si ninguna ventana alcanza el objetivo. Los valores de la lista son no negativos 
//	y no contienen null y longitud se supone que es >=1 pero menor o igual que el tamaño de la 
//	lista. 
//	Comprueba el método desde TestEjercicios mediante al menos dos pruebas propias, 
//	distintas de los ejemplos: una con coincidencia y otra sin coincidencia. Anota en 
//	comentarios la entrada y el resultado esperado y muestra el resultado obtenido. 

	public static Integer primeraVentanaObjetivo(List<Integer> ventas, Integer longitud, Integer objetivo) {
		Integer res = -1;
		Integer suma = 0;
		for (int i = 0; i < ventas.size() - longitud; i++) {
			suma=0;
			for (int j = 0; j < longitud; j++) {
				suma += ventas.get(i + j);
			}
			if (suma>=objetivo) {
				res=i;
				break;
			}
		}
		return res;
	}

}
