/*
Realiza un programa que solicite un carácter al usuario de forma sucesiva hasta que el usuario
introduzca un ‘F’. El programa llamará a un función que mostrará todos los métodos de la clase
Character sobre el char introducido por el usuario.
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char caracter;

        do {
            System.out.println("Introduce un caracter F es para terminar");
            caracter = teclado.nextLine().charAt(0);
            System.out.println(Character.isDigit(caracter));
            System.out.println(Character.isLetter(caracter));
            System.out.println(Character.isLetterOrDigit(caracter));
            System.out.println(Character.isLowerCase(caracter));
            System.out.println(Character.isUpperCase(caracter));
            System.out.println(Character.isSpaceChar(caracter));
            System.out.println(Character.isWhitespace(caracter));
            System.out.println(Character.toLowerCase(caracter));
            System.out.println(Character.toUpperCase(caracter));
            System.out.println(Character.digit(caracter, 10));
            System.out.println(Character.toString(caracter));
            System.out.println(Character.forDigit(caracter, 10));   
        } while (!(caracter == 'F'));
        System.out.println("SE ACABO EL PROGRAMA");
    }
}
