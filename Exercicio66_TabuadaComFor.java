
/*66) Escreva um programa que leia um número qualquer e mostre a tabuada desse número, usando a estrutura “para”.
Ex: Digite um valor: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15 ...*/

import java.util.Scanner;

public class Exercicio66_TabuadaComFor {

	public static void main(String[] args) {
		
		Scanner scNum = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = scNum.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
		
		scNum.close();
	}

}
