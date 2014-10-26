package br.com.clauvane.calculadora.visao;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

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
	private JButton botaoDeLimparTela;
	private JButton botaoDeResultado;

	private JLabel painelDeRodape;

	public CalculadoraFrame(String titulo) {
		super(titulo);
		init();
		painelPrincipal.add(BorderLayout.NORTH, visor);
		painelPrincipal.add(BorderLayout.CENTER, getPainelMeio());
		painelPrincipal.add(BorderLayout.SOUTH, painelDeRodape);
		this.setContentPane(painelPrincipal);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(450, 200);
		this.requestFocus();
		
		adicionandoEventosAosBotoesNumericos();
	}

	private void adicionandoEventosAosBotoesNumericos() {
		InputMap inputMap = this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_0, 0),"botao0");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_1, 0),"botao1");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_2, 0),"botao2");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_3, 0),"botao3");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_4, 0),"botao4");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_5, 0),"botao5");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_6, 0),"botao6");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_7, 0),"botao7");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_8, 0),"botao8");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_9, 0),"botao9");
		
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD0, 0),"botao0");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1, 0),"botao1");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2, 0),"botao2");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3, 0),"botao3");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4, 0),"botao4");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5, 0),"botao5");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6, 0),"botao6");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7, 0),"botao7");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8, 0),"botao8");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9, 0),"botao9");
		
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_PERIOD, 0),"ponto");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DECIMAL, 0),"ponto");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),"resultado");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),"limparTela");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0),"desfazer");
		
		this.getRootPane().getActionMap().put("botao0", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoNumero0.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("botao1", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoNumero1.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("botao2", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoNumero2.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("botao3", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoNumero3.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("botao4", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoNumero4.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("botao5", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoNumero5.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("botao6", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoNumero6.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("botao7", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoNumero7.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("botao8", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoNumero8.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("botao9", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoNumero9.doClick();
		    }
		});
		
		
		
		this.getRootPane().getActionMap().put("ponto", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoDePonto.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("resultado", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoDeResultado.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("limparTela", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoDeLimparTela.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("desfazer", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoDeDesfazer.doClick();
		    }
		});
	}

	private void init() {
		painelPrincipal = new JPanel();
		visor = new JTextField(22);
		visor.setHorizontalAlignment(JTextField.RIGHT);
		visor.setEditable(false);
		visor.setFont(new Font("Arial Bold", Font.BOLD, 18));
		
		painelDeRodape = new JLabel(" Desenvolvido por Clauvane. Github: clauvane");
		
		botaoNumero1 = new JButton("1");
		botaoNumero1.addActionListener(escreverNumeroDoBotaoNoVisor());
		botaoNumero2 = new JButton("2");
		botaoNumero2.addActionListener(escreverNumeroDoBotaoNoVisor());
		botaoNumero3 = new JButton("3");
		botaoNumero3.addActionListener(escreverNumeroDoBotaoNoVisor());
		botaoNumero4 = new JButton("4");
		botaoNumero4.addActionListener(escreverNumeroDoBotaoNoVisor());
		botaoNumero5 = new JButton("5");
		botaoNumero5.addActionListener(escreverNumeroDoBotaoNoVisor());
		botaoNumero6 = new JButton("6");
		botaoNumero6.addActionListener(escreverNumeroDoBotaoNoVisor());
		botaoNumero7 = new JButton("7");
		botaoNumero7.addActionListener(escreverNumeroDoBotaoNoVisor());
		botaoNumero8 = new JButton("8");
		botaoNumero8.addActionListener(escreverNumeroDoBotaoNoVisor());
		botaoNumero9 = new JButton("9");
		botaoNumero9.addActionListener(escreverNumeroDoBotaoNoVisor());
		botaoNumero0 = new JButton("0");
		botaoNumero0.addActionListener(escreverNumeroDoBotaoNoVisor());
		botaoDeMaisOuMenos = new JButton("+/-");
		botaoDeMaisOuMenos.addActionListener(inverterSinalDoNumeroNoVisor());
		botaoDePonto = new JButton(".");
		botaoDePonto.addActionListener(escreverPontoNoNumeroDoVisor());

		botaoDeSoma = new JButton("+");
		botaoDeSubtracao = new JButton("-");
		botaoDeMultiplicacao = new JButton("*");
		botaoDeDivisao = new JButton("/");
		botaoDeInverso = new JButton("1/N");
		botaoDePorcentagem = new JButton("%");
		botaoDePotencia = new JButton("X^");
		botaoDeRadiciacao = new JButton("Raiz");
		botaoDeLimparTela = new JButton("Clear");
		botaoDeLimparTela.addActionListener(limparTela());
		botaoDeDesfazer = new JButton("<--");
		botaoDeDesfazer.addActionListener(desfazer());
		botaoDeResultado = new JButton("=");
		
	}
	
	private ActionListener escreverNumeroDoBotaoNoVisor(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textoDoVisor = visor.getText();
				String textoDoBotao = ((JButton)e.getSource()).getText();
				textoDoVisor += textoDoBotao;
				visor.setText(textoDoVisor);
			}
		};
	}
	
	private ActionListener escreverPontoNoNumeroDoVisor(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textoDoVisor = visor.getText();
				if (!textoDoVisor.contains(".")) {
					String textoDoBotao = ((JButton)e.getSource()).getText();
					textoDoVisor += textoDoBotao;
					visor.setText(textoDoVisor);
				}
			}
		};
	}
	
	private ActionListener inverterSinalDoNumeroNoVisor(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textoDoVisor = visor.getText();
				if (!textoDoVisor.contains("-")) {
					String textoDoBotao = "-";
					textoDoBotao += textoDoVisor;
					visor.setText(textoDoBotao);
				}else{
					textoDoVisor = textoDoVisor.replace('-', ' ').trim();
					visor.setText(textoDoVisor);
				}
			}
		};
	}
	
	private ActionListener desfazer(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textoDoVisor = visor.getText();
				if (!textoDoVisor.isEmpty()) {
					textoDoVisor = textoDoVisor.substring(0, textoDoVisor.length()-1);
					visor.setText(textoDoVisor);
				}
			}
		};
	}
	
	private ActionListener limparTela(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				visor.setText("");
			}
		};
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
		painelOperacoes.add(botaoDeResultado);
		painelOperacoes.add(botaoDePotencia);
		painelOperacoes.add(botaoDeRadiciacao);
		painelOperacoes.add(botaoDeDesfazer);
		painelOperacoes.add(botaoDeLimparTela);
		
		return painelOperacoes;
	}
	
}
