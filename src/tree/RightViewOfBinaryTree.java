package tree;

class Max_level {
	 
    int max_level;
}

public class RightViewOfBinaryTree {
    Node root;
	Max_level max = new Max_level();
	 
	void rightViewOfBinaryTree(Node root, int level, Max_level maxLevel) 
	{
		if(root == null)
			return;
		
		if (maxLevel.max_level <level)
		{
			System.out.print(root.data+" ");
			maxLevel.max_level= level;
		}
		rightViewOfBinaryTree(root.right , level+1,maxLevel);
		rightViewOfBinaryTree(root.left , level+1,maxLevel);
		
	}
	
	public  void rightView() {
		 
		rightView(root);
    }
	
	public  void rightView(Node node) {
		 
		rightViewOfBinaryTree(node, 1, max);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RightViewOfBinaryTree tree = new RightViewOfBinaryTree();
		  
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
  
        tree.rightView();

	}

}
