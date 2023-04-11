
/*17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
 * 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
 * o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio17_VelocDoCarro {

	public static void main(String[] args) {

		Scanner scVelocidade = new Scanner(System.in);

		System.out.println("Digite a velocidade do carro:");
		int velocidade = scVelocidade.nextInt();

		scVelocidade.close();

		int limite = 80;
		int multa = 5;
		int total;

		if (velocidade > limite) {
			total = (velocidade - limite) * multa;
			BigDecimal bdTotal = new BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN);
			System.out.println("Você ultrapassou o limite de velocidade de " + limite + "Km/h");
			System.out.println("Por isso, você deve pagar uma multa de R$" + bdTotal);
		}

	}

}
