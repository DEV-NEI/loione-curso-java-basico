package com.loione.cursojava.revisao;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um valor:");
		int valor = scan.nextInt();
		
		if (valor > 0) {
			System.out.println("Valor positivo");
		} else {
			System.out.println("Valor negativo");
		}

	}

}
