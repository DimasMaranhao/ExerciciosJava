
//56) Crie um programa que leia vários números pelo teclado e mostre no final o
//somatório entre eles.
//Obs: O programa será interrompido quando o número 1111 for digitado

import java.util.Scanner;

public class Exercicio56_SomaAteQue1111sejaDigitado {

	public static void main(String[] args) {

		Scanner scNum = new Scanner(System.in);
		System.out.println("Realizarmos a soma de todos os números inseridos por você.");
		System.out.println("O programa se encerrará quando você digitar '1111'.");
		System.out.println("Digite um número:");

		int num = scNum.nextInt();
		int somaTotal = 0;

		while (num != 1111) {
			somaTotal += num;
			System.out.println("Digite um número:");
			num = scNum.nextInt();
		}
		
		scNum.close();
		System.out.println("\nA soma total dos números inseridos é igual a " + somaTotal);

	}

}
