
/*15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
 * salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
 * por hora trabalhada.*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio15_CalculoSalarioMensal {

	public static void main(String[] args) {

		Scanner scNome = new Scanner(System.in);

		System.out.println("Digite o nome do funcionário:");
		String nome = scNome.nextLine();

		Scanner scDiasTrabalhados = new Scanner(System.in);

		System.out.println("Digite a quantidade de dias trabalhados:");
		int diasTrabalhados = scDiasTrabalhados.nextInt();

		scDiasTrabalhados.close();

		double horasTrabalhadas = 8.0;
		double valorHora = 25.0;

		double salario = diasTrabalhados * horasTrabalhadas * valorHora;

		BigDecimal bdSalario = new BigDecimal(salario).setScale(2, RoundingMode.HALF_EVEN);

		System.out.println("O salário do funcionário " + nome + " é R$" + bdSalario);

	}

}
