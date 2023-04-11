/* 4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.*/

import java.util.Scanner;

public class Exercicio4_SomaDeDoisNumeros {

	public static void main(String[] args) {
		Scanner scNum1 = new Scanner(System.in);

		System.out.println("Digite um valor:");
		int num1 = scNum1.nextInt();

		Scanner scNum2 = new Scanner(System.in);

		System.out.println("Digite outro valor:");
		int num2 = scNum2.nextInt();

		scNum1.close();
		scNum2.close();

		int soma = num1 + num2;

		System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + soma + ".");
	}

}
