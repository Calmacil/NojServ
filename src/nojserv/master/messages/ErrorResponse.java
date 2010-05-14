package nojserv.master.messages;

public class ErrorResponse extends Message {
	
	private String _nb;
	private String _msg;
	
	public ErrorResponse(String nb, String msg) {
		_nb = nb;
		_msg = msg;
	}
	
	public ErrorResponse(int nb, String msg) {
		this(Integer.toString(nb), msg);
	}
	
	public String get() {
		
		super.add("ERROR : KO");
		super.add(_nb);
		super.add(_msg);
		
		return super.get();
	}
	
}
