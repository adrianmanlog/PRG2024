/*

 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej2 {
    public static boolean esVocal(char c) {
        if (c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U') {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        char c;
        boolean b;
        
        System.out.println("Introduce un caracter");
        c = teclado.nextLine().charAt(0);
        
        b =esVocal(c);
        System.out.println("Es vocal? " + b);
    }
}
