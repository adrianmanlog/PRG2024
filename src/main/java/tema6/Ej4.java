/*
Introducir por teclado una frase y mostrar la frase separada por espacios en blanco, carácter a carácter. 
El programa continúa hasta que se introduce la palabra “FIN” (da igual si está en mayúsculas o no debería funcionar del mismo modo).
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej4 {

    public static String cadenaDeEspacios(String cadena) {
        Scanner palabra = new Scanner(cadena);
        String cadena2 = "";
        char aux;
        int longitudPalabra;
        longitudPalabra = cadena.length();

        for (int i = 0; i < longitudPalabra; i++) {
            aux= cadena.charAt(i);
            cadena2 = cadena2 + " " + aux;
        }
        return cadena2;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;

        do {
            System.out.println("Introduce una palabra");
            frase = teclado.nextLine();
            if (frase.equalsIgnoreCase("fin")) {
                break;
            }
            System.out.println(cadenaDeEspacios(frase));
        } while (true);
    }
}
