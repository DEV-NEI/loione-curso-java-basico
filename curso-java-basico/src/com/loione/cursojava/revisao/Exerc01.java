package com.loione.cursojava.revisao;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o primeiro n�mero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com segundo n�mero:");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("Primeiro n�mero � o maior " + num1);
		} else {
			System.out.println("Segundo n�mero � o maior " + num2); 
			
		}
		
		

	}

}
