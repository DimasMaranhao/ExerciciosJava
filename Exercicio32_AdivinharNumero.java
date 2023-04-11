import java.util.Random;
import java.util.Scanner;

public class Exercicio32_AdivinharNumero {

	public static void main(String[] args) {

		System.out.println("O jogo consiste em adivinhar um número gerado aleatoriamente de 1 a 5.");
		System.out.println("Você terá até 3 chances para adivinhar.");
		System.out.println("Vamos jogar?\n");

		int min = 1;
		int max = 5;
		int tentativas = 3;

		Random randNum = new Random();
		int numero = randNum.nextInt(max - min) + min;

		Scanner scEntrada = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 5:");
		int entrada = scEntrada.nextInt();

		for (int i = 0; i < 3; i++) {
			tentativas--;

			if (i == 2) {
				System.out.println("GAME OVER");
				System.out.println("O número era " + numero);
				break;
			}

			if (entrada != numero) {
				System.out.println("Você errou. Tentativas restantes: " + tentativas);
				entrada = scEntrada.nextInt();
			}

			if (entrada == numero) {
				System.out.println("PARABÉNS, VOCÊ CONSEGUIU!!!");
				break;
			}
		}

		scEntrada.close();

	}

}
