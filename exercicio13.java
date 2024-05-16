package treino_prova;

import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat fM = new DecimalFormat("R$ ###0.00");
		
		String nome = "", modelo = "";
		int tipo = 0, quantidade = 0, parcelas = 0, somaQuant = 0;
		double preco = 0, valorFinal = 0, somaPreco = 0, somaProduto = 0;
		char pagamento = ' ';

		
			System.out.println("Nome do cliente: ");
			nome = entrada.next();
			
			System.out.println("Tipo do computador: ");
			tipo = entrada.nextInt();
				
			while (tipo != 0) {
				
				while (!(tipo == 1) && !(tipo == 2)) {
					System.out.println("Digite corretamente o tipo do computador: ");
					tipo = entrada.nextInt();
				}
			
			
			System.out.println("Digite o modelo do computador: ");
			modelo = entrada.next();

			while (!modelo.equals("I3") && !modelo.equals("I5") && !modelo.equals("I7")) {
				System.out.println("Digite corretamente o modelo do computador: ");
				modelo = entrada.next();
			}
			
			System.out.println("Digite a quantidade de computadores: ");
			quantidade = entrada.nextInt();
			somaQuant += quantidade;
			
			if(tipo == 1 && modelo.equals("I3")) {
				preco = 1801;
			}else {
				if (tipo == 1 && modelo.equals("I5")) {
					preco = 2429;
				} else {
					if (tipo == 1 && modelo.equals("I7")) {
						preco = 3150;
					} else {
						if (tipo == 2 && modelo.equals("I3")) {
							preco = 1899;
						} else {
							if (tipo == 2 && modelo.equals("I5")) {
								preco = 2799;
							} else {
								if (tipo == 2 && modelo.equals("I7")) {
									preco = 3199;
								}
							}
						}
					}
				}
			}
			somaProduto = preco * quantidade;
			somaPreco += somaProduto;
			
			System.out.println("Tipo do computador: ");
			tipo = entrada.nextInt();
				
			
		}//while tipo
		
			System.out.println("Valor da compra: " + fM.format(somaPreco));
			System.out.println("Quantidade de itens da compra: " + somaQuant);
			
			System.out.println("Forma de pagamento: ");
			pagamento = entrada.next().charAt(0);
			pagamento = Character.toUpperCase(pagamento);
			
			while (pagamento != 'V' && pagamento != 'P') {
				System.out.println("Digite corretamente a forma de pagamento: ");
				pagamento = entrada.next().charAt(pagamento);
			}
			
			if (pagamento == 'V' && quantidade > 1) {
				valorFinal = somaPreco * 0.8;
			} else {
				if (pagamento == 'V' && quantidade == 1) {
					valorFinal = somaPreco * 0.9;
				} else {
					if (pagamento == 'P') {
						valorFinal = somaPreco * 1.1;
						System.out.println("Quantidade de parcelas: ");
						parcelas = entrada.nextInt();
					}
				}
			}
			
		System.out.println("Forma de pagamento: " + pagamento);
		System.out.println("Valor final da compra " + valorFinal);
			
	}

}
