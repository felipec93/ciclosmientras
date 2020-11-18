package tallerciclomientras;

import java.util.Scanner;

public class ejercicio2 {
public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);  
		
		int entero,residuo, suma, valor, numero;
		entero = 1;
		residuo=1;
		valor=0;
		suma=0;
		
		 System.out.println("Ingrese numero: ");
	     numero = leer.nextInt();
	     
	     while (entero > 0)
	     {
	    	 residuo = numero % 10;
	    	 entero = numero/10;
	    	 numero = entero;
	    	 suma = residuo + valor;
	    	 valor = suma;
	     }
		
		System.out.println(" la suma de los numeros es  " + suma);
		
	}
	
}


