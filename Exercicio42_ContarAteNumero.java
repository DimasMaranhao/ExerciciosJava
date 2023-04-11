
//42) Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
//qualquer e mostre uma contagem até esse valor:
//Ex: Digite um valor: 35
//Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!

import java.util.Scanner;

public class Exercicio42_ContarAteNumero {

	public static void main(String[] args) {

		Scanner scNum = new Scanner(System.in);
		System.out.println("Digite um número:");
		int num = scNum.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		scNum.close();
		
		System.out.println("Acabou!");
	}

}
