package com.loione.cursojava.revisao;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra:");
		String letra = scan.next();
		
		if (letra.length() > 1) {
			System.out.println("Entrada inválida.");
		} else {
		
		switch(letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			System.out.println("São vogais.");
			break;
	    default:
	    	System.out.println("São consoantes.");
	    	break;
			
		}
		}

	}

}
