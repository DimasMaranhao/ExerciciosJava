
/*28) Faça um programa que leia a largura e o comprimento de um terreno
 * retangular, calculando e mostrando a sua área em m². O programa também
 * devemostrar a classificação desse terreno, de acordo com a lista abaixo:
 * - Abaixo de 100m² = TERRENO POPULAR
 * - Entre 100m² e 500m² = TERRENO MASTER
 * - Acima de 500m² = TERRENO VIP*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio28_AreaValorDoTerreno {

	public static void main(String[] args) {

		Scanner scLargura = new Scanner(System.in);

		System.out.println("Digite a medida da largura do terreno (em m²):");
		double largura = scLargura.nextDouble();

		Scanner scComprimento = new Scanner(System.in);

		System.out.println("Digite a medida do comprimento do terreno (em m²):");
		double comprimento = scComprimento.nextDouble();

		scLargura.close();
		scComprimento.close();

		double area = largura * comprimento;

		BigDecimal bdArea = new BigDecimal(area).setScale(2, RoundingMode.HALF_EVEN);

		if (area < 100.0) {
			System.out.println("Área do terreno: " + bdArea + "m² - TERRENO POPULAR");
		} else if ((area >= 100.0) && (area < 500.0)) {
			System.out.println("Área do terreno: " + bdArea + "m² - TERRENO MASTER");
		} else {
			System.out.println("Área do terreno: " + bdArea + "m² - TERRENO VIP");
		}

	}

}
