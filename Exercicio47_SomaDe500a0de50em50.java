//47) Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
//450 + 400 + 350 + 300 + ... + 50 + 0

public class Exercicio47_SomaDe500a0de50em50 {

	public static void main(String[] args) {

		int soma = 0;

		for (int i = 500; i >= 0; i -= 50) {
			soma += i;
		}

		System.out.println(" A soma de 500 + 450 + 400 + 350 + 300 + ... + 50 + 0 = " + soma);
	}

}
