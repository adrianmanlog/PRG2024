/*
Realizar una función en Java que lea por teclado un número entero N no negativo y mostrar el factorial de todos los números desde 0 hasta N.
 */
package tema5;

import Libreria.LibreriaMates;

/**
 *
 * @author Vespertino
 */
public class Ej20 {
    public static String mostrarFacto(int n) {
        int aux;
        String facto="";
        for (int i = 0; i <= n; i++) {
            aux=LibreriaMates.factorial(i);
            facto= facto + i + "=" + aux + "\n";
        }
        return facto;
    }

    public static void main(String[] args) {
        int n;
        
        n=LibreriaMates.leerNumeroPosi("Introduce un numero positivo");
        System.out.println(mostrarFacto(n));
    }
}
