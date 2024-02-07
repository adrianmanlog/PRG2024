/*
Se desea obtener el promedio de g grupos que están en un mismo año escolar; siendo que
cada grupo puede tener n alumnos, que cada alumno puede llevar m materias y que en todas
las materias se promedian tres calificaciones para obtener el promedio de la materia. Lo que
se desea desplegar es el promedio de los grupos, el promedio de cada grupo y el promedio de
cada alumno.
 */
package tema5;

import Libreria.LibreriaMates;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej30 {

//    public static int materias(int m) {
//        Scanner teclado = new Scanner (System.in);
//        int nota1,nota2,nota3;
//        for (int i = 0; i < m; i++) {
//            
//        }
//    }
//
//    public static int alumnos(int n, int m) {
//        for (int i = 0; i < n; i++) {
//            
//        }
//    }
//
//    public static int grupos(int g, int n) {
//        int aux;
//        for (int i = 0; i < g; i++) {
//            aux= alumnos(n);
//        }
//    }

    public static void main(String[] args) {
        int g, n, m;

        g = LibreriaMates.leerNumeroPosi("Introduce el numero de grupos");
        n = LibreriaMates.leerNumeroPosi("Introduce el numero de alumnos");
        m = LibreriaMates.leerNumeroPosi("Introduce el numero de materias");

    }
}
