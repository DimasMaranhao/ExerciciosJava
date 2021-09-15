import java.util.Scanner;

/* Informar um saldo e imprimir o saldo com reajuste de 1%. */

public class SaldoMaisUmPorCento {
    public static void main(String[] args) {
        
        System.out.println("Digite o saldo: R$");
        Scanner scanner = new Scanner(System.in);
        double saldo = scanner.nextDouble();

        double reajuste = saldo*0.001;

        double saldoReajustado = saldo + reajuste;

        System.out.println("Saldo reajustado: R$" + saldoReajustado);

        scanner.close();

    }
}
