
/*100) Melhore o exercício 96, criando além da função Media() uma outra função
chamada Situacao(), que vai retornar para o programa principal se o aluno está
APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber como
parâmetro o resultado retornado pela função Media().*/

import java.util.Scanner;

public class Exercicio100_FuncaoMediaeSituacao {

	public static void main(String[] args) {

		Scanner scNota1 = new Scanner(System.in);
		System.out.println("Digite a 1ª nota:");
		double nota1 = scNota1.nextDouble();
		Scanner scNota2 = new Scanner(System.in);
		System.out.println("Digite a 2ª nota:");
		double nota2 = scNota2.nextDouble();

		System.out.println(situacao(media(nota1, nota2)));

		scNota1.close();
		scNota2.close();

	}

	static double media(double nota1, double nota2) {
		return (nota1 + nota2) / 2;
	}

	static String situacao(double media) {
		if ((media >= 7.0) && (media <= 10.0)) {
			return "\nMédia: " + media + "\nAprovado";
		} else if ((media >= 4.5) && (media < 7.0)) {
			return "\nMédia: " + media + "\nEm recuperação";
		} else if ((media >= 0.0) && (media < 4.5)) {
			return "\nMédia: " + media + "\nReprovado";
		}
		return null;

	}

}
