
/*76) Crie um programa que preencha automaticamente um vetor numérico com 7
números gerados aleatoriamente pelo computador e depois mostre os valores
gerados na tela.*/

import java.util.Arrays;
import java.util.Random;

public class Exercicio76_PreencherVetorComNumAlatorios {

	public static void main(String[] args) {

		int[] numeros = new int[7];
		int min = 1;
		int max = 1000;

		Random rdNum = new Random();

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rdNum.nextInt(max - min) + min;
		}

		System.out.println(Arrays.toString(numeros));

	}

}
