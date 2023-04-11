
/*29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
 * quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
 * acordo com a tabela a seguir:
 * - Até 3 anos de empresa: aumento de 3%
 * - entre 3 e 10 anos: aumento de 12.5%
 * - 10 anos ou mais: aumento de 20%*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio29_ReajusteSalarial {

	public static void main(String[] args) {

		Scanner scNome = new Scanner(System.in);
		System.out.println("Digite o nome do funcionário:");
		String nome = scNome.nextLine();

		Scanner scSalarioAtual = new Scanner(System.in);
		System.out.println("Digite o salário atual do funcionário " + nome + ":");
		double salarioAtual = scSalarioAtual.nextDouble();

		Scanner scAnos = new Scanner(System.in);
		System.out.println("Digite há quantos anos o funcionário " + nome + " trabalha na empresa:");
		int anos = scAnos.nextInt();

		scNome.close();
		scSalarioAtual.close();
		scAnos.close();

		double reajAte3 = 0.03;
		double reajEntre3e10 = 0.125;
		double reajMaisDe10 = 0.2;
		double salarioReajustado;

		if (anos < 3) {
			salarioReajustado = salarioAtual + (salarioAtual * reajAte3);
			BigDecimal bdSalarioReajustado = new BigDecimal(salarioReajustado).setScale(2, RoundingMode.HALF_DOWN);
			System.out.println("O salário reajustado do funcionário " + nome + " será de R$" + bdSalarioReajustado);
		} else if ((anos >= 3) && (anos < 10)) {
			salarioReajustado = salarioAtual + (salarioAtual * reajEntre3e10);
			BigDecimal bdSalarioReajustado = new BigDecimal(salarioReajustado).setScale(2, RoundingMode.HALF_DOWN);
			System.out.println("O salário reajustado do funcionário " + nome + " será de R$" + bdSalarioReajustado);
		} else {
			salarioReajustado = salarioAtual + (salarioAtual * reajMaisDe10);
			BigDecimal bdSalarioReajustado = new BigDecimal(salarioReajustado).setScale(2, RoundingMode.HALF_DOWN);
			System.out.println("O salário reajustado do funcionário " + nome + " será de R$" + bdSalarioReajustado);
		}

	}

}
