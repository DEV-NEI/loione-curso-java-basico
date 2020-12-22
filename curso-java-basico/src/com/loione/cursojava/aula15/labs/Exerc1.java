package com.loione.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Número 1: ");
		int num1 = scan.nextInt();
		
		System.out.println("Número 2:");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("Número 1 maior");
		} else {
			System.out.println("Número 2 maior");
		}
		

	}

}
