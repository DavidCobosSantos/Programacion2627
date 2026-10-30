package ejercicios;

import java.util.List;

import utiles.Utiles;

public class Ejercicios {
//	1. Un cine cobra 8 € de lunes a jueves, 10 € los viernes y 12 € los sábados y domingos. Los menores
//	de 12 años y las personas de 65 años o más obtienen 3 € de descuento. Los socios obtienen otros 2
//	€ de descuento. Los descuentos son acumulables.
//	Crea un método que reciba la edad, el día de la semana y si la persona es socia, y devuelva el precio
//	final de la entrada. El día llega en mayúsculas y sin tildes (por ejemplo, MIERCOLES o SABADO). Si
//	la edad es negativa o el día no existe, devuelve -1. Puedes considerar que los argumentos no son
//	null.
//	Usa obligatoriamente switch para establecer el precio base e if para aplicar los descuentos.
	public static Integer precioEntrada(Integer edad, String dia, Boolean socio) {
		Integer precio = 0;
		if (edad > 0) {
			switch (dia) {
			case "LUNES":
				precio = 8;
				break;
			case "MARTES":
				precio = 8;
				break;
			case "MIERCOLES":
				precio = 8;
				break;
			case "JUEVES":
				precio = 8;
				break;
			case "VIERNES":
				precio = 10;
				break;
			case "SABADO":
				precio = 12;
				break;
			case "DOMINGO":
				precio = -1;
				break;

			}
			if (edad < 12 || edad > 65) {
				precio -= 3;
			}
			if (socio == true) {
				precio -= 2;
			}
		} else {
			precio = -1;
		}
		return precio;
	}

//	2. Escribe un método que reciba un número entero llamado lado y dibuje una letra Z utilizando
//	asteriscos. La primera y la última fila estarán totalmente rellenas de asteriscos. En las filas
//	intermedias debe aparecer un único asterisco, formando la diagonal de derecha a izquierda. Las
//	demás posiciones serán espacios. No hay que pedir datos por teclado.
	public static void dibujarZ(Integer lado) {
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				if (i == 0 || (i + j) == lado - 1 || i == lado - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
//	3. Un número es especial si es primo o perfecto. Recibe un intervalo [inicio, fin] y una cantidad. Recorre
//	el intervalo de menor a mayor y devuelve la suma de los primeros 'cantidad' números especiales
//	encontrados. Si un número cumple ambas condiciones, solo se suma una vez.
//	Puedes utilizar Utiles.esPrimo(Integer) y Utiles.esPerfecto(Integer), que ya están implementados.
//	Utiliza un bucle for con una condición if y termina el recorrido con break cuando hayas encontrado la
//	cantidad solicitada. No utilices continue.
//	Si inicio es mayor que fin, si cantidad es 0 o negativa, o si no hay números especiales, devuelve 0. Si
//	hay menos números especiales de los solicitados, suma todos los encontrados.

	public static Integer sumaPrimerosEspeciales(Integer inicio, Integer fin, Integer cantidad) {
		Integer suma = 0;
		Integer contador = 0;
		if (fin < inicio || cantidad <= 0) {
			suma = 0;
		} else {
			for (int i = inicio; i < fin; i++) {
				if (Utiles.esPerfecto(i) || Utiles.esPrimo(i) && i != 1) {
					suma += i;
					contador++;
				}
				if (contador == cantidad) {
					break;
				}
			}
		}
		return suma;
	}

//	4. El factorial tradicional multiplica un número por todos los enteros positivos anteriores. Vamos a
//	modificarlo: comenzamos multiplicando por numero y, en cada paso, restamos el valor salto hasta
//	llegar a 0 o a un número negativo. Entonces dejamos de multiplicar.
//	Por ejemplo: factorialConSaltos(7, 2) = 7 × 5 × 3 × 1 = 105; factorialConSaltos(8, 3) = 8 × 5 × 2 = 80;
//	factorialConSaltos(5, 1) = 5 × 4 × 3 × 2 × 1 = 120.
//	Implementa el cálculo de forma obligatoriamente recursiva, sin utilizar bucles. El caso base debe
//	devolver 1 cuando numero sea menor o igual que 0. Puedes suponer que numero es no negativo y
//	salto es mayor o igual que 1; se usarán valores pequeños para evitar desbordamientos.
//	Comenta brevemente el caso base y la llamada recursiva.

	public static Integer factorialConSaltos(Integer n, Integer salto) {
		Integer res;

		if (n <= 0) {// caso base
			res = 1;
		} else {
			res = n * factorialConSaltos(n - salto, salto);// llamada recursiva
		}
		return res;
	}

//	5. Una lista de enteros almacena las alturas de distintos puntos de una ruta. Una posición intermedia se
//	considera un pico cuando su altura supera a la de ambos vecinos (anterior y siguiente) en, al menos,
//	una diferencia mínima.
//	Crea un método que devuelva el número de picos. El primer y el último elemento nunca pueden ser
//	picos. Si la lista tiene menos de tres elementos, devuelve 0. Puedes suponer que no hay elementos
//	null y que diferenciaMinima es positiva.
//	Usa un for clásico y los métodos size() y get() de List<Integer>. No se pide modificar la lista. Para
//	evaluar las pruebas, añade en TestEjercicios al menos dos pruebas propias distintas de los ejemplos;
//	indica en comentarios el resultado esperado y muestra el resultado obtenido

	public static Integer contarPicos(List<Integer> alturas, Integer diferenciaMinima) {
		Integer contador = 0;
		if (alturas.size() >= 3) {
			for (int i = 1; i < alturas.size() - 1; i++) {
				if (alturas.get(i) - diferenciaMinima >= alturas.get(i + 1) && alturas.get(i) - diferenciaMinima >= alturas.get(i - 1)) {
					contador++;
				}
			}
		}
		return contador;

	}
}
