package tree;

import java.util.LinkedList;
import java.util.Stack;

public class LevelOrderZigZagTraversal {

	static Node root;

	
	public void levelOrderZigZagTraversal(Node node) 

	{
		if (node == null)
		 return ;
		
		Stack<Node> stack1 = new Stack<Node>(); 
		Stack<Node> stack2 = new Stack<Node>(); 

		stack1.push(node);
		
		while(!stack1.isEmpty() || !stack2.isEmpty())
		{
			Node temp = null;
			while(!stack1.isEmpty())
			{
				temp = stack1.pop();
				System.out.print(temp.data+ " ");
				
				if (temp.right!= null)
					stack2.push(temp.right);
					
				if (temp.left!= null)
					stack2.push(temp.left);
			}
			
			while(!stack2.isEmpty())
			{
				temp = stack2.pop();
				System.out.print(temp.data+ " ");
				
				if (temp.left!= null)
					stack1.push(temp.left);
					
				if (temp.right!= null)
					stack1.push(temp.right);
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LevelOrderZigZagTraversal tree = new LevelOrderZigZagTraversal();

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

		tree.levelOrderZigZagTraversal(root);
		
	}

}
