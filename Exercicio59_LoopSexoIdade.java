
//59) Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
//perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
//a) qual é a maior idade lida
//b) quantos homens foram cadastrados
//c) qual é a idade da mulher mais jovem
//d) qual é a média de idade entre os homens

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio59_LoopSexoIdade {

	public static void main(String[] args) {

		int maiorIdade = 0;
		int qtdHomens = 0;
		int qtdMulheres = 0;
		int mulherMaisJovem = 9999;
		int homemMaisJovem = 9999;
		double mediaIdadeMasc = 0;
		double idadeTotalMasc = 0;
		double mediaIdadeFem = 0;
		double idadeTotalFem = 0;
		int aux = 0;

		Scanner scSexo = new Scanner(System.in);
		Scanner scIdade = new Scanner(System.in);
		Scanner scDecisao = new Scanner(System.in);

		String decisao = null;

		do {
			aux += 1;
			System.out.println("Informe o sexo da " + aux + "ª pessoa:\n [M]asculino\t[F]eminino");
			String sexo = scSexo.next();

			System.out.println("Informe a idade da " + aux + "ª pessoa:");
			int idade = scIdade.nextInt();

			if (idade > maiorIdade) {
				maiorIdade = idade;
			}

			if ((sexo.equals("M") || (sexo.equals("m")))) { // para comparar Strings, é necessário usar .equals
				qtdHomens += 1;
				idadeTotalMasc += idade;

				if (idade < homemMaisJovem) {
					homemMaisJovem = idade;
				}

			} else if (sexo.equals("F") || (sexo.equals("f"))) {
				qtdMulheres += 1;
				idadeTotalFem += idade;

				if (idade < mulherMaisJovem) {
					mulherMaisJovem = idade;
				}
			}

			System.out.println("\nVocê quer:\n[C]ontinuar\t[S]air");
			decisao = scDecisao.next();

			System.out.println("\n\n");

		} while (!decisao.equals("S")); // negação de equals. (!equals)

		mediaIdadeMasc = idadeTotalMasc / qtdHomens;
		mediaIdadeFem = idadeTotalFem / qtdMulheres;

		scSexo.close();
		scIdade.close();
		scDecisao.close();
		
		BigDecimal bdMediaMasc = new BigDecimal(mediaIdadeMasc).setScale(1, RoundingMode.HALF_EVEN);
		BigDecimal bdMediaFem = new BigDecimal(mediaIdadeFem).setScale(1, RoundingMode.HALF_EVEN);

		if ((qtdMulheres == 0) && (qtdHomens != 0)) {
			mediaIdadeFem = 0;
			System.out.println("\n\n\n------------------------------------");
			System.out.println("Maior idade inserida: " + maiorIdade + " anos");
			System.out.println("Total de homens: " + qtdHomens);
			System.out.println("O homem mais jovem possui " + homemMaisJovem + " anos");
			System.out.println("Média de idade masculina: " + bdMediaMasc + " anos");
		} else if ((qtdHomens == 0) && (qtdMulheres != 0)) {
			mediaIdadeMasc = 0;
			System.out.println("\n\n\n------------------------------------");
			System.out.println("Total de mulheres: " + qtdMulheres);
			System.out.println("A mulher mais jovem possui " + mulherMaisJovem + " anos");
			System.out.println("Média de idade feminina: " + mediaIdadeFem + " anos");
			System.out.println("Média de idade feminina: " + bdMediaFem + " anos");
		} else {
			System.out.println("\n\n\n------------------------------------");
			System.out.println("Maior idade inserida: " + maiorIdade + " anos");
			System.out.println("Total de homens: " + qtdHomens);
			System.out.println("O homem mais jovem possui " + homemMaisJovem + " anos");
			System.out.println("Média de idade masculina: " + bdMediaMasc + " anos");
			System.out.println("Total de mulheres: " + qtdMulheres);
			System.out.println("A mulher mais jovem possui " + mulherMaisJovem + " anos");
			System.out.println("Média de idade feminina: " + bdMediaFem + " anos");

		}

	}

}
