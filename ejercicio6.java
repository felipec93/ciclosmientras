package tallerciclomientras;

import java.util.Scanner; 

public class ejercicio6 {
public static void main(String[] args) {
	System.out.println(" 88888888888888888888888888888888888888888 ");
	System.out.println(" -  ___________________________________  +");
	System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -");
	System.out.println(" - |       FECHA: 19-noviembre-2020    | +");
	System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -");
	System.out.println(" - |              ID:   760728         | +");
	System.out.println(" + |___________________________________| -");
	System.out.println(" 88888888888888888888888888888888888888888");
	
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

