package ejemplo03If;

public class Ejemplo03If {
	public static void main(String[] args) {
		Integer a = 2000;
		Integer mes = 7;
		Integer dias = 0;
		Boolean bisiesto = (a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0));
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			dias = 31;
		} else if (mes != 2) {
			dias = 30;
		} else if (bisiesto) {
			dias = 29;
		} else {
			dias = 28;
		}

		System.out.println("El mes" + mes + "del año" + a + "tiene" + dias + "días.");
	}

}
