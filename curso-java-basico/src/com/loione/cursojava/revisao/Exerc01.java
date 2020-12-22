package com.loione.cursojava.revisao;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com segundo número:");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("Primeiro número é o maior " + num1);
		} else {
			System.out.println("Segundo número é o maior " + num2); 
			
		}
		
		

	}

}
