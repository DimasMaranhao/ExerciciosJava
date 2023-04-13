
/*90) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
valores para um procedimento Somador() que vai calcular e mostrar a soma entre
eles.*/

import java.util.Scanner;

public class Exercicio90_MetodoSomarDoisValores {

	public static void main(String[] args) {

		Scanner scA = new Scanner(System.in);
		System.out.println("Digite o 1º valor:");
		int a = scA.nextInt();
		Scanner scB = new Scanner(System.in);
		System.out.println("Digite o 2º valor:");
		int b = scB.nextInt();

		somar(a, b);

		scA.close();
		scB.close();
	}

	static void somar(int a, int b) {
		int soma = a + b;
		System.out.println("\n" + a + " + " + b + " = " + soma);
	}

}
