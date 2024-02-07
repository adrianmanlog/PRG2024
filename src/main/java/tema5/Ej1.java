/*
 
 */
package tema5;

import Libreria.LibreriaMates;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n1,n2,max;
        
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        
        max= LibreriaMates.maximo(n1,n2);
        
        System.out.println("Maximo: " + max);
    }
}
