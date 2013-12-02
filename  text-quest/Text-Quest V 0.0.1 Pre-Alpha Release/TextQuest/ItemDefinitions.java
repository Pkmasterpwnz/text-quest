package TextQuest;
/*
 * ItemDefinitions.java
 * One of the most important classes in the game
 * converts Item Id's into various cases and assigns stats to the player
 * based on the ItemId passed in the function!
 */

public class ItemDefinitions {
	public static void getItemStats(int itemId){
		switch (itemId){
		case 0:
			Player.attack += 5;
			break;
		case 1:
			Player.attack += 3;
			break;
		case 2:
			Player.attack += 7;
			break;
		case 3:
			Player.defense += 6;
			break;
		case 5:
			Player.attack += 8;
			break;
		case 6:
			Player.attack += 10;
			break;
		case 7:
			Player.defense += 10;
			break;
		case 8:
			Player.attack += 15;
			break;
		case 9:
			Player.attack += 8;
			break;
		case 10:
			Player.attack += 20;
			break;
		case 11:
			Player.defense += 17;
			break;
		case 12:
			Player.attack += 25;
			break;
		case 13:
			Player.attack += 15;
			break;
		case 14:
			Player.attack += 35;
			break;
		case 15:
			Player.defense += 25;
			break;
		case 16:
			Player.attack += 60;
			break;
		case 17:
			Player.attack += 25;
			break;
		case 18:
			Player.attack += 70;
			break;
		case 19:
			Player.defense += 70;
			break;
		}
	}
	public static void getItemName(){
		
	}
}
