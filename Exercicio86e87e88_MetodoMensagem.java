/*86) Crie um programa que tenha um procedimento Gerador() que, quando chamado,
mostre a mensagem "Olá, Mundo!" com algum componente visual (linhas)
Ex: Ao chamar Gerador() aparece:
+-------=======------+
Olá, Mundo!
+-------=======------+


87) Crie um programa que melhore o procedimento Gerador() da questão anterior
para que mostre uma mensagem personalizada, passada como parâmetro.
Ex: Ao chamar Gerador("Aprendendo Portugol") aparece:
+-------=======------+
Aprendendo Portugol
+-------=======------+

*
*
*88) Crie um programa que melhore o procedimento Gerador() da questão anterior
para que mostre uma mensagem vário
Ex: Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
+-------=======------+
Aprendendo Portugol
Aprendendo Portugol
Aprendendo Portugol
Aprendendo Portugol
+-------=======------+*/

public class Exercicio86e87e88_MetodoMensagem {

	public static void main(String[] args) {

		gerador("Olá Mundo!");
		
		System.out.println("\n\n");
		
		gerador ("Aprendendo Portugol");
		
		System.out.println("\n\n");
		
		geradorX("Aprendendo Portugol Repetidamente", 4);

	}

	static void gerador(String mensagem) {
		System.out.println("+-------=======------+");
		System.out.println(mensagem);
		System.out.println("+-------=======------+");
	}

	static void geradorX(String mensagem, int vezes) {
		System.out.println("+-------=======------+");
		for (int i = 0; i < vezes; i++) {
			System.out.println(mensagem);
		}
		System.out.println("+-------=======------+");

	}

}
