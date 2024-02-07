/*

 */
package tema5;

import Libreria.LibreriaMates;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n1,aux;
        
        System.out.println("Introduce un numero");
        n1 = teclado.nextInt();
        
        aux = LibreriaMates.factorial(n1);
        if (n1<0) {
            System.out.println("Error el valor es: " + aux);  
        }else{
            System.out.println(aux); 
        }

        
    }
}
