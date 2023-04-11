
/*78) Escreva um programa que leia 15 números e guarde-os em um vetor. No final,
mostre o vetor inteiro na tela e em seguida mostre em que posições foram
digitados valores que são múltiplos de 10.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio78_MostarVetorePosiaoDosMultiplDe10 {

	public static void main(String[] args) {

		int[] vetor = new int[15];
		ArrayList<Integer> multiplosDe10 = new ArrayList<Integer>();

		Scanner scNum = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número inteiro:");
			vetor[i] = scNum.nextInt();
			if (vetor[i] % 10 == 0) {
				multiplosDe10.add(i);
			}
		}

		System.out.println(Arrays.toString(vetor));
		System.out.print("Foram digitados múltiplos de 10 na ");
		for (int aux : multiplosDe10) {
			System.out.print((aux + 1) + "ª, ");
		}
		System.out.print(" posição.");

		scNum.close();
	}

}
