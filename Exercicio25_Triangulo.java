
/*25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
 * Analise seus comprimentos e diga se é possível formar um triângulo com essas
 * retas. Em caso de ser triângulo, o programa deve dizer também se o mesmo é
 * isósceles, equilátero ou escaleno.*/

import java.util.Scanner;

public class Exercicio25_Triangulo {

	public static void main(String[] args) {

		Scanner scSegA = new Scanner(System.in);

		System.out.println(("Digite o tamanho do segmento A:"));
		double segA = scSegA.nextDouble();

		Scanner scSegB = new Scanner(System.in);

		System.out.println(("Digite o tamanho do segmento B:"));
		double segB = scSegB.nextDouble();

		Scanner scSegC = new Scanner(System.in);

		System.out.println(("Digite o tamanho do segmento C:"));
		double segC = scSegC.nextDouble();

		double moduloAmenosB = Math.abs(segA - segB);
		double moduloBmenosC = Math.abs(segB - segC);
		double moduloAmenosC = Math.abs(segA - segC);

		if (((moduloAmenosB < segC) && (segC < (segA + segB))) || ((moduloBmenosC < segA) && (segA < (segB + segC)))
				|| ((moduloAmenosC < segB) && (segB < (segA + segC)))) {
			if ((segA == segB) && (segA == segC) && (segB == segC)) {
				System.out.println("É um triângulo equilátero!");
			} else if ((segA != segB) && (segA != segC) && (segB != segC)) {
				System.out.println("É um triângulo escaleno!");
			} else {
				System.out.println("É um triângulo isósceles!");
			}
		} else {
			System.out.println("Não é triângulo");
		}

		scSegA.close();
		scSegB.close();
		scSegC.close();

	}

}
