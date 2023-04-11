
/*34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
 * peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
 * indivíduo dentro de certas faixas.
 * - abaixo de 18.5: Abaixo do peso
 * - entre 18.5 e 25: Peso ideal
 * - entre 25 e 30: Sobrepeso
 * - entre 30 e 40: Obesidade
 * - acima de 40: Obseidade mórbida
 * 
 * Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado da altura)*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Exercicio34_CalculoIMC {

	public static void main(String[] args) {

		Scanner scPeso = new Scanner(System.in);
		System.out.println("Digite o peso:");
		double peso = scPeso.nextDouble();

		Scanner scAltura = new Scanner(System.in);
		System.out.println("Digite a altura:");
		double altura = scAltura.nextDouble();

		double imc = peso / (altura * altura);
		double pesoIdealMin = 18.5 * (altura * altura);
		double pesoIdealMax = 25.0 * (altura * altura);
		double perdaPeso = peso - pesoIdealMax; 
		double ganhoPeso = pesoIdealMin - peso;

		BigDecimal bdIMC = new BigDecimal(imc).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bdPesoIdealMin = new BigDecimal(pesoIdealMin).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bdPesoIdealMax = new BigDecimal(pesoIdealMax).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bdPerdaPeso = new BigDecimal(perdaPeso).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal bdGanhoPeso = new BigDecimal(ganhoPeso).setScale(2, RoundingMode.HALF_EVEN);

		if (imc < 18.5) {
			System.out.println("\nIMC = " + bdIMC);
			System.out.println("ABAIXO DO PESO (Peso ideal: entre " + bdPesoIdealMin + " e " + bdPesoIdealMax + ")");
			System.out.println("Você deveria ganhar " + bdGanhoPeso + " para atingir seu IMC ideal.");
		} else if ((imc >= 18.5) && (imc < 25.0)) {
			System.out.println("\nIMC = " + bdIMC);
			System.out.println("PESO IDEAL");
		} else if ((imc >= 25.0) && (imc < 30.0)) {
			System.out.println("\nIMC = " + bdIMC);
			System.out.println("SOBREPESO (Peso ideal: entre " + bdPesoIdealMin + " e " + bdPesoIdealMax + ")");			
			System.out.println("Você deveria perder " + bdPerdaPeso + " para atingir seu IMC ideal.");
		} else if ((imc >= 30.0) && (imc < 40.0)) {
			System.out.println("\nIMC = " + bdIMC);
			System.out.println("OBESIDADE (Peso ideal: entre " + bdPesoIdealMin + " e " + bdPesoIdealMax + ")");
			System.out.println("Você deveria perder " + bdPerdaPeso + " para atingir seu IMC ideal.");
		} else {
			System.out.println("\nIMC = " + bdIMC);
			System.out.println("OBESIDADE MÓRBIDA (Peso ideal: entre " + bdPesoIdealMin + " e " + bdPesoIdealMax + ")");			
			System.out.println("Você deveria perder " + bdPerdaPeso + " para atingir seu IMC ideal.");
		}

	}

}
