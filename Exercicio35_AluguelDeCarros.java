
/*35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
 * aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
 * carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
 * que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
 * quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
 * tabela a seguir:
 * 
 * - Carros populares (aluguel de R$90 por dia)
 * - Até 100Km percorridos: R$0,20 por Km
 * - Acima de 100Km percorridos: R$0,10 por Km
 * 
 * - Carros de luxo (aluguel de R$150 por dia)
 * - Até 200Km percorridos: R$0,30 por Km
 * - Acima de 200Km percorridos: R$0,25 por Km*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio35_AluguelDeCarros {

	public static void main(String[] args) {

		Scanner scTipoCarro = new Scanner(System.in);
		System.out.println("Escolha o tipo de carro desejado:\n    [1] POPULAR\t[2] LUXO");
		int tipoCarro = scTipoCarro.nextInt();

		Scanner scTempo = new Scanner(System.in);
		System.out.println("Digite a quantidade de dias desejados para aluguel:");
		int dias = scTempo.nextInt();

		Scanner scKm = new Scanner(System.in);
		System.out.println("Digite a quilometragem percorrida:");
		double km = scKm.nextDouble();

		double aluguelDiarioPop = 90.0;
		double aluguelDiarioLuxo = 150.0;

		double kmPopAte100 = 0.20;
		double kmPopAcima100 = 0.10;
		double kmLuxoAte100 = 0.30;
		double kmLuxoAcima100 = 0.25;

		double precoDiarioPop = dias * aluguelDiarioPop;
		double precoDiarioLuxo = dias * aluguelDiarioLuxo;
		double precoKmPopAte100 = km * kmPopAte100;
		double precoKmLuxoAte100 = km * kmLuxoAte100;
		double precoKmPopAcima100 = precoKmPopAte100 + ((100 - km) * kmPopAcima100);
		double precoKmLuxoAcima100 = precoKmLuxoAte100 + ((100 - km) * kmLuxoAcima100);

		double totalPopAte100 = precoDiarioPop + precoKmPopAte100;
		double totalLuxoAte100 = precoDiarioLuxo + precoKmLuxoAte100;
		double totalPopAcima100 = precoDiarioPop + precoKmPopAcima100;
		double totalLuxoAcima100 = precoDiarioLuxo + precoKmLuxoAcima100;

		BigDecimal bdPrecoDiarioPop = new BigDecimal(precoDiarioPop).setScale(2, RoundingMode.HALF_UP);
		BigDecimal bdPrecoDiarioLuxo = new BigDecimal(precoDiarioLuxo).setScale(2, RoundingMode.HALF_UP);
		BigDecimal bdPrecoKmPopAte100 = new BigDecimal(precoKmPopAte100).setScale(2, RoundingMode.HALF_UP);
		BigDecimal bdPrecoKmLuxoAte100 = new BigDecimal(precoKmLuxoAte100).setScale(2, RoundingMode.HALF_UP);
		BigDecimal bdPrecoKmPopAcima100 = new BigDecimal(precoKmPopAcima100).setScale(2, RoundingMode.HALF_UP);
		BigDecimal bdPrecoKmLuxoAcima100 = new BigDecimal(precoKmLuxoAcima100).setScale(2, RoundingMode.HALF_UP);
		BigDecimal bdTotalPopAte100 = new BigDecimal(totalPopAte100).setScale(2, RoundingMode.HALF_UP);
		BigDecimal bdTotalLuxoAte100 = new BigDecimal(totalLuxoAte100).setScale(2, RoundingMode.HALF_UP);
		BigDecimal bdTotalPopAcima100 = new BigDecimal(totalPopAcima100).setScale(2, RoundingMode.HALF_UP);
		BigDecimal bdTotalLuxoAcima100 = new BigDecimal(totalLuxoAcima100).setScale(2, RoundingMode.HALF_UP);

		if ((tipoCarro == 1) && (km < 100.0)) {
			System.out.println("Tipo de carro: Popular");
			System.out.println("Aluguel: R$" + bdPrecoDiarioPop);
			System.out.println("Valor por quilometragem percorrida: R$" + bdPrecoKmPopAte100);
			System.out.println("--------------------------------------------");
			System.out.println("Valor total a ser pago: R$" + bdTotalPopAte100);
		} else if ((tipoCarro == 1) && (km >= 100.0)) {
			System.out.println("Tipo de carro: Popular");
			System.out.println("Aluguel: R$" + bdPrecoDiarioPop);
			System.out.println("Valor por quilometragem percorrida: R$" + bdPrecoKmPopAcima100);
			System.out.println("--------------------------------------------");
			System.out.println("Valor total a ser pago: R$" + bdTotalPopAcima100);
		} else if ((tipoCarro == 2) && (km < 100.0)) {
			System.out.println("Tipo de carro: Luxo");
			System.out.println("Aluguel: R$" + bdPrecoDiarioLuxo);
			System.out.println("Valor por quilometragem percorrida: R$" + bdPrecoKmLuxoAte100);
			System.out.println("--------------------------------------------");
			System.out.println("Valor total a ser pago: R$" + bdTotalLuxoAte100);
		} else if ((tipoCarro == 2) && (km >= 100.0)) {
			System.out.println("Tipo de carro: Popular");
			System.out.println("Aluguel: R$" + bdPrecoDiarioLuxo);
			System.out.println("Valor por quilometragem percorrida: R$" + bdPrecoKmLuxoAcima100);
			System.out.println("--------------------------------------------");
			System.out.println("Valor total a ser pago: R$" + bdTotalLuxoAcima100);
		}
		
		scTipoCarro.close();
		scTempo.close();
		scKm.close();
		
	}

}
