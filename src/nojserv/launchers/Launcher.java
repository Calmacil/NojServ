package nojserv.launchers;

public class Launcher {

	public static Launchable get(String x, int port) {
		
		Launchable l;
		
		if (x.equals("yes")) l =  new GraphicLauncher(port);
		else l = new CommandLauncher(port);
		
		return l;
		
	}

}
