
//52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
//a) Qual é a média de idade do grupo
//b) Quantas pessoas tem mais de 18 anos
//c) Quantas pessoas tem menos de 5 anos
//d) Qual foi a maior idade lida

import java.util.Scanner;

public class Exercicio52_InformacoesSobre10Idades {

	public static void main(String[] args) {

		Scanner scIdade = new Scanner(System.in);

		int vetorIdades[] = new int[10];

		int somaTotal = 0;
		int media = 0;
		int maioresDe18 = 0;
		int menoresDe5 = 0;
		int maior = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a idade: ");
			int idade = scIdade.nextInt();
			vetorIdades[i] = idade;
			somaTotal += idade;

			if (idade > 18) {
				maioresDe18++;
			}

			if (idade < 5) {
				menoresDe5++;
			}

			if (vetorIdades[i] > maior) {
				maior = vetorIdades[i];
			}
		}

		media = somaTotal / 10;
		
		scIdade.close();
		
		System.out.println("A média das idades inseridas é " + media + " anos");
		System.out.println(maioresDe18 + " pessoas têm mais de 18 anos");
		System.out.println(menoresDe5 + " pessoas têm menos de 5 anos");
		System.out.println("A maior idade lida é " + maior);

	}

}
