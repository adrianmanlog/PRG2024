/*Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos. */
package pruebas;

public class Ej2 {
    public static void main(String[] args) {
        int h=0,min=0,s=0;
        
        for (; h < 24;h++) {
            System.out.println(h);
            for (; min < 60;min++) {
                System.out.println(min);
                for (; s < 60; s++) {
                    System.out.println(s);
                }
            }
        }
        min=0;
        s=0;
        System.out.println(h + " " + min + " " + s);
    }
}
