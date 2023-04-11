
/*8) Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 185.72m corresponde a:
0.18572Km		1857.2dm
1.8572Hm		18572.0cm
18.572Dam		185720.0mm
*/

import java.util.Scanner;

public class Exercicio8_ConversorMetrosEmMedidas {

	public static void main(String[] args) {

		Scanner scMetros = new Scanner(System.in);

		System.out.println("Digite uma distância em metros:");
		double metros = scMetros.nextDouble();

		scMetros.close();

		double km = metros / 1000;
		double dm = metros * 10;
		double hm = metros / 100;
		double cm = metros * 100;
		double dam = metros / 10;
		double mm = metros * 1000;

		System.out.println("A distância de " + metros + "m corresponde a:");
		System.out.println(km + "Km");
		System.out.println(hm + "Hm");
		System.out.println(dam + "Dam");
		System.out.println(dm + "dm");
		System.out.println(cm + "cm");		
		System.out.println(mm + "mm");

	}

}
