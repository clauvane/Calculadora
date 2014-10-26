package br.com.clauvane.calculadora.modelo;

import java.math.BigDecimal;

public class Porcentagem extends OperacaoStub{
	
	@Override
	public BigDecimal calcular(BigDecimal numero) {
		return numero.divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP);
	}
	
}
