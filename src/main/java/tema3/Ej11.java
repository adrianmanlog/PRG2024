package tema3;
import java.util.*;
import java.lang.Math;

public class Ej11{
	public static void main (String [] args){
            //Declaramos variables
            Scanner entrada = new Scanner(System.in);
            float a, b, c,ecuacion, resultado1, resultado2;

            //Pedimos los datos
            System.out.println("Dime el valor de a");
            a = entrada.nextFloat();
            System.out.println("Dime el valor de b");
            b = entrada.nextFloat();
            System.out.println("Dime el valor de c");
            c = entrada.nextFloat();

            ecuacion = (float) Math.sqrt(Math.pow(b, 2)- 4*a*c);
            
            if (a==0) {
                System.out.println("No se puede hacer esa ecuacion con esta formula");
            }else {
                if (ecuacion<0) {
                    System.out.println("No exixten soluciones reales");
                } else {
                    resultado1 = (float)(-b+ecuacion)/(2*a);
                    resultado2 = (float)(-b-ecuacion)/(2*a);        
                    
                    System.out.println("El resultado es: " + resultado1);
                    System.out.println("El resultado es: " + resultado2);
                }
            }
            

     }
 }