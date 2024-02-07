/*
Realizar un programa que muestre por pantalla el fibonacci de los N primeros números enteros, empezando desde 0. 
Para ello hacer una función que reciba un número N y retorne el cálculo final. Se debe hacer uso de la función fibonacci ya realizada.
 */
package tema5;
import Libreria.LibreriaMates;
/**
 *
 * @author Vespertino
 */
public class Ej28 {
    public static String cadenaFibonnaci(int n) {
        String cadena="";
        for (int i = 0; i <= n; i++) {
            cadena= cadena + Ej25.fibonacci(i) + " ";
        }
        return cadena;
    }
    public static void main(String[] args) {
        int n;
        n=LibreriaMates.leerNumeroPosi("Introduce un numero positivo");
        System.out.println(cadenaFibonnaci(n));
    }
}
