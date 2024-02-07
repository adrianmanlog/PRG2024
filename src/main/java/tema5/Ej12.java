/*
Realizar una función que reciba n datos de tipo entero y calcule y muestre por pantalla la suma y la media de todos ellos.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej12 {
    public static int sumaNumeros(String numeros) {
        int acum = 0;
        Scanner teclado = new Scanner (numeros);

        while (teclado.hasNext()) {            
            acum = acum + Integer.parseInt(teclado.next());
        }
        return acum;
    }
    public static float mediaNumeros(String numeros) {
        Scanner teclado = new Scanner (numeros);
        int cont=0, suma;     
        
        suma= sumaNumeros(numeros);
        while (teclado.hasNext()) {
            teclado.next();
            cont++;
        }
        
        return (float)suma/cont;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int suma;
        float media;
        String numeros;
        
        System.out.println("Introduce los numeros que quieras los sumaremos y haremos la media");
        numeros = teclado.nextLine();
        suma= sumaNumeros(numeros);
        
        System.out.println("La suma " + suma);
        
        media = mediaNumeros(numeros);
        
        System.out.println("La media: " + media);
        
    }
}
