
//51) Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
//qual foi o maior e qual foi o menor preço digitados.

import java.util.Scanner;

public class Exercicio51_MaioreMenorPrecoDe8Produtos {

	public static void main(String[] args) {

		Scanner scPreco = new Scanner(System.in);

		double vetorPrecos[] = new double[8];

		double menor = 999999999999999999999999999.99;
		double maior = 0.0;

		for (int i = 0; i < 8; i++) {
			System.out.println("Digite o preço do produto:");
			double preco = scPreco.nextDouble();
			vetorPrecos[i] = preco;

			if (vetorPrecos[i] < menor) {
				menor = vetorPrecos[i];
			} else if (vetorPrecos[i] > maior) {
				maior = vetorPrecos[i];
			}
			
		}
		
		scPreco.close();
		
		System.out.println("Menor preço: R$" + menor);
		System.out.println("Maior preço: R$" + maior);
		
	}

}
