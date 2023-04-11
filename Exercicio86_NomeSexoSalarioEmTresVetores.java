
/*85) Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e
guarde esses dados em três vetores. No final, mostre uma listagem contendo
apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.*/

import java.util.Scanner;

public class Exercicio86_NomeSexoSalarioEmTresVetores {

	public static void main(String[] args) {

		String[] sexo = new String[5];
		String[] nomes = new String[5];
		double[] salarios = new double[5];

		Scanner scNome = new Scanner(System.in);
		Scanner scSexo = new Scanner(System.in);
		Scanner scSalario = new Scanner(System.in);

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite o nome da " + (i + 1) + "ª pessoa:");
			nomes[i] = scNome.nextLine();
			System.out.println("Digite o sexo da " + (i + 1) + "ª pessoa:\n[M]asculino\t[F]eminino");
			sexo[i] = scSexo.next();
			System.out.println("Digite o salário da " + (i + 1) + "ª pessoa:");
			salarios[i] = scSalario.nextDouble();
			System.out.println("\n");
		}

		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i].equals("F") || (sexo[i].equals("f"))) {

				for (int k = 0; k < salarios.length; k++) {
					if (salarios[i] > 5000.0) {
						System.out.println("Funcionária: " + nomes[i] + "\t-------\t   Salário: R$" + salarios[i]);
						break;
					}
				}

			}
		}

	}

}
