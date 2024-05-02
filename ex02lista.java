package estudo;

import java.util.Scanner;

public class ex02lista {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int voto = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, contador = 0;

		do {
			System.out.print("Digite seu voto: ");
			voto = entrada.nextInt();


			switch (voto) {
			case 1:
				cont1++;
				break;
			case 2:
				cont2++;
				break;
			case 3:
				cont3++;
				break;
			case 4:
				cont4++;
				break;
			case 5:
				cont5++;
				break;
			case 6:
				cont6++;
				break;
			case 0:
				break;
			default:
				System.out.println("Opção inválida");
			}

			contador = cont1 + cont2 + cont3 + cont4 + cont5 + cont6;

		} while (voto != 0);

		System.out.println("Votos Candidato 1: " + cont1);
		System.out.println("Votos Candidato 2: " + cont2);
		System.out.println("Votos Candidato 3: " + cont3);
		System.out.println("Votos Candidato 4: " + cont4);
		System.out.println("Total votos nulos: " + cont5);
		System.out.println("Total votos em branco: " + cont6);
		System.out.println("Porcentaem de votos nulos: " + (cont5 * 100 / contador));
		System.out.println("Porcentaem de votos em branco: " + (cont6 * 100 / contador));

	}
}