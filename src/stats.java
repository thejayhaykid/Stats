import java.applet.Applet;
import java.awt.Graphics;
import java.util.Scanner;


@SuppressWarnings("unused")
public class stats extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public stats() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Testing for applet purposes
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String test = in.nextLine();
		System.out.println("Your string was " + test);
		in.close();
		
		// TODO Create/load teams
		
		// TODO Create game()
		
		// TODO Run game()
		
		// TODO Option to to save team(s)
		
		// TODO Option to export stats for max preps
	}
	
	private void exportForMaxPreps() {
		
	}

}
