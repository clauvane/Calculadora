package br.com.clauvane.calculadora.visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraFrame extends JFrame{

	private static final long serialVersionUID = -8697156489326717662L;
	
	private JPanel painelPrincipal;
	
	private JTextField visor;
	
	private JButton botaoNumero0;
	private JButton botaoNumero1;
	private JButton botaoNumero2;
	private JButton botaoNumero3;
	private JButton botaoNumero4;
	private JButton botaoNumero5;
	private JButton botaoNumero6;
	private JButton botaoNumero7;
	private JButton botaoNumero8;
	private JButton botaoNumero9;
	private JButton botaoDeSoma;
	private JButton botaoDeSubtracao;
	private JButton botaoDeMultiplicacao;
	private JButton botaoDeDivisao;
	private JButton botaoDeInverso;
	private JButton botaoDePorcentagem;
	private JButton botaoDePotencia;
	private JButton botaoDeRadiciacao;
	private JButton botaoDePonto;

	public CalculadoraFrame(String titulo) {
		super(titulo);
		init();
	}

	private void init() {
		painelPrincipal = new JPanel();
		visor = new JTextField(8);
		botaoNumero0 = new JButton("0");
		botaoNumero1 = new JButton("1");
		botaoNumero2 = new JButton("2");
		botaoNumero3 = new JButton("3");
		botaoNumero4 = new JButton("4");
		botaoNumero5 = new JButton("5");
		botaoNumero6 = new JButton("6");
		botaoNumero7 = new JButton("7");
		botaoNumero8 = new JButton("8");
		botaoNumero9 = new JButton("9");
		botaoDeSoma = new JButton("+");
		botaoDeSubtracao = new JButton("-");
		botaoDeMultiplicacao = new JButton("*");
		botaoDeDivisao = new JButton("/");
		botaoDeInverso = new JButton("1/N");
		botaoDePorcentagem = new JButton("%");
		botaoDePotencia = new JButton("X^");
		botaoDeRadiciacao = new JButton("Raiz");
	}
	
	public JPanel getPainelTopo(){
		
		return null;
	}
	
	public JPanel getPainelMeio(){
		return null;
	}
	
	public JPanel getPainelBaixo(){
		return null;
	}
	
}
