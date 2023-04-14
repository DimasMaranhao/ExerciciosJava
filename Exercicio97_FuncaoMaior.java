
/*97) Refaça o exercício 91, só que agora em forma de função Maior(), mas faça uma
adaptação que vai receber TRÊS números como parâmetro e vai retornar qual foi o
maior entre eles.*/

import java.util.Scanner;

public class Exercicio97_FuncaoMaior {

	public static void main(String[] args) {

		Scanner scNum1 = new Scanner(System.in);
		System.out.println("Digite o 1º número:");
		int num1 = scNum1.nextInt();

		Scanner scNum2 = new Scanner(System.in);
		System.out.println("Digite o 2º número:");
		int num2 = scNum2.nextInt();

		Scanner scNum3 = new Scanner(System.in);
		System.out.println("Digite o 3º número:");
		int num3 = scNum3.nextInt();

		System.out.println("O maior número digitado foi: " + maior(num1, num2, num3));

		scNum1.close();
		scNum2.close();
		scNum3.close();
	}

	static int maior(int a, int b, int c) {
		if ((a > b) && (a > c)) {
			return a;
		} else if ((b > a) && (b > c)) {
			return b;
		} else {
			return c;
		}
	}

}
