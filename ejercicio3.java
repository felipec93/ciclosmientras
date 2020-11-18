package tallerciclomientras;

import java.util.Scanner; 

public class ejercicio3 {
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in); 

		int N, aux, inverso = 0, cifra;
		do {
			System.out.print("Digite mas de un digito para saber si es capicúa ");
			N = leer.nextInt();
		} while (N < 10);

		aux = N;
		while (aux != 0) {
			cifra = aux % 10;
			inverso = inverso * 10 + cifra;
			aux = aux / 10;
		}

		if (N == inverso) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}
	}
}
