/*
Diseñar un programa que muestre el resultado del producto de los 10 primeros números impares.
 */
package tema4;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner  (System.in);
        
        for (int num = 1; num <= 19; num=num+2) {
            if (num<19) {
                System.out.print(num + "*");    
            } else {
                System.out.println(num);
            }      
        }
    }
    
}
