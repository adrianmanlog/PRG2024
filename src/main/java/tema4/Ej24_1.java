/*
 *Realiza un programa que dibuje un rombo dependiendo del valor (n) introducido por el usuario que debe ser positivo e impar, véase el ejemplo:
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej24_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n,div1,div2,div3,div4;
        
        do {            
            System.out.println("Introduce el valor de n debe ser positivo e impar");  
            n = teclado.nextInt();
        } while (n<0 || n%2==0);
        
        div1= n/2;
        div2=1;
        div3=1;
        div4=0;
        
        for (int j=0; j < n; j++) {
            
            for (int i = 0; i < div1; i++) {
                System.out.print(" ");
            }
            for (int o = 0; o < div2; o++) {
                System.out.print("*"); 
            }
            for (int t = 0; t < div3; t++) {
                System.out.print(" ");
            }
            for (int c = 0; c < div2; c++) {
                System.out.print("*");
            }
            System.out.println("");
//          System.out.print(div1 + " " + div2);

            if (div1!=0 && j<n/2) {
                div1--;                
            } else{
                div1++;                
            }if (div4==0){
                div4++;   
            }if (div4==1){
                div4--;
            }
            
        }
    }
}