/*

 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class MuestraEco {
    public static void muestraEco(int n1) {
        for (int i = 0; i < n1 ; i++) {
            System.out.println("Eco");   
        }
    }
    public static void muestraRango(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
        }
    }
    public static int sumar(int n1, int n2) {
        int suma;
        suma=n1+n2;
        
        return suma;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n1,n2;
        
        System.out.println("Introduce dos numeros separados con espacios");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        
        System.out.println(sumar(n1,n2));
        
        muestraEco(n1);
        muestraRango(n1,n2);
        
    }
}
