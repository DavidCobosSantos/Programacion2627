package test;

import java.util.ArrayList;
import java.util.List;

public class EjemploListas {
	public static void main(String[] args) {
		List<Integer> miQueridaLista = new ArrayList<>();
		miQueridaLista.add(7);miQueridaLista.add(4);miQueridaLista.add(3);miQueridaLista.add(12);
		System.out.println(miQueridaLista);
		System.out.println(miQueridaLista.size());
		System.out.println(hacerSuma(miQueridaLista));
		List<Integer> recorrido = List.of(2, 1, 0, 5, 5, -1, 1, 1);
		System.out.println(pasosLaberinto(recorrido));
	}
	public static Integer hacerSuma(List<Integer> lis) {
		Integer suma = 0;
		for (int i = 0; i < lis.size(); i++) {
			suma += lis.get(i);
}
		
		return suma;
	}
	public static Integer pasosLaberinto (List<Integer> pasos) {
		Integer suma = 0;
		int i = 0;
		while (0 <= pasos.get(i)) {
			suma+=pasos.get(i);
			i++;
		}
		return suma;
	}
}
