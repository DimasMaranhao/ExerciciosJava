
/*63) Crie um programa usando a estrutura “faça enquanto” que leia vários números.
A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
tela:
a) O somatório entre todos os valores
b) Qual foi o menor valor digitado
c) A média entre todos os valores
d) Quantos valores são pares*/

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio63_InfoNumComDoWhile {

	public static void main(String[] args) {

		int num;
		int qtdNum = 0;
		float soma = 0;
		int menorNum = 999999999;
		float media;
		int qtdPares = 0;
		String decisao = null;

		Scanner scStr = new Scanner(System.in);
		Scanner scNum = new Scanner(System.in);

		do {
			System.out.println("Digite um número inteiro:");
			num = scNum.nextInt();
			soma += num;
			qtdNum += 1;

			if (num < menorNum) {
				menorNum = num;
			}

			if (num % 2 == 0) {
				qtdPares += 1;
			}

			System.out.println("Deseja continuar?\n[S]im\t[N]ão");
			decisao = scStr.next();
			System.out.print("\n");

		} while (decisao.equals("S") || (decisao.equals("s")));
		
		media = soma / qtdNum;
		
		scNum.close();scStr.close();
		
		System.out.println("\n--------------------------------------------------");
		System.out.println("Somatório: " + soma);
		System.out.println("Menor número digitado: " + menorNum);
		System.out.println("Média: " + media);
		System.out.println("Quantidade de números pares digitados: " + qtdPares);
		
		
		
	}

}
