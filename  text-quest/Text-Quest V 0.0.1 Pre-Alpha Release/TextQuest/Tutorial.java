package TextQuest;
import static java.lang.System.out;


public class Tutorial {
	public static int Tut_Responses;
	public static void main(){
		out.println("Welcome to Text Quest, " +Player.username);
		out.println("In Text Quest you can interact with another character through dialogue ");
		out.println("Each Dialouge will have numerical answers, you can answer a dialogue");
		out.print(" by typing the number next to your desired response.");
		out.println();
		out.println("Lets try it.");
		out.println("Would you like some free starter armor?");
		out.println("1. Yes");
		out.println("2. No");
		Tut_Responses = Game.mainScanner.nextInt();
		CommandHandler.CommandsAvailable = false;
		if (Tut_Responses == 1){
			Player.equippedArmour = 3;
			Player.equippedWeapon = 1;
			ItemDefinitions.getItemStats(3);
			ItemDefinitions.getItemStats(1);
			out.println("You have recieved a Bronze Dagger, and Bronze Plate Armor.");
			
		}else{
			out.println("You recieved no armor, and no weapon.");
		}
		out.println("That was just a sample dialouge, Text Quest has many more complex");
		out.print(" dialouges.");
		out.println();
		out.println("Now onward " +Player.username+ " you have an adventure to start!");
	}
}
