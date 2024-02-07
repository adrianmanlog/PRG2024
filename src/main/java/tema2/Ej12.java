package tema2;
/*
Diseñar una aplicación que calcule la longitud y el área de una circunferencia. Para ello, el usuario debe introducir el radio (que puede contener decimales). Recordamos: Longitud= 2π radio Area=π radio2
*/

import java.util.*;
import java.text.DecimalFormat;
public class Ej12{
	public static void main (String [] args){
		//Creamos variables
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner entrada = new Scanner(System.in);
		float radio, longitud, area;
	
		//Pedimos variables
		System.out.println("Cual es el radio de la circunferencia");
		radio = entrada.nextFloat();

		//Calculos
		longitud =(float) (2*3.14*radio);
		area =(float) (3.14*radio*radio);

		//Resultado
		System.out.println("La longitud es " + df.format(longitud) + " y el area es " + df.format(area));
	}
}