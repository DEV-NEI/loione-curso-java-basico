package com.loione.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite numero 1: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite numero 2: ");
		int num2 = scan.nextInt();
		
		System.out.println("A soma de " + num1 + " + " + num2 + " = " + (num1 + num2));	
				
	}

}

