package test;

import java.util.ArrayList;
import java.util.List;
import ejercicios.Ejercicios;
import utiles.Utiles;

public class TestEjercicios {

    public static void main(String[] args) {
        //List<Integer> numeros = List.of(2, 4, 3, 6, 5, 28);
    	List<Integer> carameloLista = new ArrayList<Integer>();
    	carameloLista.add(2);carameloLista.add(4);carameloLista.add(3);
    	carameloLista.add(6);carameloLista.add(5);carameloLista.add(28);
        System.out.println("Lista: " + carameloLista);
        
       
        
        System.out.println("\n--- SUMAS ---");
        System.out.println("Suma 1 (for-each): " + Ejercicios.suma1(carameloLista));
        System.out.println("Suma 2 (for):      " + Ejercicios.suma2(carameloLista));
        System.out.println("Suma 3 (while):    " + Ejercicios.suma3(carameloLista));

        System.out.println("\n--- CONTADORES ---");
        System.out.println("Cantidad de pares:     " + Ejercicios.contarPares(carameloLista));
        System.out.println("Cantidad de primos:    " + Ejercicios.contarPrimos(carameloLista));
        System.out.println("Cantidad de perfectos: " + Ejercicios.contarPerfectos(carameloLista));

        System.out.println("\n--- MEDIAS ---");
        System.out.println("Media 1 (for-each): " + Ejercicios.media1(carameloLista));
        System.out.println("Media 2 (for):      " + Ejercicios.media2(carameloLista));
        System.out.println("Media 3 (while):    " + Ejercicios.media3(carameloLista));

        System.out.println("\n--- PRUEBAS DE UTILES ---");
        System.out.println("¿7 es primo?       " + Utiles.esPrimo(7));
        System.out.println("¿9 es primo?       " + Utiles.esPrimo(9));
        System.out.println("¿6 es perfecto?    " + Utiles.esPerfecto(6));
        System.out.println("¿28 es perfecto?   " + Utiles.esPerfecto(28));
        System.out.println("¿12 es perfecto?   " + Utiles.esPerfecto(12));
        
        //TODO Seguir haciendo las pruebas de los ejercicios
        
        //1. Control de acceso al Baile de los Monstruos
        System.out.println("\n--- Control de acceso al Baile de los Monstruos ---");
        System.out.println(Ejercicios.puedeEntrar(16, true, "zombie")); // true
        System.out.println(Ejercicios.puedeEntrar(15, false, "vampiro")); // true
        System.out.println(Ejercicios.puedeEntrar(15, false, "bruja")); //false
        
        //2.  Clasificador de caramelos
        //List<String> lista = List.of("dulce", "ácido", "dulce","misterioso", null);
        System.out.println("\n--- Clasificador de caramelos ---");
        List<String> caramel = new ArrayList<String>();
    	caramel.add("dulce");caramel.add("ácido");caramel.add("dulce");
    	caramel.add("misterioso");caramel.add("null");
    	System.out.println(Ejercicios.clasificador(caramel, "dulce"));
    	
    	//Ejercicio 3 — Contador de pasos en el Laberinto
    	List<Integer> recorrido = List.of(2, 5, -1, 5, 5);
        System.out.println("\n--- Contador de pasos en el Laberinto ---");
        System.out.println(Ejercicios.pasosLaberinto(recorrido)); // 9

        //Ejercicio 4 — Nivel medio de magia en las calabazas
        System.out.println("\n--- Nivel medio de magia en las calabazas ---");
        List<Integer> magia = List.of(3, 9, 7, 4, 10);
        System.out.println(Ejercicios.promedioMagia(magia)); // (9+7+10)/3 = 8.67
        
        //Ejercicio 5 — Recursividad: Cuenta Atrás de Sustos
        System.out.println("\n--- Cuenta Atrás de Sustos ---");
        Ejercicios.cuentaAtrasSustos(5);
        
        //Ejercicio 6 — La suma entre los dos ceros
        System.out.println("\n--- La suma entre los dos ceros ---");
        List<Integer> numeros = List.of(3, 9, 0, 4, 10, 0, -3, 5);
        System.out.println(Ejercicios.sumaEntreCeros(numeros)); // 4+10 = 14
    }
}