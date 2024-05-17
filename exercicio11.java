package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 DecimalFormat fM = new DecimalFormat("R$ ##0.00");
			
		 double valorInicial = 0, juros = 0, valorParc = 0, valorJuros = 0, total = 0;
		 int parcela = 0;
		 
		 System.out.println("Digite o valor da sua divida: ");
		 valorInicial = entrada.nextDouble();
		 
		 total = valorInicial;
		 parcela = 1;
		 valorParc = valorInicial;
		 
		 System.out.println("Total: " + total + " Juros: " + juros + " Número de parcelas: " + parcela + " Valor parcela: " + valorParc);
		
		 juros+=10;
		 parcela+=2;
		 
		 for (int i = 1; i < 5; i++) {
			 
			 valorJuros = (valorInicial * juros)/100;
			 total=valorInicial+valorJuros;
			 valorParc=total/parcela;
			 
			 System.out.println("Total: " + total + " Juros: " + juros + " Número de parcelas: " + parcela + " Valor parcela: " + fM.format(valorParc));
			 
			 juros+=5;
			 parcela+=3;
		 }
		
		
		
		
	}

}
