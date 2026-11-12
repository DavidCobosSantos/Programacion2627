package ejemploWhile;

import java.util.Scanner;

public class EjemploWhilex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final Integer NUM_INTENTOS = 3;
		final Integer PIN = 1111;
		Boolean acertaste = false;
		
		
		for (int i = 0; i < NUM_INTENTOS; i++) {
			System.out.println("Deme pin: ");
			Integer n = sc.nextInt();
			if (n.equals(PIN)) {
				acertaste=true;
				break;
			}
		}
		if (acertaste) {
			System.out.println("Puedes ver el móvil");

		} else {
			System.out.println("TE QUEDASTE SIN MOVIL");

		}
		sc.close();
	}
}



