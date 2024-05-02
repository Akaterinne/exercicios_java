package estudo;

import java.util.Scanner;

public class ex05lista {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero = 0, maior = 0, menor = 0;

		for (int contador = 0; contador < 10; contador++) {

			System.out.print("Digite um número: ");
			numero = entrada.nextInt();

			if (numero > maior) {
				maior = numero;
			}

			if (contador == 0) {
				menor = numero;
			} else {
				if (numero < menor) {
					menor = numero;
				}

			}
		}
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
	}
}
