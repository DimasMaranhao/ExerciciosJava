
/*79) Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor.
No final, mostre quais são os números pares que foram digitados e em que
posições eles estão armazenados.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio79_NumerosParesePosicoesEmUmVetor {

	public static void main(String[] args) {

		int[] vetor = new int[10];
		ArrayList<Integer> pares = new ArrayList<Integer>();
		ArrayList<Integer> posicoes = new ArrayList<Integer>();

		Scanner scNum = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número inteiro:");
			vetor[i] = scNum.nextInt();
			if (vetor[i] % 2 == 0) {
				pares.add(vetor[i]);
			}
		}

		System.out.println(Arrays.toString(vetor));
		System.out.print("Números pares digitados: ");
		for (int aux : pares) {
			System.out.print(pares + ", ");
			break;
		}

		System.out.print("\nNas posições: ");
		for (int aux : pares) {
			System.out.print(aux + ", ");
		}

	}

}
