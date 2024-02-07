/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Scanner;
import static tema5.Ej13.figura;

/**
 *
 * @author Vespertino
 */
public class Ej18 {
    
    public static String figuraPiramide(int n) {
        String figura = "";
        int asteriscos = 1, espacios=n/2;
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < espacios; j++) {
                figura = figura + " ";
            }
            for (int j = 0; j < asteriscos; j++) {
                figura = figura + "*";
            }
            figura = figura + "\n";
            if (i < n) {
                espacios-=1;
                asteriscos += 2;
            }
        }
        return figura;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        String figura;
        
        System.out.println("Introduce un numero");
        n = teclado.nextInt();
        figura = figuraPiramide(n);
        
        System.out.println(figuraPiramide(n));
    }
}
