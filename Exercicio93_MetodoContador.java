
/*93) Faça um programa que tenha um procedimento chamado Contador() que recebe
três valores como parâmetro: o início, o fim e o incremento de uma contagem. O
programa principal deve solicitar a digitação desses valores e passá-los ao
procedimento, que vai mostrar a contagem na tela.

Ex: Para os valores de início (4), fim (20) e incremento(3) teremos
Contador(4, 20, 3) vai mostrar na tela 4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM*/

import java.util.Scanner;

public class Exercicio93_MetodoContador {

	public static void main(String[] args) {

		Scanner scNum = new Scanner(System.in);
		System.out.println("Digite um número de onde deveremos começar a contagem:");
		int inicio = scNum.nextInt();
		System.out.println("Digite um número para que saibamos até onde devemos contar:");
		int fim = scNum.nextInt();
		System.out.println("Digite um número para sabermos de quanto em quanto será feita a contagem:");
		double contador = scNum.nextDouble();

		contador(inicio, fim, contador);

		scNum.close();

	}

	static void contador(int inicio, int fim, double contador) {
		System.out.print("\n");
		for (int i = inicio; i <= fim; i += contador) {
			System.out.print(i + " >> ");
		}
		System.out.println("FIM");
	}

}
