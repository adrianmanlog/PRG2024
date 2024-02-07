/*
Realizar una función que almacene en un array los 20 primeros números de la siguiente secuencia. 
Posteriormente los muestra por pantalla
3 6 7 5 10 11 7 14 15 9 18 19 …

 */
package tema7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej6 {

    public static int[] cadenaArray(int[] cadena) {
        int a = 3, b = 6, cont = 3,cont2=0,cont3;
        cadena[0] = 3;
        cadena[1] = 6;
        for (int i = 2; i < cadena.length; i++) {
            a = a + 2;
            b++;
            cadena[i] = b;
            i++;
            cadena[i] = a;
            i++;
            b += 3;
            cadena[i] = b; 
        }
        return cadena;
    }

    public static void main(String[] args) {
        int[] cadena = new int[30];
        int[] aux = cadenaArray(cadena);
        System.out.println(Arrays.toString(aux));
    }
}
