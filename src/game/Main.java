package game;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
	RoomManager rm = new RoomManager();
	Player player1 = new Player();
	player1.setCurrentRoom(rm.StartingRoom);
	
	
	String[] input;
	
	do {
		printRoom(player1);
		input = collectInput();
		parse(input, player1,rm);
		System.out.println("---");
	
	
	}while(player1.getCurrentRoom().getName()!="quit");
	
	
	
	}
	
	
	private static void printRoom(Player player) {
		//print current room and exits
		System.out.println(player.getCurrentRoom());
		System.out.println(player.getCurrentRoom().getExits());
	}
	
	
	private static String[] collectInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which room would you like to see?" + "\ntype 'go' when you're ready to go!"
				+ "( north,east,south,West)\n Or would you like to quit?");
		//save input to string userInput
		String userInput = scan.nextLine().toLowerCase();
		String[] collectedInput = userInput.split(" ");
		return collectedInput;
		
		
	}
	 

	
	private static void parse(String[] command, Player player,RoomManager rm) {
		
		
		switch(command [0]) {
		
		case "go" :
		
			player.setCurrentRoom(player.getCurrentRoom().getExit(command[1]));
			break;
		
		case "quit":
			 player.setCurrentRoom((rm.getQuit()));
				System.out.println("Thanks for stopping by!");
			}
			
		}
	
		
}

