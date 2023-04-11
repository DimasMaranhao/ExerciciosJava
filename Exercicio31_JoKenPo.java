
/*31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)*/

import java.util.Scanner;

public class Exercicio31_JoKenPo {

	public static void main(String[] args) {

		Scanner scEscolha = new Scanner(System.in);

		System.out.println("\t   Faça sua escolha:\n[1] PEDRA\t[2] PAPEL\t[3] TESOURA\n");
		int escolha = scEscolha.nextInt();

		int min = 1;
		int max = 3;

		int randomJKP = (int) Math.floor(Math.random() * (max - min + 1) + min);

		String textoJKP;
		String textoEscolha;

		if (randomJKP == 1) {
			textoJKP = "PEDRA";
		} else if (randomJKP == 2) {
			textoJKP = "PAPEL";
		} else {
			textoJKP = "TESOURA";
		}

		if (escolha == 1) {
			textoEscolha = "PEDRA";
		} else if (escolha == 2) {
			textoEscolha = "PAPEL";
		} else {
			textoEscolha = "TESOURA";
		}

		if ((textoJKP == "PEDRA") && (textoEscolha == "PAPEL")) {
			System.out.println("\nComputador: " + textoJKP + " x Jogador: " + textoEscolha + "\n\tVencedor: JOGADOR");
		}

		if ((textoJKP == "PAPEL") && (textoEscolha == "PEDRA")) {
			System.out
					.println("\nComputador: " + textoJKP + " x Jogador: " + textoEscolha + "\n\tVencedor: COMPUTADOR");
		}

		if ((textoJKP == "PAPEL") && (textoEscolha == "TESOURA")) {
			System.out.println("\nComputador: " + textoJKP + " x Jogador: " + textoEscolha + "\n\tVencedor: JOGADOR");
		}

		if ((textoJKP == "TESOURA") && (textoEscolha == "PAPEL")) {
			System.out
					.println("\nComputador: " + textoJKP + " x Jogador: " + textoEscolha + "\n\tVencedor: COMPUTADOR");
		}

		if ((textoJKP == "TESOURA") && (textoEscolha == "PEDRA")) {
			System.out.println("\nComputador: " + textoJKP + " x Jogador: " + textoEscolha + "\n\tVencedor: JOGADOR");
		}

		if ((textoJKP == "PEDRA") && (textoEscolha == "TESOURA")) {
			System.out
					.println("\nComputador: " + textoJKP + " x Jogador: " + textoEscolha + "\n\tVencedor: COMPUTADOR");
		}

	}

}
