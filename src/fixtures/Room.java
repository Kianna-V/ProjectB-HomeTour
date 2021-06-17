package fixtures;

import java.util.HashMap;
        

public class Room extends Fixtures {

	//creating HashMap object to store directions in key/value pairs
	HashMap<String, Room> exits = new HashMap<String, Room>();
	
	private String name;
	//private Room[] exits = new Room[4];
	
	//Constructor
	public Room(String name, String shortDescription, String longDescription ) {
		super(name, shortDescription, longDescription);
		HashMap<String, Room> exits = new HashMap<String, Room>();
	} 
	
	

	
	// able to use put keyword with HashMap
	public void setExits(Room north,  Room east, Room south, Room west) {
		exits.put("north", north);
		exits.put("east", east);
		exits.put("south", south);
		exits.put("west", west);
		
		
		}
		
		public Room getExit(String direction) {
			
		switch(direction) {
		
			case "north":
				return this.exits.get("north");
			
			case "east":
				return this.exits.get("east");
			case "south":
				return this.exits.get("south");
				
			case "west":
				return this.exits.get("west");
				
				default:
					System.out.println("That is not a valid option... choose wisely");
				
		}
			return this;
		}
		
		   // displays the exits
	    public String getExits(){
	    	String prompt = "Exits: ";
	    	String north = new String( "");
	    	String east = new String( "");
	    	String south = new String( "");
	    	String west = new String( "");
	    	
	    
	    
	 // If exit is the same room, then there is no exit in that direction, prints "none"
        if( exits.get("north").equals(this)  ) {
            north = "\nnorth: None";
        }else {north = "\nnorth: " + exits.get("north").getName();
            }

        if( exits.get("east").equals(this)  ) {
            east = "\neast: None";
        }else {east = "\neast: " + exits.get("east").getName();
            }

        if( exits.get("south").equals(this)  ) {
            south = "\nsouth: None";
        }else {south = "\nsouth: " + exits.get("south").getName();
            }

        if( exits.get("west").equals(this)  ) {
            west = "\nwest: None";
        }else {west = "\nwest: " + exits.get("west").getName();
            }
        return (prompt + north + east + south + west );
	    }
	
	@Override
	public String toString() {
		return (getName() + "\n" + getShortDescription() + "\n" + getLongDescription());
	}

	
	
}
