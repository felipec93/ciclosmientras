package tallerciclomientras;

import java.util.Scanner; 

public class ejercicio5 {
public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);  
	
     int contador,primo,numero;

     System.out.print("Ingresa un numero: ");
     numero = leer.nextInt();

     contador = 0;

     for(primo = 1; primo <= numero; primo++)
     {
         if((numero % primo) == 0)
         {
             contador++;
         }
     }

     if(contador <= 2)
     {
         System.out.println(numero+ " si es numero primo");
     }else{
         System.out.println("El numero no es primo");
     }
}
}

