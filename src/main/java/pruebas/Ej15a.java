/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import java.util.Scanner;

public class Ej15a {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int año1,año2,cont=0;
        
        System.out.println("introduce dos años");
        año1 = teclado.nextInt();
        año2 = teclado.nextInt();
        
        for (; año1 < año2; año1++) {
            if (año1%400==0 || año1%100!=0 && año1%4==0) {
                cont++;
                continue;
            }
        }
        System.out.println(cont);
    }
}
