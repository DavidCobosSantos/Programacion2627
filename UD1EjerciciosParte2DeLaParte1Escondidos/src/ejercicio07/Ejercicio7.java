package ejercicio07;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

//		Una empresa que gestiona un parque acuático te solicita una aplicación
//		que les ayude a calcular el importe que hay que cobrar en la taquilla 
//		por la compra de una serie de entradas (cuyo número será introducido por el usuario).
//		Existen dos tipos de entradas: infantiles, que cuestan 15,50€; y de adultos, 
//		que cuestan 20€. En el caso de que el importe total sea igual o superior a 100€,
//		se aplicará automáticamente un bono descuento del 5%.

		Scanner sc = new Scanner(System.in);
		System.out.print("Cantidad de entrada infantil: ");
		Integer entInf = sc.nextInt();
		System.out.print("Cantidad de entrada adulto: ");
		Integer entadu = sc.nextInt();

		Double pInf = 15.5;
		Double pAdu = 20.0;

		Double precio = (entadu * pAdu) + (entInf * pInf);

		Double descuento = (precio >= 100.0) ? (precio * 0.05) : 0.0;
		Double precioFinal = precio - descuento;
		System.out.printf("Precio de la entrada: %.2f€", precioFinal);
		sc.close();

	}

}
