/*
Realizar un programa en Java que pida al usuario múltiples caracteres separados por un espacio, 
posteriormente mostrará por pantalla qué caracteres están entre la ‘h’ y la ‘n’.
Ejemplo:
Entrada: k l i w q a c m 4 @ h & <
Salida: SI SI NO NO NO NO NO SI NO NO
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej10 {

    public static StringBuilder entreHyN(String cadena) {
        StringBuilder respuesta = new StringBuilder();
        int lengt = cadena.length();
        char aux;
        for (int i = 0; i < lengt; i++) {
            aux = cadena.charAt(i);
            if (Character.isWhitespace(aux)) {
                continue;
            } else {
                if (aux > 'h' && aux < 'n') {
                    respuesta.append("SI ");
                } else {
                    respuesta.append("NO ");
                }
            }
        }
        return respuesta;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;

        System.out.println("Introduce la cadena");
        cadena = teclado.nextLine();
        System.out.println(entreHyN(cadena));
    }
}
