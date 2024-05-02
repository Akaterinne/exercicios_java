package estudo;

import java.util.Scanner;

public class ex04lista {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int idade = 0, cont1 = 0, cont2 = 0, somaIdade = 0, cont3 = 0, cont4 = 0;
		double peso = 0, altura = 0;
		char cabelo = ' ', olhos = ' ';

		for (int contador = 0; contador < 10; contador++) {

			System.out.print("Digite sua idade: ");
			idade = entrada.nextInt();
			System.out.print("Digite sua altura: ");
			altura = entrada.nextDouble();
			System.out.print("Digite seu peso: ");
			peso = entrada.nextDouble();

			do {
				System.out.print("Digite a cor dos seus olhos: ");
				olhos = entrada.next().charAt(0);
			} while (olhos != 'A' && olhos != 'P' && olhos != 'V' && olhos != 'C');

			do {
				System.out.print("Digite a cor dos seus cabelos: ");
				cabelo = entrada.next().charAt(0);
			} while (cabelo != 'P' && cabelo != 'C' && cabelo != 'L' && cabelo != 'R');

			if (idade > 50 && peso < 60) {
				cont1++;
			}

			if (altura < 1.5) {
				cont2++;
				somaIdade += idade;
			}

			if (olhos == 'A') {
				cont3++;
			}

			if (cabelo == 'R' && olhos != 'A') {
				cont4++;
			}

		}

		System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: " + cont1);
		System.out.println("Média das idades das pessoas com altura inferior a 1,5: " + somaIdade / cont2);
		System.out.println("Porcentagem de pessoas com olhos azuis: " + cont3 * 100 / 10 + "%");
		System.out.println("Pessoas ruivas e que não possuem olhos azuis: " + cont4);

	}
}