
/*69) [DESAFIO] Desenvolva um programa que leia o primeiro termo e a razão de uma
PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e
a soma entre todos os valores da sequência.*/

import java.util.Scanner;

public class Exercicio69_SomaDos10PrimeirosTermosDeUmaPA {

	public static void main(String[] args) {

		Scanner scPrimTermo = new Scanner(System.in);
		Scanner scRazao = new Scanner(System.in);

		double soma = 0;

		System.out.println("Digite o 1º termo da P.A.:");
		double primTermo = scPrimTermo.nextDouble();
		System.out.println("Digite a razão da P.A.:");
		double razao = scRazao.nextDouble();

		System.out.print("S₁₀ = ");
		
		for (double i = primTermo; i <= (primTermo + (10 - 1) * razao); i += razao) {
			System.out.print(i + ", ");
			soma += i;
		}

		System.out.println("\nA soma dos 10 primeiros termos da P.A. é igual a " + soma);
	}

}
