/*
Realiza un programa que dibuje un triángulo dependiendo del valor de n introducido por el usuario que debe ser positivo e impar, véase el ejemplo:
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n,cont=1;
        
        do {            
            System.out.println("Introduce el numero");
            n= teclado.nextInt();
        } while (n<0 || n%2==0);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cont; j++) {
                System.out.print("*");
            }
            System.out.println("");
            cont=cont+1;
        }
    }
}
