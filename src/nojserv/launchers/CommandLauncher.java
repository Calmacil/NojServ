package nojserv.launchers;

public class CommandLauncher implements Launchable {
	
	private int _port;
	
	public CommandLauncher(int port) {
		_port = port;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("OK : " +_port);
	}

}
