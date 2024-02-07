/*
 Realizar un programa en Java que pida dos números enteros positivos al usuario (n1 y n2) y calcule y muestre por pantalla el resultado de n1*n2, 
sin utilizar el operador * (mediante sumas).
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1,num2,acum=0;
        
        do {            
            System.out.println("Introduce dos numero para hacer la multiplicacion");
            num1 = teclado.nextInt();
            num2 = teclado.nextInt();            
        } while (num1<0 || num2<0);

        
        for (; num2!=0 ;num2--) {
            acum = acum+num1;
        }
        System.out.println(acum);
    }
}
