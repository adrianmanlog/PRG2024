/*
Modifica el ejercicio 21 añadiendo ahora otro mapa (llamado departamento) donde se introduzca información con distintos departamentos a los que pertenece un empleado.
El mapa tendrá como clave el código del departamento, los códigos será un número aleatorio de entre los números de código de departamento del mapa empleado (como si fuera una clave ajena).
Los valores a introducir será un array con nombre_departamento, ciudad y número de empleados aleatorios con Faker.

Posteriormente mostrar un listado MAESTRO-DETALLE donde veamos para cada departamento los empleados que tiene ese departamento. 
NOTA: Tienen que mostrarse todos los empleados. Ejemplo de listado:

Listado de DEPARTAMENTOS CON SUS EMPLEADOS
Departamento: 1 Contabilidad Logroño
Codigo		Nombre
1 		Juan Pérez
5		Ana Sarabia
3		Unai García
Departamento: 2 Producción Bilbao
Codigo		Nombre
8		Anselmo Pérez
6		Pepa García
Departamento: 3 Marketing Vitoria
…



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
public class Ej22 {

    public static void main(String[] args) {
        TreeMap<Integer, String[]> empleados = new TreeMap<Integer, String[]>();
        TreeMap<Integer, String[]> departamento = new TreeMap<Integer, String[]>();
        Faker f = new Faker();

        int n = LibreriaMates.leerNumeroPosi("Introduce el numero de empleados");
        int n2 = LibreriaMates.leerNumeroPosi("Introduce el numero de departamentos");
        rellenaMapa(empleados, n, f);
        muestraMapa(empleados);
    }

    public static void rellenaMapa(Map empleados, int n, Faker f) {
        int cont = 0;
        String[] valores;
        int clave=f.number().numberBetween(1, 4);
        for (int i = 1; i <= n; i++) {
            valores = new String[4];
            cont = 0;
            valores[cont++] = f.beer().malt();
            valores[cont++] = f.dragonBall().character();
            empleados.put(clave, valores);
        }
    }

    public static void rellenaDepartamentos(Map departamento, int n2, Faker f) {
        int cont = 0;
        String[] valores;
        for (int i = 1; i <= n2; i++) {
            valores = new String[2];
            cont = 0;
            valores[cont++] = f.zelda().game();
            valores[cont++] = f.number().digit();
            valores[cont++] = f.crypto().sha1();
            valores[cont++] = f.number().numberBetween(1, 4) + " ";
            departamento.put(i, valores);
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
