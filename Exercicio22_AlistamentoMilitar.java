
/*22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
 * situação em relação ao alistamento militar.
 * - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
 * - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do alistamento.*/

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio22_AlistamentoMilitar {

	public static void main(String[] args) {

		Scanner scAnoNasc = new Scanner(System.in);

		System.out.println("Digite o ano em que você nasceu:");
		int anoNasc = scAnoNasc.nextInt();

		scAnoNasc.close();

		Calendar calAnoHoje = Calendar.getInstance();
		int anoHoje = calAnoHoje.get(Calendar.YEAR);

		int idade = anoHoje - anoNasc;
		int idadeAlist = 18;

		if (idade == idadeAlist) {
			System.out.println("Você deve se alistar esse ano!");
		} else if (idade < idadeAlist) {
			System.out.println("Faltam " + (idadeAlist - idade) + " anos para você se alistar");
		} else {
			System.out.println("Você deveria ter se alistado há " + (idade - idadeAlist) + " anos!");
		}

	}

}
