package br.com.clauvane.calculadora.modelo;

import java.math.BigDecimal;

public class Potenciacao extends OperacaoStub{

	public BigDecimal calcular(BigDecimal primeiroNumero, BigDecimal segundoNumero) {
		return new BigDecimal(Math.pow(primeiroNumero.doubleValue(), segundoNumero.doubleValue())).setScale(2, BigDecimal.ROUND_UP);
	}
	
}
