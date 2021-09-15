/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
  A média dos números 4, 5 e 6. 
  A soma das duas médias.
  A média das médias. */

public class Medias {
    public static void main(String[] args) {
        
    int num1 = 8;
    int num2 = 9;
    int num3 = 7;
    int num4 = 4;
    int num5 = 5;
    int num6 = 6;

    double media1 = (num1+num2+num3)/3;
    System.out.println("A média dos três primeiros números é " + media1);

    double media2 = (num4+num5+num6)/3;
    System.out.println("A média dos três últimos números é " + media2);

    double mediasMedias = (media1+media2)/2;
    System.out.println("A média entre as duas médias obtidas é " + mediasMedias);

    double mediaGeral = (num1+num2+num3+num4+num5+num5)/6;
    System.out.println("A média de todos os números é " + mediaGeral);

    }
}
