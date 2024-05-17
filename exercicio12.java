package fiap;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int codigoCliente = 0, codigoDvd = 0, locacao = 0, contLocacao = 0, contDvd = 0;
		char tipo = ' ', respLocacao = 'S', respDvd = 'S';
		double valorLocacao = 0, valorTotal = 0;

		while (respLocacao != 'N') {
			locacao++;
			System.out.println(locacao + "º Locação");
			
			valorTotal = 0;
			contDvd = 0;
			
			System.out.println("Digite o código do cliente: ");
			codigoCliente = entrada.nextInt();
			
			respDvd = 'S';

			while (respDvd != 'N') {
				contDvd++;
				System.out.println("Código DVD: ");
				codigoDvd = entrada.nextInt();

				while (!(codigoDvd >= 1) || !(codigoDvd <= 20)) {
					System.out.println("Digite corretamente o código do DVD: ");
					codigoDvd = entrada.nextInt();
				}

				System.out.println("Tipo DVD: ");
				tipo = entrada.next().charAt(0);
				tipo = Character.toUpperCase(tipo);

				while (!(tipo == 'A') && !(tipo == 'C') && !(tipo == 'D')) {
					System.out.println("Digite corretamente o tipo de DVD: ");
					tipo = entrada.next().charAt(0);
					tipo = Character.toUpperCase(tipo);
				}

				if ((codigoDvd >= 1) || (codigoDvd <= 10) && (tipo == 'A')) {
					valorLocacao = 8.00;
				} else {
					if ((codigoDvd >= 1) || (codigoDvd <= 10) && (tipo == 'C')) {
						valorLocacao = 12.00;
					} else {
						if ((codigoDvd >= 1) || (codigoDvd <= 10) && (tipo == 'D')) {
							valorLocacao = 10.00;
						} else {
							if ((codigoDvd >= 11) || (codigoDvd <= 20) && (tipo == 'A')) {
								valorLocacao = 5.00;
							} else {
								if ((codigoDvd >= 11) || (codigoDvd <= 20) && (tipo == 'C')) {
									valorLocacao = 7.00;
								} else {
									if ((codigoDvd >= 11) || (codigoDvd <= 20) && (tipo == 'D')) {
										valorLocacao = 9.00;
									}
								}
							}
						}
					}

				}
				
				valorTotal += valorLocacao;

				System.out.println("Cadastrar novo DVD: ");
				respDvd = entrada.next().charAt(0);
				respDvd = Character.toUpperCase(respDvd);
				

			} // while2
			
			System.out.println("Número da locação: " + locacao);
			System.out.println("Valor total das locações: " + valorTotal);
			System.out.println("Quantidade de DVD: " + contDvd);

			System.out.println("Cadastrar nova locação? ");
			respLocacao = entrada.next().charAt(0);
			respLocacao = Character.toUpperCase(respLocacao);
			
			


		} // while1
		
		
		
		
		
		System.out.println("Número de locações: " + locacao);
		System.out.println("Valor Total de locações: " + valorTotal);
		

	}
}
