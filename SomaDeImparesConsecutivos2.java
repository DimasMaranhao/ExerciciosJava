import java.util.Scanner; 
 
public class SomaDeImparesConsecutivos2 { 
    public static void main(String[] args) { 
         
        System.out.println("Insira quantas vezes você quer verificar\na soma dos números ímpares entre dois números:"); 
        Scanner scanVezes = new Scanner (System.in); 
        int vezes = scanVezes.nextInt();
        Scanner scanEntrada; 
         
        int contador = 0; 
 
        do { 
            System.out.println("Insira dois números (separados por espaço)\nparaverificarmos a soma dos números ímpares entre eles:"); 
            scanEntrada = new Scanner (System.in); 
            String entrada = scanEntrada.nextLine(); 
             
            String valorUm = entrada.split(" ")[0]; 
            String valorDois = entrada.split(" ")[1]; 
 
            int numUm = Integer.parseInt(valorUm); 
            int numDois = Integer.parseInt(valorDois); 
 
            int soma = 0; 
 
            if (numUm%2 != 0){ 
                numUm = numUm+1; 
            } 
 
            if (numDois%2 != 0){ 
                numDois = numDois-1; 
            } 
 
            if (numDois > numUm){     
                for (int i = numUm; i < numDois; i++) { 
                    if (i%2 != 0){ 
                        soma += i; 
                    } 
                    // contador += 1; 
                } 
            } 
             
            if (numUm > numDois){ 
                for (int i = numDois; i < numUm; i++) {            
                    numUm = numUm-1; 
                    numDois = numDois+1; 
                    if (i%2 != 0){ 
                        soma += i; 
                    } 
                    // contador += 1; 
                } 
            }
 
            System.out.println(soma); 
            contador += 1;
 
        }  while (contador < vezes);

        scanEntrada.close();
        scanVezes.close();
        
    } 
}