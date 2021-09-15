/*Leia 2 valores inteiros X e Y.
A seguir, calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro.
Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada
que deverá caber em um inteiro.

        Exemplo de Entrada	            Exemplo de Saída
                6                               5
               -5

               15                               13
              -12

               12                               0
               12
*/

import java.util.Scanner;

public class SomaDeImparesConsecutivos {
    public static void main(String[] args) {

        System.out.println("Digite o 1º número:");
        Scanner scanNumUm = new Scanner(System.in);
        int numUm = scanNumUm.nextInt();

        System.out.println("Digite o 2º número:");
        Scanner scanNumDois = new Scanner(System.in);
        int numDois = scanNumDois.nextInt();

        int soma = 0;

        if (numUm %2 != 0){
            numUm = numUm-1;
        }

        if (numDois %2 != 0){
            numDois = numDois+1;
        }

        if(numUm < numDois){
            for (int i = numUm; i < numDois; i++) {
                if (i%2 != 0) {
                    soma+=1;
                }                
            }
        } else{
            for (int i = numDois; i < numUm; i++) {
                if (i%2 != 0) {
                    soma+=1;
                }                
            }
        }

        System.out.println(soma);


        /*if (numUm%2== 0){
            numUm = numUm-1;
        }

        if (numDois%2== 0){
            numUm = numDois+1;
        }
        
        int quantImpares = (numUm-numDois);
        //int quantImparesMod = Math.abs(quantImpares);

        System.out.println(quantImpares);*/
        
    scanNumUm.close();
    scanNumDois.close();


    }
    
}
