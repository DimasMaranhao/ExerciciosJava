
/*80) Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e
15 sorteados pelo computador. Depois disso, peça para o usuário digitar um
número (chave) e seu programa deve mostrar em que posições essa chave foi
encontrada. Mostre também quantas vezes a chave foi sorteada.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio80_EncontrarNumGeradoAleatoriamEmVetor {

	public static void main(String[] args) {

		int[] vetor = new int[30];
		int min = 1;
		int max = 15;
		int repeticoes = 0;

		ArrayList<Integer> iguais = new ArrayList<Integer>();

		Scanner scGuess = new Scanner(System.in);

		System.out.println("Digite um número inteiro entre 1 e 15 para tentarmos encontrá-lo no vetor:");
		int chute = scGuess.nextInt();

		Random rdNum = new Random();

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rdNum.nextInt(max - min) + min;
			if (vetor[i] == chute) {
				repeticoes++;
				iguais.add(i+1);
			}
		}

		System.out.println(Arrays.toString(vetor));
		System.out.print("O número " + chute + " foi repetido " + repeticoes + " vez(es), na(s) posiçõe(s) ");
		for (int aux : iguais) {
			System.out.print(aux + ", ");
		}


	}

}
