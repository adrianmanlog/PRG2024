/*
Implementa un método llamado limpiaRepetidos a la que se le pase una lista de nombres y devuelva una copia sin elementos repetidos.
Realizaremos dos versiones, una que retorne una colección nueva sin repetidos y otra que modifique la recibida como parámetro.
 */
package tema8;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Vespertino
 */
public class Ej5 {

    public static void rellenarColeccion(Collection<String> col) {
        col.add("Adrian");
        col.add("Raul");
        col.add("Andoni");
        col.add("Gabriel");
        col.add("Adrian");
        col.add("Ivan");
        col.add("Unai");
        col.add("Emilio");
    }

    public static List<String> sinRepetidos(List<String> sinRepetidos, List<String> col) {
        for (int i = 0; i < col.size(); i++) {
            if (!sinRepetidos.contains(col.get(i))) {
                sinRepetidos.add(col.get(i));
            }
        }
        return sinRepetidos;
    }

    public static void sinRepetidos2(List<String> col) {
        String aux;
        int cont = 0;
        for (int i = 0; i < col.size(); i++) {
            aux = col.get(i);
            cont = 0;
            if (i == col.size()) {
                break;
            }
            for (int j = 0; j < col.size(); j++) {
                if (aux == col.get(j)) {
                    cont++;
                    if (cont >= 2) {
                        col.remove(j);
                    }
                }

            }

        }
    }

    public static String muestraColeccion(Collection<String> col) {
        StringBuilder sb = new StringBuilder();
        Iterator it = col.iterator();
        while (it.hasNext()) {
            sb.append(it.next() + "\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedList<String> c = new LinkedList<String>();
        LinkedList<String> sinRepetidos = new LinkedList<String>();

        rellenarColeccion(c);
        sinRepetidos(sinRepetidos, c);
        sinRepetidos2(c);

        System.out.println(muestraColeccion(sinRepetidos));
        System.out.println(muestraColeccion(c));
    }
}
