/*
Create un nuevo comparador de Strings que ordene por numero de vocales de mayor a menor, en caso de empate alfabeticamente.
 */
package tema8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Vespertino
 */
public class Ej14 {
    public static void main(String[] args) {
        List<String> coleccion = Arrays.asList("Ivan","Unai","Eugenio","Nahuel");
        
        NumeroVocales nv= new NumeroVocales();
        Collections.sort(coleccion, nv);        
        System.out.println(coleccion);
        System.out.println(coleccion.get(1).compareTo(coleccion.get(2)));
    }
}
