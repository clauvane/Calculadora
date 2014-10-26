package br.com.clauvane.calculadora.visao;

import br.com.clauvane.calculadora.modelo.Divisao;
import br.com.clauvane.calculadora.modelo.Inversao;
import br.com.clauvane.calculadora.modelo.Multiplicacao;
import br.com.clauvane.calculadora.modelo.Operacao;
import br.com.clauvane.calculadora.modelo.Porcentagem;
import br.com.clauvane.calculadora.modelo.Potenciacao;
import br.com.clauvane.calculadora.modelo.Radiciacao;
import br.com.clauvane.calculadora.modelo.Soma;
import br.com.clauvane.calculadora.modelo.Subtracao;

public enum TipoOperacao {
	
	SOMA(new Soma()),
	SUBTRACAO(new Subtracao()),
	DIVISAO(new Divisao()),
	MULTIPLICACAO(new Multiplicacao()),
	POTENCIACAO(new Potenciacao()),
	INVERSAO(new Inversao()),
	RADICIACAO(new Radiciacao()),
	PORCENTAGEM(new Porcentagem());
	
	private Operacao operacao;
	
	private TipoOperacao(Operacao operacao) {
		this.operacao = operacao;
	}
	
	public Operacao getOperacao(){
		return operacao;
	}
}
