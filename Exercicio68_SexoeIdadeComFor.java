
/*68) Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
“para”. No final, mostre na tela:
a) Quantas mulheres foram cadastradas
b) Quantos homens pesam mais de 100Kg
c) A média de peso entre as mulheres
d) O maior peso entre os homens*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio68_SexoeIdadeComFor {

	public static void main(String[] args) {

		int qtdMulheres = 0;
		int homensMaisDe100 = 0;
		float peso;
		String sexo;
		float maiorPesoHomens = 0;
		float mediaPesoMulheres = 0;
		float somaPesoMulheres = 0;

		Scanner scPeso = new Scanner(System.in);
		Scanner scSexo = new Scanner(System.in);

		for (int i = 0; i < 8; i++) {

			System.out.println("Digite o sexo da " + (i + 1) + "ª pessoa:");
			System.out.println("[M]asculino\t[F]eminino");
			sexo = scSexo.next();
			System.out.println("Digite o peso da " + (i + 1) + "ª pessoa:");
			peso = scPeso.nextFloat();

			if (sexo.equals("M") || (sexo.equals("m"))) {

				if (peso > 100.0) {
					homensMaisDe100 += 1;
				}
			}

			if (peso > maiorPesoHomens) {
				maiorPesoHomens = peso;
			}

			if (sexo.equals("F") || (sexo.equals("f"))) {
				qtdMulheres += 1;
				somaPesoMulheres += peso;
			}

			System.out.print("\n");
		}

		mediaPesoMulheres = somaPesoMulheres / qtdMulheres;
		BigDecimal bdMedia = new BigDecimal(mediaPesoMulheres).setScale(1, RoundingMode.HALF_EVEN);

		scPeso.close();
		scSexo.close();

		System.out.println("Mulheres cadastradas: " + qtdMulheres);
		System.out.println("Homens com mais de 100Kg: " + homensMaisDe100);
		System.out.println("Média de peso entre as mulheres: " + bdMedia + "Kg");
		System.out.println("Maior peso entre os homens: " + maiorPesoHomens + "Kg");

	}

}
