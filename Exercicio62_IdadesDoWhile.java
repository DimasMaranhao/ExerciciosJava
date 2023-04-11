
/*62) Faça um programa usando a estrutura “faça enquanto” que leia a idade de
várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou
não continuar a digitar dados. No final, quando o usuário decidir parar, mostre
na tela:
a) Quantas idades foram digitadas
b) Qual é a média entre as idades digitadas
c) Quantas pessoas tem 21 anos ou mais.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio62_IdadesDoWhile {

	public static void main(String[] args) {

		Integer idade;
		int qtdIdades = 0;
		int somaIdades = 0;
		float media;
		int maisDe21 = 0;
		String decisao = null;
		ArrayList<Integer> vetorIdades = new ArrayList();

		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);

		do {
			System.out.println("Digite uma idade:");
			idade = scNum.nextInt();
			qtdIdades += 1;
			vetorIdades.add(idade);
			somaIdades += idade;

			if (idade >= 21) {
				maisDe21 += 1;
			}

			System.out.println("Deseja continuar?\n  [S]im\t[N]ão");
			decisao = scStr.next();
			System.out.print("\n");

		} while (decisao.equals("S") || (decisao.equals("s")));

		media = somaIdades / qtdIdades;

		scNum.close();
		scStr.close();

		System.out.println("Foram digitadas " + qtdIdades + " idades");
		System.out.println("Média das idades digitadas: " + media);
		System.out.println(maisDe21 + " pessoas têm mais de 21 anos");

	}

}
