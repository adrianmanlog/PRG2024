/*
Realizar una función recursiva en Java que pida un número entero positivo (n) 
y muestre por pantalla los números de 1,2, … n-1, n.
 */
package tema5;

import Libreria.LibreriaMates;

/**
 *
 * @author Vespertino
 */
public class Ej24 {

    public static void de0aN(int n, int cont) {
        if (cont == n) {
            System.out.print(cont);
        } else {
            System.out.print(cont + " ");
            de0aN(n, cont+1);
        }

    }

    public static void main(String[] args) {
        int n, cont = 1;

        n = LibreriaMates.leerNumeroPosi("Introduce el numero debe ser positivo");
        de0aN(n, cont);
    }
}
