package ejercicio07;

public class Ejercicio7 {

	public static void main(String[] args) {

//		Utiliza la clase Random para generar y mostrar tres valores: 
//		un número entero aleatorio entre 1 y 100, un número real aleatorio
//		y un valor booleano aleatorio (true o false).

		Integer centenario = (int) (Math.random() * 100) + 1;
		Double real = (Math.random() * 2 - 1) * Double.MAX_VALUE;
		Boolean par = Math.random() < 0.5;

		System.out.println("Random 1-100: " + centenario);
		System.out.println("Random: " + real);
		System.out.println("Boolean: " + par);

	}

}
