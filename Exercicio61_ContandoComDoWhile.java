/*61) Crie um programa que mostre na tela a seguinte contagem, usando a estrutura “faça enquanto”
	0 3 6 9 12 15 18 21 24 27 30 Acabou!*/


public class Exercicio61_ContandoComDoWhile {

	public static void main(String[] args) {
		
		int num = 0;
		System.out.println(num);
		do {
			System.out.println(num += 3);
		} while (num < 30);
		System.out.println("Acabou!");
	}

}
