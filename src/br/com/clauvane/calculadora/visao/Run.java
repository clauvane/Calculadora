package br.com.clauvane.calculadora.visao;

public class Run {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				new CalculadoraFrame("Calculadora");
			}
		};
		
		r.run();
	}
}
