
/*71) Faça um programa que preencha automaticamente um vetor numérico com 8
posições, conforme abaixo:
999 999 999 999 999 999 999 999
 0 	 1	 2	 3	 4 	 5 	 6 	 7*/

import java.util.Arrays;

public class Exercicio71_PreenchimentoDeVetor {

	public static void main(String[] args) {

		int numeros[] = new int[8];

		for (int i = 0; i < 8; i++) {
			numeros[i] = 999;
		}

		System.out.println(Arrays.toString(numeros));
	}

}
