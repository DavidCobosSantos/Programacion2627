package utiles;

public class Utiles {
	public static boolean esPrimo(Integer numero) {
    	Boolean res = true;

        for (int divisor = 2; divisor < numero ; divisor++) {
            if (numero % divisor == 0) {
                res = false;
            }
        }

        return res;
    }

}
