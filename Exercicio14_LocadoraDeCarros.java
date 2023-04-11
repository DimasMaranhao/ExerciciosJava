
/*14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
 * um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
 * quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
 * sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio14_LocadoraDeCarros {

	public static void main(String[] args) {

		Scanner scKm = new Scanner(System.in);

		System.out.println("Digite a quantidade de Km percorridos:");
		double quilometragem = scKm.nextDouble();

		Scanner scDias = new Scanner(System.in);
		
		System.out.println("Digite por quantos dias o carro ficou alugado:");
		int dias = scDias.nextInt();

		double custoDiario = 90.0;
		double custoKm = 0.20;

		double custoTotalDias = dias * custoDiario;
		double custoTotalKm = quilometragem * custoKm;
		double totalGeral = custoTotalDias + custoTotalKm;

		BigDecimal bdTotalGeral = new BigDecimal(totalGeral).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bdTotalDias = new BigDecimal(custoTotalDias).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bdCustoTotalKm = new BigDecimal(custoTotalKm).setScale(2, RoundingMode.HALF_EVEN);
		
		scDias.close();
		scKm.close();

		System.out.println("\tCusto do aluguel diário: R$" + bdTotalDias);
		System.out.println("+\tCusto da quilometragem:  R$" + bdCustoTotalKm);
		System.out.println("------------------------------------------");
		System.out.println("\tO valor total a pagar é R$" + bdTotalGeral);

	}

}
