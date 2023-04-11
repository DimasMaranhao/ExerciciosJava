
/*27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
 * mostrando uma mensagem no final, de acordo com a média atingida:
 * - Média até 4.9: REPROVADO
 * - Média entre 5.0 e 6.9: RECUPERAÇÃO
 * - Média 7.0 ou superior: APROVADO*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio27_MediaEscolar {

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

		if ((media >= 0.0) && (media < 5.0)) {
			System.out.println("Média: " + bdMedia + " - REPROVADO");
		} else if ((media >= 5.0) && (media < 7.0)) {
			System.out.println("Média: " + bdMedia + " - RECUPERAÇÃO");
		} else if ((media >= 7.0) && (media <= 10.0)) {
			System.out.println("Média: " + bdMedia + " - APROVADO");
		} else {
			System.out.println("Verigique as notas inseridas.\nApenas são consideradas válidas notas entre 0.0 e 10.0");
		}

	}

}
