/*94) [DESAFIO] Desenvolva um aplicativo que tenha um procedimento chamado
Fibonacci() que recebe um único valor inteiro como parâmetro, indicando quantos
termos da sequência serão mostrados na tela. O seu procedimento deve receber
esse valor e mostrar a quantidade de elementos solicitados.
Obs: Use os exercícios 70 e 75 para te ajudar na solução
Ex:
Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM*/

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio95_MetodoFibonacci {

	public static void main(String[] args) {

		Scanner scNum = new Scanner(System.in);
		System.out.println("Digite um número para exibirmos a sequência de Fibonacci até este mesmo número:");
		int num = scNum.nextInt();

		fibonnaci(num);

		scNum.close();

	}

	static void fibonnaci(int num) {
		int num1 = 0;
		int num2 = 1;

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for (int i = 1; i <= num; i++) {

			num1 = num1 + num2;
			num2 = num1 - num2;
			numeros.add(num1);
		}

		for (int k : numeros) {
			System.out.print(k + " >> ");
		}

		System.out.println("FIM");
	}

}
