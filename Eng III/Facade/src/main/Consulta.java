package main;

import cd.Armazem;

public class Consulta {
	
	public static void main(String[]args) {
		Armazem armazem = new Armazem();
		int atualizar = 0;
		
		//atualizar o n�mero de mercadorias recebidas
		atualizar = armazem.recebido(1000, 500);
		System.out.println("Estoque atual P�s recebimento:");
		System.out.println(atualizar);
		
		//atualizar o n�mero de mercadorias avariadas
		atualizar = armazem.avaria(1500, 250);
		System.out.println("Estoque atual P�s consulta de avaria:");
		System.out.println(atualizar);
		
		//atualizar o n�mero de mercadorias distribuidas entre armaz�ns 
		atualizar = armazem.distribuir(1250, 4);
		System.out.println("Estoque atual P�s divis�o entre armaz�ns:");
		System.out.println(atualizar);
	}
}

