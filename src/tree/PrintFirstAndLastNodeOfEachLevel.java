package tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintFirstAndLastNodeOfEachLevel {
	static Node root;


	public void printFirstAndLastNodeOfEachLevel(Node node) 
	{

		if (node == null)
			return;

		Queue<Node> q1 = new LinkedList<>();
		Queue<Node> q2 = new LinkedList<>();

		q1.add(node);
		while (!(q1.isEmpty()) || !(q2.isEmpty()))
		{
			boolean first = true;
			while (!(q1.isEmpty()))
			{
				Node temp = q1.remove();

				if (first && !q1.isEmpty())
				{
					System.out.println(temp.data);
					first = false;
				}

				if(q1.isEmpty())
					System.out.println(temp.data);

				if (temp.left != null)
					q2.add(temp.left);

				if (temp.right != null)
					q2.add(temp.right);
			}

			first = true;
			while (!(q2.isEmpty()))
			{
				Node temp = q2.remove();
				
				if (first && !q2.isEmpty())
				{
					System.out.println(temp.data);
					first = false;
				}

				if(q2.isEmpty())
					System.out.println(temp.data);

				if (temp.left != null)
					q1.add(temp.left);

				if (temp.right != null)
					q1.add(temp.right);
			} 	  


		}


	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintFirstAndLastNodeOfEachLevel tree = new PrintFirstAndLastNodeOfEachLevel();

		/* Let us construct the tree shown in above diagram */
		/*
    	      1
	        /    \
	       2      3
	      / \    / \
	     4   5  6   7
	             \   \
	              8   9  

		 */
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.right.left.right = new Node(8);
		tree.root.right.right.right = new Node(9);

		tree.printFirstAndLastNodeOfEachLevel(root);

	}

}
