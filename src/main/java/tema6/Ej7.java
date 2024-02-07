/*
Pedir el nombre y apellidos de una persona y realizar un función llamada sinVocales que reciba estos dos parámetros y
devuelva un String con dicha información sin ninguna vocal (acentuadas o no).
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej7 {

    public static boolean esVocal(char aux) {
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        return vocales.indexOf(aux)!=-1;
    }

    public static String sinVocales(String nombreApe) {
        String cadena = "";
        char aux;
        int longitudCadena;

        longitudCadena = nombreApe.length();
        for (int i = 0; i < longitudCadena; i++) {
            aux = nombreApe.charAt(i);
            if (!esVocal(aux)) {
                cadena = cadena + aux;
            }
        }
        return cadena;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1");
        String nombreApe;

        System.out.println("Introduce tu nombre y apellidos");
        nombreApe = teclado.nextLine();

        System.out.println(sinVocales(nombreApe));
    }
}
