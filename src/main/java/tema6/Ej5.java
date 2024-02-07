/*
Diseñar el juego de acierta la contraseña. Un usuario introduce una cadena y otro debe adivinarla. Cuando realice más de 3 intentos le daremos una pista (el número de caracteres), 
cuando lleve 3 más le daremos la otra pista (los dos últimos caracteres de la contraseña) a partir de aquí le mostraremos mayor o menor alfabéticamente.
 */
package tema6;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej5 {

    public static String pista1(String contraseña) {
        int longitudPalabra;
        String cadena="";
        longitudPalabra = contraseña.length();
        cadena= cadena + "La contraseña tiene " + longitudPalabra + " caracteres";
        return cadena;
    }

    public static String pista2(String contraseña) {
        int n=2;
        return contraseña.substring(contraseña.length()-n);
    }
    
    public static String pista3oMas(String contraseña, String contraseña2) {
        String cadena="";
        if (contraseña.compareTo(contraseña2)<0) {
            cadena= cadena + "La contraseña esta en una posicion menor en el diccionario";
        } else{
            cadena= cadena + "La contraseña esta en una posicion mayor en el diccionario";
        }
        return cadena;
    }

    public static void adivinarContraseña(String contraseña) {
        Scanner teclado = new Scanner(System.in);
        int vidas = 0, vidas2 = 0;
        String contraseña2;
        
        for (;;) {
            System.out.println("Intenta la contraseña");
            contraseña2 = teclado.nextLine();
            if (contraseña2.equalsIgnoreCase(contraseña)) {
                break;
            }
            vidas++;
            vidas2++;
            if (vidas == 4) {
                System.out.println(pista1(contraseña));
            }
            if (vidas2 == 6) {
                System.out.println("Los dos ultimos caracteres son: " + pista2(contraseña));
            }
            if (vidas2>6) {
                System.out.println(pista3oMas(contraseña, contraseña2));
            }
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contraseña;
        
        System.out.println("Introduce la contraseña");
        contraseña = teclado.nextLine();
       
        adivinarContraseña(contraseña);
        System.out.println("¡¡¡HAS ACERTADO LA CONTRASEÑA!!!");
    }
}
