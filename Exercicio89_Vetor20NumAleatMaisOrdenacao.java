
/*83) [DESAFIO] Crie uma lógica que preencha um vetor de 20 posições com números
aleatórios (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os
números gerados e depois coloque o vetor em ordem crescente, mostrando no final
os valores ordenados.*/

import java.util.Arrays;
import java.util.Random;

public class Exercicio89_Vetor20NumAleatMaisOrdenacao {

	public static void main(String[] args) {

		int[] numeros = new int[20];

		int max = 99;
		int min = 0;

		Random rd = new Random();

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rd.nextInt(max - min) + min;

		}

		System.out.print("Números gerados alatoriam.: ");
		for (int aux : numeros) {
			System.out.print(aux + ", ");
		}

		Arrays.sort(numeros);

		System.out.print("\nNúmeros em ordem crescente: ");
		for (int aux : numeros) {
			System.out.print(aux + ", ");
		}

	}

}
