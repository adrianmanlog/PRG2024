package tema2;
/*
Se va a adquirir un préstamo para comprar una casa que tiene un valor de ‘h’ y una tasa de interés de i (i debe de estar entre 0 y 100)
a un plazo de ‘n’ años . Calcule la cuota respectiva a partir de la siguiente fórmula y muestre la salida con dos decimales: 
*/

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Ej15{
	public static void main (String [] args){
		//Declaramos variables
		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		float valor, tasaInteres, plazoAños, r, m;

		//Pedimos los datos
		System.out.println("Dime el valor de la casa");
		valor = entrada.nextFloat();
		System.out.println("Dime la tasa de interes(Tiene que ser entre 0-100)");
		tasaInteres = entrada.nextFloat();
		System.out.println("Dime el plazo de años para pagar");
		plazoAños = entrada.nextFloat();

		//Cálculo
		r = tasaInteres/(float)(100*12);
		m = (float)valor*r / (1-(float)Math.pow(1+r,-12*plazoAños));

		//Resultado
		System.out.println("La cuota respectiva es " + df.format(m) + " euros");

	}
}