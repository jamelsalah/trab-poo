package exercicio1;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateScreen extends JFrame{
	private static final long serialVersionUID = 1L;
	
	String type = null;
	
	JPanel mainContainer = new JPanel();
	JPanel container = new JPanel();
	JPanel labelsContainer = new JPanel();
	JPanel fieldsContainer = new JPanel();
	JPanel fieldsContainer2 = new JPanel();
	JPanel buttonsPanel = new JPanel();
	
	JLabel title = new JLabel("Criar");
	JLabel codigoLabel = new JLabel("Codigo:");
	JLabel precoLabel = new JLabel("Preço:");
	JLabel nomeLabel = new JLabel("Nome:");
	JLabel nLabel = new JLabel("");
	
	JButton criarButton = new JButton("criar");
	JButton cancelarButton = new JButton("cancelar");
	
	JTextField codigoField = new JTextField(8);
	JTextField precoField = new JTextField(8);
	JTextField nomeField = new JTextField(8);	
	JTextField nField = new JTextField(8);
	
	public CreateScreen(String type) {
		super("Adicionar Midia");
		
		setSize(250, 220);
		setLocation(150, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		setVisible(true);
		
		labelsContainer.setLayout(new BoxLayout(labelsContainer, BoxLayout.PAGE_AXIS));
		labelsContainer.setBackground(Color.white);
		labelsContainer.add(codigoLabel);
		labelsContainer.add(Box.createRigidArea(new Dimension(5, 10)));
		labelsContainer.add(precoLabel);
		labelsContainer.add(Box.createRigidArea(new Dimension(5, 20)));
		labelsContainer.add(nomeLabel);
		
		codigoField.setPreferredSize( new Dimension( 6, 22 ) );
		precoField.setPreferredSize( new Dimension( 6, 22 ) );
		nomeField.setPreferredSize( new Dimension( 6, 22) );
		
		fieldsContainer.setLayout(new BoxLayout(fieldsContainer, BoxLayout.Y_AXIS));
		fieldsContainer.setBackground(Color.white);
		fieldsContainer.add(codigoField);
		fieldsContainer.add(Box.createRigidArea(new Dimension(5, 10)));
		fieldsContainer.add(precoField);
		fieldsContainer.add(Box.createRigidArea(new Dimension(5, 10)));
		fieldsContainer.add(nomeField);
		
		container.setBackground(Color.white);
		container.add(labelsContainer);
		container.add(fieldsContainer2);
		
		fieldsContainer.setLayout(new BoxLayout(fieldsContainer, BoxLayout.PAGE_AXIS));
		fieldsContainer2.setBackground(Color.white);
		fieldsContainer2.add(fieldsContainer);
		
		buttonsPanel.setBackground(Color.white);
		buttonsPanel.add(criarButton);
		buttonsPanel.add(cancelarButton);
		
		if(type == "Main" || type == "") {
			title.setText("Criar Mídia");
		}else if(type == "CD") {
			title.setText("Criar CD");
			nLabel.setText("nMusicas");
			nField.setPreferredSize( new Dimension( 6, 22) );
			fieldsContainer.add(Box.createRigidArea(new Dimension(5, 10)));
			fieldsContainer.add(nField);
			labelsContainer.add(Box.createRigidArea(new Dimension(5, 10)));
			labelsContainer.add(nLabel);
		}else if(type == "DVD") {
			title.setText("Criar DVD");
			nLabel.setText("nFaixas");
			nField.setPreferredSize( new Dimension( 6, 22) );
			fieldsContainer.add(Box.createRigidArea(new Dimension(5, 10)));
			fieldsContainer.add(nField);
			labelsContainer.add(Box.createRigidArea(new Dimension(5, 10)));
			labelsContainer.add(nLabel);
		}
		
		mainContainer.setLayout(new BoxLayout(mainContainer, BoxLayout.PAGE_AXIS));
		mainContainer.setBackground(Color.white);
		mainContainer.add(title);
		mainContainer.add(container);
		mainContainer.add(buttonsPanel);
		
		add(mainContainer);
	};
}
