package estudo;

import java.util.Scanner;

public class ex01lista {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		
		for (int i = 0; i < 4; i++) {
			
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			
			if (idade <= 15) {
				cont1++;
			} else {
				if (idade <= 30) {
					cont2++;
				} else {
					if (idade <= 45) {
						cont3++;
					} else {
						if (idade <= 60) {
							cont4++;
						} else {
							cont5++;
						}
					}
				}			
			}
			
			
		}
		
		System.out.println("Faixa etária 1: " + cont1);
		System.out.println("Faixa etária 2: " + cont2);
		System.out.println("Faixa etária 3: " + cont3);
		System.out.println("Faixa etária 4: " + cont4);
		System.out.println("Faixa etária 5: " + cont5);
	
		System.out.println("Porcentagem de pessoas na faixa etária 1: " + (cont1 * 100/4)+ "%");
		
	}
}