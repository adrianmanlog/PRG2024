/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.util.Scanner;


public class Ej19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1,num2,acum=0;
                
        System.out.println("Introduce dos numero para hacer la multiplicacion");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();            
        
        for (; num2!=0 ;num2--) {
            acum = acum+num1;
        }
        System.out.println(acum);
    }
}
