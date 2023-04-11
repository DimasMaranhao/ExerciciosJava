
/*7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666*/

import java.util.Scanner;

public class Exercicio7_DobroeTercaParte {

	public static void main(String[] args) {
		Scanner scNum = new Scanner(System.in);

		System.out.println("Digite um número:");
		double numero = scNum.nextDouble();

		double dobro = numero * 2;
		double tercaParte = numero / 3;

		scNum.close();

		System.out.println("O dobro de " + numero + " é " + dobro);
		System.out.println("A terça parte de " + numero + " é " + tercaParte);

	}

}
