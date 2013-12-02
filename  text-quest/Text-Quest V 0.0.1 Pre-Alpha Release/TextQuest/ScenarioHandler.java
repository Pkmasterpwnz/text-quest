package TextQuest;
import static java.lang.System.out;


public class ScenarioHandler {
	public static void getScenario(int scenarioId){
		switch (scenarioId){
		default:
			out.println("GLITCH, Please Report This!!! GLITCH!");
			break;
		case 0: //tutorial scenario cannot be done unless through main menu.
			Player.currentScenario = 0;
			Tutorial.main();
			break;
		case 1: //Keln Scenario :)
			Player.currentScenario = 1;
			KelnScenario.main();
			Trialbuild.gameOver();
			break;
			
			
			
		}
	}
	
	/*These features will also be implemented in a later build! Sowwie :(
	 * 
	 * public static void getRandomScenario(){ //generate random scenario.
		
	}
	public static void main(){
		//ties all of the methods for scenario handling.
	}
	*/
}
