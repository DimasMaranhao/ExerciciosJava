
//54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
//no final:
//a) Qual foi a média de altura do grupo
//b) Quantas pessoas pesam mais de 90Kg
//c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
//d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio54_PesoeAlturaDe7PessoasComFiltros {

	public static void main(String[] args) {

		Scanner scPeso = new Scanner(System.in);

		Scanner scAltura = new Scanner(System.in);

		double alturaTotal = 0.0;
		@SuppressWarnings("unused")
		double alturaMedia = 0.0;
		int maisDe90 = 0;
		int pequenos = 0;
		int grandes = 0;

		for (int i = 0; i < 7; i++) {
			System.out.println("\nDigite o peso da " + (i + 1) + "ª pessoa: ");
			double peso = scPeso.nextDouble();
			System.out.println("Digite a altura da " + (i + 1) + "ª pessoa:");
			double altura = scAltura.nextDouble();

			alturaTotal += altura;

			if (peso > 90) {
				maisDe90++;
			}

			if ((peso < 50) && (altura < 1.6)) {
				pequenos++;
			}

			if ((peso > 90) && (altura > 1.9)) {
				grandes++;
			}
		}

		scPeso.close();
		scAltura.close();

		alturaMedia = alturaTotal / 7;

		BigDecimal bdAlturaMedia = new BigDecimal(alturaTotal).setScale(2, RoundingMode.HALF_EVEN);

		System.out.println("\nAltura média do grupo: " + bdAlturaMedia);
		System.out.println(maisDe90 + " pessoas estão acima de 90Kg");
		System.out.println(pequenos + " pessoas estão abaixo de 50Kg e abaixo de 1.60m");
		System.out.println(grandes + " pessoas estão acima de 90Kg e abaixo de 1.90m");

	}

}
