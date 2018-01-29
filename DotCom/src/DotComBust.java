import java.util.*;
public class DotComBust {
	
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame() {
		//first make dot coms and give them locations
		DotCom one = new DotCom();
		one.SetName("Pets.com");
		DotCom two = new DotCom();
		two.SetName("eToys.com");
		DotCom three = new DotCom();
		three.SetName("Go2.com");
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);
		
		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest nomber of guesses");
		
		for(DotCom dotComToSet : dotComList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}

	private void startPlaying() {
		
		while(!dotComList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a Guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	
	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		
		String result = "miss";
		
		for(DotCom dotComToTest : dotComList) {
			result = dotComToTest.checkYourself(userGuess);
			
			if(result.equals("hit")) {
				break;
			}
			
			if(result.equals("kill")) {
				dotComList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}
	
	private void finishGame() {
		System.out.println("All Dot Coms are dead! Your stock is now worthless.");
		if (numOfGuesses <= 18) {
			System.out.println("");
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("");
		}
	}
	
	public static void main (String[] args) {
		
	}
}
