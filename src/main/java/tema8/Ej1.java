/*
Introducir por teclado, hasta que se introduzca "fin", una seria de nombres de alumnos,
que se insertaran en una coleccion, de forma que se conserve el orden de inserccion no pudiendo repetirse
(utiliza un conjunto). Mostrar la lista por pantalla.
 */
package tema8;

import java.util.*;

/**
 *
 * @author Vespertino
 */
public class Ej1 {

    public static void rellenaConjunto(LinkedHashSet<String> conjuntoAlumnos, String finalizacion) {
        Scanner teclado = new Scanner(System.in);
        String nombre;

        nombre = teclado.next();
        while (!nombre.equals(finalizacion)) {
            conjuntoAlumnos.add(nombre);
            nombre = teclado.next();
        }

    }

    public static String muestraConjunto(LinkedHashSet<String> conjuntoAlumnos) {
        StringBuilder sb = new StringBuilder();
        Iterator it;

        it = conjuntoAlumnos.iterator();

        while (it.hasNext()) {
            sb.append(it.next() + "<---->\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedHashSet<String> conjuntoAlumnos = new LinkedHashSet<String>();

        System.out.println("Introduce el nombre de los alumnos separados con espacios");
        rellenaConjunto(conjuntoAlumnos, "fin");
        System.out.println(muestraConjunto(conjuntoAlumnos));
    }

}
