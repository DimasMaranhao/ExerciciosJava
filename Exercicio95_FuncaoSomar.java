/*95) Refaça o exercício 90, só que agora em forma de função Somador(), que vai
receber dois parâmetros e vai retornar o resultado da soma entre eles para o
programa principal.*/

import java.util.Scanner;


public class Exercicio95_FuncaoSomar {

	public static void main(String[] args) {
		
		Scanner scNum1 = new Scanner(System.in);
		System.out.println("Digite o 1º valor:");
		int num1 = scNum1.nextInt();
		
		Scanner scNum2 = new Scanner(System.in);
		System.out.println("Digite o 2º valor:");
		int num2 = scNum2.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + somar(num1, num2));
		
		scNum1.close();
		scNum2.close();
	}
	
	static int somar(int a, int b) {
		return a + b;
		
	}

}
