package TextQuest;
import java.util.Random;

import static java.lang.System.out;
@SuppressWarnings("unused")
public class Monster {
	public static String state;
	public static int PlayerLevel = Player.level;
	public static int Attackchance = Player.level + 5;
	public static int Defensechance = Player.level + 3;
	public static int generateRandomLevel(int PlayerLevel){
		MonsterLevel = new Random().nextInt(PlayerLevel) + 1;
		return MonsterLevel;
		
	}
	public static int getMonsterAttack(int MonsterLevel, int chance){
		MonsterAttack = chance + MonsterLevel;
		return MonsterAttack;
		
	}
	public static int getMonsterDefense(int MonsterLevel, int chance ){
		MonsterDefense = chance + MonsterLevel;
		return MonsterDefense;
	}
	public static int getMonsterHp(int MonsterLevel){
		hp = MonsterLevel * 5;
		return hp;
	}
	public static int MonsterLevel = generateRandomLevel(PlayerLevel);
	public static int MonsterAttack = getMonsterAttack(MonsterLevel, Attackchance );
	public static int MonsterDefense = getMonsterDefense(MonsterLevel, Defensechance);
	public static int hp = getMonsterHp(MonsterLevel);
	
}