
/*67) Faça um programa usando a estrutura “para” que leia um número inteiro
positivo e mostre na tela uma contagem de 0 até o valor digitado:
Ex: Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!*/

import java.util.Scanner;

public class Exercicio67_ContandoAteValor {

	public static void main(String[] args) {

		Scanner scNum = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int num = scNum.nextInt();

		for (int i = 0; i <= num; i++) {
			System.out.print(i + ", ");
		}

		System.out.println("FIM!");
	}

}
