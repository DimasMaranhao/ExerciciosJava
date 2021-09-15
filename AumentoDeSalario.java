/*A empresa ABC resolveu conceder um aumento de salários a seus funcionários
 de acordo com a tabela abaixo:


    Salário	                    Percentual de Reajuste
0 - 400.00                              15%
400.01 - 800.00                         12%
800.01 - 1200.00                        10%
1200.01 - 2000.00                       7%
Acima de 2000.00                        4%

Leia o salário do funcionário e calcule e mostre o novo salário, 
bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada:
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída:
- o novo salário,
- o valor ganho de reajuste
- o percentual de reajuste ganho, conforme exemplo abaixo.

Exemplo de Entrada	                Exemplo de Saída
400.00

Novo salario: 460.00
Reajuste ganho: 60.00
Em percentual: 15 %

800.01

Novo salario: 880.01
Reajuste ganho: 80.00
Em percentual: 10 %

2000.00

Novo salario: 2140.00
Reajuste ganho: 140.00
Em percentual: 7 %
*/

import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        
        System.out.println("Insira o salário a ter o aumento calculado:");
        Scanner scanSalario = new Scanner(System.in);
        float salario = scanSalario.nextFloat();

        float reajuste = 0.0f;
        float valorReajuste = 0.0f;
        float salarioReajustado = 0.0f;        

        if (salario >0 && salario <= 400.0f){
            reajuste = 0.15f;
            valorReajuste = salario*reajuste;
            salarioReajustado = salario+valorReajuste;
            System.out.println("Novo salario: " + (String.format("%.2f", salarioReajustado)) + "\nReajuste ganho: " + (String.format("%.2f", valorReajuste) + "\nEm percentual: " + (String.format("%.0f", (reajuste*100))) + " %"));
        }

        if (salario >400.0f && salario <= 800.0f){
            reajuste = 0.12f;
            valorReajuste = salario*reajuste;
            salarioReajustado = salario+valorReajuste;
            System.out.println("Novo salario: " + (String.format("%.2f", salarioReajustado)) + "\nReajuste ganho: " + (String.format("%.2f", valorReajuste) + "\nEm percentual: " + (String.format("%.0f", (reajuste*100))) + " %"));
        }

        if (salario >800.0f && salario <= 1200.0f){
            reajuste = 0.10f;
            valorReajuste = salario*reajuste;
            salarioReajustado = salario+valorReajuste;
            System.out.println("Novo salario: " + (String.format("%.2f", salarioReajustado)) + "\nReajuste ganho: " + (String.format("%.2f", valorReajuste) + "\nEm percentual: " + (String.format("%.0f", (reajuste*100))) + " %"));
        }

        if (salario >1200.0f && salario <= 2000.0f){
            reajuste = 0.07f;
            valorReajuste = salario*reajuste;
            salarioReajustado = salario+valorReajuste;
            System.out.println("Novo salario: " + (String.format("%.2f", salarioReajustado)) + "\nReajuste ganho: " + (String.format("%.2f", valorReajuste) + "\nEm percentual: " + (String.format("%.0f", (reajuste*100))) + " %"));
        }

        if (salario >2000.0f){
            reajuste = 0.04f;
            valorReajuste = salario*reajuste;
            salarioReajustado = salario+valorReajuste;
            System.out.println("Novo salario: " + (String.format("%.2f", salarioReajustado)) + "\nReajuste ganho: " + (String.format("%.2f", valorReajuste) + "\nEm percentual: " + (String.format("%.0f", (reajuste*100))) + " %"));
        }

        scanSalario.close();

    }
}
