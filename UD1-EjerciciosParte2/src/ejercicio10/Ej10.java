package ejercicio10;

import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un año: ");
		Integer anio = sc.nextInt();
		Boolean bisiesto = anio % 400 == 0 || anio % 4 == 0 && anio % 100 != 0;
		String resultado = bisiesto ? "El año es bisiesto" : "El año no es bisiesto";
		System.out.print(resultado);		
		sc.close();		
				
				
				
				
				
	}
	

}
