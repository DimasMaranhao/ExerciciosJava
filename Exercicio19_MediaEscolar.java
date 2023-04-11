
/*19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
 * média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
 * não um bom aproveitamento (se ficou acima da média 7.0).*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio19_MediaEscolar {

	public static void main(String[] args) {

		Scanner scNota1 = new Scanner(System.in);

		System.out.println("Digite a 1ª nota:");
		double nota1 = scNota1.nextDouble();

		Scanner scNota2 = new Scanner(System.in);

		System.out.println("Digite a 2ª nota:");
		double nota2 = scNota2.nextDouble();

		scNota1.close();
		scNota2.close();

		double media = (nota1 + nota2) / 2;
		
		BigDecimal bdMedia = new BigDecimal(media).setScale(2, RoundingMode.HALF_UP);
		
		System.out.println("\nMédia: " + bdMedia);

		if (media >= 7.0 && media < 9.0) {
			System.out.println("Aluno aprovado!");
		} else if (media >= 9.0) {
			System.out.println("Aluno aprovado com honras!!!");
		} else if (media >= 4.0 && media < 7.0) {
			System.out.println("Aluno em recuperação.");
		} else {
			System.out.println("Aluno reprovado.");
		}

	}

}
