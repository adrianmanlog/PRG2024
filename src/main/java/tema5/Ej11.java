/*
 Escribir una función que retorne la suma de los divisores de un número. El alumno deberá hacer dos versiones de funciones una que permita 
la reutilización de funciones anteriores y otra que no permita realizar internamente ninguna llamada a ninguna otra función.
 */
package tema5;

import Libreria.LibreriaMates;

/**
 *
 * @author Vespertino
 */
public class Ej11 {
    public static int sumaDivisores(int n1) {
        int acum=0;
        for (int i = 1; i <= n1; i++) {
            if (LibreriaMates.esDivisor(n1, i)) {
                System.out.print(i + " ");
                acum+=i;
            }
        }
        return acum;
    }

    public static void main(String[] args) {
        int leerNumero;

        leerNumero = LibreriaMates.leerNumeroPosi("introduce el valor del primero numero");
        

        System.out.println("El resultado es: "+ sumaDivisores(leerNumero));
    }
}
