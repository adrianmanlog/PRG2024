/*
Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios. Almacenar en una lista las palabras de la frase, 
una en cada nodo y mostrar por pantalla las palabras que estén repetidas. A continuación, mostrar las que no lo estén.
 */
package tema8;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Ej6 {

    public static void rellenarColeccion(Collection<String> col, String[] VectorFrase) {
        Scanner teclado = new Scanner(System.in);
        String aux;
        for (int i = 0; i < VectorFrase.length; i++) {
            aux = VectorFrase[i];
            col.add(aux);
        }

    }

    public static String sinRepetidos(List<String> col) {
        StringBuilder sb = new StringBuilder();
        String aux, aux2;
        int cont = 0;
        for (int i = 0; i < col.size(); i++) {
            aux = col.get(i);
            cont = 0;
            if (i == col.size()) {
                break;
            }
            for (int j = 0; j < col.size(); j++) {
                if (aux == col.get(j)) {
                    cont++;
                    if (cont < 2) {
                        sb.append(aux + " ");
                    }
                }

            }
        }
        return sb.toString();
    }

    public static String sinRepetidos2(List<String> col) {
        StringBuilder sb2 = new StringBuilder();
        String aux, aux2;
        int cont = 0;
        for (int i = 0; i < col.size(); i++) {
            aux = col.get(i);
            cont = 0;
            if (i == col.size()) {
                break;
            }
            for (int j = 0; j < col.size(); j++) {
                if (aux == col.get(j)) {
                    cont++;
                    if (cont >= 2) {
                        sb2.append(aux + " ");
                    }
                }

            }
        }
        return sb2.toString();
    }

    public static String muestraColeccion(Collection<String> col) {
        StringBuilder sb = new StringBuilder();
        Iterator it = col.iterator();
        while (it.hasNext()) {
            sb.append(it.next() + "\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedList<String> c = new LinkedList<String>();
        LinkedList<String> sinRepetidos = new LinkedList<String>();
        String frase = "la cabeza el arbol la bici un casco";
        String[] VectorFrase;
        VectorFrase = frase.split(" ");

        rellenarColeccion(c, VectorFrase);
        System.out.println(sinRepetidos(c));
        System.out.println(sinRepetidos2(c));
        System.out.println(muestraColeccion(sinRepetidos));
    }
}
