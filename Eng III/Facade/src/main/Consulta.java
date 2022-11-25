package main;

import cd.Armazem;

public class Consulta {
	
	public static void main(String[]args) {
		Armazem armazem = new Armazem();
		int atualizar = 0;
		
		//atualizar o número de mercadorias recebidas
		atualizar = armazem.recebido(1000, 500);
		System.out.println("Estoque atual Pós recebimento:");
		System.out.println(atualizar);
		
		//atualizar o número de mercadorias avariadas
		atualizar = armazem.avaria(1500, 250);
		System.out.println("Estoque atual Pós consulta de avaria:");
		System.out.println(atualizar);
		
		//atualizar o número de mercadorias distribuidas entre armazéns 
		atualizar = armazem.distribuir(1250, 4);
		System.out.println("Estoque atual Pós divisão entre armazéns:");
		System.out.println(atualizar);
	}
}

