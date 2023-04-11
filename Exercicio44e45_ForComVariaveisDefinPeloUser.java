
//44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
//incremento, mostrando em seguida todos os valores no intervalo:
//Ex: Digite o primeiro Valor: 3
//Digite o último Valor: 10
//Digite o incremento: 2
//Contagem: 3 5 7 9 Acabou!

import java.util.Scanner;

public class Exercicio44e45_ForComVariaveisDefinPeloUser {

	public static void main(String[] args) {

		Scanner scInicio = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		int inicio = scInicio.nextInt();

		Scanner scFim = new Scanner(System.in);
		System.out.println("Digite o último valor:");
		int fim = scFim.nextInt();

		Scanner scIncremento = new Scanner(System.in);
		System.out.println("Digite o incremento:");
		int incremento = scIncremento.nextInt();

		if (inicio < fim) {
			for (int i = inicio; i <= fim; i += incremento) {
				System.out.println(i);
			}
		} else if (inicio > fim) {
			for (int i = inicio; i >= fim; i -= incremento) {
				System.out.println(i);
			}
		} else {
			System.out.println("Para iniciarmos a contagem, o número inicial precisa ser diferente do número final.");
		}

		scInicio.close();
		scFim.close();
		scIncremento.close();
	}

}
