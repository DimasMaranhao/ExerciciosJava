
/*21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.*/

import java.util.Scanner;

public class Exercicio21_AnoBissexto {

	public static void main(String[] args) {

		Scanner scAno = new Scanner(System.in);

		System.out.println("Digite um ano para sabermos se o mesmo é bissexto ou não:");
		int ano = scAno.nextInt();

		scAno.close();

		if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " é bissexto!");
		} else if ((ano % 4 != 0) && (ano % 400 != 0)) {
			System.out.println(ano + " não é bissexto.");
		} else if ((ano % 4 != 0) && (ano % 4 == 400)) {
			System.out.println(ano + " é bissexto!");
		}

	}

}
