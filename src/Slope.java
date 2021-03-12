import java.util.Iterator;

/**
 * this class represents a path down the tree from the root to a leaf node
 * @author Rosy Ren (251080052) cs 1027
 *
 * @param <T> generic type
 */
public class Slope implements Comparable<Slope>{

	// declares the instance variables
	private Trail[] trails;
	private int ranking;
	private int count;
	
	/**
	 * initialize the instance variable trails 
	 * transfers the elements from the inputted list into the trails array 
	 * using iterator 
	 * @param list		
	 */
	public Slope(ArrayUnorderedList<Trail> list) {
		
		// initialize the trails array with a size of 10
		trails = new Trail[10];
		int i = 0;
		
		// create a new iterator and iterate through the list 
		Iterator<Trail> iter = list.iterator(); 
		
		while (iter.hasNext()) {
		
			// add from list to the variable list trails
			trails[i] = iter.next();
			i++;
			count ++;
			
		}
		
	}
	
	/**
	 * returns the ranking 
	 * @return ranking 
	 */
	public int getRanking() {
		return ranking;
	}
	
	/**
	 * returns the number of trails comprising this slope
	 * @return count 
	 */
	public int getCount() {
		return count;
	}
	
	/**
	 * calculates the ranking of the slope based on each Trail type 
	 * if there is a reoccuring slope, it multiples
	 */
	public void calculateRank() {

		int difficulty = 0;
		
		int num = 0;
			
		// gets the first trail's difficulty
		String type = trails[0].getType();
		difficulty += trails[num].getRank();
		num++;
		
		int i = 1;
		
		while (num != count) {
			
			// if it is the same type consecutively, it adds twice
			if (type.equals(trails[num].getType()) && trails[num].getRank() != 0) {
				i++;
			}
			type = trails[num].getType();

			difficulty += trails[num].getRank()*i;

			num++;
		}
		
		// sets the instance variable to the new calculated ranking
		ranking = difficulty;
		
	}
	/**
	 * returns a string representation of the slope and the types and difficulty 
	 * @return string 
	 */
	public String toString () {
		
		String str = "";
		
		if (count == 0) {
			return "The slope contains no trails.";
		}
		
		for (int i = 0; i < count-1; i ++) {
			str += trails[i] + ", ";
		}
		
		
		str += trails[count-1] + ".\t"; 
		
		
		return str + "(" + ranking + ")";
	}
	
	/**
	 * takes in another Slope object and they're compared
	 * @param T other		takes in for comparison
	 */
	public int compareTo(Slope other) {
		
		return Integer.compare(this.ranking, other.ranking);
	}

  
}
