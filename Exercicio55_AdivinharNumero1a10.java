
//Crie um jogo onde o computador vai sortear um número entre 1 e 10 o
//jogador vai tentar descobrir qual foi o valor sorteado
//e o jogador vai ter 4 tentativas para tentar acertar.

import java.util.Random;
import java.util.Scanner;

public class Exercicio55_AdivinharNumero1a10 {

	public static void main(String[] args) {

		System.out.println("O jogo consiste em adivinhar um número gerado aleatoriamente de 1 a 10.");
		System.out.println("Você terá até 4 chances para adivinhar.");
		System.out.println("Vamos jogar?\n");
		
		int max = 10;
		int min = 1;
		int tentativas = 4;

		Random randNum = new Random();

		int numero = randNum.nextInt(max - min) + min;
		
		Scanner scChute = new Scanner(System.in);
		
		System.out.println(numero);
		
		
		for (int i = 0; i < 4; i++) {
			System.out.println("\nDigite um número de 1 a 10:");
			int chute = scChute.nextInt();
			tentativas--;
			
			if (chute == numero) {
				System.out.println("Parabéns, você conseguiu!");
				break;
			} else if (tentativas >= 1) {
				System.out.println("Você errou.");
				System.out.println("Você tem mais " + tentativas + " tentativas");
			} else {
				System.out.println("GAME OVER");
				System.out.println("O número era " + numero);
			}
		}
	}

}
