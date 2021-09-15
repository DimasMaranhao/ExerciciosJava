/*Desenvolva um algoritmo em Java que leia um número inteiro
 e imprima o seu antecessor e seu sucessor;*/

import java.util.Scanner;

 public class AntecessorSucessor {
    public static void main(String[] args) {
    
        System.out.println("Digite um número: ");
        Scanner scanNumero = new Scanner(System.in);
        int numero = scanNumero.nextInt();

        int antecessor = numero -1;
        int sucessor = numero +1;

        System.out.println("Antecessor: " + antecessor + "; Número: " + numero + "; Sucessor: " + sucessor);

        scanNumero.close();
    }
}
