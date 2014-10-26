package br.com.clauvane.calculadora.modelo;

import java.math.BigDecimal;

public interface Operacao {
	BigDecimal calcular(BigDecimal numero);
	BigDecimal calcular(BigDecimal primeiroNumero, BigDecimal segundoNumero);
}
