
//58) Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
//vai parar quando for digitada a idade 999. No final, mostre quantos alunos
//existem na turma e qual é a média de idade do grupo.

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exericio58_IdadesQuantDeAlunoseMedia {

	public static void main(String[] args) {

		Scanner scIdade = new Scanner(System.in);
		System.out.println("Digite sua idade ou '999' para sair:");

		int idade = scIdade.nextInt();
		double total = 0.0;
		double media = 0;
		int aux = 0;

		while (idade != 999) {
			total += idade;
			aux++;
			System.out.println("Digite sua idade ou '999' para sair:");
			idade = scIdade.nextInt();
		}

		media = total / aux;

		BigDecimal bdMedia = new BigDecimal(media).setScale(1, RoundingMode.HALF_EVEN);

		scIdade.close();

		System.out.println("\nExistem " + aux + " alunos na turma.");
		System.out.println("A média das idades inseridas é " + bdMedia + " anos.");

	}

}
