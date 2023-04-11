
/*11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta.*/

import java.util.Scanner;

public class Exercicio11_EquacaoDoSegundoGrau {

	public static void main(String[] args) {

		Scanner scA = new Scanner(System.in);

		System.out.println("Digite o valor de A:");
		int variavelA = scA.nextInt();

		Scanner scB = new Scanner(System.in);

		System.out.println("Digite o valor de B:");
		int variavelB = scB.nextInt();

		Scanner scC = new Scanner(System.in);

		System.out.println("Digite o valor de C:");
		int variavelC = scC.nextInt();

		int variavelX1 = 0;
		int variavelX2 = 0;
		int delta = 0;

		scA.close();
		scB.close();
		scC.close();

		if (variavelA != 0 && variavelB != 0 && variavelC != 0) {

			delta = (int) (Math.pow(variavelB, 2) - 4 * (variavelA * variavelC));
			variavelX1 = (int) (((variavelB * -1) + Math.sqrt(delta)) / 2 * variavelA);
		}

		if (variavelA != 0 && variavelB != 0 && variavelC != 0) {

			delta = (int) (Math.pow(variavelB, 2) - 4 * (variavelA * variavelC));
			variavelX2 = (int) (((variavelB * -1) - Math.sqrt(delta)) / 2 * variavelA);
		}

		if (variavelA != 0 && variavelB == 0 && variavelC != 0) {
			variavelX2 = (int) Math.sqrt((variavelC * -1) / variavelA);

		} else if (variavelA != 0 && variavelB == 0 && variavelC != 0) {
			variavelX1 = (int) Math.sqrt(((variavelC * -1) / variavelA) * -1);
		}

		if (variavelA != 0 && variavelB != 0 && variavelC == 0) {
			variavelX2 = (variavelB * -1) / variavelA;
		}

		if (variavelB > 0 && variavelC > 0) {
			System.out.println("Os valores das raízes para a equação " + variavelA + "x² + " + variavelB + "x + "
					+ variavelC + " = 0");
		} else if (variavelB < 0 && variavelC > 0) {
			System.out.println("Os valores das raízes para a equação " + variavelA + "x² " + variavelB + "x + "
					+ variavelC + " = 0");
		} else if (variavelB > 0 && variavelC < 0) {
			System.out.println("Os valores das raízes para a equação " + variavelA + "x² +" + variavelB + "x "
					+ variavelC + " = 0");
		} else if (variavelB < 0 && variavelC < 0) {
			System.out.println("Os valores das raízes para a equação " + variavelA + "x² " + variavelB + "x "
					+ variavelC + " = 0");
		}

		System.out.println("X' = " + variavelX1);
		System.out.println("X'' = " + variavelX2);
		System.out.println("Δ = " + delta);

	}

}
