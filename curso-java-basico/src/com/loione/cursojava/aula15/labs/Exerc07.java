package com.loione.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com primeiro n�mero:");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo n�mero");
		int num2 = scan.nextInt();
		System.out.println("Entre com o terceiro n�mero");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3){
			System.out.println("Primeiro n�mero � o maior " + num1);
			} else if (num2 > num1 && num2 > num3) {
			System.out.println("Segundo n�mero � o maior " + num2);
		} else{
			System.out.println("Terceiro n�mero � o maior " + num3);
			
	   if (num1 < num2 && num1 < num3) {
			System.out.println("Primeiro n�mero � o menor " + num1);		
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("Segundo n�mero � o menor " + num2);
		} else {
			System.out.println("Terceiro n�mero � o menor " + num3);
		}

	}
	}
}


