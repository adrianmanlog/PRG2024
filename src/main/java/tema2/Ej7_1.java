package tema2;
//Modificar el ejercicio anterior para que ahora se pidan tres notas enteras y también se muestre la media de las tres.
import java.util.*;
public class Ej7_1{
	public static void main (String [] args){
	
	//Declarar variables
	Scanner entrada = new Scanner(System.in);
	byte nota1, nota2, nota3;
	float resultado;

	//Pide las notas
	System.out.println("Dime la nota 1");
	nota1 = entrada.nextByte();
	System.out.println("Dime la nota 2");
	nota2 = entrada.nextByte();
	System.out.println("Dime la nota 3");
	nota3 = entrada.nextByte();
	
	//Calcular
	resultado = (float)(nota1+nota2+nota3)/3;

	//Resultado
	System.out.println("La nota media es " + resultado);
	}
}