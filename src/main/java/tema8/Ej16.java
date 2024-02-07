/*
Realizar ahora un comparador de números enteros (Integer) que primero muestre 
los números que sean múltiplos de 3 y luego el resto de números de menor a mayor. 
En este caso haz uso de una clase anónima para implementar el comparador.
 */
package tema8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Vespertino
 */
public class Ej16 {

    public static void main(String[] args) {
        List<Integer> coleccion = new ArrayList<Integer>();
        coleccion.add(6);
        coleccion.add(9);
        coleccion.add(5);
        coleccion.add(17);
        coleccion.add(12);

        Collections.sort(coleccion, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                for (int i = 0; i < coleccion.size(); i++) {
                    
                    if (o1 % 3 == 0 && o2 % 3 != 0) {
                        return -9;
                    } else if (o1 % 3 != 0 && o2 % 3 == 0){
                        return 9;
                    }else{
                        return o1.compareTo(o2);
                    }
                }
                return -1;
            }

        });
        System.out.println(coleccion);
    }
}
