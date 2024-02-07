/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej12a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num,tab;
        
        do {            
            System.out.println("Introduce un numero de l al 10");
            num=teclado.nextInt();
        } while (num<1||num>10);
        
        for (num=num;  num<11; num++) {
            tab=1;
            do {                
                System.out.println(num + "x" + tab + "=" + num*tab);
                tab++;
            } while (tab<11);
        }
    }
}
