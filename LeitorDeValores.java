public class LeitorDeValores {
    public static void main(String[] args) {
        
        int numUm = 2;
        int numDois = 5;
        int numTres = 7;

       if (numUm > numDois) {
            if (numDois > numTres){
                    System.out.println(numUm + " - " + numDois + " - " + numTres);
                }
            else if (numDois < numTres){
                    System.out.println(numUm + " - " + numTres + " - " + numDois);
                }            
        }

        else if (numDois > numUm) {
            if (numUm > numTres){
                    System.out.println(numDois + " - " + numUm + " - " + numTres);
                }
            else if (numUm < numTres){
                    System.out.println(numDois + " - " + numTres + " - " + numUm);
                }            
        }

        else if (numTres > numUm) {
            if (numUm > numDois){
                    System.out.println(numTres + " - " + numUm + " - " + numDois);
                }
            else if (numUm < numDois){
                    System.out.println(numTres + " - " + numDois + " - " + numUm);
                }            
        }        
    }
}
