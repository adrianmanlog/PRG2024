/*
Realiza el mismo ejercicio pero en este caso se podra repetir cada numero aunque el usuario introduzca multiples veces el mismo. 
Mostrar la lista por pantalla;
 */
package tema8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Vespertino
 */
public class Ej3 {
    
    public static void rellenarColeccion(Collection<Integer> col,int numElementos,String msg) {
        Scanner teclado= new Scanner (System.in);
        int aux;
        for (int i = 0; i < numElementos; i++) {
            System.out.println(msg);
            aux= teclado.nextInt();
            col.add(aux);
        }

    }

    public static String muestraColeccion(Collection<Integer> col) {
        StringBuilder sb = new StringBuilder();
        Iterator it = col.iterator();
        while (it.hasNext()) {
            sb.append(it.next() + "\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedList<Integer> c = new LinkedList<Integer>();
        rellenarColeccion(c,20,"Introduce el numero que quieras");
        System.out.println(muestraColeccion(c));
    }
}
