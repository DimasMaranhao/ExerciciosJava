
/*77) Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No
final, mostre uma listagem com todos os nomes informados, na ordem inversa
daquela em que eles foram informados.*/

import java.util.Scanner;

public class Exercicio77_VetorLendoSeteNomesIMprimEmOrdemInversa {

	public static void main(String[] args) {

		String[] vetor = new String[7];

		Scanner scStr = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um nome:");
			vetor[i] = scStr.nextLine();
		}

		System.out.println("\n");

		for (int i = vetor.length - 1; i >= 0; i--) {
			System.out.println(vetor[i]);
		}
		
		scStr.close();

	}

}
