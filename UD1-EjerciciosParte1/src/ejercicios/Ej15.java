package ejercicios;

import java.util.Scanner;

public class Ej15 {
//	Escribe un programa en el que declares una constante IVA de valor igual a 21. 
//	A continuación, pídele un precio al usuario 
//	(recuerda que los precios contienen decimales) y calcula 
//	cuál será el precio final con el IVA aplicado.

	public static void main(String[] args) {
		final Double iva = 0.21;
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un precio: ");
		Double precio = sc.nextDouble();
		Double preFinal = precio - precio * iva;
		Double redondeo = Math.round(preFinal*100)/100.0;
		System.out.println("Precio final: " + redondeo + "€");
		sc.close();
	}

}
