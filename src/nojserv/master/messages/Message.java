package nojserv.master.messages;

import java.util.ArrayList;

public  class Message {
	
	protected ArrayList<String> _parts;
	protected String _message;
	
	private String _pattern = "[^\\^]|";
	
	
	public Message() {
		_parts = new ArrayList<String>();
	}
	
	public Message(String[] st) {
		this();
		for (String s : st)
			_parts.add(s);
	}
	
	public Message(String s) {
		this(s.split("|"));
	}
	
	public Message(ArrayList<String> st) {
		this();
		_parts = st;
		
	}
	
	private void format() {
		for (String s : _parts)
			addArg(s);
	}
	
	public void add(String s) {
		_parts.add(s);
	}
	
	private void addArg(String arg) {
		if (!(_message == null || _message.equals(""))) {
			_message += "|";
		}
		_message += arg;
	}
	
	public String get() {
		format();
		return _message;
	}

}
