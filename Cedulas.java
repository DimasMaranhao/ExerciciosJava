/*Leia um valor inteiro. 
A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1.
A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

Exemplo de Entrada:	                     Exemplo de Saída:
        576                             5 nota(s) de R$ 100,00
                                        1 nota(s) de R$ 50,00
                                        1 nota(s) de R$ 20,00
                                        0 nota(s) de R$ 10,00
                                        1 nota(s) de R$ 5,00
                                        0 nota(s) de R$ 2,00
                                        1 nota(s) de R$ 1,00

*/


import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        
        System.out.println("Digite  valor que você deseja realizar a troca: ");
        Scanner scanValor = new Scanner (System.in);
        int valor = scanValor.nextInt();

        int contadorCem = 0;
        int contadorCinquenta = 0;
        int contadorVinte = 0;
        int contadorDez = 0;
        int contadorCinco = 0;
        int contadorDois = 0;
        int contadorUm = 0;   
        
        while (valor>=1){
            if (valor >= 100){
                contadorCem = (valor/100);                
                valor = valor % 100;
            }
            else if (valor >= 50){
                contadorCinquenta = (valor/50);                
                valor = valor % 50;
            }
            else if (valor >= 20){
                contadorVinte = (valor/20);                
                valor = valor % 20;
            }
            else if (valor >= 10){
                contadorDez = (valor/10);                
                valor = valor % 10;
            }
            else if (valor >= 5){
                contadorCinco = (valor/5);                
                valor = valor % 5;
            }
            else if (valor >= 2){
                contadorDois = (valor/2);                
                valor = valor % 2;
            }
            else if (valor == 1){
                contadorCem = (valor/1);                
                valor = valor % 1;
            }
        }


        System.out.println(contadorCem + " nota(s) de R$ 100,00");
        System.out.println(contadorCinquenta + " nota(s) de R$ 50,00");
        System.out.println(contadorVinte + " nota(s) de R$ 20,00");
        System.out.println(contadorDez + " nota(s) de R$ 10,00");
        System.out.println(contadorCinco + " nota(s) de R$ 5,00");
        System.out.println(contadorDois + " nota(s) de R$ 2,00");
        System.out.println(contadorUm + " nota(s) de R$ 1,00");
        
        scanValor.close();
    }
}
