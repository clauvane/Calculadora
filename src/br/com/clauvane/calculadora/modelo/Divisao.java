package br.com.clauvane.calculadora.modelo;

public class Divisao extends OperacaoStub{

	@Override
	public double calcular(double primeiroNumero, double segundoNumero) {
		return primeiroNumero / segundoNumero;
	}

}
