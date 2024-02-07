/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class EjxExamen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n;
        
        System.out.println("Introduce el numero");
        n=teclado.nextInt();
        
        int espaciosInternos=n-2, espaciosExternos=0;
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < espaciosExternos; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < espaciosInternos; j++) {
                System.out.print(" ");
            }
            if (i!=n/2) {
                System.out.print("*");
            }
            System.out.println("");
            if (i<n/2) {
                espaciosExternos++;
                espaciosInternos-=2;
            }else{
                espaciosExternos--;
                espaciosInternos+=2;
            }
        }
    }
}
