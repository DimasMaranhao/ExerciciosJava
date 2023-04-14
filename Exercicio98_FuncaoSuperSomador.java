
/*98) Crie um programa que tenha uma função SuperSomador(), que vai receber dois
números como parâmetro e depois vai retornar a soma de todos os valores no
intervalo entre os valores recebidos.
Ex:
SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar 85*/

import java.util.Scanner;

public class Exercicio98_FuncaoSuperSomador {

	public static void main(String[] args) {

		Scanner scInicio = new Scanner(System.in);
		System.out.println("Digite o número de onde iniciaremos nossa soma:");
		int inicio = scInicio.nextInt();
		Scanner scFim = new Scanner(System.in);
		System.out.println("Digite o número onde nossa soma deve parar:");
		int fim = scFim.nextInt();

		System.out.println(
				"A soma de todos os números entre " + inicio + " e " + fim + " é igual a " + superSomador(inicio, fim));

		scInicio.close();
		scFim.close();

	}

	static int superSomador(int inicio, int fim) {
		int total = 0;
		for (int i = inicio; i <= fim; i++) {
			total += i;
		}
		return total;

	}
}
