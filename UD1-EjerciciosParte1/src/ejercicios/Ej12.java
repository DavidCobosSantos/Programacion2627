package ejercicios;

import java.util.Scanner;

public class Ej12 {
	public static void main(String[] args) {
		
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
