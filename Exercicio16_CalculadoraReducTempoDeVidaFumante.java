
/*16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
 * fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
 * já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
 * quantos dias de vida um fumante perderá e exiba o total em dias.*/

import java.util.Scanner;

public class Exercicio16_CalculadoraReducTempoDeVidaFumante {

	public static void main(String[] args) {

		Scanner scQtdCigarros = new Scanner(System.in);

		System.out.println("Quantos cigarros você fuma por dia?");
		int qtdCigarros = scQtdCigarros.nextInt();

		Scanner scQtdAnos = new Scanner(System.in);

		System.out.println("Há quantos anos você fuma?");
		int qtdAnos = scQtdAnos.nextInt();

		scQtdCigarros.close();
		scQtdAnos.close();

		int minutosPorDia = 1440;
		int diasPorAno = 365;
		int minutosPerdidos = 10;

		int perdaDiaria = minutosPerdidos * qtdCigarros;
		int tempoPerdidoParcial = (perdaDiaria * diasPorAno) / minutosPorDia;
		int perdaTotal = tempoPerdidoParcial * qtdAnos;

		System.out.println("\n  Fumando " + qtdCigarros + " cigarros por dia, você perde " + tempoPerdidoParcial
				+ " dias de vida a cada ano!");
		System.out.println("Nesses "+ qtdAnos + " anos em que você fumou, você já perdeu " + perdaTotal + " dias de sua vida...");
		System.out.println("\t\t\tQuer perder mais?");

	}

}
