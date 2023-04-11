
/*36) Um programa de vida saudável quer dar pontos atividades físicas que podem
 * ser trocados por dinheiro. O sistema funciona assim:
 * - Cada hora de atividade física no mês vale pontos
 * - até 10h de atividade no mês: ganha 2 pontos por hora
 * - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
 * - acima de 20h de atividade no mês: ganha 10 pontos por hora
 * - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
 * Faça um programa que leia quantas horas de atividade uma pessoa teve por mês,
 * calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio36_VidaSaudavel {

	public static void main(String[] args) {

		Scanner scHoras = new Scanner(System.in);
		System.out.println("Digite quantas horas de atividade física você fez nesse mês:");
		int horas = scHoras.nextInt();

		int ate10 = 2;
		int de10a20 = 5;
		int maisDe20 = 10;

		double cash = 0.05;

		int totalPontos;
		double totalDinheiro;

		if (horas < 10) {
			totalPontos = horas * ate10;
			totalDinheiro = totalPontos * cash;
			BigDecimal bdTotalDinheiro = new BigDecimal(totalDinheiro).setScale(2, RoundingMode.HALF_EVEN);
			System.out.println("\nTotal de pontos ganhos: " + totalPontos);
			System.out.println("Total ganho: R$" + bdTotalDinheiro);
		} else if ((horas >= 10) && (horas < 20)) {
			totalPontos = horas * de10a20;
			totalDinheiro = totalPontos * cash;
			BigDecimal bdTotalDinheiro = new BigDecimal(totalDinheiro).setScale(2, RoundingMode.HALF_EVEN);
			System.out.println("\nTotal de pontos ganhos: " + totalPontos);
			System.out.println("Total ganho: R$" + bdTotalDinheiro);
		} else {
			totalPontos = horas * maisDe20;
			totalDinheiro = totalPontos * cash;
			BigDecimal bdTotalDinheiro = new BigDecimal(totalDinheiro).setScale(2, RoundingMode.HALF_EVEN);
			System.out.println("\nTotal de pontos ganhos: " + totalPontos);
			System.out.println("Total ganho: R$" + bdTotalDinheiro);
		}

	}

}
