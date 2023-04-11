
/*20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR.*/

import java.util.Scanner;

public class Exercicio20_ParOuImpar {

	public static void main(String[] args) {

		Scanner scNum = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
		int num = scNum.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " é PAR");
		} else {
			System.out.println(num + " é IMPAR");
		}

	}

}
