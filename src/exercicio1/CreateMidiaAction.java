package exercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateMidiaAction implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new CreateScreen("Midia");		
	}

}
