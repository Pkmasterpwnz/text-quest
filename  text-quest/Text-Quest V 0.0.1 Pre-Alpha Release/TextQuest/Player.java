package TextQuest;
import static java.lang.System.out;
/*
 * player.java
 * Processes the player and most of the players actions.
 * Written by Joseph Swafford
 * Text Quest and all of its code/content is owned by
 * Joseph Swafford
 */

@SuppressWarnings("unused")
public class Player {
	public static int hp = 100;
	public static int level = 1;
	public static int maxLevel = 20;
	public static int xp = 0;
	public static int xpToLevelUp = 100;
	public static int attack = 5;
	public static int defense = 1;
	public static int equippedWeapon;
	public static int equippedArmour;
	public static int equippedAmulet;
	static String username;
	static String password;
	public static boolean security;
	public static String state = "idle";
	public static String RecentCommand = "";
	public static int RecentCommandId;
	public static int currentCity;
	public static int currentScenario;
	public static int dragonSoulCount;
	// public static int currentScenarioStage;
	// will use that depending on what scenarios I will make for the Pre-Alpha release, so I'll block it for now.
	
	/*
	 * Leveling Up/Xp gain has been disabled for this build.
	 * Will be releasing it for TQ V 1.0
	 * 
	 * public static void getLevelBonus(){ //determines player combat stats based on level. Defense not included.
		int LevelBonus = level + 5;
		attack += LevelBonus;
		int HpBonus = level + 10;
		hp += HpBonus;
		
	}
	public static void checkLevelUp(){ //checks if the player has level up until the xp is not greater than max xp.
		boolean levelUpAgain = true;
		while (levelUpAgain == true){
			if (xp >= xpToLevelUp){
				level += 1;
				getLevelBonus();
				xpToLevelUp += 150 * 2;
				
			}else{
				levelUpAgain = false;
				break;
			}
		}
	}
	public static void checkMaxLevel(){
		if (level >= maxLevel){
			level = 20;
		}else{
			out.println("You gained a level! You are now level " +level);
		}
	} */
}
