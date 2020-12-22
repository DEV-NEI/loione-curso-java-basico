package com.loione.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor hora?");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas no mês:");
		double horas = scan.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.println("O salário é de: " + salario);
		
		

	}

}
