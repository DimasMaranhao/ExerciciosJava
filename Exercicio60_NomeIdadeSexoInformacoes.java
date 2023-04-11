
/*60) Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
a) O nome da pessoa mais velha
b) O nome da mulher mais jovem
c) A média de idade do grupo
d) Quantos homens tem mais de 30 anos
e) Quantas mulheres tem menos de 18 anos
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio60_NomeIdadeSexoInformacoes {

	public static void main(String[] args) {

		Scanner scSexo = new Scanner(System.in);
		Scanner scIdade = new Scanner(System.in);
		Scanner scNome = new Scanner(System.in);
		Scanner scDecisao = new Scanner(System.in);

		ArrayList<String> homens = new ArrayList<String>();
		ArrayList<String> mulheres = new ArrayList<String>();
		ArrayList<Integer> idadesHomens = new ArrayList<Integer>();
		ArrayList<Integer> idadesMulheres = new ArrayList<Integer>();

		String mulherMaisNova = null;
		String mulherMaisVelha = null;
		String homemMaisVelho = null;
		String homemMaisNovo = null;
		int youngerMale = 999999999;
		int olderMale = 0;
		int youngerFemale = 999999999;
		int olderFemale = 0;
		float mediaIdades;
		int totalIdades = 0;
		int homensMaisDe30 = 0;
		int mulheresMaisDe30 = 0;
		int homensMenosDe18 = 0;
		int mulheresMenosDe18 = 0;
		int decisao;
		int aux1 = 999999999;
		int aux2 = 999999999;
		int aux3 = 999999999;
		int aux4 = 999999999;

		do {
			System.out.println("\nInforme seu sexo:\n[M]asculino\t[F]eminino");
			String sexo = scSexo.next();
			System.out.println("Digite seu nome:");
			String nome = scNome.nextLine();
			System.out.println("Informe sua idade:");
			int idade = scIdade.nextInt();

			if (sexo.equals("M") || (sexo.equals("m"))) {

				homens.add(nome);
				idadesHomens.add(idade);

				if (idade > 30) {
					homensMaisDe30++;
				} else if (idade < 18) {
					homensMenosDe18++;
				}
			}

			if (sexo.equals("F") || (sexo.equals("f"))) {

				mulheres.add(nome);
				idadesMulheres.add(idade);

				if (idade > 30) {
					mulheresMaisDe30++;
				} else if (idade < 18) {
					mulheresMenosDe18++;
				}
			}

			System.out.println("\nDeseja continuar?\n [1] Sim\t[2] Não");
			decisao = scDecisao.nextInt();

		} while (decisao != 2);

		for (int i = 0; i < idadesHomens.size(); i++) {
			if (idadesHomens.get(i) < youngerMale) {
				youngerMale = idadesHomens.get(i);
				aux1 = idadesHomens.indexOf(youngerMale);
				homemMaisNovo = homens.get(aux1);
			}

			if (idadesHomens.get(i) > olderMale) {
				olderMale = idadesHomens.get(i);
				aux2 = idadesHomens.indexOf(olderMale);
				homemMaisVelho = homens.get(aux2);
			}

			totalIdades += idadesHomens.get(i);
		}

		for (int i = 0; i < idadesMulheres.size(); i++) {
			if (idadesMulheres.get(i) < youngerFemale) {
				youngerFemale = idadesMulheres.get(i);
				aux3 = idadesMulheres.indexOf(youngerFemale);
				mulherMaisNova = mulheres.get(aux3);
			}

			if (idadesMulheres.get(i) > olderFemale) {
				olderFemale = idadesMulheres.get(i);
				aux4 = idadesMulheres.indexOf(olderFemale);
				mulherMaisVelha = mulheres.get(aux4);
			}

			totalIdades += idadesMulheres.get(i);
		}

		mediaIdades = totalIdades / (idadesMulheres.size() + idadesHomens.size());

		scSexo.close();
		scIdade.close();
		scNome.close();
		scDecisao.close();

		System.out.println("\n\n\n-------------------------------");
		System.out.println("\t  RESULTADOS");
		System.out.println("-------------------------------");
		System.out.println("Média de idades do grupo: " + mediaIdades);
		System.out.print("\nHomens: ");
		for (String nome : homens) {
			System.out.print(nome + ", ");
		}
		System.out.println("\nHomem mais novo: " + homemMaisNovo);
		System.out.println("Homem mais velho: " + homemMaisVelho);
		System.out.println("Homens com menos de 18 anos: " + homensMenosDe18);
		System.out.println("Homens com mais de 30 anos: " + homensMaisDe30);

		System.out.print("\nMulheres: ");
		for (String nome : mulheres) {
			System.out.print(nome + ", ");
		}
		System.out.println("\nMulher mais nova: " + mulherMaisNova);
		System.out.println("Mulher mais velha: " + mulherMaisVelha);
		System.out.println("Mulheres com menos de 18 anos: " + mulheresMenosDe18);
		System.out.println("Mulheres com mais de 30 anos: " + mulheresMaisDe30);

	}

}
