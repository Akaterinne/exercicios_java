package treino_prova;

import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio09 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat fM = new DecimalFormat("R$ ###0.00");
		
		double valor = 0, total = 0, percentual = 3;
		
		System.out.println("Digite o valor do carro: ");
		valor = entrada.nextDouble();
		
		System.out.println("O preço final a vista com desconto 20% é: " + fM.format(valor * 0.80));
	
		//parcelado
		
		for (int parcela = 6; parcela <=60; parcela+=6) {
			
			total = valor + (valor * percentual / 100);
			
			System.out.println("O preço final parcelado em " + parcela + " X é de " + fM.format(total) + " com parcelas de " + fM.format(total / parcela) );
			
			percentual+=3;
		}
	
	
	
	}
}
