 /*Leia 2 valores inteiros (A e B). 
        Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
        indicando se os valores lidos são múltiplos entre si.
        
        Entrada
        A entrada contém valores inteiros.
        
        Saída
        A saída deve conter uma das mensagens conforme descrito acima.
        
         Exemplo de Entrada	              Exemplo de Saída
                6 24                        Sao Multiplos
                6 25                       Nao sao Multiplos
        */

import java.util.Scanner;

public class MultiplosComStrings {
    public static void main(String[] args) {
        
        System.out.println("Insira o número e o resultado:");
        Scanner scanEntrada = new Scanner (System.in);
        String entrada = scanEntrada.nextLine();

        String primeiroNum = entrada.split(" ")[0];
        String resultado = entrada.split(" ")[1];        

        int numUm = Integer.parseInt(primeiroNum);
        int result = Integer.parseInt(resultado);
        int numDois = result/numUm;
        
        if (numUm * numDois == result){
            System.out.println(numUm + " e " + result + " são múltiplos");
        } else{
            System.out.println(numUm + " e " + result + " não são múltiplos");
        }

        scanEntrada.close();
        
    }

}
