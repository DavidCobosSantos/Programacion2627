package ejercicio03;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

//		Una tienda aplica un descuento fijo del 15% y, 
//		posteriormente, un IVA del 21%. Declara ambos porcentajes como constantes.
//		Pide el precio inicial al usuario, calcula el precio final y
//		muéstralo redondeado a dos cifras decimales utilizando Math.round().

		final Double DESCUENTO = 0.15;
		final Double IVA = 0.21;

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuál es el precio inicial?");
		Double precioInicial = sc.nextDouble();
		Double precioConDescuento = precioInicial - (precioInicial * DESCUENTO);
		Double precioFinal = precioConDescuento + (precioConDescuento * IVA);
		Double precioRedondeado = Math.round(precioFinal * 100) / 100.0;
		System.out.println("Precio final: " + precioRedondeado);
		sc.close();

	}

}
