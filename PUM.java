/*Escreva um programa que leia um valor inteiro N.
Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.

    Exemplo de Entrada	            Exemplo de Saída
            7                           1 2 3 PUM
                                        5 6 7 PUM
                                        9 10 11 PUM
                                        13 14 15 PUM
                                        17 18 19 PUM
                                        21 22 23 PUM
                                        25 26 27 PUM
*/

import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        
        System.out.println("Insira a quantidade de linhas que deseja ver o PUM:");
        Scanner scanVezes = new Scanner(System.in);
        int vezes = scanVezes.nextInt();

        for (int i = 1; i < vezes*4; i++) {
            System.out.println(i + " " + (i+=1) + " " + (i+=1) + " PUM");
            i+=1;
        }
    scanVezes.close();
    }
}
