
/*96) Crie um programa que tenha uma função Media(), que vai receber as 2 notas de
 * um aluno e retornar a sua média para o programa principal.*/

import java.util.Scanner;

public class Exercicio96_FuncaoMedia {

	public static void main(String[] args) {

		Scanner scNota1 = new Scanner(System.in);
		System.out.println("Digite a 1ª nota:");
		double nota1 = scNota1.nextDouble();

		Scanner scNota2 = new Scanner(System.in);
		System.out.println("Digite a 2ª nota:");
		double nota2 = scNota2.nextDouble();

		System.out.println("Média: " + media(nota1, nota2));
		
		scNota1.close();
		scNota2.close();
	}

	static double media(double a, double b) {
		return (a + b) / 2;
	}

}
