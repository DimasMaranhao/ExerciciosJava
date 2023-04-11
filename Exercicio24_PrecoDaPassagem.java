
/*24) Faça um algoritmo que pergunte a distância que um passageiro deseja
 * percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
 * viagens até 200Km e R$0.45 para viagens mais longas.*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio24_PrecoDaPassagem {

	public static void main(String[] args) {
		
		Scanner scDistancia = new Scanner(System.in);
		
		System.out.println("Digite qual a distância (em Km) a ser percorrida:");
		double distancia = scDistancia.nextDouble();
		
		double corridaMenor = 0.50;
		double corridaMaior = 0.45;
		
		double custoCorrMenor = distancia * corridaMenor;
		double custoCorrMaior = distancia * corridaMaior;
		
		BigDecimal bdCustoCorrMenor = new BigDecimal(custoCorrMenor).setScale(2, RoundingMode.HALF_UP);
		BigDecimal bdCustoCorrMaior = new BigDecimal(custoCorrMaior).setScale(2, RoundingMode.HALF_UP);
		
		if ((distancia > 0) && (distancia < 200)) {
			System.out.println("Distância percorrida: " + distancia + "Km");
			System.out.println("Valor da corrida: R$" + bdCustoCorrMenor);
		} else if (distancia >= 200){
			System.out.println("Distância percorrida: " + distancia + "Km");
			System.out.println("Valor da corrida: R$" + bdCustoCorrMaior);			
		}

	}

}
