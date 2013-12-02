package TextQuest;
import static java.lang.System.out;
import java.util.Scanner;


/*
 *KelnScenario.java
 *This handles the famous Keln Quest
 *This allows you to collect dragon souls.
 *Written by Joseph Swafford 
 */
public class KelnScenario {//Need to implement feature for collecting dragon souls and need to make amulet function.
	public static Scanner mainScanner = new Scanner (System.in);
	public static int stage = 1;
	public static int response = 0;
	public static void intro(){
		out.println("I don't know how you found us, but we are not interested in small talk.");
		out.println("The man you stand before is the clan leader of the Keln, a power is radiating in the ");
		out.println(" atmosphere. The man that stands before you is Keldaggen, leader of the Keln.");
		out.println("1. Say 'I need your clan's secret.'");
		out.println("2. Say 'The kingdom needs your help");
		response = mainScanner.nextInt();
		switch (response){
		default:
			out.println("You need to enter either 1 or 2, make sure to not space as it affects the input handler.");
			break;
		case 1:
			out.println("Im sorry, but I cannot help you.");
			break;
		case 2:
			out.println("What do you mean by that?");
			out.println("1. (lie) I have been hired by the king of Taften to rid the world of Dragons.");
			out.println("2. (persuade) I need the power to destroy dragons, they are reaking havock on Taften.");
			response = mainScanner.nextInt();
			switch(response){
			default:
				out.println("You must either enter a 1 or 2, make sure to avoid spacing.");
				break;
			case 1:
				out.println("You speak lies. This family will not associate with your kind.");
				break;
			case 2:
				out.println("Alright then, I shall teach you our craft.");
				stage = 2;
				main();
				break;
			
			}
			
		}
	}
	public static void battletime(){
		out.println("Before starting, be wary.");
		out.println("The path of dragon slaying is not for the faint of heart.");
		out.println();
		out.println("In order to craft Dragonnite armor, you must learn this spell.");
		out.println("Say the following incantation. 'Un'd Estean Belgath'");
		out.println("*You utter the incantation, and you feel a surge or power running through you.*");
		out.println("Did you feel a surge of power?");
		out.println("1. Yes");
		out.println("2. No");
		response = mainScanner.nextInt();
		switch (response){
		default:
			out.println("You must enter either a 1 or 2. Do NOT Space.");
			break;
		case 1:
			out.println("Good, this means you are able to use our magick.");
			out.println("However, this is only the first step in crafting Dragonnite gear.");
			out.println("Next you will need to collect Dragon Souls.");
			out.println("This process is impossible without a Dragon Amulet.");
			out.println("Luckily I have a spare amulet");
			out.println("*The man gives you an amulet, you put it around your neck.*");
			stage = 3;
			main();
			break;
		case 2:
			out.println("If you didn't feel a surge of power, then you are unworthy of our method.");
			break;
		}
	}
	public static void dragonArena(){
		out.println("Collecting Dragon Souls will be quite difficult.");
		out.println("Luckily we have fed dragon souls to one of our training dragons.");
		out.println("The training dragon is in the dungeon. Would you like to go there now?");
		out.println("*Warning: An Intense Battle Is about to Occur*");
		out.println("1. Yes");
		out.println("2. No");
		response = mainScanner.nextInt();
		switch (response){
		default:
			out.println("You must enter a 1 or 2.");
			break;
		case 1:
			out.println("Alright then.");
			out.println("*Keldaggen leads you into a cottage, that has a trap door on the floor*");
			out.println("*Keldaggen opens the trap door and leads you into a dimly lit room thats barely visible.*");
			out.println("A Dragon approaches, prepare for combat.");
			CombatHandler.main(); //starts combat with the dragon.
			out.println("It Appears you have defeated the Dragon.");
			Player.dragonSoulCount += 15;
			stage = 4;
			main();
			break;
		case 2:
			out.println("Then leave.");
			out.println("*You are teleported back to Taften.*");
			Player.currentCity = 1;
			break;
		}
	}
	public static void finalTask(){
		out.println("*You now have 15 dragon souls.*");
		out.println("Good job, now all you need to do is use the spell I taught you.");
		out.println("1. Say Un'd Estean Belgath");
		out.println("2. Leave");
		response = mainScanner.nextInt();
		switch (response){
		default:
			out.println("You must enter a 1 or 2.");
			break;
		case 1:
			out.println("*You utter the words of power, a piece of gear and a large 2h sword appear before you*");
			out.println("*You notice the Dragon Amulet around your neck glows and then dissipates into thin air.*");
			Player.equippedArmour = 11;
			Player.equippedWeapon = 10;
			Player.attack = 0;
			Player.defense = 0;
			//Player.getLevelBonus();
			ItemDefinitions.getItemStats(10);
			ItemDefinitions.getItemStats(11);
			out.println("I have given you our secret, in return destory the dragons.");
			out.println("You may go.");
			out.println("*You Travel to Taften.");
			Player.currentCity = 1;
			break;
			
		}
	}
	public static void main(){ //ties the entire quest together.
		switch (stage){
		default:
			out.println("You have found a glitch, please report!!!! :'(");
			break;
		case 1:
			intro();
			break;
		case 2:
			battletime();
			break;
		case 3:
			dragonArena();
			break;
		case 4:
			finalTask();
			break;
		}
	}
}
