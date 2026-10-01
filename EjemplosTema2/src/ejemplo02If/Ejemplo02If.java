package ejemplo02If;

public class Ejemplo02If {
	public static void main(String[] args) {
		Integer a = 12;
		Integer c = 11;
		Integer b = 10;
		Integer mayor = 0;
		if (a > b) {
			if (a > c) {
				mayor = a;
			} else {
				mayor = c;
			}
		} else {
			if (c > b) {
				mayor = c;
			} else {
				mayor = b;
			}

		}
		System.out.println("El mayor es: " + mayor);

	}

}
