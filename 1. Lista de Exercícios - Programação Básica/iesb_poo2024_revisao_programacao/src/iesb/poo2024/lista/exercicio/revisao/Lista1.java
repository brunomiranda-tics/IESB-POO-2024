package iesb.poo2024.lista.exercicio.revisao;

import java.util.Scanner;

/*
*
Instituição: IESB
Disciplina:  Programação Orientada a Objetos (POO)
Objetivo:    Fornecer conhecimentos e práticas de programação OO.
Professor:   Bruno Miranda [bruno.marcos@iesb.edu.br]
Data:        2024/2S

# Prática: Exercícios de revisão de programação básica.
*
*/

public class Lista1 {

	// metodo construtor da classe
	public Lista1() {
		
	}
	
	public void executarExercicio1() {
		// implemente aqui a sua logica
		System.out.println("Você está no método executarExercicio1().");
		
		int count = 0;
		while(true) {
			
			int numeroLido = 0;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println(">> Digite um número:");			
			String imputUsuario = scanner.nextLine();
			
			Integer integer = Integer.parseInt(imputUsuario);
			numeroLido = integer.intValue();
			
			if(numeroLido % 2 == 0)
				count++;
						
			if(count == 2)
				break;
		}

		System.out.println("## Quantidade de interações necessárias: " + count);
	}
	
	public void executarExercicio2() {
		// implemente aqui a sua logica
		System.out.println("Você está no método executarExercicio2().");		
	}
	
	public void executarExercicio3() {
		// implemente aqui a sua logica
		System.out.println("Você está no método executarExercicio3().");		
	}
	
	public void executarExercicio4() {
		// implemente aqui a sua logica
		System.out.println("Você está no método executarExercicio4().");
	}
	
	public void executarExercicio5() {
		// implemente aqui a sua logica
		System.out.println("Você está no método executarExercicio5().");		
	}
}