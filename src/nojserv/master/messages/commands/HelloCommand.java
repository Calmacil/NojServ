package nojserv.master.messages.commands;

public class HelloCommand extends Command {

	private double nptcVersion = 1.;
	
	public HelloCommand(String s) {
		super(s);
	}

	@Override
	public boolean proceed() {
		// TODO Auto-generated method stub
		this._response = "";
		return true;
		
	}

}
