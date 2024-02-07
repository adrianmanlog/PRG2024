/*
Realizar un programa que pida al usuario las calificaciones de 5 alumnos (comprobar entrada) y decir si hay algún suspenso,
indicando la cantidad, 
en  caso de que no hubiera ningún suspenso mostraremos el mensaje 
“¡¡¡Qué gran trabajo el de este grupo!!!”.
 */
package tema4;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num,cont=0;
        
        for (int c = 0; c < 5; c++) {
            // Comprobamos la entrada
            do {                
                System.out.println("Introduce la nota del alumno " + (c+1));
                num = teclado.nextInt();
            } while (num>10 || num<0);
            if (num<5) {
                cont++; // Contamos los suspensos
            }    
        }
        if (cont==0) {
            System.out.println("¡¡¡QUE GRAN TRABAJO DE ESTE GRUPO!!!");
        } else {
            System.out.println("Hay este numero de suspensos: " + cont);
        }
    }
}
