
/*92) Crie uma lógica que leia um número inteiro e passe para um procedimento
ParOuImpar() que vai verificar e mostrar na tela se o valor passado como
parâmetro é PAR ou ÍMPAR.*/

import java.util.Scanner;

public class Exercicio92_MetodoParOuImpar {

	public static void main(String[] args) {

		Scanner scNum = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		int a = scNum.nextInt();

		parOuImpar(a);

		scNum.close();
	}

	static void parOuImpar(int a) {
		if (a % 2 == 0) {
			System.out.println("\n" + a + " é PAR");
		} else {
			System.out.println("\n" + a + " é IMPAR");
		}
	}

}
