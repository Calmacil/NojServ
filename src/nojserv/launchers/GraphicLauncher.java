package nojserv.launchers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import nojserv.NojServ;

public class GraphicLauncher extends JFrame implements ActionListener, Launchable {
	
	private int _port;
	
	public GraphicLauncher(int port) {
		
		_port = port;
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("NojServ - version" + Double.toString(NojServ.version));
		this.setSize(300,200);
		this.setResizable(false);
		
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}





	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.setVisible(true);
	}

}
