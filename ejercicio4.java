package tallerciclomientras;

import java.util.Scanner; 

public class ejercicio4 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); 

		int maximo;
		int num;
		int mayor;
		int cont, valor = 0, suma = 0;

		System.out.println("Inserte el m�ximo de n�meros: ");
		maximo = leer.nextInt();

		for (cont = 0; cont < maximo; cont++) {
			System.out.println("Inserte un n�mero: ");
			num = leer.nextInt();
			valor = valor + num;

		}

		System.out.println("numero " + valor);

	}
}
