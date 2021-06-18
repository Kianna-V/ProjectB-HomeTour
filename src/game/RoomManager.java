package game;


import fixtures.Room;

public class RoomManager {
	
	
	
	 Room quit = new Room("quit", "quit", "quit");
	 
	 public Room getQuit(){
			return this.quit;
		}
	
		public RoomManager() {
		this.init();
		this.fillRoomManager(); // used to set up rooms 
		this.fillExits(); // used to set exits for rooms 
	
	}
	
	
	Room StartingRoom;

	Room[] rooms = new Room[5];

		
	
	public void init(){
		Room foyer = new Room("The Foyer", "A small foyer", "The small "
				+ "Entryway of a 3 room condo with a beautiful modern kitchen. All 4 rooms can be "
				+ "seen and entered in from this foyer.");
				
		rooms[0] = foyer;
		this.StartingRoom = foyer;//  the room the player will start in
		
	}
	
	// using java collections fill() method to replace elements
		//of specified list with the specified elements
public void fillRoomManager() {
	Room livingRoom = new Room("The living Room"," Spacious Wide open Living Room", "Within this space, you have "
			+ "A lovely green sectional couch, Lazy-Boy chair, and an entertainment center with a 4k 60 inch tv complete "
			+ "\nwith surround sound system.");
	rooms[1] = livingRoom;
	Room kitchen = new Room("Kitchen", "Modern Kitchen", "Within this kitchen, there are granite counter tops"
			+ "Complete with an open Bar space and stools,\n so guest's can chat with whomever is cooking!");
	rooms[2] = kitchen;
	Room gameRoom = new Room("Game Room", "Room for Gaming", " In this room here, there's another"
			+ " entertainment system with the same 60 inch 4K tv, with gaming console connected and "
			+ "Ready to play");
	rooms[3] = gameRoom;
	Room masterBedroom = new Room("The Master Bedroom","The Master Bedroom",
			"Within the Master, there's a giant king sized bed with plenty of pillows,"
			+ " feel free to take a nap!");
	rooms[4] = masterBedroom; 
}

public void fillExits() {
	//Room directions: 
	//north, east, south, west
	//foyer at index[0]
			//north east south west
	rooms[0].setExits(rooms[1],rooms[3] , rooms[4], rooms[2]); // starting at the room foyer -all rooms accessible
	//living room [1]
	rooms[1].setExits( rooms[1],rooms[3],rooms[0],rooms[1]);
	//kitchen[2]
	rooms[2].setExits(rooms[2], rooms[0], rooms[2], rooms[4]);
	//gameRoom [3]
	rooms[3].setExits(rooms[1],rooms[3],rooms[3],rooms[2]);
	//masterBedroom[4]
	rooms[4].setExits(rooms[0], rooms[4], rooms[4], rooms[2]);



}


}

		
		
		
		
	
		
	

