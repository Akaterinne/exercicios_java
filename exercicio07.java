package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat fP = new DecimalFormat("#%");
		
		int idade = 0, cont = 0, somaIdade = 0, contA = 0, contB = 0, contC = 0, contD = 0, contE = 0;
		char opiniao = ' ';
		
		System.out.println("Qual sua idade: ");	
		idade = entrada.nextInt();
		
		while(idade != 0){
		
			
		System.out.println("Opinião em relação ao filme: ");
		opiniao = entrada.next().charAt(0);
		opiniao = Character.toUpperCase(opiniao);
		
		while(!(opiniao == 'A') && !(opiniao == 'B') && !(opiniao == 'C') && !(opiniao == 'D') && !(opiniao == 'E')) {
			System.out.println("Digite novamente a opinião em relação ao filme: ");
			opiniao = entrada.next().charAt(0);
			opiniao = Character.toUpperCase(opiniao);
		}
		
	
		somaIdade += idade;
		cont++;
		
		switch (opiniao) {
		case 'A':
			contA++;
			break;
		case 'B':
			contB++;
			break;
		case 'C':
			contC++;
			break;
		case 'D':
			contD++;
			break;
		case 'E':
			contE++;
		}
		
			
		System.out.println("Qual sua idade: ");	
		idade = entrada.nextInt();	
		}
		 
		System.out.println("Quantidade de pessoas que respondeu a pesquisa: " + cont);
		System.out.println("Média de idade das pessoas: " + somaIdade/cont);
		System.out.println("Porcentagem da opiniao A: " + fP.format((double)contA /cont) + "%" );
		System.out.println("Porcentagem da opiniao A: " + fP.format((double)contB /cont) + "%" );
		System.out.println("Porcentagem da opiniao A: " + fP.format((double)contC /cont) + "%" );
		System.out.println("Porcentagem da opiniao A: " + fP.format((double)contD /cont) + "%" );
		System.out.println("Porcentagem da opiniao A: " + fP.format((double)contE /cont) + "%" );
	
	
	
	}

}
