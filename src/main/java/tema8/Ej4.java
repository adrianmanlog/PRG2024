/*
Crea una colección de 20 números enteros aleatorios menores de 25 sin que existan
repetidos. Deberá obligatoriamente tener 20 números. Recorre dicha colección mostrando
aquellos números que sean menores de 10.
 */
package tema8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Vespertino
 */
public class Ej4 {

    public static void rellenarColeccion(Collection<Integer> col, int min, int max, int cantidad) {
        while (cantidad != col.size()) {
            col.add((int) (Math.random() * (max + 1 - min) + min));
        }

    }

    public static String muestraColeccionMenores(Collection<Integer> col,int menores) {
        StringBuilder sb = new StringBuilder();
        Iterator it = col.iterator();
        int aux;

        while (it.hasNext()) {
            aux = (int) it.next();
            if (aux < menores) {
                sb.append(aux + "\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        HashSet<Integer> c = new HashSet<Integer>();

        rellenarColeccion(c, 0, 25, 20);
        System.out.println(muestraColeccionMenores(c,10));
    }
}
