package br.com.clauvane.calculadora.modelo;

public interface Operacao {
	double calcular(double numero);
	double calcular(double primeiroNumero, double segundoNumero);
}
