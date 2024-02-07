package tema2;
//Necesitamos una aplicación que calcule la media aritmética de dos notas enteras. Realiza un ejercicio en Java que solvente dicho problema. Hay que tener en cuenta que la media puede contener decimales.
import java.util.*;
public class Ej6{
	public static void main (String [] args){
	
	//Declarar variables
	Scanner entrada = new Scanner(System.in);
	byte nota1, nota2;
	float resultado;

	//Pide las notas
	System.out.println("Dime la nota 1");
	nota1 = entrada.nextByte();
	System.out.println("Dime la nota 2");
	nota2 = entrada.nextByte();
	
	//Calcular
	resultado = (float)(nota1+nota2)/2;

	//Resultado
	System.out.println("La nota media es " + resultado);
	}
}