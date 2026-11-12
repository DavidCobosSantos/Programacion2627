package test;

import java.util.ArrayList;
import java.util.List;

import tipos.Persona;
import tipos.Sexo;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona("Christian", 21, 70.2, Sexo.HOMBRE);
		System.out.println(p1.getNombre());
		
		Persona p2 = new Persona("Ana", 20, 60.3, Sexo.MUJER);
		System.out.println(p2.getNombre());
		//para cambiar un dato
		p1.setNombre("Cristiano");
		System.out.println(p1.getNombre());
		
		//direccion de memoria
		System.out.println(p1);
		//es igual a
		System.out.println(p2.toString());
		
		List<Persona> lis = new ArrayList<>();
		lis.add(p1); lis.add(p2); lis.add(new Persona("Antonio", 25, 73.2, Sexo.HOMBRE)); 
		lis.add(new Persona("Lucía", 15, 53.2, Sexo.MUJER)); 
		System.out.println(lis);
		System.out.println(filtraPorSexo(lis, Sexo.MUJER));
		
		
		
		p1.setEdad(34);
		System.out.println(p1);
	}
	public static List<Persona> filtraPorSexo(List<Persona> lis, Sexo s){
		List<Persona> res = new ArrayList<>();
		for (Persona p : lis) {
			if (p.getSexo()==s) {
				res.add(p);
			}
		}
		return res;
	}
}
