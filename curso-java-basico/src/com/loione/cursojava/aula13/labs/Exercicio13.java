package com.loione.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Numero de horas trabalhadas no m�s:");
		double horas = scan.nextDouble();
		
		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto /100) *5;
		double ir = (salarioBruto /100) *11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Sal�rio Bruto " + salarioBruto);
		System.out.println("INSS " + inss );
		System.out.println("Sindicato " + sindicato);
		System.out.println("IR " + ir);
		System.out.println("Sal�rio l�quido " + salarioLiquido);
		

	}

}
