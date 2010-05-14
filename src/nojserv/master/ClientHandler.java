package nojserv.master;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


/**
 * @author Thomas Lenoël
 * @version 0.1
 */
public class ClientHandler {

	private Socket _sock;
	
	
	private BufferedReader _in;
	
	
	private PrintWriter _out;
	
	
	public ClientHandler(Socket sock) {
		_sock = sock;
		setEncoding("UTF-8");
	}
	
	public void send(String msg) {
		_out.println(msg);
		_out.flush();
	}
	
	private boolean setEncoding(String charset) {
		try {
			_in = new BufferedReader(new InputStreamReader(_sock.getInputStream(), charset));
			_out = new PrintWriter(new OutputStreamWriter(_sock.getOutputStream(), charset));
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	
}
