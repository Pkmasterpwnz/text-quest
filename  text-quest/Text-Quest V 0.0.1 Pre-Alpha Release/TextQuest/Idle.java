package TextQuest;
import static java.lang.System.out;
import java.util.Scanner;


public class Idle {
	public static Scanner mainScanner;
	public static void checkIdle(){
		if (Player.state.equals("idle")){
			main();
		}
	}
	public static void main(){
		mainScanner = new Scanner (System.in);
		out.println("Enter a command.");
		CommandHandler.CommandsAvailable = true;
		Player.RecentCommand = mainScanner.next().toLowerCase();
		
	}
}
