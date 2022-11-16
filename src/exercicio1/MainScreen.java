package exercicio1;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MainScreen extends JFrame {
	private static final long serialVersionUID = 1L;
	
	Object state[] = new Object[100];
	int n;
	
	JPanel mainScreen = new JPanel();
	JPanel rightScreen = new JPanel();
	JPanel leftScreen = new JPanel();
	
	JButton createMidiaButton = new JButton("Criar Mídia");
	JButton createCDButton = new JButton("Criar CD");
	JButton createDVDButton = new JButton("Criar DVD");
	
	public MainScreen(Object[] state, int n) {
		super("Loja de CDs e DVDs <3");
		
		setSize(500, 300);
		setLocation(150, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		
		this.state = state;
		this.n = n;
		
		mainScreen.setBackground(Color.white);
		mainScreen.setLayout(new BoxLayout(mainScreen, BoxLayout.LINE_AXIS));
		
		rightScreen.setBackground(Color.white);
		rightScreen.setLayout(new BoxLayout(rightScreen, BoxLayout.PAGE_AXIS));
		rightScreen.add(createMidiaButton);
		rightScreen.add(Box.createRigidArea(new Dimension(20, 20)));
		rightScreen.add(createCDButton);
		rightScreen.add(Box.createRigidArea(new Dimension(20, 20)));
		rightScreen.add(createDVDButton);
		
		leftScreen.setBackground(Color.white);
		
		createMidiaButton.addActionListener(new CreateMidiaAction());
		createCDButton.addActionListener(new CreateCDAction());
		createDVDButton.addActionListener(new CreateDVDAction());
		
		mainScreen.add(rightScreen);
		mainScreen.add(leftScreen);
		setVisible(true);
		add(mainScreen);
	}
}
