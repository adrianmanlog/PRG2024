package tema4;

import java.util.Scanner;

public class Ej30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n,espacioexterno=1,espaciointernos;

        do {
            System.out.println("Introduce un numero que sea positivo y impar");
            n = teclado.nextInt();
        } while (n<0 || n%2==0);

        espaciointernos=n;

        for (int i = 0; i < n/2+2; i++) {
            if (i==0 || i==n/2+1) {
                for (int o = 0; o < espacioexterno; o++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                System.out.print("*");

                for (int m = 0; m < espaciointernos; m++) {
                   System.out.print(" "); 
                }
                System.out.print("*");
                System.out.println("");
            } 
        }
    }
}
