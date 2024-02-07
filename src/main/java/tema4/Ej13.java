/*
Realizar un programa en Java que muestre los números entre 1 y 100 salvo los múltiplos de 7,
el programa finalizará antes de que aparezca el número 70. Muestra un mensaje cuando haya
finalizado que diga “El número 70 está prohibido en este programa”
 */
package tema4;

/**
 *
 * @author Vespertino
 */
public class Ej13 {
    public static void main(String[] args) {
        for (int num = 0; num < 100; num++) {
            if (num==70) {
                break;
            }
            if (num%7==0) {
                continue;
            }
            System.out.println(num);
        }
        System.out.println("El numero 70 esta prohibido en este programa");
    }
}
