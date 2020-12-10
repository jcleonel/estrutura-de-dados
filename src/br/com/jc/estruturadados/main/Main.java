package br.com.jc.estruturadados.main;

import java.util.Scanner;

import br.com.jc.estruturadados.listasligadas.ListaDuplamenteLigada;
import br.com.jc.estruturadados.listasligadas.ListaLigada;
import br.com.jc.estruturadados.modelos.Pessoa;
import br.com.jc.estruturadados.pilhas.Pilha;
import br.com.jc.estruturadados.vetores.Vetor;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a opcao desejada: ");
		System.out.println("1. Gerenciamento de memoria");
		System.out.println("2. Vetores");
		System.out.println("3. Lista ligada");
		System.out.println("4. Lista duplamente ligada");
		System.out.println("5. Pilha");

		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			break;
		case 2:
			fazerVetor();
			break;
		case 3:
			fazerListaLigada();
			break;
		case 4:
			fazerListaDuplamenteLigada();
			break;
		case 5:
			fazerPilha();
			break;
		}

		sc.close();
	}

	private static void fazerPilha() {
		Pilha<Pessoa> pilhaPessoas = new Pilha<Pessoa>();
		System.out.println(pilhaPessoas.estaVazia());
		pilhaPessoas.empilhar(new Pessoa(1, "Jean 1"));
		pilhaPessoas.empilhar(new Pessoa(2, "Jean Leonel 2"));
		pilhaPessoas.empilhar(new Pessoa(3, "Jean Carlos 3"));
		Pessoa p1 = pilhaPessoas.desempilhar();
		System.out.println(p1.toString());
	}

	private static void fazerListaDuplamenteLigada() {
		ListaDuplamenteLigada<Pessoa> listaPessoas = new ListaDuplamenteLigada<Pessoa>();
		listaPessoas.inserir(new Pessoa(1, "Jean 1"));
		listaPessoas.inserir(new Pessoa(2, "Jean Leonel 2"));
		listaPessoas.inserir(new Pessoa(3, "Jean Carlos 3"));
		listaPessoas.inserirEm(1, new Pessoa(4, "JC 4"));
		listaPessoas.inserirEmPrimeiro(new Pessoa(5, "Carlos 5"));
		listaPessoas.inserirEmUltimo(new Pessoa(6, "Leonel 6"));
		System.out.println(listaPessoas.toString());
		Pessoa p = listaPessoas.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(100, "Pessoa Não Listada 100");
		System.out.println(listaPessoas.contem(p));
		System.out.println(listaPessoas.contem(pessoaErrada));
		System.out.println(listaPessoas.indice(p));
		System.out.println(listaPessoas.indice(pessoaErrada));
		listaPessoas.remover(p);
		System.out.println(listaPessoas.toString());
		listaPessoas.remover(0);
		System.out.println(listaPessoas.toString());
		for (int i = 0; i < listaPessoas.tamanho(); i++) {
			System.out.println(listaPessoas.recuperar(i).toString());
		}
	}

	private static void fazerListaLigada() {
		ListaLigada<Pessoa> listaPessoas = new ListaLigada<Pessoa>();
		listaPessoas.inserir(new Pessoa(1, "Jean 1"));
		listaPessoas.inserir(new Pessoa(2, "Jean Leonel 2"));
		listaPessoas.inserir(new Pessoa(3, "Jean Carlos 3"));
		listaPessoas.inserirEm(1, new Pessoa(4, "JC 4"));
		listaPessoas.inserirEmPrimeiro(new Pessoa(5, "Carlos 5"));
		listaPessoas.inserirEmUltimo(new Pessoa(6, "Leonel 6"));
		System.out.println(listaPessoas.toString());
		Pessoa p = listaPessoas.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(100, "Pessoa Não Listada 100");
		System.out.println(listaPessoas.contem(p));
		System.out.println(listaPessoas.contem(pessoaErrada));
		System.out.println(listaPessoas.indice(p));
		System.out.println(listaPessoas.indice(pessoaErrada));
		listaPessoas.remover(p);
		System.out.println(listaPessoas.toString());
		listaPessoas.remover(0);
		System.out.println(listaPessoas.toString());
		for (int i = 0; i < listaPessoas.tamanho(); i++) {
			System.out.println(listaPessoas.recuperar(i).toString());
		}
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

	private static void fazerVetor() {
		Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>();
		vetorPessoas.inserir(new Pessoa(1, "Jean 1"));
		vetorPessoas.inserir(new Pessoa(2, "Jean Leonel 2"));
		vetorPessoas.inserir(new Pessoa(3, "JC 3"));
		vetorPessoas.inserir(new Pessoa(4, "TESTE 4"));
		vetorPessoas.inserirEm(1, new Pessoa(5, "Carlos 5"));
		System.out.println(vetorPessoas);

		System.out.println("Lista de pessoas: ");
		for (int i = 0; i < vetorPessoas.tamanho(); i++) {
			System.out.println(vetorPessoas.recuperar(i).getNome());
		}

		Pessoa p = vetorPessoas.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(900, "Marinete");
		System.out.println(vetorPessoas.contem(p));
		System.out.println(vetorPessoas.contem(pessoaErrada));
		System.out.println(vetorPessoas.indice(p));
		System.out.println(vetorPessoas.indice(pessoaErrada));
		vetorPessoas.remover(2);
		System.out.println(vetorPessoas);
		vetorPessoas.remover(p);
		System.out.println(vetorPessoas);
	}

}
