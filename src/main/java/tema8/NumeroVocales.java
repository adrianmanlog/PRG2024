/*
Create un nuevo comparador de Strings que ordene por numero de vocales de mayor a menor, en caso de empate alfabeticamente.
 */
package tema8;

import java.util.Comparator;

/**
 *
 * @author Vespertino
 */
public class NumeroVocales implements Comparator<String> {

 @Override
    public int compare(String o1, String o2) {
        char aux;
        int cont = 0, cont2 = 0;
        // Numero de vocales de o1
        for (int i = 0; i < o1.length(); i++) {
            aux = o1.charAt(i);
            if (tema6.Ej7.esVocal(aux)) {
                cont++;
            }
        }
        // Numero de vocales de o2
        for (int i = 0; i < o2.length(); i++) {
            aux = o2.charAt(i);
            if (tema6.Ej7.esVocal(aux)) {
                cont2++;
            }
        }
        if (cont-cont2==0) // Mismo numero de vocales 
            return o1.compareTo(o2); // ordenado alfabeticamente
        return cont2-cont; // Diferencia
        
    }

   
}
