
//57) Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
//No final, mostre o total de salários pagos aos homens e o total pago às
//mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
//sempre que ler os dados de um funcionário.

import java.util.Scanner;

public class Exercicio57_SomaSalariosAteUsuarioDesejar {

	public static void main(String[] args) {

		// Scanner scInicio = new Scanner(System.in);
		Scanner scSexo = new Scanner(System.in);
		Scanner scSalario = new Scanner(System.in);
		Scanner scOpcao = new Scanner(System.in);

		System.out.println("\t\t  DIGITE:\n[1]Entrar no programa\t[2]Sair do programa");
		int opcao = scOpcao.nextInt();

		double salarioTotalMasc = 0;
		double salarioTotalFem = 0;		

		while (opcao != 2) {

			System.out.println("\n    QUAL O SEXO DO(A) FUNCIONÁRIO(A)?\n    [1] Masculino\t[2] Feminino");
			int sexo = scSexo.nextInt();			
			
			if (sexo == 1) {
				System.out.println("    DIGITE O SALÁRIO DO FUNCIONÁRIO:");
				double salario = scOpcao.nextDouble();
				salarioTotalMasc += salario;
			} else if (sexo == 2){
				System.out.println("    DIGITE O SALÁRIO DA FUNCIONÁRIA:");
				double salario = scOpcao.nextDouble();
				salarioTotalFem += salario;
			}
			
			System.out.println("\n\t\tDIGITE:\n[1] Continuar\t[2] Sair do programa");
			opcao = scOpcao.nextInt();
		}

		scOpcao.close();
		scSexo.close();
		scSalario.close();
		
		System.out.println("\nTotal pago a funcionários homens: R$" + salarioTotalMasc);
		System.out.println("Total pago a funcionárias mulheres: R$" + salarioTotalFem);

	}

}
