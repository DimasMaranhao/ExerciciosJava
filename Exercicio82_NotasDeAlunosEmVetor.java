
/*82) Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em
um vetor. No final, mostre:
a) Qual é a média da turma
b) Quantos alunos estão acima da média da turma
c) Qual foi a maior nota digitada
d) Em que posições a maior nota aparece*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio82_NotasDeAlunosEmVetor {

	public static void main(String[] args) {

		Scanner scNota = new Scanner(System.in);

		ArrayList<Integer> posicMaiorNotas = new ArrayList<Integer>();

		double[] notas = new double[10];
		double media = 0;
		double totalNotas = 0;
		double maiorNota = 0;
		int alunosAcimaDaMedia = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota do " + (i + 1) + "º aluno:");
			notas[i] = scNota.nextDouble();
			totalNotas += notas[i];

			if (notas[i] > maiorNota) {
				maiorNota = notas[i];
				posicMaiorNotas.add(i + 1);
			} else if (notas[i] == maiorNota) {
				posicMaiorNotas.add(i + 1);
			}

			if (notas[i] >= 7.0) {
				alunosAcimaDaMedia++;
			}

		}

		scNota.close();

		media = totalNotas / notas.length;

		BigDecimal bdMedia = new BigDecimal(media).setScale(1, RoundingMode.HALF_EVEN);

		System.out.print("\nNotas da turma: ");
		for (double aux2 : notas) {
			System.out.print(aux2 + "; ");
		}
		System.out.println("\nMédia da turma: " + bdMedia);
		System.out.println("Alunos acima da média: " + alunosAcimaDaMedia);
		System.out.println("Maior nota: " + maiorNota);
		System.out.print("Posições em que as maiores notas aparecem: ");
		for (int aux : posicMaiorNotas) {
			System.out.print(aux + ", ");
		}

	}
}
