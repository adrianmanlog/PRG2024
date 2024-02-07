package tema5;

import Libreria.LibreriaMates;

public class Ej21 {

    public static String mostrarFactoRecursivo(int n) {
        int aux;
        String factorial="";
        if (n == 0) {
            factorial = factorial + 1 + "\n";
        } else {
            aux = LibreriaMates.factorial(n);
            factorial = factorial + aux + "\n"+ mostrarFactoRecursivo(n - 1);
        }
        return factorial;
    }

    public static void main(String[] args) {
        int n;

        n = LibreriaMates.leerNumeroPosi("Introduce un numero positivo");
        System.out.println(mostrarFactoRecursivo(n));
    }
}
