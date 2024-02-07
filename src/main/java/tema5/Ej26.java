/*
Realizar un programa en java que permita dibujar gráficos de barra (mediante texto). Para ello pediremos al usuario N números seguidos, 
hasta la introducción de un cero,y mostraremos la siguiente gráfica.
Ejemplo para entrada:
3 6 5 2 0
3. | ###
6. | ######
5. | #####
2. | ##
   |__________

 */
package tema5;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej26 {

    public static String leerCodigoBarras(String numeros) {
        Scanner leerNumeros = new Scanner(numeros);
        String cadena = "";
        int n;

        while (leerNumeros.hasNext()) {
            n = leerNumeros.nextInt();
            if (n == 0) {
                break;
            }
            cadena = cadena + n + " ";
            for (int i = 1; i <= n; i++) {
                cadena = cadena + "#" + " ";
            }
            cadena = cadena + "\n";
        }
        return cadena;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numeros, aux;

        System.out.println("Introduce una cadena de numeros se terminara un 0");
        numeros = teclado.nextLine();
        aux = leerCodigoBarras(numeros);
        System.out.println(aux);
    }
}
