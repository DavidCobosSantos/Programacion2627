package test;

import tipos.Jugador;
import tipos.Posicion;

public class TestEquipo {
	public static void main(String[] args) {
		Jugador j1 = new Jugador("23232323X", "Pepe", Posicion.DELANTERO);
		Jugador j2 = new Jugador("23565656R", "Juan", Posicion.DEFENSA);
		Jugador j3 = new Jugador("23232323X", "Pepe", Posicion.DELANTERO);
		//crear equals en el objeto, ya que pilla el metodo equals del tostring, que no comprueba lo de dentro del jugador
		if (j1.equals(j3)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintos");
		}
	}
//metodo remove y compare
}
