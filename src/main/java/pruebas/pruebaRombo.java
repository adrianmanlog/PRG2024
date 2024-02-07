package pruebas;

import java.util.Scanner;

public class pruebaRombo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, espaciosInteriores = -1;

        do {
            System.out.println("Introduce el valor de n tiene que ser positivo e impar");
            n = teclado.nextInt();
        } while (n < 0 || n % 2 == 0);

        int espaciosExternos = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < espaciosExternos; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0; k < espaciosInteriores; k++) {
                System.out.print(" ");
            }

            if (!(i == 0 || i == n - 1)) {
                System.out.print("*");
            }
            System.out.println("");

            if (i < n / 2) {
                espaciosExternos--;
                espaciosInteriores += 2;
            } else {
                espaciosExternos++;
                espaciosInteriores -= 2;
            }
        }
    }
}
