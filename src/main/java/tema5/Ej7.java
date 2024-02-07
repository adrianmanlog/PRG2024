/*
Diseñar una función que nos diga si un número es primo (un número primo es un número natural mayor que 1 que tiene únicamente dos divisores él mismo y el 1)
 */
package tema5;

import java.util.Scanner;
import Libreria.LibreriaMates;
/**
 *
 * @author Vespertino
 */
public class Ej7 {
    public static void main(String[] args) {
        int auxNumero;

        auxNumero = LibreriaMates.leerNumero("Introduce el numero para que se compruebe si va a ser primo");        

        if (LibreriaMates.esPrimo(auxNumero)) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }
}
