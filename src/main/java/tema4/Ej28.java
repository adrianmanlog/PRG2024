package tema4;

import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n,cont=1,espaciosinternos=0;

        do {
            System.out.println("Introduce el valor de n debe ser positivo e impar");
            n = teclado.nextInt();
        } while (n<0 || n%2==0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cont; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < espaciosinternos; j++) {
                System.out.print(" ");
            }
            if (i!=0) {
                System.out.print("*");
            }
            if (i==n-2) {
                espaciosinternos =0;
                cont=cont+=n-2;
                System.out.println("");
            } else {
                System.out.println("");
                espaciosinternos++;  
            }
        }
    }
}
