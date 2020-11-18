package tallerciclomientras;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {

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
