/*
Diseñar una aplicación que pida al usuario que introduzca una frase por teclado e indique
cuántos espacios tiene. Para ello crearemos una función que se llame cuentaEspacios.
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej6 {

    public static int cuentaEspacios(String cadena) {
        Scanner teclado = new Scanner (cadena);
        char aux;
        int cont=0;
        int longitudCadena = cadena.length();

        for (int i = 0; i < longitudCadena; i++) {
            aux=cadena.charAt(i);
            if (Character.isWhitespace(aux)) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;

        System.out.println("Introduce una cadena");
        cadena = teclado.nextLine();

        System.out.println(cuentaEspacios(cadena));
    }
}
