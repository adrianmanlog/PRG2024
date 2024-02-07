/*
Realizar un función que muestre por pantalla la secuencia de los primeros N números siguiendo esta secuencia. 
El número será introducido por el usuario.
1, 5, 3, 15, 5, 75, 7, …..

 */
package tema5;

import Libreria.LibreriaMates;

/**
 *
 * @author Vespertino
 */
public class Ej29 {

    public static void secuencia(int n) {
        int cont1 = 1, cont2 = 5;
        for (int i = 0; i < n; i++) {
            System.out.print(cont1 + " " + cont2 + " ");
            cont1 += 2;
            cont2 = cont1 * cont2;
        }
    }

    public static void main(String[] args) {
        int n;

        n = LibreriaMates.leerNumeroPosi("Introduce un numero positivo");
        secuencia(n);
    }
}
