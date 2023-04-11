
/*26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
 * na tela uma das mensagens abaixo:
 * - O primeiro valor é o maior
 * - O segundo valor é o maior
 * - Não existe valor maior, os dois são iguais*/

import java.util.Scanner;

public class Exercicio26_ComparNumerosInteiros {

	public static void main(String[] args) {

		Scanner scNum1 = new Scanner(System.in);

		System.out.println("Digite o 1º número:");
		int num1 = scNum1.nextInt();

		Scanner scNum2 = new Scanner(System.in);

		System.out.println("Digite o 2º número:");
		int num2 = scNum2.nextInt();

		scNum1.close();
		scNum2.close();

		if (num1 > num2) {
			System.out.println("O primeiro valor é o maior (" + num1 + " > " + num2 + ")");
		} else if (num1 < num2) {
			System.out.println("O segundo valor é o maior (" + num1 + " < " + num2 + ")");
		} else {
			System.out.println("Não existe valor maior, os dois são iguais (" + num1 + " = " + num2 + ")");
		}

	}

}
