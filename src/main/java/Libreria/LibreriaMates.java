/*
 */
package Libreria;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class LibreriaMates {

    /**
     * El metodo devuelve el factorial del numero que le mandemos
     *
     * @param n1 Le pasamos el numero introducido por el usuario
     * @return Sirve para sacar el factorial de un numero= 3!= 3*2*1=6
     * 4!=4*3*2*1=24
     *
     */
    public static int factorial(int n1) {
        int acum = 1;
        if (n1 < 0) {
            return -1;
        } else {
            if (n1 == 0) {
                return 1;
            } else {
                for (int i = n1; i > 0; i--) {
                    acum = acum * i;
                }
                return acum;
            }
        }
    }

    /**
     * Sirve para sacar el numero mayor de los 3 numeros que le pases
     *
     * @param n1 Le pasamos el numero introducido por el usuario tiene que ser
     * entero
     * @param n2 Le pasamos el numero introducido por el usuario tiene que ser
     * entero
     * @param n3 Le pasamos el numero introducido por el usuario tiene que ser
     * entero
     * @return devuelve el numero mayor de los 3
     */
    public static int maximo(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n1 && n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }

    /**
     * Sirve para sacar el maximo de esos dos numeros
     *
     * @param n1 Le pasamos el numero introducido por el usuario tiene que ser
     * entero
     * @param n2 Le pasamos el numero introducido por el usuario tiene que ser
     * entero
     * @return devuelve el numero mayor de los 2
     */
    public static int maximo(int n1, int n2) {
        int aux;
        aux = n1 > n2 ? n1 : n2;
        return aux;
    }

    /**
     * Devuelve un true o false dependiendo de si el n2 es divisor de n1
     *
     * @param n1 Le pasamo el primer numero entero
     * @param n2 Le pasamos el segundo numero para comprobar si es divisor
     * @return Si el numero es divisor se devuelve true si no se devuelve false
     */
    public static boolean esDivisor(int n1, int n2) {
        return n1 % n2 == 0;
    }

    /**
     * Sirve calcular el area y el volumen de un cilindro dependiendo si la
     * opcion es 1 o 2
     *
     * @param opcion Le agenciamos si queremos realizar el area o el volumen
     * @param radio Le agenciamos el radio del cilindro
     * @param altura Le agenciamos la altura del cilindro
     * @return Devuelve un float que es el area o el volumen del cilindro
     */
    public static float avCilindro(int opcion, float radio, float altura) {
        if (opcion == 1) {
            return (float) (2 * Math.PI) * radio * (altura + radio);
        } else {
            return (float) Math.PI * radio * radio * altura;
        }
    }

    /**
     * Sirve para pedir la opcion es 1 o 2 para area o volumen
     *
     * @param msg Le agenciamos el mensaje de la opcion para hacer el area o el
     * volumen
     * @return Devuelve el entero que es la opción que ha elegido el usuario
     */
    public static int opcion12(String msg) {
        Scanner teclado = new Scanner(System.in);
        int opcion1;

        do {
            System.out.println(msg);
            opcion1 = teclado.nextInt();
        } while (opcion1 != 1 && opcion1 != 2);

        return opcion1;
    }

    /**
     * Sirve para pedir el enenunciado y devuelve el valor del radio o de la
     * altura
     *
     * @param msg Le agenciamos el enunciado que queremos que muestre el sout
     * del metodo
     * @return Devuelve el numero en formato float que le a agenciado el usuario
     */
    public static float leerEntrada(String msg) {
        float resultado;
        Scanner teclado = new Scanner(System.in);

        System.out.println(msg);
        resultado = teclado.nextFloat();

        return resultado;
    }

    /**
     * Pide los datos de n para que no sean menor de 1
     *
     * @param msg El usuario le pasa al metodo el enunciado que quiere para leer
     * un numero que no sea menor que 1
     * @return Devuelve un numero de tipo entero que no sea menor que 1
     */
    public static int leerNumero(String msg) {
        int n;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println(msg);
            n = teclado.nextInt();
        } while (n < 1);
        return n;
    }

    /**
     * Calcula si n es primo y si lo es le suma 1 a contador
     *
     * @param n Le asigna el numero que quiere comprobar si es primo o no
     * @return Devuelve el Boolean dependiendo de si el numero es primo o no
     */
    public static boolean esPrimo(int n) {
        int cont = 0;
        for (int i = 1; i <= n; i++) {
            if (esDivisor(n, i)) {
                cont++;
            }
        }
        if (cont <= 2) {
            return true;
        }
        return false;
    }

    /**
     * Lee un numero cualquiera positivo
     *
     * @param msg El usuario le asigna el enunciado al sout de la funcio para
     * pedir lo que quiere
     * @return Devuelve un entero que sea positivo
     */
    public static int leerNumeroPosi(String msg) {
        Scanner teclado = new Scanner(System.in);
        int n;

        do {
            System.out.println(msg);
            n = teclado.nextInt();
        } while (n < 0);
        return n;
    }

    /**
     *Sirve para leer un caracter 
     * @param msg Es el mensaje que le asigna el enunciado al sout de la funcion para pedir el caracter
     * @return Devuelve un caracter
     */
    public static char leerCaracter(String msg) {
        Scanner teclado = new Scanner(System.in);
        char caracter;

        System.out.println(msg);
        caracter = teclado.nextLine().charAt(0);
        return caracter;
    }

    /**
     *Sirve para calcular una operacion 
     * @param n1 Le asigna un entero para la operacion
     * @param caracter Este caracter muestra que operacion quiere realizar
     * @param n2 Se le asigna el segundo numero para realizar la operacion
     * @return Devuelve el resultado de la operacion
     */
    public static int calculadora(int n1, char caracter, int n2) {
        int resultado = 0;
        switch (caracter) {
            case '+':
                resultado = suma(n1, n2);
                return resultado;
            case '-':
                resultado = resta(n1, n2);
                return resultado;
            case '*':
                resultado = multiplicacion(n1, n2);
                return resultado;
            case '/':
                resultado = division(n1, n2);
                return resultado;
            default:
                throw new AssertionError();
        }
    }

    /**
     *Realiza la suma
     * @param n1 Le asignamos el primer entero
     * @param n2 Le asignamos el Segundo entero
     * @return Devuelve una suma
     */
    public static int suma(int n1, int n2) {
        int suma;
        suma = n1 + n2;
        return suma;
    }
    /**
     *Realiza la resta
     * @param n1 Le asignamos el primer entero
     * @param n2 Le asignamos el Segundo entero
     * @return Devuelve una resta
     */
    public static int resta(int n1, int n2) {
        int resta;
        resta = n1 - n2;
        return resta;
    }
    /**
     *Realiza la multiplicacion
     * @param n1 Le asignamos el primer entero
     * @param n2 Le asignamos el Segundo entero
     * @return Devuelve una multiplicacion
     */
    public static int multiplicacion(int n1, int n2) {
        int multiplicacion;
        multiplicacion = n1 * n2;
        return multiplicacion;
    }
    /**
     *Realiza la division
     * @param n1 Le asignamos el primer entero
     * @param n2 Le asignamos el Segundo entero
     * @return Devuelve una division
     */
    public static int division(int n1, int n2) {
        int division;
        division = n1 / n2;
        return division;
    }
}
