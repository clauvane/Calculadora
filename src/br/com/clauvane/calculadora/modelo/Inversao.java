package br.com.clauvane.calculadora.modelo;

import java.math.BigDecimal;

public class Inversao extends OperacaoStub{

	@Override
	public BigDecimal calcular(BigDecimal numero) {
		return new BigDecimal(1).divide(numero, 2, BigDecimal.ROUND_UP);
	}

}
