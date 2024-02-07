/*
Realizar un programa en Java que compruebe si una persona está “mellada de forma equilibrada”. 
Una persona lo está si en la parte izquierda de la dentadura faltan la misma cantidad de dientes que en la parte derecha, en la misma posición. 
Suponemos el valor ‘1’ como tiene diente y el valor ‘0’ como que no lo tiene.
Ejemplo
Entrada: 1 1 1 1 1 0 0 1 1 1 1 1 -> MELLADO EQUILIBRADO
Entrada: 1 1 1 0 1 1 1 -> NO EQUILIBRADO (es impar)
Entrada: 1 1 0 0 0 0 1 1 -> MELLADO EQUILIBRADO
Entrada: 0 0 1 0 1 1 0 1 0 0 -> MELLADO EQUILIBRADO

 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej8 {

    public static void mellado(String cadena) {
        int longitudCadena = cadena.length();
        int cont = 0, cont2 = 0;
        char aux;
        int aux2=0;
        for (int i = 0; i < longitudCadena; i++) {
            aux = cadena.charAt(i);
            aux2 = (int) aux;
            if (aux2 == 49 && i < longitudCadena / 2) {
                if (aux == 49) {
                    cont++;
                }
            }
            if (aux == 49 && i > longitudCadena / 2) {
                if (aux == 49) {
                    cont2++;
                }
            }
        }
        if (cont == cont2) {
            System.out.println("MELLADO EQUILIBRADO");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        int longitudCadena;

        do {
            System.out.println("Introduce la cadena mellada");
            cadena = teclado.nextLine();
            longitudCadena = cadena.length();
            if (longitudCadena % 2 != 0) {
                System.out.println("MELLADO NO EQUILIBRADO");
            }
        } while (longitudCadena % 2 != 0);
        mellado(cadena);
    }
}
