/*
 * Escribir una función que retorne dado un número introducido por el usuario (n), todos los
números que son divisor de este número. ¿Podemos reutilizar algo realizado en temas
anteriores?
Ejemplo si n=24 -&gt; 1 2 3 4 6 8 12 24
*/
package tema5;

import Libreria.LibreriaMates;

public class Ej8 {
    public static void main(String[] args) {
        int leerNumero2;
        leerNumero2 = LibreriaMates.leerNumeroPosi("Introduce el valor de n tiene que ser un numero positivo");

        for (int i = 1; i <= leerNumero2; i++) {
            if (LibreriaMates.esDivisor(leerNumero2, i)) {
                System.out.print(i + " ");
            }
        }
    }
}
