package pruebas;

import java.util.Scanner;

public class preubaRombo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n,espaciosInternos=-1,espaciosExternos;

        System.out.println("Introduce un numero impar y positivo");
        n=teclado.nextInt();

        espaciosExternos = n/2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < espaciosExternos; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < espaciosInternos; j++) {
                System.out.print(" ");
            }
            if (!(i==0||i==n-1)) {
                System.out.print("*");
            }
            System.out.println("");
            if (i<n/2) {
                espaciosExternos--;
                espaciosInternos+=2; 
            }else{
                espaciosExternos++;
                espaciosInternos-=2;
            }
        }
    }
}
