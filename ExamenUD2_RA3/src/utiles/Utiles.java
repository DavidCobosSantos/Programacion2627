package utiles;


public class Utiles {

	public static boolean isItPar(Integer n) {
		Boolean res = true;
		if (n % 2 != 0) {
			res = false;
		}
		return res;
	}

	public static Integer contarDivisores(Integer n) {
		Integer cont = 0;
		for (int i = 1; i < n - 1; i++) {
			if (n % i == 0) {
				cont++;
			}
		}
		return cont;
	}

	
}
