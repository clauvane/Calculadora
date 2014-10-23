package br.com.clauvane.calculadora.visao;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	private JButton botaoDeMaisOuMenos;
	private JButton botaoDeDesfazer;
	private JButton botaoDeApagarTudo;
	private JButton botaoDeIgual;

	private JLabel painelDeRodape;

	public CalculadoraFrame(String titulo) {
		super(titulo);
		init();
		painelPrincipal.add(BorderLayout.NORTH, visor);
		painelPrincipal.add(BorderLayout.CENTER, getPainelMeio());
		this.add(BorderLayout.CENTER, painelPrincipal);
		this.add(BorderLayout.SOUTH, painelDeRodape);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(450, 200);
	}

	private void init() {
		painelPrincipal = new JPanel();
		visor = new JTextField(22);
		visor.setHorizontalAlignment(JTextField.RIGHT);
		visor.setEditable(false);
		visor.setFont(new Font("Arial Bold", Font.BOLD, 18));
		visor.setText("123456789");
		
		painelDeRodape = new JLabel(" Desenvolvido por Clauvane. Github: clauvane");
		
		botaoNumero1 = new JButton("1");
		botaoNumero2 = new JButton("2");
		botaoNumero3 = new JButton("3");
		botaoNumero4 = new JButton("4");
		botaoNumero5 = new JButton("5");
		botaoNumero6 = new JButton("6");
		botaoNumero7 = new JButton("7");
		botaoNumero8 = new JButton("8");
		botaoNumero9 = new JButton("9");
		botaoNumero0 = new JButton("0");
		botaoDeMaisOuMenos = new JButton("+/-");
		botaoDePonto = new JButton(".");

		botaoDeSoma = new JButton("+");
		botaoDeSubtracao = new JButton("-");
		botaoDeMultiplicacao = new JButton("*");
		botaoDeDivisao = new JButton("/");
		botaoDeInverso = new JButton("1/N");
		botaoDePorcentagem = new JButton("%");
		botaoDePotencia = new JButton("X^");
		botaoDeRadiciacao = new JButton("Raiz");
		botaoDeApagarTudo = new JButton("Clear");
		botaoDeDesfazer = new JButton("<--");
		botaoDeIgual = new JButton("=");
		
	}
	
	public JPanel getPainelMeio(){
		GridLayout grid = new GridLayout(1, 1);
		JPanel painelMeio = new JPanel(grid);
		painelMeio.add(getPainelNumeros());
		painelMeio.add(getPainelOperacoes());
		
		return painelMeio;
	}
	
	public JPanel getPainelNumeros(){
		GridLayout grid = new GridLayout(4, 3);
		JPanel painelNumeros = new JPanel(grid);
		painelNumeros.add(botaoNumero1);
		painelNumeros.add(botaoNumero2);
		painelNumeros.add(botaoNumero3);
		painelNumeros.add(botaoNumero4);
		painelNumeros.add(botaoNumero5);
		painelNumeros.add(botaoNumero6);
		painelNumeros.add(botaoNumero7);
		painelNumeros.add(botaoNumero8);
		painelNumeros.add(botaoNumero9);
		painelNumeros.add(botaoDeMaisOuMenos);
		painelNumeros.add(botaoNumero0);
		painelNumeros.add(botaoDePonto);
		
		return painelNumeros;
	}
	
	public JPanel getPainelOperacoes(){
		GridLayout grid = new GridLayout(4, 3);
		JPanel painelOperacoes = new JPanel(grid);
		painelOperacoes.add(botaoDeSoma);
		painelOperacoes.add(botaoDeSubtracao);
		painelOperacoes.add(botaoDeMultiplicacao);
		painelOperacoes.add(botaoDeDivisao);
		painelOperacoes.add(botaoDePorcentagem);
		painelOperacoes.add(botaoDeInverso);
		painelOperacoes.add(botaoDeIgual);
		painelOperacoes.add(botaoDePotencia);
		painelOperacoes.add(botaoDeRadiciacao);
		painelOperacoes.add(botaoDeDesfazer);
		painelOperacoes.add(botaoDeApagarTudo);
		
		return painelOperacoes;
	}
	
}
