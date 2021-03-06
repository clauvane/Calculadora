package br.com.clauvane.calculadora.modelo;

import java.math.BigDecimal;

public class Radiciacao extends OperacaoStub{

	@Override
	public BigDecimal calcular(BigDecimal numero) {
		return new BigDecimal(Math.sqrt(numero.doubleValue())).setScale(2, BigDecimal.ROUND_UP);
	}
	
}
