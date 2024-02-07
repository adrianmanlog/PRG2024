/*
Diseñar una función recursiva que dado un número N entero positivo, muestra el número binario correspondiente a dicho número 
(en decimal) recibido (mediante divisiones por 2).
 */
package tema5;

import Libreria.LibreriaMates;

/**
 *
 * @author Vespertino
 */
public class Ej27 {

    public static void binario(int n) {
        int calculo;
        if (n == 1) {
            System.out.print("1" + " ");
        } else {
            binario(n / 2);
            calculo = n % 2;
            System.out.print(calculo + " ");
        }
    }

    public static void main(String[] args) {
        int n;

        n = LibreriaMates.leerNumeroPosi("Introduce un numero positivo");
        binario(n);
    }
}
