package com.loione.cursojava.revisao;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com uma letra (M/F):");
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("f")) {
			System.out.println("F -feminino");
		} else if (letra.equalsIgnoreCase("m")) {
			System.out.println("M - masculino");
		} else {
			System.out.println("Sexo Inválido.");
		}
	}

}
