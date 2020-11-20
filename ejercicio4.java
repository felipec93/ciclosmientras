package tallerciclomientras;

import java.util.Scanner; 

public class ejercicio4 {
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

		int maximo;
		int num;
		
		int cont, valor = 0, suma = 0;

		System.out.println("Inserte el máximo de números: ");
		maximo = leer.nextInt();

		for (cont = 0; cont < maximo; cont++) {
			System.out.println("Inserte un número: ");
			num = leer.nextInt();
			valor = valor + num;

		}

		System.out.println("numero " + valor);

	}
}
