package tallerciclomientras;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		System.out.println(" 88888888888888888888888888888888888888888 ");
		System.out.println(" -  ___________________________________  +");
		System.out.println(" + | AUTOR:ANDRES FELIPE BOTINA        | -");
		System.out.println(" - |       FECHA: 19-noviembre-2020    | +");
		System.out.println(" + |       PROGRAMA DE ING. INDUSTRIAL | -");
		System.out.println(" - |              ID:   760728         | +");
		System.out.println(" + |___________________________________| -");
		System.out.println(" 88888888888888888888888888888888888888888");

		int num, i;
		Scanner leer = new Scanner(System.in);

		String palabra;
		String palabrainvertida = "";
		System.out.println("Ingresa una palabra y se mostrara a la inversa:\n");
		palabra = leer.nextLine();

		for (i = palabra.length() - 1; i >= 0; i--) {
			palabrainvertida += palabra.charAt(i);
		}

		System.out.println("La palabra invertida es:\n" + palabrainvertida);

	}

}
