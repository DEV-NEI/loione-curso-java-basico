package com.loione.cursojava.aula13.labs;

import java.util.Scanner;

public class TestesEstudo {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.nextLine();
		//System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		//System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		//System.out.println("Sua idade é: " + idade + " anos");
		

		System.out.println("Seu nome è " +nomeCompleto+ " você têm " +idade+ " anos");
	}

	
}
