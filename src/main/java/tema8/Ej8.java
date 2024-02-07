/*
Para ir a ver la película &quot;Dolor y Gloria&quot; hay dos filas de espectadores. Un acomodador es el
encargado de dejar entrar a la gente. Sus instrucciones son simples: &quot;Tiene que dejar
entrar siempre al espectador que tenga más edad de entre los dos espectadores que están
esperando primero en cada una de las dos colas, si tienen la misma edad, las personas de
la fila 1 tiene preferencia&quot;. Ten en cuenta, que si acomodas a un espectador el NO elegido
sigue estando en la otra cola esperando para volver a ser comparado nuevamente.
Almacena previamente en las dos colas 5 enteros en cada una que representan las edades
de dichos espectadores.

Ejemplo.
Si COLA 1 tiene espectadores con las edades siguientes: 18, 12, 15, 19, 13
Si COLA 2 tiene espectadores con las edades siguientes: 20, 13, 17, 18, 23
Se debe mostrar por pantalla: 20, 18, 13, 17, 18, 23, 12, 15, 19 y 13

Entrada
18, 12, 15, 19, 13
20, 13, 17, 18, 23
Salida
20, 18, 13, 17, 18, 23, 12, 15, 19 y 13
 */
package tema8;

import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.text.StrBuilder;

/**
 *
 * @author Vespertino
 */
public class Ej8 {

    public static void main(String[] args) {
        LinkedList<Number> edades1 = new LinkedList<Number>();
        LinkedList<Number> edades2 = new LinkedList<Number>();

        rellenaCola2(edades1);
        rellenaCola1(edades2);

        System.out.println(ordena(edades1, edades2));

    }

    private static String ordena(List<Number> edades1, List<Number> edades2) {
        StringBuilder sb = new StringBuilder();
        int cont = 0, cont2 = 0, numMayor = 0;
        Integer aux = null, aux1 = null;
        int vueltas = edades1.size() + edades2.size();

        for (int i = 0; i < vueltas; i++) {
            if (edades1.isEmpty()) {
                numMayor = (Integer) edades2.get(cont2);
                edades2.remove(0);
                
            } else if (edades2.isEmpty()) {
                numMayor = (Integer) edades1.get(cont2);
                edades1.remove(0);
                
            } else if (!(edades1.isEmpty() && edades2.isEmpty())) {
                aux = (Integer) edades1.get(0);
                aux1 = (Integer) edades2.get(0);
                numMayor = aux > aux1 ? aux : aux1;
                if (aux > aux1) {
                    edades1.remove(0);
                } else {
                    edades2.remove(0);
                }
            }
            sb.append(numMayor + " ");
        }
        return sb.toString();
    }

    private static void rellenaCola2(List<Number> edades1) {
        edades1.add(18);
        edades1.add(25);
        edades1.add(30);
        edades1.add(19);
        edades1.add(13);

    }

    private static void rellenaCola1(LinkedList<Number> edades2) {
        edades2.add(16);
        edades2.add(13);
        edades2.add(17);
        edades2.add(18);
        edades2.add(23);
    }
}
