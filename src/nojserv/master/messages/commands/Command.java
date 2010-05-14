package nojserv.master.messages.commands;

import nojserv.master.messages.Message;

public abstract class Command extends Message{
	
	protected String _response;

	public Command(String s) {
		super(s);
	}
	
	public static Command getCommand(String cmd) {
		String s = cmd.split(_pattern)[0];
		
		if (s.toUpperCase().equals("HELLO")) return new HelloCommand(cmd);
		else return null;
	}
	
	public abstract boolean proceed();
	
	public String getResponse() {
		return _response;
	}
}
