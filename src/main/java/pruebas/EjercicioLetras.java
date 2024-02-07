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
public class EjercicioLetras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        char letra,primera='A';
        
        System.out.println("Introduce la letra en mayuscula");
        letra=teclado.nextLine().charAt(0);
        
        for (int i = 0; i < letra; i++) {
            char letra2=letra;
            for (; letra2 >= primera; letra2--) {
                System.out.print(letra2);
            }
            System.out.println("");
            letra= (char) (letra-1);
            if (letra<'A') {
                break;
            }
        }
    }
}
