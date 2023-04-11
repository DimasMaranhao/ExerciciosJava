
/*6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10*/

import java.util.Scanner;

public class Exercicio6_AntecessorSucessor {

	public static void main(String[] args) {

		Scanner scNum = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero = scNum.nextInt();

		scNum.close();

		int antecessor = numero - 1;
		int sucessor = numero + 1;

		System.out.println("O antecessor de " + numero + " é " + antecessor);
		System.out.println("O suvessor de " + numero + " é " + sucessor);

	}

}
