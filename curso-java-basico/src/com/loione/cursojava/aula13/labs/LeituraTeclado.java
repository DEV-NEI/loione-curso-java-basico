package com.loione.cursojava.aula13.labs;

import java.util.Scanner;

public class LeituraTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String primeiroNome = scan.nextLine();
		System.out.println("O seu nome é: " +primeiroNome);
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade + " anos");
		

	}

}
