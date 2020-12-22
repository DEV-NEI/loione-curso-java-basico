package com.loione.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um número: ");
		int numero = scan.nextInt();
		
		if (numero >= 0) {
			System.out.println("O valor é positivo");
		} else {
			System.out.println("O valor é negativo");
		}

	}

}
