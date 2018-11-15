package tree;

public class PrintCousinsOfNode {

	Node root;

	public int getLevelOfNode(Node root,Node node,int level)
	{
		if (root == null)
			return -1;
		
		else if (root.data == node.data)
			return level;
		
		int leftLevel = getLevelOfNode(root.left, node , level+1);
		
		if (leftLevel!= -1 )
			return leftLevel;
		
		return getLevelOfNode(root.right,node, level+1);
		
	}
	
	public void printlevelOfNode(Node root,Node node , int level)
	{
		if (root == null|| level<2)
		{
			return ;
		}
		
		if (level == 2)
	    {
	        if (root.left == node || root.right == node)
	            return;
	        if (root.left !=null)
	           System.out.println(root.left.data);
	        if (root.right != null)
		       System.out.println(root.right.data);
	    }
	 
	    // Recur for left and right subtrees
	    else if (level > 2)
	    {
	    	printlevelOfNode(root.left, node, level-1);
	    	printlevelOfNode(root.right, node, level-1);
	    }
	}
	
	public void printCousins(Node root,Node data) 
	{
	    	int level = getLevelOfNode(root,data,1);
	    	printlevelOfNode(root,data,level);
	}
	
	public void printCousinsUtil(Node data) 
	{
		printCousins(root,data);	
	}
	
	public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
		PrintCousinsOfNode tree = new PrintCousinsOfNode();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
 
        Node node = tree.root.left.right;
        tree.printCousinsUtil(node);
    }
}
