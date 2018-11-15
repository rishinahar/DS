package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalTree {
	static Node root;


	public void levelOrderTraversalTreeQueue(Node node) 
	{

		if (node == null)
			return;

		Queue<Node> q1 = new LinkedList<>();

		q1.add(node);
		while (!(q1.isEmpty()))
		{
			Node temp = q1.remove();
			System.out.print(temp.data+" ");

			if (temp.left != null)
				q1.add(temp.left);

			if (temp.right != null)
				q1.add(temp.right);
		}

	}
	
	public void levelOrderTraversalTreeRecursion(Node node, int level) 
	{

		if (node == null)
			return;
		
		System.out.println("node.data ="+ node.data +  " node.height = "+nodeHeight(root, node,0) + " currentLevel = "+level );
       
		if (nodeHeight(root, node,0) == level)
		System.out.print(node.data+" ");

		if (node.left != null)
			levelOrderTraversalTreeRecursion(node.left,level+1);

		if (node.right != null)
			levelOrderTraversalTreeRecursion(node.right,level+1);
	}

	public int nodeHeight(Node root, Node node, int height)
	{
		if (root == null || node == null)
			return -1;
		
		if (node == root)
			return height;
		
		int leftHeight = nodeHeight(root.left, node , height+1);
		
		if (leftHeight ==-1)
		 return nodeHeight(root.right, node , height+1);
		
		return leftHeight;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LevelOrderTraversalTree tree = new LevelOrderTraversalTree();

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

		tree.levelOrderTraversalTreeQueue(root);
		System.out.println();
		tree.levelOrderTraversalTreeRecursion(root,0);

		
	}

}
