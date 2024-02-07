/*
Realiza métodos que hagan uso de los métodos de fechas de la clase LocalDate:
● Método que recibe una fecha como String e indica si el año es bisiesto o no.
● Método que recibe una fecha como String e indica si dicha fecha es o no correcta.
● Método que dada una fecha te indica el día de la semana en castellano de esta fecha.
Ejemplo {“Lunes”, “Martes” …}
● Método recibe dos fechas en formato String y devuelve -1, 0 o 1 dependiendo de si la
primera está antes, es igual o está después de la segunda.
● Método que recibe un String con una fecha y devuelve cuantos días quedan para llegar a
final de mes.
● Método que recibe un String con una fecha y devuelve cuantos días quedan hasta fin de
año.

1º Curso. Desarrollo de Aplicaciones Web y Multiplataforma
Estructuras Dinámicas de Datos

Programación David Pérez Lledó
● Método que recibe dos String y calcula cuántos días de diferencias hay entre ambas fechas.
● Método que recibe un String con una fecha y un int con el número de días. Retorna un
String con la fecha tras haber pasado esos días.
● Método que devuelve la fecha del sistema en formato bonito. Ejemplo si “03/02/2023 -&gt; 3
de Febrero del 2023”.
 */
package tema8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;

/**
 *
 * @author Vespertino
 */
public class Ej10 {
    public static void main(String[] args) {
        LocalDate ld= new LocalDate(2004,04,24);  
        LocalDate ld2= new LocalDate(2004,04,26);  
        System.out.println(Year.isLeap(2004));
//        System.out.println("Existe"+ LocalDate.of(2019, Month.DECEMBER, 32));
        System.out.println(LocalDate.of(2004,04,24).getDayOfWeek());
        System.out.println(ld.isBefore(ld2));
    }
}
