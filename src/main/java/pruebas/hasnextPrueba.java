package pruebas;

import java.util.Scanner;

public class hasnextPrueba {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numeros, aux2 = "";
        int aux;

        System.out.println("Introduce una cadena de numeros quitare los inpares");
        numeros = teclado.nextLine();
        Scanner readNumeros = new Scanner(numeros);
        while (readNumeros.hasNext()) {
            aux = readNumeros.nextInt();
            if (aux % 2 == 0) {
                aux2 += aux;
            }
        }
        System.out.println(aux2);
    }
}
