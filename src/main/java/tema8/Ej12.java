/*
Realiza un programa de ejemplo, haciendo uso de la clase Collections explicada en clase,  
donde pruebes como mínimo los métodos que aparecen a continuación (estudia el API antes de probarlo).
Ordenación (Sorting) -> sort
Barajado (Shuffling) -> shuffle
Manipulación de datos de rutina  -> reverse / swap / copy / addAll / fill
Búsqueda (Searching) -> binarySearch
Composición -> frequency / disjoint
Búsqueda de valores extremos -> max/min
 */
package tema8;

import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Vespertino
 */
public class Ej12 {

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(2);
        lista.add(4);
        lista.add(1);
        lista.add(3);
        lista.add(2);
        lista.add(5);
        LinkedList<Integer> lista2 = new LinkedList<Integer>();
        lista2.add(2);
        lista2.add(2);
        lista2.add(2);
        lista2.add(2);
        lista2.add(2);
        lista2.add(2);
        
        Collections.sort(lista);
        System.out.println("Sort: "+lista);

        Collections.shuffle(lista);
        System.out.println("Shuffle: "+lista);

        Collections.reverse(lista);
        System.out.println("Reverse: "+lista);

        Collections.swap(lista, 0, 3);
        System.out.println("Swap: "+lista);

        Collections.copy(lista2, lista);
        Collections.sort(lista2);
        System.out.println("Copy: "+lista2);
        
//        Collections.addAll(lista, 3);
//        System.out.println(lista);
        
//        Collections.fill(lista, 3);
//        System.out.println(lista);
        
        int busqueda= Collections.binarySearch(lista, 4);
        System.out.println("Busqueda: "+busqueda);
        
        int frecuencia = Collections.frequency(lista, 2);
        System.out.println("Frecuencia: "+frecuencia);
        
        System.out.println("Son iguales: "+Collections.disjoint(lista, lista2));
        
        System.out.println("Maximo: "+Collections.max(lista));
        System.out.println("Minimo: "+Collections.min(lista));
    }
}
