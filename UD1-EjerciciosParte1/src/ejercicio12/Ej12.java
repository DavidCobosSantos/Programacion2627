package ejercicio12;

import java.util.Scanner;

public class Ej12 {
	public static void main(String[] args) {
		
//		Un frutero necesita calcular los beneficios anuales que
//		obtiene de la venta de manzanas y peras.
//		Por este motivo, es necesario diseñar una aplicación que solicite las ventas
//		(en kilos, tanto de las peras como de las manzanas). 
//		La aplicación mostrará el importe total sabiendo que 
//		el precio del kilo de manzanas está fijado en 2,35€ y el kilo de peras en 1,95€.
		
	Scanner sc = new Scanner(System.in);
	System.out.println("¿Cuántos kilos de manzanas se han vendido?");
	Double manzanas = sc.nextDouble();
	System.out.println("¿Cuántos kilos de peras se han vendido?");
	Double peras = sc.nextDouble();
	Double rManzanas = manzanas * 2.35;
	Double rPeras = peras * 1.95;
	Double resultado = rManzanas + rPeras;
	System.out.println("Importe total: " + resultado + "€");
	sc.close();
		
	}
}
