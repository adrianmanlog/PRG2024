/*
Realizar una función que calcule y devuelva el área o el volúmen de un cilindro, según se especifique en un menú. Para distinguir un caso de otro se le pasará un número 1 (para el área) y un 2 (para el volumen). 
Las fórmulas a utilizar son: 
área = 2PI * radio * (altura+radio)
volumen =PI * radio * radio * altura

 */
package tema5;

import Libreria.LibreriaMates;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej6 {
    public static void main(String[] args) {
        int opcion;
        float radio,altura,aux;
        
        opcion = LibreriaMates.opcion12("Introduzca 1 para area y 2 para Volumen");
        
        radio = LibreriaMates.leerEntrada("Introduzca el radio del cilindro");
        
        altura = LibreriaMates.leerEntrada("Introduzca la altura del cilindro");
        
        aux=LibreriaMates.avCilindro(opcion, radio, altura);
        
        if (opcion==1) {
            System.out.println("El area es: " + aux);
        } else {
            System.out.println("El volumen es: " + aux);
        }
    }
}
