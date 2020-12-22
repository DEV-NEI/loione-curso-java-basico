package com.loione.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho de arquivo(em MB):");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Entre com  a velocidade(em Mbps):");
		double velInternet = scan.nextDouble();
		
		double tempo = tamArquivo / velInternet;
		
		System.out.println("Tempo de download: " + tempo);
		
		
		
		
		
		

	}

}
