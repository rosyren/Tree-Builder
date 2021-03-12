/**
 * This will be the main program that calls all the other methods
 * @author Rosy Ren (251080052) CS 1027
 * @param <T>	 generic type
 */

public class SlopeRanker<T> {
	
	// declaring the instance variable of ranks
	private ArrayOrderedList<Slope> ranks;
	
	
	/**
	 * Constructor that initializes new arrays and lists and calls methods
	 * @param trailTypes		includes all of the trailTypes
	 */
	public SlopeRanker(String [] trailTypes) {
	
	
		Trail[] newTrail = initTrailArray(trailTypes);
				
		TreeBuilder<Trail> newTree = new TreeBuilder<>();
		
		// build a new tree with the newTrail array
		LinkedBinaryTree<Trail> trailTree = newTree.buildTree(newTrail);
		
		// initializes rank 
		ranks = new ArrayOrderedList<Slope>();
		
		ArrayUnorderedList<Trail> newList = new ArrayUnorderedList<>();
		
		preorderTraversal(trailTree.getRoot(), newList);
		
		System.out.println(ranks.toString());
	}
	
	/**
	 * 
	 * takes in a string array parameter and returns a trail array   
	 * @param input		 contains all of the types to be converted to Trail
	 * @return Trail[] array
	 */
	public Trail[] initTrailArray(String[] input) {
		
		Trail[] trailArray = new Trail[input.length];

		int ID = 0;
		
		for (int i = 0; i < input.length; i ++) {
			// if the input is null
			if (input[i] == null) {
				trailArray[i] = null;
			}
			// creates a new trail object and adds it to the trail array
			else {
				Trail newObject = new Trail(String.valueOf(ID), input[i]);
				trailArray[i] = newObject;
			}
			
			ID++;
		}
		
		return trailArray;
		
		
		
	}
	
	/**
	 * Traverse using preorder and create slopes from root to leaf 
	 * @param node		the node we're currently on
	 * @param list		the list we have to add to when we traverse
	 */
	public void preorderTraversal(BinaryTreeNode<Trail> node, ArrayUnorderedList<Trail> list) {
		
		// if the node is not null, we traverse
		if (node!= null) {
			
			list.addToRear(node.getData());
			preorderTraversal(node.getLeft(),list);
			preorderTraversal(node.getRight(),list);
			
			// this checks for leaf nodes and if it is a leaf node, we remove 
			if (node.getLeft()!= null || node.getRight() != null) {
				
				list.remove(node.getData());

			} else {
				Slope slope1 = new Slope(list);
				slope1.calculateRank();
				ranks.add(slope1);
				list.remove(node.getData());
			}
		}
		
		
	}
	
	/**
	 * returns the rank of the node
	 * @param node		takes in an node
	 * @return
	 */
	public int rankNode(BinaryTreeNode<Trail> node) {
		
		return node.getData().getRank();
		
	}
	
	/**
	 * returns the rank lists 
	 * @return ranks list 	
	 */
	public ArrayOrderedList<Slope> getRanks(){
		return ranks;
		
	}
	

}
