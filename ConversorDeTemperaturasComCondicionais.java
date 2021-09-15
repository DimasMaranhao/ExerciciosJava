import java.util.Scanner;

public class ConversorDeTemperaturasComCondicionais {
    public static void main(String[] args) {

        System.out.print("Informe o valor da temperatura (Celsius) que você desesa conveter: ");
        Scanner leitor = new Scanner(System.in);
        int celsius = leitor.nextInt();
        System.out.println("");

        System.out.println(
            "Informe qual a temperatura desejada: \n" +
            "Kelvin (1)\n" +
            "Réaumur (2)\n" +
            "Rankine (3)\n" +
            "Fahrenheit (4)\n"
            );
        int conversao = leitor.nextInt();
        leitor.close();

        if(conversao < 1 || conversao > 4) {
            System.out.println("A Opção escolhida é inválida!");
            return;
        }
        
        switch (conversao) {
            case 1:
                float k = celsius + 273.15f;
                System.out.println("Temperatura Kelvin(K) = " + k);
                break;
            case 2:
                float re = celsius * 0.8f;
                System.out.println("Temperatura Réaumur(Re) = " + re);
                break;
            case 3:
                float ra = (celsius * 1.8f) + 32 + 459.67f;
                System.out.println("Temperatura Rankine(Ra) = " + ra);
                break;
            case 4:
                float f = (celsius * 1.8f) + 32;
                System.out.println("Temperatura Fahrenheit(F) = " + f);
                break;
        }


    }
}