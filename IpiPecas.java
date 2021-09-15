import java.util.Scanner;
/*Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor das peças
 - o código da peça 1, valor unitário da peça 1, quantidade de peças 1 
 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
  O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. 
  Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1);*/

public class IpiPecas {
    public static void main(String[] args) {

        System.out.println("Insira o código da peça: ");
        Scanner scanner = new Scanner(System.in);
        int codigoPeca1 = scanner.nextInt();
        scanner.close();
        
        double valor1 = 100.0;
        System.out.println("Insira a quantidade da peça "+ codigoPeca1 + ": ");
        Scanner scanner1 = new Scanner(System.in);
        int quant1 = scanner1.nextInt();
        scanner1.close();

        System.out.println("Insira o código da peça: ");
        Scanner scanner2 = new Scanner(System.in);
        int codigoPeca2 = scanner2.nextInt();
        double valor2 = 50.0;
        scanner2.close();

        System.out.println("Insira a quantidade da peça "+ codigoPeca2 + ": ");
        Scanner scanner3 = new Scanner(System.in);
        int quant2 = scanner3.nextInt();
        scanner3.close();

        int valorIpi = 638; 

        double valorTotal = (valor1*quant1 + valor2*quant2)*(valorIpi/100 + 1);

        System.out.println("Valor unitário (peça "+ codigoPeca1 + "): R$" + valor1);
        System.out.println("Valor total (peça " + codigoPeca1 + "): R$" + valor1*quant1);
        System.out.println("Valor unitário (peça "+ codigoPeca2 + "): R$" + valor2);
        System.out.println("Valor total (peça " + codigoPeca2 + "): R$" + valor2*quant2);     
        System.out.println("Valor total a ser pago: R$" + valorTotal);

        
    }
}
