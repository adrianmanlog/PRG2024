/*
Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores primos del número que se le pasa como parámetro. 
Deberás utilizar el máximo número de funciones.
 */
package tema5;

import Libreria.LibreriaMates;
import static Libreria.LibreriaMates.esDivisor;
import static Libreria.LibreriaMates.esPrimo;

/**
 *
 * @author Vespertino
 */
public class Ej19 {

    public static String divisoresPrimos(int n) {
        String aux="";
        for (int i = 1; i <= n; i++) {
            if (esDivisor(n, i) && esPrimo(i)) {
                aux = aux + i + "\n";
            }
        }
        return aux;
    }

    public static void main(String[] args) {
        int n;

        n = LibreriaMates.leerNumeroPosi("Inserta un numero positivo");
        System.out.println(divisoresPrimos(n));
    }
}
