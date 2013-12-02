package TextQuest;
import java.util.Random;
import static java.lang.System.out;


public class CombatHandler {
	//public static int round; 
	//this will be implemented in a later build 
	//when I decide to Revamp Combat.
	
	public static void combat(String state, int attack, int defense, int hitpoints, int monsterhitpoints,  int monsterattack,  int monsterdefense){
		if (state.equals("attacking")){
			int damage = attack;
			damage -= monsterdefense;
			monsterhitpoints -= damage;
			out.println("You have dealt " +damage+ " points of damage");
			out.println("Enemy Hp: " +monsterhitpoints);
			
			
			}else if (state.equals("defending")){
				int damage = monsterattack;
				damage -= defense;
				hitpoints -= damage;
				out.println("You have taken " +damage+ " points of damage");
				out.println("HP: " +hitpoints);
				if (Player.hp <= 0){
					out.println("You have died.");
					Idle.main();
					Player.currentCity = 1;
					
				}
				
			}else{
				out.println("In order to attack you must either use the attack command or the defend command.");
				out.println("Type help for a list of commands.");
				Idle.main();
				
			}
	}
	public static void encounter(int monsterId, String monsterName){
		if (monsterId == 0){
			monsterId = new Random().nextInt(9);
			if (monsterId == 3 || monsterId == 4){
				monsterId = new Random().nextInt(2);
				MonsterDefinitions.getMonster(monsterId);
				out.println("You encounter a level " +Monster.MonsterLevel+ MonsterDefinitions.monsterName);
			}
			MonsterDefinitions.getMonster(monsterId);
			out.println("You encounter a level " +Monster.MonsterLevel+ MonsterDefinitions.monsterName);
			
		}else{
			MonsterDefinitions.getMonster(monsterId);
			out.println("You encounter a level " +Monster.MonsterLevel+ MonsterDefinitions.monsterName);
		}
	}
	
	public static void main(){
		//getting commands for battle.
		while (Monster.hp > 0 || Player.state!=("running") || Player.hp > 0){ //conditionals for battle.
			Idle.main();
			//CommandHandler.getCommand(CommandHandler.CommandsAvailable);
			CommandHandler.translateCommand(Player.RecentCommand, Player.RecentCommandId);
			CommandHandler.processCommand(Player.RecentCommandId);
			combat(Player.state, Player.attack, Player.defense, Player.hp, Monster.hp, Monster.MonsterAttack, Monster.MonsterDefense);
			Player.state = "defending";
			combat(Player.state, Player.attack, Player.defense, Player.hp, Monster.hp, Monster.MonsterAttack, Monster.MonsterDefense);
		}
		
		
		
	}
}
