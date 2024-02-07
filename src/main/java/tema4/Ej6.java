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
public class Ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner  (System.in);
        int y=1;
        
        for (int num = 1; num <= 19; num=num+2) {
            y=y*num;
        }
        System.out.println(y);
       
    }
}
