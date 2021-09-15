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

public class Multiplos {
    public static void main(String[] args) {
        
        System.out.println("Insira o 1º número:");
        Scanner scanPrimeiroNumero = new Scanner (System.in);
        int primeiroNumero = scanPrimeiroNumero.nextInt();

        System.out.println("Insira o resultado esperado:");
        Scanner scanResultado = new Scanner (System.in);
        int resultado = scanResultado.nextInt();

        int segundoNumero = resultado / primeiroNumero;
        
        if (segundoNumero * primeiroNumero == resultado){
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        scanPrimeiroNumero.close();
        scanResultado.close();

    }

}
