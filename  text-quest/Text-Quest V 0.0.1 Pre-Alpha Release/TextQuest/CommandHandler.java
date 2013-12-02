package TextQuest;
import static java.lang.System.out;
import java.util.Scanner;

 /*
  * CommandHandler.java
  * Handles commands
  * Written by Joseph Swafford
  */

public class CommandHandler {
	public static boolean CommandsAvailable = false; //default false this is for a reason. You cannot use commands during dialogue.
	private static Scanner mainScanner;
	
	public static void processCommand(int commandId){
		if (CommandsAvailable == true){
			switch (commandId){
			default:
				out.println("Invalid Command, Use Help for a list of Commands.");
				break;
			case 1:
				Commands.travel();
				break;
			case 2:
				Commands.destory(Player.equippedArmour, Player.equippedWeapon);
				break;
			case 3:
				Commands.attack(Player.state);
				break;
			case 4:
				Commands.defend(Player.state);
				break;
			case 5:
				Commands.run(Player.state);
				break;
			case 6:
				Commands.help();
				break;
				
				
			}
			}else{
				out.println("Oh boy, you found a glitch :) Please Report.");
		}
	}
	public static void translateCommand(String RecentCommand, int RecentCommandId){
		if (RecentCommand.equals("travel")){
			RecentCommandId = 1;
		}else if (RecentCommand.equals("destroy")){
			RecentCommandId = 2;
		}else if (RecentCommand.equals("attack")){
			RecentCommandId = 3;
		}else if (RecentCommand.equals("defend")){
			RecentCommandId = 4;
		}else if (RecentCommand.equals("run")){
			RecentCommandId = 5;
		}else if (RecentCommand.equals("help")){
			RecentCommandId = 6;
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
