import java.util.Scanner;

/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
 calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado.
 (1SM=R$1.100,00);*/

public class QuantidadeSalariosMinimos {
    public static void main(String[] args) {
        
        double salarioMinimo = 1100.0;

        System.out.println("Insira o valor do seu salário: ");
        Scanner scannerSalario = new Scanner(System.in);
        double salario = scannerSalario.nextDouble();

        double quantidadeDeSalariosMinimos = salario/salarioMinimo;

        System.out.println("Você ganha o equivalente a " + String.format("%1.2f", quantidadeDeSalariosMinimos) + " salários mínimos");

        scannerSalario.close();
    }
}
