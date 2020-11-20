package tallerciclomientras;

import java.util.Scanner;

public class ejercicio2 {
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

		int entero, residuo, suma, valor, numero;
		entero = 1;
		residuo = 1;
		valor = 0;
		suma = 0;

		System.out.println("Ingrese numero: ");
		numero = leer.nextInt();

		while (entero > 0) {
			residuo = numero % 10;
			entero = numero / 10;
			numero = entero;
			suma = residuo + valor;
			valor = suma;
		}

		System.out.println(" la suma de los numeros es  " + suma);

	}

}
