package com.loione.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ente com a primeira nota:");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if (media == 10) {
			System.out.println("Aprovado com Distinção " + media);
		} else if (media >= 7) {
			System.out.println("Aprovado " + media);
		} else {
			System.out.println("Reprovado " + media);
		}
				
	
		

	}

}
