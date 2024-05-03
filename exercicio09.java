package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat fM = new DecimalFormat("R$ ##0.00");

		double precoCar = 0, total = 0, perc = 3;

		System.out.print("Digite o preço do carro: ");
		precoCar = entrada.nextDouble();

		System.out.println("Preço do carro com desconto: " + fM.format(precoCar * 0.80));

		// parcelado
		for (int parcela = 6; parcela <= 60; parcela += 6) {

			total = precoCar + (precoCar * perc / 100);

			System.out.println("O preço final parcelado em " + parcela + "X é de " + fM.format(total) + " com parcelas de " + fM.format(total/parcela));

			perc += 3;
		}

	}

}
