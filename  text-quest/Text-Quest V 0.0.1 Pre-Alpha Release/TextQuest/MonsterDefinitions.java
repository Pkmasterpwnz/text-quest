package TextQuest;

/*
 * MonsterDefinitions.java
 * Used to determine what monster you are fighting
 * Doesn't really gather stats because thats what Monster.java is for.
 * Written by Joseph Swafford
 */

public class MonsterDefinitions {
	public static String monsterName;
	public static void getMonster(int monsterId){
		@SuppressWarnings("unused")
		String monsterName;
		switch (monsterId){
		case 1:
			monsterName = "Goblin";
			break;
		case 2:
			monsterName = "Orc";
			break;
		case 3:
			monsterName = "Dwarf";
			break;
		case 4:
			monsterName = "Elf";
			break;
		case 5:
			monsterName = "Human";
		case 6:
			monsterName = "Dragon";
			break;
		case 7:
			monsterName = "Skeleton";
			break;
		case 8:
			monsterName = "Angel";
			break;
		case 9:
			monsterName = "Demon";
			
			
		}
	}
}
