
//49) Crie um programa que leia 6 números inteiros e no final mostre quantos deles
//são pares e quantos são ímpares.

import java.util.Scanner;

public class Exercicio49_NumDePareseImpares {

	public static void main(String[] args) {

		Scanner scNum = new Scanner(System.in);

		int pares = 0;
		int impares = 0;

		for (int i = 0; i < 6; i++) {
			System.out.println("Digite um número inteiro:");
			int num = scNum.nextInt();

			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("Foram digitados " + pares + " números pares");
		System.out.println("Foram digitados " + impares + " números ímpares");
		
	}

}
