package com.loione.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro preço:");
		double preco1 = scan.nextDouble();
		
		System.out.println("Entre com o segundo valor:");
		double preco2 = scan.nextDouble();
		
		System.out.println("Entre com o terceiro valor:");
		double preco3 = scan.nextDouble();
		
		if(preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Compre o produto 1");
		} else if (preco2 <= preco1 && preco2 <= preco3 ) {
			System.out.println("Compre o produto 2");			
		} else {
			System.out.println("Compre o produto 3");
		}

	}

}
