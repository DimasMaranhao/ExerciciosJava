
/*18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
 * dela e depois mostre se ela pode ou não votar.*/

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio18_PodeVotar {

	public static void main(String[] args) {

		Scanner scAnoNasc = new Scanner(System.in);

		System.out.println("Digite o ano em que você nasceu:");
		int anoNasc = scAnoNasc.nextInt();

		scAnoNasc.close();

		Calendar cal = Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);

		int idade = anoAtual - anoNasc;

		System.out.println("\nVocê possui " + idade + " anos.");

		if (idade >= 18) {
			System.out.println("Seu voto é obrigatório!");
		} else if ((idade >= 16 && idade < 18) || (idade >= 65)) {
			System.out.println("Seu voto é opcional!");
		} else {
			System.out.println("Você ainda não pode votar!");
		}

	}

}
