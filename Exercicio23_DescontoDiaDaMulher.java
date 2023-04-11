
/*23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
 * para todos, mas especialmente para mulheres. Faça um programa que leia nome,
 * sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
 * que:
 * - Homens ganham 5% de desconto
 * - Mulheres ganham 13% de desconto*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio23_DescontoDiaDaMulher {

	public static void main(String[] args) {

		Scanner scNome = new Scanner(System.in);

		System.out.println("Digite o nome do cliente:");
		String nome = scNome.nextLine();

		Scanner scSexo = new Scanner(System.in);

		System.out.println("Digite o sexo do cliente:\n [H]omem\t[M]ulher");
		char sexo = scSexo.next().charAt(0);

		Scanner scValor = new Scanner(System.in);

		System.out.println("Digite o valor das compras:");
		double valor = scValor.nextDouble();

		double descMulher = 0.13;
		double descHomem = 0.05;

		double totalMulher = valor - (valor * descMulher);
		double totalHomem = valor - (valor * descHomem);

		BigDecimal bdTotalMulher = new BigDecimal(totalMulher).setScale(2, RoundingMode.HALF_DOWN);
		BigDecimal bdTotalHomem = new BigDecimal(totalHomem).setScale(2, RoundingMode.HALF_DOWN);

		scNome.close();
		scSexo.close();
		scValor.close();

		if ((sexo == 'H') || (sexo == 'h')) {
			System.out.println("Olá " + nome + ", o total de suas compras (com desconto) é de R$" + bdTotalHomem);
		}

		if ((sexo == 'M') || (sexo == 'm')) {
			System.out.println("Olá " + nome + ", o total de suas compras (com desconto) é de R$" + bdTotalMulher);
			System.out.println("\t   FELIZ DIA INTERNACIONAL DA MULHER!");
		}

	}
}
