/*89) Crie um programa que melhore o procedimento Gerador() da questão anterior
para que o programador possa escolher uma entre três bordas:

+-------=======------+ Borda 1
~~~~~~~~:::::::~~~~~~~ Borda 2
<<<<<<<<------->>>>>>> Borda 3

Ex: Uma chamada válida seria Gerador("Portugol Studio", 3, 2)
~~~~~~~~:::::::~~~~~~~
Portugol Studio
Portugol Studio
Portugol Studio
~~~~~~~~:::::::~~~~~~~*/

public class Exercicio89_MetodoMensagemVezesComOpcoesDeBorda {

	public static void main(String[] args) {

		gerarMensagem("Portugol Studio", 3, 2);

	}

	static void gerarMensagem(String mensagem, int vezes, int borda) {

		if (borda == 1) {
			System.out.println("+-------=======------+");
			for (int i = 0; i <= vezes; i++) {
				System.out.println(mensagem);
			}
			System.out.println("+-------=======------+");
		} else if (borda == 2) {
			System.out.println("~~~~~~~~:::::::~~~~~~~");
			for (int i = 0; i <= vezes; i++) {
				System.out.println(mensagem);
			}
			System.out.println("~~~~~~~~:::::::~~~~~~~");
		} else if (borda == 3) {
			System.out.println("<<<<<<<<------->>>>>>>");
			for (int i = 0; i <= vezes; i++) {
				System.out.println(mensagem);
			}
			System.out.println("<<<<<<<<------->>>>>>>");
		}
	}

}
