/*70) [DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência
de Fibonacci:
		1 1 2 3 5 8 13 21...*/

public class Exercicio70_SomaDosDezPrimeirosTermosDeFibonacci {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 0;
		int soma = 0;

		System.out.print(num1 + " ");

		for (int i = 0; i < 9; i++) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			soma += num1;
			System.out.print(num1 + " ");
		}

		System.out.println("\nSoma = " + (soma + 1));

	}

}
