
/*84) Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses
valores em dois vetores, em posições relacionadas. No final, mostre uma listagem
contendo apenas os dados das pessoas menores de idade.*/

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio85_NomeseIdadesEmDoisVetores {

	public static void main(String[] args) {

		int[] idades = new int[9];
		String[] nomes = new String[9];

		Scanner scNome = new Scanner(System.in);
		Scanner scIdade = new Scanner(System.in);

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite o nome da " + (i + 1) + "ª pessoa:");
			nomes[i] = scNome.next();
			System.out.println("Digite a idade da " + (i + 1) + "ª pessoa:");
			idades[i] = scIdade.nextInt();
		}

		for (int i = 0; i < idades.length; i++) {
			if (idades[i] < 18) {
				System.out.println("\n\n" + nomes[i] + "\t\t" + idades[i] + " anos");

			}
		}

		scNome.close();
		scIdade.close();
	}

}
