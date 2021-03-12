/**
 * creates binary trees for the program using a queue based approach 
 * @author rosy
 *
 * @param <T>
 */
public class TreeBuilder<T> {
	/**
	 * this is the only method used to create the trees
	 * @param input		takes in a set of values to insert in the new tree's nodes
	 * @return
	 */

	public LinkedBinaryTree<T> buildTree (T[] input) {
		
		
		LinkedQueue<T> dataQueue = new LinkedQueue<T>();
		
		// enqueues all of the inputted values into the data queue
		for (int i = 0; i < input.length; i ++) {
			dataQueue.enqueue(input[i]);
		}

		// creates a parent queue which is used for visiting
		LinkedQueue<BinaryTreeNode<T>> parentQueue = new LinkedQueue<>();
		
		BinaryTreeNode<T> root = new BinaryTreeNode<T>(dataQueue.dequeue());
		
		parentQueue.enqueue(root);
		
		// initializes all of the left, right, and parent nodes
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		BinaryTreeNode<T> parent;

		// while there are still elements
		while (!dataQueue.isEmpty()) {
			
			left = new BinaryTreeNode<>(dataQueue.dequeue());
			right = new BinaryTreeNode<>(dataQueue.dequeue());
			parent = parentQueue.dequeue();

			// if it is not null, set the left to be the left child of the parent
			if ((left != null) && (parent.getData()!= null) && (left.getData()!= null)){ 
				
				parent.setLeft(left);
				// enqueue the left to parentQueue as the next parent
				parentQueue.enqueue(left);
				
			}
			// if it is not null, set the right to be the right child of the parent

			if ((right != null)&& (parent.getData()!= null)  && (right.getData()!= null)){
				
				parent.setRight(right);
				// enqueue the right to parentQueue as the next parent

				parentQueue.enqueue(right);
				

			}

		}
		// create a new tree with the root object we created earlier
		LinkedBinaryTree<T> tree = new LinkedBinaryTree<T>(root);
		
		// return the tree
		return tree;
	}
	

}
