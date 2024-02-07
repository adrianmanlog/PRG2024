/*
Realizar un programa en Java que solicite al usuario el DNI (String) y el nombre completo de los alumnos de MULWEB1. 
El programa dejará de solicitar información cuando el usuario introduzca un “FIN” en el DNI. Rellena un mapa (a elegir por el usuario) con estas parejas. 
Posteriormente mostrará un listado como el que aparece a continuación ordenado por el DNI.

Listado de Alumnos de MULWEB1
DNI		Nombre
20343243R	Juan Pérez
34243334A	Ana Sarabia
53243224T	Unai García
 */
package tema8;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Vespertino
 */
public class Ej20 {

    public static void main(String[] args) {
        TreeMap<String, String> alumnos = new TreeMap<String, String>();
        
        rellenaMapa(alumnos,"fin");
        muestraMapa(alumnos);
    }

    public static void rellenaMapa(Map alumnos,String fin) {
        Scanner teclado = new Scanner(System.in);
        String dni = "", nombre = "";
        do {
            System.out.println("Introduce el Dni");
            dni = teclado.nextLine();
            if (dni.equalsIgnoreCase(fin)) {
                break;
            }
            System.out.println("Introduce tu nombre");
            nombre = teclado.nextLine();
            alumnos.put(dni, nombre);
        } while (true);
    }

    public static void muestraMapa(Map mapa2) {
        String aux = "";
        Set mapa = mapa2.keySet();
        Iterator it = mapa.iterator();
        while (it.hasNext()) {
            aux = (String) it.next();
            System.out.println(aux + ": " + mapa2.get(aux));
        }
    }

}
