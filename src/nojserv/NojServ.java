package nojserv;

import nojserv.launchers.Launcher;

public class NojServ {

	/**
	 * Version du serveur
	 */
	public static double version = 0.1;
	
	
	
	private static String x = "yes";
	
	
	private static int port = 4200;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < args.length; i++) {
			if (args[i].equals("-x")) {
				i++;
				try {
					x = args[i];
				} catch(NullPointerException e) {
					x = "yes";
				}
			}
			
			else {
				try {
					port = Integer.parseInt(args[i]);
				} catch (NumberFormatException e){
					port = 4200;
				}
			}
		}
		
		Launcher.get(x,port).run();
		
	}

}
