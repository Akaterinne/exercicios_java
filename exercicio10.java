package treino_prova;

import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat fM = new DecimalFormat("R$ ###0.00");
		
		double preco = 0, valorFinal = 0, somaPreco = 0;
		int pagamento = 0;
		String resp ="sim";
		
		
		while (resp.equalsIgnoreCase("sim")) {
		
		System.out.println("Digite o preço da etiqueta: ");
		preco = entrada.nextDouble();
		somaPreco += preco;
	
		
		System.out.println("Deseja inserir nova compra? ");
		resp = entrada.next();
		}
		
		System.out.println("Digite o código de pagamento: ");
		pagamento = entrada.nextInt();
		
		
		while (pagamento != 1 && pagamento != 2 && pagamento != 3 && pagamento != 4) {
			System.out.println("Digite corretamente o código de pagamento do produto: ");
			pagamento = entrada.nextInt();
		}
			if (pagamento == 1) {
				valorFinal = somaPreco * 0.9;
			}else {
				if (pagamento == 2) {
					valorFinal = somaPreco * 0.95;
				} else {
					if (pagamento == 3) {
						valorFinal = somaPreco;
					}else {
						if(pagamento == 4) {
						valorFinal = somaPreco * 1.1;
						}
					}
				}
			}
		
		System.out.println("Valor Final das compras:" + fM.format(valorFinal));
	}

}
