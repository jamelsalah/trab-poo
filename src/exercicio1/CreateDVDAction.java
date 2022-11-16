package exercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateDVDAction implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new CreateScreen("DVD");		
	}

}
