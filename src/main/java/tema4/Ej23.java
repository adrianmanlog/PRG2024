/*
 Realizar un programa que muestre las tablas de multiplicar del 1 al 10, el número de veces que indique el usuario.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej23 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int num;
    
    do {            
        System.out.println("Introduce el numero para calcular las tablas");
        num = teclado.nextInt();
    } while (num<0 || num>10);
    
        for (int i = 0; i < num; i++) {
            for (int j=0; j <11; j++){
                System.out.println(" ");
                for (int tab = 0; tab < 11; tab++) {
                    System.out.println(j + "x" + tab + "=" + j*tab);                
                }
            }   
        }
    }
    
}
