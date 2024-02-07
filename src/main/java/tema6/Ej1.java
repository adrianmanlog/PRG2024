/*
Realiza un programa en Java que muestre por pantalla los 500 primeros caracteres de la tabla
UNICODE, al ejecutarse se mostrará la lista de la siguiente forma:
0: xx
1: xx
…
499: xx
 */
package tema6;

import Libreria.LibreriaMates;

/**
 *
 * @author Vespertino
 */
public class Ej1 {
    public static String unicode(int n1, int n2) {
        String cadena="";
        char cont=(char) n1;
        for (int i = n1; i < n2; i++) {
            cadena= cadena + i + ":" + cont + "\n";
            cont++;
        }
        return cadena;
    }
    public static void main(String[] args) {
        int n1,n2;
        String aux;
        
        n1=LibreriaMates.leerNumeroPosi("Introduce el minimo");
        n2=LibreriaMates.leerNumeroPosi("Introduce el maximo");
        aux= unicode(n1, n2);
        System.out.println(aux);
        
    }
}
