package TextQuest;
import static java.lang.System.out;

public class CityHandler {
	public static boolean cityAvailable;
	public static String cityName;
	
	
	public static void getcityAvailable(int cityId, int PlayerLocation){
		switch(cityId){
		default:
			out.println("That city doesn't exist. You must have found a glitch.");
		case 1:
			cityName = "Taften";			
			cityAvailable = true;
			PlayerLocation = 1;
			break;
		case 2:
			cityName = "Kellagan";
			cityAvailable = true;
			PlayerLocation = 2;
			break;
		case 3:
			cityName = "Centripole";
			cityAvailable = false;
			break;
		case 4:
			cityName = "Rift Haven";
			cityAvailable = true;
			PlayerLocation = 4;
			break;
		case 5:
			cityName = "Garven Port";
			cityAvailable = true;
			PlayerLocation = 5;
			break;
		case 6:
			cityName = "Goblin Village";
			cityAvailable = false;
			break;
		case 7:
			cityName = "Dramen";
			cityAvailable = false;
			break;
		case 8:
			cityName = "City of the Dead";
			cityAvailable = false;
			break;
		case 9:
			cityName = "High Heaven";
			cityAvailable = false;
			break;
		case 10:
			cityName = "Hell's Den";
			cityAvailable = false;
			break;
		case 11:
			cityName = "Flaming Fjords";
			cityAvailable = false;
			break;
		case 12:
			cityName = "Glissfall";
			cityAvailable = true;
			PlayerLocation = 12;
			
		}
		
	}
}
