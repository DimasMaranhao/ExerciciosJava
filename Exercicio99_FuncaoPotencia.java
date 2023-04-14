
/*99) Faça um programa que possua uma função chamada Potencia(), que vai receber
dois parâmetros numéricos (base e expoente) e vai calcular o resultado da
exponenciação.
Ex: Potencia(5,2) vai calcular 52 = 25*/

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio99_FuncaoPotencia {

	public static void main(String[] args) {

		Scanner scBase = new Scanner(System.in);
		System.out.println("Digite o número que será a base:");
		int base = scBase.nextInt();
		Scanner scExpoente = new Scanner(System.in);
		System.out.println("Digite o número que será o expoente:");
		int expoente = scExpoente.nextInt();

		System.out.println("Resultado = " + potencia(base, expoente));

		scBase.close();
		scExpoente.close();

	}

	static int potencia(int base, int expoente) {
		return (int) Math.pow(base, expoente);
	}

}
