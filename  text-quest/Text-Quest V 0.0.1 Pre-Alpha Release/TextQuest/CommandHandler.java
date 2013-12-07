package TextQuest;
import static java.lang.System.out;

//import java.util.Scanner;

 /*
  * CommandHandler.java
  * Handles commands
  * Written by Joseph Swafford
  */

//@SuppressWarnings("unused")
public class CommandHandler {
	public static boolean CommandsAvailable = true; //default false this is for a reason. You cannot use commands during dialogue.
	//private static Scanner commandScanner;
	
	public static void processCommand(int commandId){
		out.println("Command Id: " +Player.RecentCommandId);
		if (CommandsAvailable == true){
			switch (commandId){
			//default:
				//out.println("Invalid Command, Use Help for a list of Commands.");
				//break;
			case 1:
				Commands.travel();
				break;
			case 2:
				Commands.destory(Player.equippedArmour, Player.equippedWeapon);
				break;
			case 3:
				Commands.attack();
				break;
			case 4:
				Commands.defend();
				break;
			case 6:
				Commands.help();
				break;
				
			}
			}else{
				out.println("Oh boy, you found a glitch :) Please Report.");
		}
	}
	public static void translateCommand(String RecentCommand){
		out.println("Current Command: " +Player.RecentCommand);
		if (RecentCommand.equals("travel")){
			Player.RecentCommandId = 1;
		}else if (RecentCommand.equals("destroy")){
			Player.RecentCommandId = 2;
		}else if (RecentCommand.equals("attack")){
			Player.RecentCommandId = 3;
		}else if (RecentCommand.equals("defend")){
			Player.RecentCommandId = 4;
		}else if (RecentCommand.equals("run")){
			Player.RecentCommandId = 5;
		}else if (RecentCommand.equals("help")){
			Player.RecentCommandId = 6;
		}else{
			out.println("That is not a valid command. Type 'help' for a list of commands.");
		}
	}
	
	
	/*public static void getCommand(boolean CommandsAvailable){
		if (CommandsAvailable == true){
		}else{
			out.println("You cannot do that at this time.");
		}
	}*/
}
