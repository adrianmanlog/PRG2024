package tema2;
import java.util.*;
import java.lang.Math;

public class Ej13{
	public static void main (String [] args){
		//Declaramos variables
		Scanner entrada = new Scanner(System.in);
		float a, b, c, resultado1, resultado2;

		//Pedimos los datos
		System.out.println("Dime el valor de a");
		a = entrada.nextFloat();
		System.out.println("Dime el valor de b");
		b = entrada.nextFloat();
		System.out.println("Dime el valor de c");
		c = entrada.nextFloat();

		//Calculos
		resultado1 = (float)(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		resultado2 = (float)(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);

		//Resultado
		System.out.println("El resultado es: " + resultado1);

		System.out.println("El resultado es: " + resultado2);
	}
}