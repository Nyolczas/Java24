import java.util.*;
public class DotComBust {
	
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private int numOfGuess = 0;
	
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
		
	}
	

}
