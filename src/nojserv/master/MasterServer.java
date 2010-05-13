package nojserv.master;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Classe MasterServer
 * 
 * Implémente le socket serveur et écoute les connexions.<br />
 * Crée les objets utilisateurs.<br />
 * 
 * @author Thomas Lenoël
 * @version 0.1
 *
 */
public class MasterServer implements Runnable {
	
	
	private int _port;
	
	
	private ServerSocket _socket;
	
	
	private boolean _running = true;
	
	
	/**
	 * @param port Le port d'écoute
	 * 
	 * @since 0.1
	 */
	public MasterServer(int port) {
		_port = port;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			_socket = new ServerSocket(_port);
			
			
			while (_running) {
				
				_socket.accept();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
