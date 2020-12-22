package com.loione.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em Celsius ºC:");
		double c = scan.nextDouble();
		
		double f = (c * 9/5) + 32;
		
		System.out.println("A temperatura em Farenheit é: " + f + "ºF");
		

	}

}
