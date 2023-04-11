
//53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
//a) Quantos homens foram cadastrados
//b) Quantas mulheres foram cadastradas
//c) A média de idade do grupo
//d) A média de idade dos homens
//e) Quantas mulheres tem mais de 20 anos

import java.util.Scanner;

public class Exercicio53_IdadeSexoInformacoesComScanner {

	public static void main(String[] args) {

		Scanner scIdade = new Scanner(System.in);

		Scanner scSexo = new Scanner(System.in);

		int qtdHomens = 0;
		int qtdMulheres = 0;
		int idadeTotalHomens = 0;
		int mediaIdadeHomens = 0;
		int idadeTotalMulheres = 0;
		int mediaIdadeMulheres = 0;
		int idadeTotal = 0;
		int mediaIdadeGeral = 0;
		int homensAcimaDe20 = 0;
		int mulheresAcimaDe20 = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("    Informe sua idade:");
			int idade = scIdade.nextInt();
			System.out.println("\t  Você é:\n[1] HOMEM\t[2] MULHER");
			int sexo = scSexo.nextInt();
			idadeTotal += idade;

			if (sexo == 1) {
				qtdHomens++;
				idadeTotalHomens += idade;
			}

			if (sexo == 2) {
				qtdMulheres++;
				idadeTotalMulheres += idade;
			}
			
			if ((sexo == 1) && (idade > 20)) {
				homensAcimaDe20++;
			}
			
			if ((sexo == 2) && (idade > 20)) {
				mulheresAcimaDe20++;
			}
		}

		scSexo.close();
		scIdade.close();
		
		mediaIdadeGeral = idadeTotal / 5;

		System.out.println("\nTotal de homens: " + qtdHomens);
		System.out.println("Total de mulheres: " + qtdMulheres);

		if (qtdHomens != 0) {
			mediaIdadeHomens = idadeTotalHomens / qtdHomens;
			System.out.println("A média da idade do grupo masculino é de " + mediaIdadeHomens + " anos");
		} else {
			mediaIdadeHomens = 0;
		}

		if (qtdMulheres != 0) {
			mediaIdadeMulheres = idadeTotalMulheres / qtdMulheres;
			System.out.println("A média da idade do grupo feminino é de " + mediaIdadeMulheres + " anos");
		} else {
			mediaIdadeMulheres = 0;
		}

		System.out.println("A média da idade total do grupo é de " + mediaIdadeGeral + " anos");
		System.out.println("Homens com idade superior a 20 anos: " + homensAcimaDe20);
		System.out.println("Mulheres com idade superior a 20 anos: " + mulheresAcimaDe20);

	}

}
