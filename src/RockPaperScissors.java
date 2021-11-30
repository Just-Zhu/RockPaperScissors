import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		final String[] rps = {
				"rock",
				"paper",
				"scissors"
		};
		Random random = new Random();
		String playerOne = rps[random.nextInt(rps.length)];
		System.out.println(playerOne);
		String playerTwo = rps[random.nextInt(rps.length)];
		System.out.println(playerTwo);
		rps(playerOne, playerTwo);

	}
	
	public static void rps(String playerOne, String playerTwo) {
		if(playerOne.equalsIgnoreCase(playerTwo)) {
			System.out.println("TIE");
		}else if(playerOne.equalsIgnoreCase("rock") && playerTwo.equalsIgnoreCase("scissors")) {
			System.out.println("Player 1 wins");
		}else if(playerOne.equalsIgnoreCase("rock") && playerTwo.equalsIgnoreCase("paper")) {
			System.out.println("Player 2 wins");
		}else if(playerOne.equalsIgnoreCase("scissors") && playerTwo.equalsIgnoreCase("rock")) {
			System.out.println("Player 2 wins");
		}else if(playerOne.equalsIgnoreCase("scissors") && playerTwo.equalsIgnoreCase("paper")) {
			System.out.println("Player 1 wins");
		}else if(playerOne.equalsIgnoreCase("paper") && playerTwo.equalsIgnoreCase("rock")) {
			System.out.println("Player 2 wins");
		}else if(playerOne.equalsIgnoreCase("paper") && playerTwo.equalsIgnoreCase("scissors")) {
			System.out.println("Player 1 wins");
		}else {
			System.out.println("invalid input");
		}
		
		
		
		
	}

}
