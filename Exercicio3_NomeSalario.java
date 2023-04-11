/*3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.*/

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio3_NomeSalario {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("deprecation")
		Locale localeBR = new Locale("pt","BR");

		Scanner scNome = new Scanner(System.in);

		System.out.println("Digite o nome do funcionário(a):");
		String nome = scNome.nextLine();

		Scanner scSalario = new Scanner(System.in);

		System.out.println("Digite o salário do(a) funcionário(a) " + nome + ":");
		double salario = scSalario.nextDouble();
		
		NumberFormat printSalario = NumberFormat.getCurrencyInstance (localeBR);

		scNome.close();
		scSalario.close();

		System.out.println("Nome do funcionário(a): " + nome);
		System.out.println("Salário: " + printSalario.format(salario));
		System.out.println("O(a) funcionário(a) " + nome + " tem um salário de " + printSalario.format(salario) + " em Junho.");
	}

}
