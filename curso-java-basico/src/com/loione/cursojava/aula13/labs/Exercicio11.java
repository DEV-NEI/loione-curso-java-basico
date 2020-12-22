package com.loione.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo numero");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com um numero fracionado:");
		double num3 = scan.nextDouble();
		
		int resultado1 = (num1 * 2) * (num2 / 2);
		double resultado2 = (num1 * 3) + num3;
		double resultado3 = Math.pow(num3, 3);
		
		System.out.println("a. O produto do dobro do primeiro com metade do segundo:" + resultado1);
		System.out.println("b. A soma do triplo do primeiro com o terceiro:" + resultado2);
		System.out.println("O teceiro elevado ao cubo: " + resultado3);
		
		
		

	}

}
