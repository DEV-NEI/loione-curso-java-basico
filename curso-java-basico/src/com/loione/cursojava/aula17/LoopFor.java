package com.loione.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i tem valor:" + i);
		}
		System.out.println();
		
		//System.out.println(i);
		
		for (int i = 5; i > 0; i--) {
			System.out.println("i tem valor: " + i);
		}

		System.out.println();
		  //Utilizando mais de uma  varíavel i e j
		
		for (int i=0, j=10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}
		
	}

}
