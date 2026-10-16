package ejercicio18;

public class Ejercicio18 {
//	18. Reto: reloj de arena
//	Une una pirámide invertida con otra creciente, evitando duplicar la fila más estrecha.
//	Ejemplo de entrada: N = 4
//	Salida esperada:
//	*******
//	 *****
//	  ***
//	   *
//	  ***
//	 *****
//	*******
	public static void main(String[] args) {
		Integer n=4;
		for (int i = 0; i < 2*n-1; i++) {
			for (int j = 0; j < 2*n-1; j++) {
				if (i<=j && i<=(2*n-1)/2) {
					System.out.print("*");
				} else if (i+j<=n-1){
					System.out.print("*");
				} else {
					System.out.println(" ");
				}
			}
			System.out.println();
		}
	}



}
