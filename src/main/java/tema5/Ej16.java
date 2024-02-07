/*
 Realizar una función recursiva en Java que pida un número ‘n’ y muestre la tabla de multiplicar del número ‘n’.
 */
package tema5;

import Libreria.LibreriaMates;

/**
 *
 * @author Vespertino
 */
public class Ej16 {

    public static void tablaMultiplicar(int n, int tabla) {
        int multi;
        if (tabla == 10) {
            System.out.println(n + "*" + tabla + "=" + n * 10);
        } else {
            multi = n * tabla;
            System.out.println(n + "*" + tabla + "=" + multi);
            tablaMultiplicar(n, tabla + 1);
        }
    }

    public static void main(String[] args) {
        int n, tabla = 0;

        n = LibreriaMates.leerNumeroPosi("Introduce un numero positivo");
        tablaMultiplicar(n, tabla);
    }
}
