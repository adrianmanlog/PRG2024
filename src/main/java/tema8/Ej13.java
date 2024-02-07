/*
(Colecciones-Programame Ej142) Los siete niños decidieron jugar al escondite, y se enfrentaron a la tarea de elegir quién era el que empezaba buscando. 
Procedieron como siempre. Se colocaron en círculo y uno de ellos empezó a contar señalando con el dedo a cada uno y avanzando hacia la derecha, 
de forma que uno de cada tres niños se iban salvando de la pesada tarea de empezar buscando y salía del círculo. El último niño que quedó en el círculo fue el seleccionado para buscar.

De forma más general, el proceso de selección es el siguiente: se numeran a los N niños desde el 1 hasta el N, 
y se les coloca en círculo. Empezando por el niño número 1, se va eliminando a uno de cada 3, es decir, se elimina al número 3, al 6, al 9, etc. 
Cuando se llega al final del círculo se continúa contando desde el principio. Siguiendo con el ejemplo, si hay 10 niños, tras eliminar al 9, se salta al 10,
se salta al 1, y se elimina al número 2.

Entrada
La entrada consistirá en distintos casos de prueba, cada uno en una línea. Cada caso de prueba tendrá dos números. 
El primero, un número positivo que no superará el 10.000, indicará el número de niños que van a jugar. 
El segundo (no negativo menor o igual a 1.000), indicará cuántos niños nos saltamos antes de sacar del círculo a uno de ellos. 
La entrada terminará cuando ambos números sean cero.

Salida
Para cada caso de prueba se escribirá en una línea el número de niño que empezará buscando en el juego.

Entrada de ejemplo
4 1
7 2
10 2
0 0

Salida de ejemplo
1
4
4

 */
package tema8;

import Libreria.LibreriaMates;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Vespertino
 */
public class Ej13 {

    public static void main(String[] args) {
        LinkedList<Integer> niños = new LinkedList<Integer>();
        int n, eliminar;
        n = LibreriaMates.leerNumeroPosi("Introduce el numero de niños");
        eliminar = LibreriaMates.leerNumeroPosi("Introduce cada cuanto eliminamos");

        rellenarNiños(niños, n);
        matarNiños(niños, eliminar, n);
        
        for (Integer niño2 : niños) {
            System.out.println(niño2);
        }
    }

    public static void rellenarNiños(LinkedList<Integer> niños, int n) {
        for (int i = 0; i < n; i++) {
            niños.add(i + 1);
        }
    }

    public static void matarNiños(LinkedList<Integer> niños, int eliminar, int n) {
        for (int i = 0; i < n; i++) {
            if (niños.size() != 1) {
                do {
                    Collections.rotate(niños, -(eliminar));
                    niños.remove(0);
                } while (niños.size() != 1);
            }

        }
    }
}
