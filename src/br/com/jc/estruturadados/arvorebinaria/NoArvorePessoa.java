package br.com.jc.estruturadados.arvorebinaria;

import br.com.jc.estruturadados.modelos.Pessoa;

public class NoArvorePessoa extends NoArvore<Pessoa> {

	public NoArvorePessoa(Pessoa valor) {
		super(valor);
	}

	@Override
	public int peso() {
		return this.valor.getId();
	}

}
