package tema1;
//IMPORTANTE 
import java.text.DecimalFormat;
import java.util.*;

public class ej10{
	public static void main(String [] args){
		Scanner t = new Scanner(System.in);
		System.out.println("Indique la cantidad");
		float cantidad = t.nextFloat();
		
		//Sirve para redondear decimales (No olvidar import java.text.DecimalFormat), los # sirve para usar el formato que deseemos.
		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println("Total al 21%: " + df.format(cantidad*1.21) + " euros");
		System.out.println("Total al 10%: " + df.format(cantidad*1.10) + " euros");
		System.out.println("Total al 4%: " + df.format(cantidad*1.04) + " euros");
		
		
	}
}