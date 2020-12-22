package com.loione.cursojava.aula13.labs;

import java.util.Scanner;

public class ReadyKeyboard {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o seu nome? ");
		String nome = scan.nextLine();
		//System.out.println("Seu nome é " + nome);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		//System.out.println("Sua idade é " + idade + " anos");
		System.out.println();
		
		System.out.println("O seu nome é " + nome + " e sua idade é " + idade + " anos." ) ;
		
	}

}
