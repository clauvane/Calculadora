package br.com.clauvane.calculadora.modelo;

import java.math.BigDecimal;

public class Divisao extends OperacaoStub{

	@Override
	public BigDecimal calcular(BigDecimal primeiroNumero, BigDecimal segundoNumero) {
		BigDecimal resultado;
		try{
			resultado = primeiroNumero.divide(segundoNumero, 2, BigDecimal.ROUND_HALF_UP);
		}catch(ArithmeticException ae){
			return new BigDecimal(0);
		}
		return resultado;
	}

}
