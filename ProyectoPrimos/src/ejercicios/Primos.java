package ejercicios;

public class Primos {
	public static boolean esPrimo(int n) {
		boolean es = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				es = false;
				break;
			}
		}
		return es;
	}
	public static void imprimePrimosHasta(int tope) {
		for (int i = 2; i <= tope; i++) {
			if (esPrimo(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
