
/*12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio12_PrecoPromocional {

	public static void main(String[] args) {

		Scanner scPreco = new Scanner(System.in);

		System.out.println("Digite o preço do produto:");
		double preco = scPreco.nextDouble();

		double desconto = 0.05;
		double precoDescontado = preco - (preco * desconto);

		BigDecimal bdPrecoDescontado = new BigDecimal(precoDescontado).setScale(2, RoundingMode.HALF_EVEN);
		scPreco.close();

		System.out.println("Preço original: R$" + preco);
		System.out.println("Preço com desconto: R$" + bdPrecoDescontado);

	}

}
