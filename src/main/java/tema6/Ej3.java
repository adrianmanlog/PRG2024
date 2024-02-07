/*
Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra1, palabra2;
        boolean palabra;

        System.out.println("Introduce la primera palabra");
        palabra1 = teclado.nextLine();
        System.out.println("Introduce la segunda palabra");
        palabra2 = teclado.nextLine();

        palabra=palabra1.length()<palabra2.length();
        
        if (palabra==true) {
            System.out.println(palabra1);
        }else{
            System.out.println(palabra2);
        }
    }
}
