/*
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
Escreva para cada X e Y uma mensagem que indique se estes valores foram digitados
em ordem crescente ou decrescente.

Entrada
A entrada contém vários casos de teste.
Cada caso contém dois valores inteiros X e Y.
A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

Saída
Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente,
caso contrário imprima a mensagem “Decrescente”.

Exemplo de Entrada	        Exemplo de Saída
       5 4                      Decrescente
       7 2                      Decrescente
       3 8                      Crescente
       2 2
*/

import java.util.Scanner;

public class CrescenteDecrescente {
 public static void main(String[] args) {
     

    System.out.println("Digite dois números (separados por espaço) \npara verificarmos se foram inseridos em ordem crescente ou descrescente:");
    Scanner scanEntrada = new Scanner(System.in);
    String entrada = scanEntrada.nextLine();

    String primeiroNum = entrada.split(" ")[0];
    String segundoNum = entrada.split(" ")[1];

    int numUm = Integer.parseInt(primeiroNum);
    int numDois = Integer.parseInt(segundoNum);

    while (numUm != numDois){
        
        if (numUm < numDois){
            System.out.println("Crescente\n");
        } else{
            System.out.println("Decrescente\n");
        } 

        System.out.println("Digite dois números (separados por espaço) \npara verificarmos se foram inseridos em ordem crescente ou descrescente:");
        scanEntrada = new Scanner(System.in);
        entrada = scanEntrada.nextLine();

        primeiroNum = entrada.split(" ")[0];
        segundoNum = entrada.split(" ")[1];

        numUm = Integer.parseInt(primeiroNum);
        numDois = Integer.parseInt(segundoNum); 
    
        
    }    

    scanEntrada.close();
 }   
}
