/*
Realiza un programa en Java que recoja las edades de los alumnos de los grupos de 1MULTIWEB, 2MULTIWEB y 3MULTIWEB. 
Para ello se deberá almacenar en una colección (a definir por el alumno) que a su vez tenga 3 colecciones internamente. 
Posteriormente mostrar el listado de las edades con un encabezado (ver ejemplo posterior) y la media de edad por cada grupo.Ejemplo:

Alumno s de 1ºMULTIWEB
18, 19, 20, 20 ….
Media de edad: 21.30
Alumno s de 2ºMULTIWEB
20, 39, 19, 26 ….
Media de edad: 24.30

 */
package tema8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vespertino
 */
public class Ej7 {

    public static void rellenaArraydeArray(List<ArrayList<Integer>> instituto) {
        ArrayList<Integer> mulweb1 = new ArrayList<>();
        mulweb1.add(20);
        mulweb1.add(19);
        mulweb1.add(18);
        mulweb1.add(19);
        mulweb1.add(17);
        mulweb1.add(25);
        ArrayList<Integer> mulweb2 = new ArrayList<>();
        mulweb2.add(20);
        mulweb2.add(19);
        mulweb2.add(18);
        mulweb2.add(19);
        mulweb2.add(17);
        mulweb2.add(25);
        ArrayList<Integer> mulweb3 = new ArrayList<>();
        mulweb3.add(20);
        mulweb3.add(19);
        mulweb3.add(18);
        mulweb3.add(19);
        mulweb3.add(17);
        mulweb3.add(25);
        instituto.add(mulweb1);
        instituto.add(mulweb2);
        instituto.add(mulweb3);
    }

    public static void mostrarMedia(List<ArrayList<Integer>> instituto) {
        int acum = 0, cont = 0, i = 1;
        float media = 0;
        for (ArrayList<Integer> calculos : instituto) {
            cont = 0;
            acum = 0;
            System.out.println("Alumnos de MULWEB" + i);
            for (Integer calculo : calculos) {
                System.out.print(calculo + " ");
                acum += calculo;
                cont++;
            }
            media = acum / cont;
            System.out.println("La media de MULWEB" + i + " es " + media);
            i++;
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> instituto = new ArrayList<ArrayList<Integer>>();
        rellenaArraydeArray(instituto);

        mostrarMedia(instituto);

    }
}
