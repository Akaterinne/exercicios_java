package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat fM = new DecimalFormat("R$ ##0.00");

		String resp = "sim";
		int contador = 0, qtdItens = 0, cp = 0;
		double pe = 0, total = 0;

		// repetição compras
		while (resp.equalsIgnoreCase("sim")) {

			contador++;
			System.out.println(contador + "º COMPRA");
			
			//zerar variaveis 
			total = 0;
			qtdItens = 0;

			// itens da compra
			System.out.println("Digite o preço da etiqueta: ");
			pe = entrada.nextDouble();

			while (pe != 0) {
				
				total +=pe;
				qtdItens++;
				
				System.out.println("Digite o preço da etiqueta: ");
				pe = entrada.nextDouble();
			}
			
			System.out.println("Total da compra: " + fM.format(total));
			System.out.println("Qtd Itens: " + qtdItens);
			
			
			//forma de pagamento
			System.out.println("Digite a forma de pagamento: ");
			cp = entrada.nextInt();
			
			while(cp > 4) {
			
				System.out.println("Digite a forma de pagamento 1/2/3/4: ");
				cp = entrada.nextInt();
			}
			
			if(cp==1) {
				System.out.println("Valor final: " + fM.format(total * 0.9));
			} else if (cp == 2) {
				System.out.println("Valor final: " + fM.format(total * 0.95));
			}else if (cp == 3) {
				System.out.println("Valor final: " + fM.format(total/2));
			}else {
				System.out.println("Valor final: " + fM.format(total * 1.10/3));
			}
			

			System.out.println("Deseja cadastrar nova compra? ");
			resp = entrada.next();

		}

	}

}
