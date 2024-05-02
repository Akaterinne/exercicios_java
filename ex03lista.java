package estudo;

import java.util.Scanner;

public class ex03lista {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int canal = 0, pessoas = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, totalPessoas = 0;

		do {
			System.out.print("Digite o canal: ");
			canal = entrada.nextInt();

			System.out.print("Digite o número de pessoas assistindo: ");
			pessoas = entrada.nextInt();

			switch (canal) {

			case 4:
				cont1++;
				cont1 = cont1 + pessoas;
				break;
			case 5:
				cont2++;
				cont2 = cont2 + pessoas;
				break;
			case 7:
				cont3++;
				cont3 = cont3 + pessoas;
				break;
			case 12:
				cont4++;
				cont4 = cont4 + pessoas;
				break;
			case 0:
				break;
			default:
				System.out.println("Opção inválida");
			}

			totalPessoas = totalPessoas + pessoas;
			
		} while (canal != 0);
		
		System.out.println("Canal 4: " + (cont1 * 100/totalPessoas) + "%");
		System.out.println("Canal 5: " + (cont2 * 100/totalPessoas) + "%");
		System.out.println("Canal 7: " + (cont3 * 100/totalPessoas) + "%");
		System.out.println("Canal 12: " + (cont4 * 100/totalPessoas) + "%");

	}
}
