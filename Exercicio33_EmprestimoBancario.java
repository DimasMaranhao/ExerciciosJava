
/*33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra
 * de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
 * em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
 * ela não pode exceder 30% do salário ou então o empréstimo será negado.*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio33_EmprestimoBancario {

	public static void main(String[] args) {

		Scanner scValorCasa = new Scanner(System.in);
		System.out.println("Digite o valor do imóvel:");
		double valorCasa = scValorCasa.nextDouble();

		Scanner scSalario = new Scanner(System.in);
		System.out.println("Digite o salário do proponente:");
		double salario = scSalario.nextDouble();

		Scanner scTempo = new Scanner(System.in);
		System.out.println("Digite em quantos anos o proponente pretende financiar o imóvel:");
		int tempo = scTempo.nextInt();

		double limiteCredito = salario * 0.3;
		double prestacaoMensal = valorCasa / (tempo * 12);

		BigDecimal bdPrestacaoMensal = new BigDecimal(prestacaoMensal).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bdLimiteCredito = new BigDecimal(limiteCredito).setScale(2, RoundingMode.HALF_EVEN);

		// System.out.println(bdPrestacaoMensal);

		if (prestacaoMensal > limiteCredito) {
			System.out.println("\nLimite de crédito: R$" + bdLimiteCredito);
			System.out.println("Valor da prestação mensal: R$" + bdPrestacaoMensal);
			System.out.println("Limite de crédito insuficiente. Finaciamento NEGADO.");
		} else {
			System.out.println("\nLimite de crédito: R$" + bdLimiteCredito);
			System.out.println("Valor da prestação mensal: R$" + bdPrestacaoMensal);
			System.out.println("Financiamento APROVADO.");
		}

		scValorCasa.close();
		scSalario.close();
		scTempo.close();

	}

}
