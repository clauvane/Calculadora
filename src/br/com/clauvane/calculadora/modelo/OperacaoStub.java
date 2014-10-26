package br.com.clauvane.calculadora.modelo;

import java.math.BigDecimal;

public class OperacaoStub implements Operacao{

	@Override
	public BigDecimal calcular(BigDecimal numero) {
		return new BigDecimal(0);
	}

	@Override
	public BigDecimal calcular(BigDecimal primeiroNumero, BigDecimal segundoNumero) {
		return new BigDecimal(0);
	}

}
