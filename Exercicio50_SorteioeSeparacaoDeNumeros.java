
//50) Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
//mostre na tela:
//a) Quais foram os números sorteados
//b) Quantos números estão acima de 5
//c) Quantos números são divisíveis por 3

import java.util.Arrays;
import java.util.Random;

public class Exercicio50_SorteioeSeparacaoDeNumeros {

	public static void main(String[] args) {

		int numeros[] = new int[20];
		 
		int acimaDe5 = 0;
		int divPor3 = 0;

		Random randNum = new Random();

		for (int i = 0; i < 20; i++) {
			numeros[i] = randNum.nextInt(20);

			if (numeros[i] > 5) {
				acimaDe5++;
				
			} 
			
			if ((numeros[i] % 3 == 0) && (numeros[i] != 0)) {
				divPor3++;
			}
		}

		System.out.println("Os números sorteados foram: " + Arrays.toString(numeros));
		System.out.println(acimaDe5 + " números são maiores que 5");
		System.out.println(divPor3 + " números são divisíveis por 3");
	}

}
