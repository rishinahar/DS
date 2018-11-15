package tree;

public class TransformToSumTree {
	static Node root;
	int toSumTree(Node node)
	{  int olddata ;
	    if (node == null)
	    {
	    	return 0;
	    }
	    
	        olddata = node.data;
	    	node.data = toSumTree(node.left) +toSumTree(node.right) ;
	   
	   return olddata +node.data;

	}

	void inorderTraversal(Node node)
	{
		 if (node == null) {
	            return;
	        }
		   inorderTraversal(node.left);
	        System.out.print(node.data + " ");	        
	        inorderTraversal(node.right);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransformToSumTree tree  = new TransformToSumTree(); 

				/*
				 *     1
				 *   /  \
				 * 2      3
				 *      /   \
				 *     4     5
				*/
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.right.left = new Node(4);
		tree.root.right.right = new Node(5);
  
		tree.inorderTraversal(root);
		tree.toSumTree(root);
		System.out.println("\nTHE SUM TREE IS \n");
		tree.inorderTraversal(root);

		
	}

}
