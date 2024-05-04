package fiap;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int matricula = 0, aulasFrequentadas = 0;
		double nota1 = 0, nota2 = 0, nota3 = 0, notaFinal = 0, cont1 = 0, cont2 = 0, cont3 = 0;
		String situacao = " ";
		
		
		for (int i = 0; i < 2; i++) {
			
		System.out.println("Número da matricula: ");	
		matricula = entrada.nextInt();
		System.out.println("Primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.println("Segunda nota: ");
		nota2 = entrada.nextDouble();
		System.out.println("Terceira nota: ");
		nota3 = entrada.nextDouble();
		System.out.println("Número de aulas frequentadas: ");
		aulasFrequentadas = entrada.nextInt();
		
		
		notaFinal = (nota1 + nota2 + nota3) / 3;
		
		if (notaFinal >= 6 && aulasFrequentadas >= 40) {
			situacao = "aprovado";
			cont1++;
		} else {
			situacao = "reprovado";
			cont2++;
		}

		if (aulasFrequentadas < 40) {
			cont3++;
		}
		
		
		System.out.println("Aluno de matricula: " + matricula + " - Nota final: " + notaFinal + "- Situação: " + situacao);
		}
		
		System.out.println("Quantidade de alunos aprovados: " + cont1);
		System.out.println("Quantidade de alunos reprovados: " + cont2);
		System.out.println("Quantidade de alunos reprovados por frequência abaixo da mínima necessária: " + cont3);
		

	}

}
