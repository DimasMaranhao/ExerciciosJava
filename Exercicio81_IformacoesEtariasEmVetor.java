
/*81) Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor.
 * No final, mostre:
a) Qual é a média de idade das pessoas cadastradas
b) Em quais posições temos pessoas com mais de 25 anos
c) Qual foi a maior idade digitada (podem haver repetições)
d) Em que posições digitamos a maior idade*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio81_IformacoesEtariasEmVetor {

	public static void main(String[] args) {

		int[] vetorIdades = new int[8];

		double mediaIdades = 0;
		double totalIdades = 0;
		int maiorIdade = 0;
		int cont = 0;

		Scanner scIdade = new Scanner(System.in);

		ArrayList<Integer> posicMaiorIdade = new ArrayList<Integer>();
		ArrayList<Integer> posicMaior25 = new ArrayList<Integer>();

		for (int i = 0; i < vetorIdades.length; i++) {
			System.out.println("Digite uma idade:");
			vetorIdades[i] = scIdade.nextInt();
			totalIdades += vetorIdades[i];
			cont++;
			if (vetorIdades[i] > maiorIdade) {
				maiorIdade = vetorIdades[i];
				posicMaiorIdade.add(i + 1);

			} else if (vetorIdades[i] == maiorIdade) {
				posicMaiorIdade.add(i + 1);
			}

			if (vetorIdades[i] > 25) {
				posicMaior25.add(i + 1);
			}

		}

		mediaIdades = totalIdades / cont;

		BigDecimal bdMedia = new BigDecimal(mediaIdades).setScale(1, RoundingMode.HALF_EVEN);

		System.out.print("\nIdades digitadas: ");
		for (int aux : vetorIdades) {
			System.out.print(aux + ", ");
		}

		System.out.println("\nMédia etária: " + bdMedia + " anos");
		System.out.print("Maior idade inserida: " + maiorIdade + " na(s) posição(s) ");
		for (int aux2 : posicMaiorIdade) {
			System.out.print(aux2 + ", ");
		}
		System.out.print("\nPessoas com mais de 25 anos inseridas nas posições: ");
		for (int aux3 : posicMaior25) {
			System.out.print(aux3 + ", ");
		}

		scIdade.close();

	}

}
