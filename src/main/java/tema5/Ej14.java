/*
Pedimos al usuario dos numeros base y exponenete, queremos que calcule de forma recursiva
 */
package tema5;

import Libreria.LibreriaMates;


public class Ej14 {
    public static int elevado(int b, int expo) {
        int r;
        if (expo==0) {
            r = 1;
        } else {
            r = b * elevado(b, expo-1);
        }
        return r;
    }
    
    public static void main(String[] args) {
        int b,expo;
        
        b= LibreriaMates.leerNumeroPosi("Introduce la base del numero");
        expo= LibreriaMates.leerNumeroPosi("Introduce el exponente del numero");
        
        System.out.println(elevado(b, expo));
    }
}
