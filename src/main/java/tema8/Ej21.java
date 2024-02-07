/*
Realizar un programa en Java que almacene en un mapa (llamado empleados) la información de los empleados de una empresa. 
La información del mapa la rellenaremos usando la clase Faker.
El mapa tendrá como clave el código del empleado secuencial empezando en 1.
Los valores del mapa será un array de String donde almacenaremos: nombre, edad, salario y código de departamento (aquí usamos Faker)

Posteriormente solicitaremos al usuario un código determinado y mostraremos toda la información disponible en el mapa de ese empleado. 
En caso de no existir mostraremos el mensaje “EMPLEADO INEXISTENTE”. El programa termina cuando el usuario introduce un -1 como código de empleado.

 */
package tema8;

import Libreria.LibreriaMates;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Vespertino
 */
public class Ej21 {

    public static void main(String[] args) {
        TreeMap<Integer, String[]> mapa = new TreeMap<Integer, String[]>();
        Faker f = new Faker();

        int n = LibreriaMates.leerNumeroPosi("Introduce el numero de empleados");
        rellenaMapa(mapa, n, f);
        muestraMapa(mapa);
    }

    public static void rellenaMapa(Map empleados, int n, Faker f) {
        int cont = 0;
        String[] valores;
        for (int i = 0; i < n; i++) {
            valores = new String[4];
            cont = 0;
            valores[cont++] = f.zelda().game();
            valores[cont++] = f.number().digit();
            valores[cont++] = f.crypto().sha1();
            valores[cont++] = f.number().numberBetween(1, 4) + " ";
            empleados.put(i, valores);
        }
    }

    public static void muestraMapa(Map<Integer, String[]> mapa2) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        String aux;
        do {
            System.out.println("Introduce el que quieres conocer");
            n = teclado.nextInt();
            if (!mapa2.containsKey(n)) {
                System.out.println("Usuario Inexsistente");
            } else {
                aux = Arrays.toString(mapa2.get(n));
                System.out.println(n + ": " + aux);
            }
        } while (n != -1);
    }
}
