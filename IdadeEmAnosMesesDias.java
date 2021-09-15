import java.util.Scanner;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em
 anos, meses e dias e mostre-a expressa em dias. 
 Leve em consideração o ano com 365 dias e o mês com 30. 
 (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) */

public class IdadeEmAnosMesesDias {
    public static void main(String[] args) {
        
        System.out.println("Digite o ano em que você nasceu: ");
        Scanner scanner = new Scanner(System.in);
        int ano = scanner.nextInt();

        System.out.println("Digite o mês em que você nasceu (em números): ");        
        int mes = scanner.nextInt();

        System.out.println("Digite o dia em que você nasceu: ");        
        int dia = scanner.nextInt();

        int totalDias = ((2021-ano)*365) + (mes*30) + (30-dia);

        System.out.println((2021 - ano) + " anos, " + (9-mes) + " meses e " + (30-dia) + " dias = " + totalDias + " dias");

//Scanner scanner = ew Scanner(System.in);
//int valorInformado = scanner.nextInt();

scanner.close();

    }
}