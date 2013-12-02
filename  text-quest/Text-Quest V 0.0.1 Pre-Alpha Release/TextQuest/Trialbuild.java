package TextQuest;
import static java.lang.System.out;

/*
 *Trialbuild.java
 *This is a file that will set the player's current scenario to the Keln Scenario for the V 0.0.1 build of the game
 *This file will NOT be in V 1.0
 *V 1.0 may or may not implement the Game Jolt API. That just depends.
 *Written by Joseph Swafford 
 */

public class Trialbuild {
	public static void main(){
		out.println("Welcome to Text Quest V 0.0.1 Pre-Alpha Build.");
		out.println("The following Scenario you are about to play will test the mechanics of the game.");
		out.println("Sorry this build of the game is so short lived, I am really working hard");
		out.println("To make this game amazing. Please be patient and report all bugs!!");
		out.println("Thanks for testing Text Quest!!!");
		out.println();
		out.println();
		Player.currentScenario = 1;
		ScenarioHandler.getScenario(Player.currentScenario);
	}
	public static void gameOver(){
		out.println("You have finished the Pre-Alpha build of Text Quest, Thanks player!!");
		out.println("Please rate the game and comment any suggestions!");
	}
}
