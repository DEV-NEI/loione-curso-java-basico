package com.loione.cursojava.nei;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	/*	
		System.out.println("Qual o seu nome: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println(nome + " voc� � maior de idade.");
			System.out.println("Voc� tem " + idade + " anos.");
		}else {
		System.out.println(nome + " Voc� � menor de idade");
		System.out.println("Voc� tem " + idade + " anos.");
		}
*/
		
		
		//IF-ELSE (M�ltiplos)
		//Comprar um item
		//Barato <=10
		//10 > valor < 15 - Pedir desconto
		//15 >= valor 17 - pesquisar mais
		// >= 17 - muito caro
		
		System.out.println("Entre com o pre�o do item: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Est� barato, pode comprar."); 
		} else if (valor > 10 && valor < 15) {
			System.out.println("Voc� pode pedir um desconto.");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Voc� pode pesquisar mais."); 
		} else { // valor >=17
			System.out.println("Est� muito caro.");
		}
		
		
		
		
		
	}

}
