/**
 * 
 * this creates an individual leg of the ski hill represented in the tree structure
 * @author Rosy Ren (251080052) CS 1027
 * 
 *
 */
public class Trail {

	// declares the attributes each leg has
	private String ID;
	private String type;
	private int rank;
	
	/**
	 * takes in two parameters and sets the ranking difficulty of each type of terrain 
	 * or obstacle
	 * 
	 * @param ID		this keeps an ID of the trail
	 * @param type		this declares the terrain or obstacle type 
	 */
	public Trail(String ID, String type) {
		
		this.ID = ID;
		this.type = type;
		
		// sets the difficulty of each terrain type
		if (type.equals("ice")) {
			rank = 4;
		}
		
		else if (type.equals("trees")){
			rank = 3;

		}
		
		else if (type.equals("rocks")) {
			rank = 2;
			
		}
		
		else if (type.equals("slalom")){
			
			rank = 1;
			
		}
		
		else {
			rank = 0;
		}
	}
	
	/**
	 * returns the rank value 
	 * @return rank		returns the rank of each terrain
	 */
	public int getRank() {
		return rank;
	}
	
	/**
	 * sets the rank value with the input parameter
	 * @param newRank		input parameter rank
	 */
	
	public void setRank(int newRank) {
		
		rank = newRank;
		
	}
	
	/**
	 * returns the type of terrain/obstacle
	 * @return String	returns the type
	 */

	public String getType() {
		return type;
	}
	
	/**
	 * sets a new type with the input parameter
	 * @param newType		new type of terrain
	 */
	public void setType(String newType) {
		
		type = newType;
	}
	
	/**
	 * returnsthe ID 
	 * @return String 		the ID of the trail
	 */
	public String getID() {
		return ID;
	}
	
	/**
	 * sets the ID with the new input parameter
	 * @param newID		input parameter new ID
	 */
	
	public void setID(String newID) {
		
		ID = newID;
	}

	/**
	 * returns the rank as a string 
	 * @return String 		string representation
	 */
	public String toString() {
		
		return "" + rank;
	}

}



