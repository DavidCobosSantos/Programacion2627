package utiles;

import java.util.Scanner;

public class Utiles {
	public static Integer leerEntero(String mensaje, Scanner sc) {
		System.out.println(mensaje);
		Integer num= sc.nextInt();
		return num;
	}

}
