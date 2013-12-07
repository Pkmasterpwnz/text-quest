package TextQuest;
import static java.lang.System.out;
import java.util.Scanner;


public class Idle {
	private static Scanner mainScanner;
	/*public static void checkIdle(){
		if (Player.state.equals("idle")){
			main();
		}
	}*/
	public static void main(){
		mainScanner = new Scanner (System.in);
		out.println("Enter a command.");
		CommandHandler.CommandsAvailable = true;
		Player.RecentCommand = mainScanner.next().toLowerCase();
		CommandHandler.translateCommand(Player.RecentCommand);
		CommandHandler.processCommand(Player.RecentCommandId);
		out.println("You entered: " +Player.RecentCommand);
		//out.println("You are currently: " +Player.state);
		
	}
}
