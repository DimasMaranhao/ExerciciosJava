
//37) Uma empresa precisa reajustar o salário dos seus funcionários, dando um
// * aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
// * o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
// * No final, mostre o seu novo salário, baseado na tabela a seguir:
// * 
// * - Mulheres
// * - menos de 15 anos de empresa: +5%
// * - de 15 até 20 anos de empresa: +12%
// * - mais de 20 anos de empresa: +23%
// * 
// * - Homens
// * - menos de 20 anos de empresa: +3%
// * - de 20 até 30 anos de empresa: +13%
// * - mais de 30 anos de empresa: +25%

import java.util.Scanner;

public class Exercicio37_ReajusteSalarial {

	public static void main(String[] args) {
		Scanner scGenero = new Scanner(System.in);
		System.out.println("Escolha o gênero do funcionário:\n  [1] MASCULINO\t[2] FEMININO");
		int genero = scGenero.nextInt();

		Scanner scSalarioAtual = new Scanner(System.in);

		if (genero == 1) {
			System.out.println("Digite o salário atual do funcionário:");
		} else if (genero == 2) {
			System.out.println("Digite o salário atual da funcionária:");
		} else {
			System.out.println("    Opção inválida! Digite:\n  [1] MASCULINO\t[2] FEMININO");
		}

		double salarioAtual = scSalarioAtual.nextDouble();

		Scanner scAnos = new Scanner(System.in);

		if (genero == 1) {
			System.out.println("Digite há quanto anos o funcionário trabalha na empresa:");
		} else if (genero == 2) {
			System.out.println("Digite há quanto anos a funcionária trabalha na empresa:");
		}

		int anos = scAnos.nextInt();
		double salarioReajustado;

		if ((genero == 2) && (anos < 15)) {
			salarioReajustado = salarioAtual * 1.05;
			System.out.println("Salário reajustado: R$" + salarioReajustado);
		} else if (((genero == 2) && ((anos >= 15) && (anos < 20)))) {
			salarioReajustado = salarioAtual * 1.12;
			System.out.println("Salário reajustado: R$" + salarioReajustado);
		} else if ((genero == 2) && (anos >= 20)) {
			salarioReajustado = salarioAtual * 1.23;
			System.out.println("Salário reajustado: R$" + salarioReajustado);
		} else if ((genero == 1) && (anos < 15)) {
			salarioReajustado = salarioAtual * 1.03;
			System.out.println("Salário reajustado: R$" + salarioReajustado);
		} else if (((genero == 1) && ((anos >= 15) && (anos < 20)))) {
			salarioReajustado = salarioAtual * 1.13;
			System.out.println("Salário reajustado: R$" + salarioReajustado);
		} else if ((genero == 1) && (anos >= 20)) {
			salarioReajustado = salarioAtual * 1.25;
			System.out.println("Salário reajustado: R$" + salarioReajustado);
		}
		
		scGenero.close();
		scSalarioAtual.close();
		scAnos.close();
		
	}

}
