package com.loione.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o lado do quadrado:");
		double lado = scan.nextDouble();
		
		//area = lado * lado
		double area = Math.pow(lado, 2);
		
		System.out.println("A �ea do quadrado �: " + area);
		System.out.println("O dobro do quadrado �: "
				+ "" + (area * 2));
		
		

	}

}
