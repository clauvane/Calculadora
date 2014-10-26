package br.com.clauvane.calculadora.modelo;

import java.math.BigDecimal;

public class Soma extends OperacaoStub{

	@Override
	public BigDecimal calcular(BigDecimal primeiroNumero, BigDecimal segundoNumero) {
		return primeiroNumero.add(segundoNumero).setScale(2, BigDecimal.ROUND_UP);
	}
	
}
