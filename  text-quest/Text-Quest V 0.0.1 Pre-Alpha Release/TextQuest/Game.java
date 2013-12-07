package TextQuest;
//import static java.lang.System.out;

import java.util.Scanner;
/*
 * Game.java
 * This class pieces the entire game together.
 * Written By Joseph Swafford
 * Text Quest and all of the code/content associated with it 
 * Belongs to Joseph Swafford
 */

@SuppressWarnings("unused")
public class Game{
	public static double version = 0.01; //for reference whenever I work with other versions of TQ.
	private static Scanner create;
	public static Scanner mainScanner;
	
	/*public static void createCharacter(){
		create = new Scanner(System.in);
		out.println("Welcome to Text Quest New Player!");
		out.println();
		out.println("What would you like to be called?");
		Player.username = create.next();
		out.println("Welcome to Text Quest, " +Player.username);
		out.println("Would you like the security features?");
		String response = create.next().toLowerCase();
		if (response.equals("yes")){
			Player.security = true;
		}else{
			Player.security = false;
		}
		}*/
	/*public static void authenticate(boolean security, String username, String password){
		if (security == true){
			
		}else{
			out.println("Failed to authenticate");
			out.println("Invalid Credentials.");
		}
		}*/
	public static void main(String args[]){	
		/*mainScanner = new Scanner(System.in);
		out.println("Welcome to Text Quest!");
		out.println("Are you a new player, or do you want to load?");
		String response = mainScanner.next().toLowerCase();
		
		if(response.equals("new")){
			createCharacter();
		}
		if (response.equals("load")){
			authenticate(Player.security, Player.username, Player.password);
		}*/
		//out.println("Welcome to Text Quest V 0.0.1");
		Trialbuild.main();
	}
}
