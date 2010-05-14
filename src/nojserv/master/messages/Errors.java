package nojserv.master.messages;

public enum Errors {
	// Connection
	e001("Server is closed to new connections."),
	e002("Client version is out of date."),
	e003("Unknown client user and/or password"),
	e004("Username is banned from server"),
	
	e204("Unknown user ");
	
	String value;
	
	private Errors(String v) {
		value = v;
	}
	
	private String getValue() {
		return value;
	}
}
