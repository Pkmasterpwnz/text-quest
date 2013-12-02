package TextQuest;
import static java.lang.System.out;

/*
 * Commands.java
 * Functions for all of the commands in TQ
 * Written by Joseph Swafford
 */
public class Commands {
	public static int travel_location;
	public static boolean sure;
	
	public static void travel(){
		out.println("Where would you like to travel?");
		out.println("1. Taften");
		out.println("2. Kallagen");
		out.println("3. Centripole");
		out.println("4. Rift Haven");
		out.println("5. Garven Port ");
		out.println("6. Goblin Village");
		out.println("7. Dramen");
		out.println("8. City of the Dead");
		out.println("9. High Heaven.");
		out.println("10. Hell's Den");
		out.println("11. Flaming Fjords");
		out.println("12. Glissfall.");
		travel_location = Game.mainScanner.nextInt();
		CityHandler.getcityAvailable(travel_location, Player.currentCity);
		out.println("Welcome to " +CityHandler.cityName);
	}
	public static void attack(String PlayerState){
		PlayerState = "attacking";
	}
	public static void defend(String PlayerState){
		PlayerState = "defending";
	}
	public static void run(String PlayerState){
		PlayerState = "running";
	}
	public static void destory(int equippedArmor, int equippedWeapon){
		out.println("The Destory Command will delete your equipped gear");
		out.println("Are you sure you want to do this?");
		String response = Game.mainScanner.next().toLowerCase();
		if (response.equals("yes")){
			equippedArmor = 0;
			equippedWeapon = 0;
			Player.attack = 0;
			Player.defense = 0;
			//Player.getLevelBonus();
			out.println("Your gear has been destroyed, and your combat stats reset.");
		}
	}
	public static void help(){
		out.println("Commands List:");
		out.println("1. Travel");
		out.println("2. Destory");
		out.println("3. Attack");
		out.println("4. Defend");
		out.println("5. Run");
		out.println("6. Help");
	}
}
