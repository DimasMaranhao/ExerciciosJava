
/*91) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
valores para um procedimento Maior() que vai verificar qual deles é o maior e
mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem
informando essa característica.*/

import java.util.Scanner;

public class Exercicio91_MetodoMaior {

	public static void main(String[] args) {

		Scanner scA = new Scanner(System.in);
		System.out.println("Digite o 1º valor:");
		int a = scA.nextInt();

		Scanner scB = new Scanner(System.in);
		System.out.println("Digite o 1º valor:");
		int b = scB.nextInt();

		maior(a, b);

		scA.close();
		scB.close();

	}

	static void maior(int a, int b) {
		if (a > b) {
			System.out.println("\n" + a + " > " + b);
		} else if (a < b) {
			System.out.println("\n" + a + " < " + b);
		} else {
			System.out.println("\n" + a + " = " + b);
		}
	}

}
