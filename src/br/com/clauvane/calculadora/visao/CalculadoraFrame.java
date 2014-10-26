package br.com.clauvane.calculadora.visao;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;

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
	
	private JTextField visorParcial;
	private JTextField visorGeral;
	
	private JLabel rodape;
	
	private BigDecimal memoria = new BigDecimal(0);
	private TipoOperacao tipoOperacao;
	
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

	public CalculadoraFrame(String titulo) {
		super(titulo);
		init();
		painelPrincipal.add(BorderLayout.NORTH, visorGeral);
		painelPrincipal.add(BorderLayout.NORTH, visorParcial);
		painelPrincipal.add(BorderLayout.CENTER, getPainelMeio());
		painelPrincipal.add(BorderLayout.SOUTH, rodape);
		this.setContentPane(painelPrincipal);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(450, 200);
		this.requestFocus();
		
		adicionandoEventosAosBotoesNumericos();
	}

	

	private void init() {
		painelPrincipal = new JPanel();
		visorParcial = new JTextField(22);
		visorParcial.setHorizontalAlignment(JTextField.RIGHT);
		visorParcial.setEditable(false);
		visorParcial.setFont(new Font("Arial Bold", Font.BOLD, 18));
		visorParcial.setText("0");
		
		visorGeral = new JTextField(22);
		visorGeral.setHorizontalAlignment(JTextField.RIGHT);
		visorGeral.setEditable(false);
		visorGeral.setFont(new Font("Arial Bold", Font.BOLD, 18));
		
		rodape = new JLabel(" Desenvolvido por Clauvane. Github: clauvane");
		
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
		botaoDeSoma.addActionListener(setTipoOperacaoSoma());
		botaoDeSubtracao = new JButton("-");
		botaoDeSubtracao.addActionListener(setTipoOperacaoSubtracao());
		botaoDeMultiplicacao = new JButton("*");
		botaoDeMultiplicacao.addActionListener(setTipoOperacaoMultiplicacao());
		botaoDeDivisao = new JButton("/");
		botaoDeDivisao.addActionListener(setTipoOperacaoDivisao());
		
		botaoDeInverso = new JButton("1/N");
		botaoDeInverso.addActionListener(setTipoOperacaoInversao());
		botaoDePorcentagem = new JButton("%");
		botaoDePorcentagem.addActionListener(setTipoOperacaoPorcentagem());
		botaoDePotencia = new JButton("X^Y");
		botaoDePotencia.addActionListener(setTipoOperacaoPotencia());
		botaoDeRadiciacao = new JButton("Raiz");
		botaoDeRadiciacao.addActionListener(setTipoOperacaoRadiciacao());
		
		botaoDeLimparTela = new JButton("Clear");
		botaoDeLimparTela.addActionListener(limparTela());
		botaoDeDesfazer = new JButton("<--");
		botaoDeDesfazer.addActionListener(desfazer());
		botaoDeResultado = new JButton("=");
		botaoDeResultado.addActionListener(resultado());
		
	}
	
	private ActionListener escreverNumeroDoBotaoNoVisor(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textoDoVisor = visorParcial.getText();
				BigDecimal numeroDoVisor = new BigDecimal(textoDoVisor);
				String textoDoBotao = ((JButton)e.getSource()).getText();
				if (numeroDoVisor.doubleValue() == 0) {
					visorParcial.setText(textoDoBotao);
				}else{
					textoDoVisor += textoDoBotao;
					visorParcial.setText(textoDoVisor);
				}
			}
		};
	}
	
	private ActionListener escreverPontoNoNumeroDoVisor(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textoDoVisor = visorParcial.getText();
				if (!textoDoVisor.contains(".")) {
					String textoDoBotao = ((JButton)e.getSource()).getText();
					textoDoVisor += textoDoBotao;
					visorParcial.setText(textoDoVisor);
				}
			}
		};
	}
	
	private ActionListener inverterSinalDoNumeroNoVisor(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textoDoVisor = visorParcial.getText();
				if (!textoDoVisor.contains("-")) {
					String textoDoBotao = "-";
					textoDoBotao += textoDoVisor;
					visorParcial.setText(textoDoBotao);
				}else{
					textoDoVisor = textoDoVisor.replace('-', ' ').trim();
					visorParcial.setText(textoDoVisor);
				}
			}
		};
	}
	
	private ActionListener desfazer(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textoDoVisor = visorParcial.getText();
				if (!textoDoVisor.isEmpty()) {
					textoDoVisor = textoDoVisor.substring(0, textoDoVisor.length()-1);
					visorParcial.setText(textoDoVisor);
				}
			}
		};
	}
	
	private ActionListener limparTela(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				memoria = new BigDecimal(0);
				visorParcial.setText("0");
				visorGeral.setText("");
			}
		};
	}
	
	private ActionListener resultado(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		};
	}
	
	private void calcular() {
		BigDecimal valorDaTela = new BigDecimal(visorParcial.getText());
		BigDecimal resultado = new BigDecimal(0);
		if (memoria.doubleValue() == 0) {
			resultado = tipoOperacao.getOperacao().calcular(valorDaTela);
		}else{
			resultado = tipoOperacao.getOperacao().calcular(memoria, valorDaTela);
		}
		memoria = new BigDecimal(0);
		resultado.abs();
		visorGeral.setText("");
		visorParcial.setText(resultado+"");
	}
	
	private ActionListener setTipoOperacaoSoma(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setOperacao(TipoOperacao.SOMA, e);
			}
		};
	}
	
	private ActionListener setTipoOperacaoSubtracao(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setOperacao(TipoOperacao.SUBTRACAO, e);
			}
		};
	}
	
	private ActionListener setTipoOperacaoDivisao(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setOperacao(TipoOperacao.DIVISAO, e);
			}
		};
	}
	
	private ActionListener setTipoOperacaoMultiplicacao(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setOperacao(TipoOperacao.MULTIPLICACAO, e);
			}
		};
	}
	
	private ActionListener setTipoOperacaoPotencia(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setOperacao(TipoOperacao.POTENCIACAO, e);
			}
		};
	}
	
	private void setOperacao(TipoOperacao tipoOperacao, ActionEvent e) {
		this.tipoOperacao = tipoOperacao;
		BigDecimal numeroDoVisor = new BigDecimal(visorParcial.getText());
		String textoDoBotao = ((JButton)e.getSource()).getText();
		visorGeral.setText(visorGeral.getText()+"("+numeroDoVisor+")"+ textoDoBotao);
		if (memoria.doubleValue() == 0) {
			memoria = numeroDoVisor;
		}else{
			memoria = tipoOperacao.getOperacao().calcular(memoria, numeroDoVisor);
		}
		visorParcial.setText("0");
	}
	
	private ActionListener setTipoOperacaoInversao(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tipoOperacao = TipoOperacao.INVERSAO;
				calcular();
			}
		};
	}
	
	private ActionListener setTipoOperacaoPorcentagem(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tipoOperacao = TipoOperacao.PORCENTAGEM;
				calcular();
			}
		};
	}
	
	private ActionListener setTipoOperacaoRadiciacao(){
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tipoOperacao = TipoOperacao.RADICIACAO;
				calcular();
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
		
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0),"somar");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, 0),"subtrair");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_MULTIPLY, 0),"multiplicar");
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DIVIDE, 0),"dividir");
		
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
		
		
		this.getRootPane().getActionMap().put("somar", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoDeSoma.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("subtrair", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoDeSubtracao.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("multiplicar", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoDeMultiplicacao.doClick();
		    }
		});
		this.getRootPane().getActionMap().put("dividir", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        botaoDeDivisao.doClick();
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
	
}
