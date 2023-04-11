
/*10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.*/

import java.util.Scanner;

public class Exercicio10_QuantidadeDeTintaParaParede {

	public static void main(String[] args) {

		Scanner scLarg = new Scanner(System.in);

		System.out.println("Digite a largura:");
		double largura = scLarg.nextDouble();

		Scanner scAlt = new Scanner(System.in);

		System.out.println("Digite a altura:");
		double altura = scAlt.nextDouble();

		scLarg.close();
		scAlt.close();

		double area = altura * largura;
		double areaTinta = 2.0;
		double qtdTinta = area / areaTinta;
		
		System.out.println("Serão necessários " + qtdTinta + "L de tinta para pintar uma área de " + area + "m");
	}

}
