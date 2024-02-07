package tema2;
import java.util.*;

public class Ej5{
	public static void main (String [] args){

		//Crear variables
		Scanner entrada = new Scanner(System.in);
		int año_actual, año_nacimiento, edad;

		//Pedir los datos
		System.out.println("Introduce el año actual");
		año_actual = entrada.nextInt();
		System.out.println("Introduce el año que naciste");
		año_nacimiento = entrada.nextInt();

		//Calculos 
		edad = año_actual-año_nacimiento;

		//Sacar a pantalla
		System.out.println("Tu edad es " +edad +" años");
	}
}