import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        
        System.out.println("Informe o número para verificarmos se o mesmo é um número perfeito: ");
        Scanner scanNumeroInformado = new Scanner(System.in);
        int numeroInformado = scanNumeroInformado.nextInt();
        int total = 0;

        for (int i = (numeroInformado - 1); i > 0; i--) {
            if (numeroInformado % i == 0){
                total += i;                
            }  
        }

        if (total == numeroInformado){
            System.out.println("Número é perfeito!");                             
        }
        else {
            System.out.println("Número não é perfeito!");                
        }

        scanNumeroInformado.close();

    }
}


/*public class NumeroPerfeito2 {
    public static void main(String[] args) {
        int numeroInformado = 6;
        int total = 0;

        for (int i = (numeroInformado - 1); i > 0; i--) {
            if (numeroInformado % i == 0) {
                total += i;
            }
        }

        if(total == numeroInformado) {
            System.out.println("Numero é perfeito!");
        } else {
            System.out.println("Numero é imperfeito!");
        }
    }
}
*/