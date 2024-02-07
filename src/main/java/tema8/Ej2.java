/*
Crea una coleccion de 20 numeros enteros alatorios menores de 100 y guardalos en el orden en que se vayan generando. 
no se debe perimtir almacenar duplicados, mostrar por pantall dicha lista una vez creada sin importar el orden de como los muestra. 
ordenarla ahora en sentido creciente y volverla a mostrar por pantalla
 */
package tema8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Vespertino
 */
public class Ej2 {

    public static void rellenarColeccion(Collection<Integer> col, int min, int max, int numElementos) {
        for (int i = 0; i < numElementos; i++) {
            col.add((int) (Math.random() * (max + 1 - min) + min));
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

    public static TreeSet<Integer> ordenaColeccion(Collection<Integer> col) {
        TreeSet<Integer> colOrdenada = new TreeSet<Integer>();
        colOrdenada.addAll(col);
        return colOrdenada;
    }

    public static void main(String[] args) {
        HashSet<Integer> c = new HashSet<Integer>();
        TreeSet<Integer> ts;
        rellenarColeccion(c, 0, 99, 20);
        System.out.println(muestraColeccion(c));
        ts = ordenaColeccion(c);
        System.out.println(muestraColeccion(ts));
    }
}
