
/*74) Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
5 3 5 3 5 3 5 3 5 3
0 1 2 3 4 5 6 7 8 9*/

import java.util.Arrays;

public class Exercicio74_PreenchAlternadodeArray {

	public static void main(String[] args) {

		int[] numeros = new int[10];

		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				numeros[i] = 3;
			} else if (i % 2 == 0) {
				numeros[i] = 5;
			}
		}

		System.out.println(Arrays.toString(numeros));

	}

}
