
package tema3;

import java.util.Scanner;

public class Ej12 { 
    public static void main(String[] args) {
        //Variables
        Scanner teclado = new Scanner (System.in);
        int horas,min,segundos;
        
        System.out.println("Introduce el numero de horas");
        horas = teclado.nextInt();
        System.out.println("Introduce el numero de minutos");
        min= teclado.nextInt();
        System.out.println("Introduce el numero de segundos");
        segundos = teclado.nextInt();
        
        //IF
        segundos++;
        if (horas>12){
            System.out.println("Formato doce horas merluzo");
        }else {
            if (segundos>=60) {
                segundos=0;
                min++;
            }   
            if (min>=60){
                min=0;
                horas++;
            }   
            if (horas==13) {
                horas=1;
            }  
        System.out.println("En total son: " + horas + " " + min + " " + segundos);
        }        
    }
}
