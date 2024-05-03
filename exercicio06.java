package fiap;

import java.util.Scanner;
import java.text.DecimalFormat;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		DecimalFormat fP = new DecimalFormat("#%");

		int criancas = 0, tempoVida = 0, periodo = 0, cont1 = 0, cont2 = 0, cont3 = 0;
		char sexo = ' ';

		System.out.print("Digite o número de crianças: ");
		criancas = entrada.nextInt();
	
		for (int i = 0; i < criancas; i++) {

			System.out.print("Digite o sexo da criança(M ou F): ");
			sexo = entrada.next().charAt(0);
			sexo = Character.toUpperCase(sexo);
			
			while(!(sexo == 'F') && !(sexo == 'M')) {
				System.out.print("Digite novamente o sexo da criança(M ou F): ");
				sexo = entrada.next().charAt(0);
				sexo = Character.toUpperCase(sexo);
			}

			System.out.print("Tempo de vida: ");
			tempoVida = entrada.nextInt();
			
			if (sexo == 'F') {
				cont1++;
			}
			
			if (sexo == 'M') {
				cont2++;
			}
			
			if (tempoVida <= 24) {
				cont3++;
			}

		}
		
		System.out.println("Porcentagem de crianças do sexo feminino mortas no periodo: " + fP.format((double)cont1/criancas) + "%");
		System.out.println("Porcentagem de crianças do sexo masculino mortas no periodo: " + fP.format((double)cont2 /criancas) + "%");
		System.out.println("Porcentagem de crianças que vivem 24 meses ou menos: " + (cont3 * 100/ criancas) + "%");
	}
	

}
