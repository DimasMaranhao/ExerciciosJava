
/*5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5*/

import java.util.Scanner;

public class Exercicio5_MediaDoAluno {

	public static void main(String[] args) {

		Scanner scNota1 = new Scanner(System.in);

		System.out.println("Nota 1:");
		double nota1 = scNota1.nextDouble();

		Scanner scNota2 = new Scanner(System.in);

		System.out.println("Nota 2:");
		double nota2 = scNota2.nextDouble();

		scNota1.close();
		scNota2.close();

		double media = (nota1 + nota2) / 2;

		System.out.println("A média entre " + nota1 + " e " + nota2 + " é igual a " + media);
	}

}
