package br.com.clauvane.calculadora.modelo;

public class OperacaoStub implements Operacao{

	@Override
	public double calcular(double numero) {
		return 0;
	}

	@Override
	public double calcular(double primeiroNumero, double segundoNumero) {
		return 0;
	}

}
