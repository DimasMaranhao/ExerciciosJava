
//48) Faça um programa que leia 7 números inteiros e no final mostre o somatório
//entre eles.

import java.util.Scanner;

import java.util.Optional;

public class Exercicio48_SomaDe7numIntDefinPeloUser {

	public static void main(String[] args) {

		Scanner scNum = new Scanner(System.in);
		int num;
		int soma = 0;

		int[] numeros = new int[7];
		

		for (int i = 0; i < 7; i++) {
			System.out.println("Digite um número inteiro:");
			num = scNum.nextInt();
			numeros[i] = num;
			soma += num;
		}

		scNum.close();

		System.out.print("O Resultado da soma de ");
		for (int val : numeros) {			//IMPRIMIR OS NUMEROS DO VETOR COM SINAL DE "+"
			System.out.print(val + " + ");
		}
		System.out.print(" = " + soma);

	}

}
