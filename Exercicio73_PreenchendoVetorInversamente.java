
/*73) Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
9 8 7 6 5 4 3 2 1 0
0 1 2 3 4 5 6 7 8 9*/

import java.util.Arrays;

public class Exercicio73_PreenchendoVetorInversamente {

	public static void main(String[] args) {

		int[] numeros = new int[10];

		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
			numeros[i] = 9 - i;
		}

		System.out.println(Arrays.toString(numeros));

	}

}
