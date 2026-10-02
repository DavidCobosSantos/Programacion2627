package ejercicio14;

public class Ejercicio14 {
	
	public static void main(String[] args) {
		
//		Un videojuego comienza con 100 puntos y 3 vidas. 
//		Modifica estas variables utilizando los operadores +=, -=, ++ y -- 
//		para representar esta secuencia: gana 50 puntos, pierde 20 puntos, 
//		obtiene una vida extra y después pierde una vida. Muestra el estado final.
		
		Integer puntos = 100;
		Integer vidas = 3;
		
		System.out.println("Puntos: " + puntos + "\nVidas: " + vidas);
		
		puntos+=50;
		puntos-=20;
		vidas++;
		vidas--;
		
		System.out.println("Puntos: " + puntos + "\nVidas: " + vidas);
		

	}

}
