/*2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas
para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!*/

import java.util.Scanner;

public class Exercicio2_NomeBoasVindas {

	public static void main(String[] args) {

		Scanner scNome = new Scanner(System.in);

		System.out.println("Qual o seu nome?");
		String nome = scNome.nextLine();

		scNome.close();

		System.out.println("Olá " + nome + ", é um prazer te conhecer!");

	}

}
