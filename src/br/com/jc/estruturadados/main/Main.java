package br.com.jc.estruturadados.main;

import java.util.Scanner;

import br.com.jc.estruturadados.modelos.Pessoa;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a opção desejada: ");
		System.out.println("1. Gerenciamento de memória");

		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			break;
		default:
			extracted(opcao);
		}

		sc.close();
	}

	private static void extracted(int opcao) {
		throw new IllegalArgumentException("Unexpected value: " + opcao);
	}

	private static void fazerGerenciamentoMemoria() {

		System.out.println("-- Value-Types --");
		int a = 3;
		System.out.println(a);
		int b = a;
		System.out.println(b);
		b = 2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println();

		System.out.println("-- Reference-Types --");
		Pessoa p1 = new Pessoa(1, "Jean");
		System.out.println(p1.toString());		
		Pessoa p2 = p1;
		System.out.println(p2.toString());	
		p2.setNome("Jean Leonel");
		System.out.println(p1.toString());
		System.out.println(p2.toString());	
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}

}