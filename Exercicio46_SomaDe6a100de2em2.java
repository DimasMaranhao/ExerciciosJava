//46) Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
//8 + 10 + 12 + 14 + ... + 98 + 100.

public class Exercicio46_SomaDe6a100de2em2 {

	public static void main(String[] args) {

		int soma = 0;

		for (int i = 6; i <= 100; i += 2) {
			soma += i;
		}

		System.out.println("A soma entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100 = " + soma);
	}

}
