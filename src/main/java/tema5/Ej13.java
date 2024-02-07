/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej13 {

    public static String figura(int n) {
        String figura="";
        for (int i = 1; i < n - 2; i++) {
            if (i % 2 == 0) {
                figura= figura+ " ";
            }
            for (int j = 0; j < n; j++) {
                figura=figura + "*";
            }
            figura = figura + "\n";
        }
        return figura;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        String figura;
        
        System.out.println("Introduce un numero");
        n = teclado.nextInt();
        figura=figura(n);
        
        System.out.println(figura);
    }
}
