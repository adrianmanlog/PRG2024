/*
Diseñar la función calculadora() que reciba dos números enteros y una operación. Dependiendo del valor de la operación retornará suma, resta, 
multiplicación o división de los dos números recibidos. 
Las operaciones aunque sean muy básicas también las haremos en métodos diferentes (aunque no sean candidatas a almacenar en nuestra Librería ;-))
 */
package tema5;

import java.util.Scanner;
import Libreria.LibreriaMates;
/**
 *
 * @author Vespertino
 */
public class Ej10 {

    public static int leerNumero1(String msg) {
        Scanner teclado = new Scanner(System.in);
        int n1;
        System.out.println(msg);
        n1 = teclado.nextInt();
        return n1;
    }

    public static void main(String[] args) {
        int auxN1, auxN2;
        char caracter;

        auxN1 = leerNumero1("Introduzca el valor del primer numero");
        caracter =LibreriaMates.leerCaracter("Introduzca el caracter de la operacion");
        auxN2 = leerNumero1("Introduzca el valor del segundo numero");

        System.out.println(LibreriaMates.calculadora(auxN1, caracter, auxN2));

    }
}
