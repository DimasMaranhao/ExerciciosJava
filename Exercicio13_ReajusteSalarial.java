
/*13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio13_ReajusteSalarial {

	public static void main(String[] args) {

		Scanner scSalario = new Scanner(System.in);

		System.out.println("Digite o salário do funcionário:");
		double salario = scSalario.nextDouble();

		double reajuste = 0.15;
		double salarioReajustado = salario + (salario * reajuste);

		BigDecimal bdSalarioReajustado = new BigDecimal(salarioReajustado).setScale(2, RoundingMode.HALF_EVEN);
		scSalario.close();

		System.out.println("Salário reajustado: R$" + bdSalarioReajustado);

	}

}
