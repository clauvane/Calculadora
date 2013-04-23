package br.com.clauvane.calculadora.modelo;

public class Soma extends OperacaoStub{

	@Override
	public double calcular(double primeiroNumero, double segundoNumero) {
		return primeiroNumero + segundoNumero;
	}
	
}
