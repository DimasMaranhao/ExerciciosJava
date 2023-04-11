
/*9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio9_CalculadoraDolares {

	public static void main(String[] args) {

		Scanner scReais = new Scanner(System.in);

		System.out.println("Digite quanto você tem (em reais) para calcularmos quantos dólares você pode comprar:");
		double reais = scReais.nextDouble();

		scReais.close();

		double cotacaoDolar = 3.45;
		double dolares = reais / cotacaoDolar;

		BigDecimal bdDolar = new BigDecimal(dolares).setScale(2, RoundingMode.HALF_EVEN);

		System.out.println("Você pode comprar U$" + bdDolar);

	}

}
