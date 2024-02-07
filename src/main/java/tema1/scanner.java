package tema1;
//Cargamos la libreria para leer datos por teclado
import java.util.Scanner; 
public class scanner{
	public static void main (String [] args){
		//Iniciamos el uso de teclado
		Scanner t = new Scanner(System.in);
		System.out.println("Pulsa INTRO para continuar...");
		//Esperamos la entrada de teclado
		t.nextLine();
		System.out.println("Gracias por la espera");
	}
}