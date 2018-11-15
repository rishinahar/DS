package tree;

public class DifferenceOfSumOfNodesAtOddAndEvenLevel {
    
	static Node root;

	static int  oddSum =0;  
	static int  evenSum =0;  

	public static void sumOfNodesAtOddLevel(Node node ,int level) 
	{
		if (node == null)
			return;
		
		if (level % 2 !=0)
		{  System.out.print(node.data+", ");
			oddSum += node.data;
		}	
		sumOfNodesAtOddLevel(node.left , level+1);
		sumOfNodesAtOddLevel(node.right , level+1);

	}
	
	public static void sumOfNodesAtEvenLevel(Node node ,int level) 
	{
		if (node == null)
			return;
		
		if (level % 2 ==0)
			{ System.out.print(node.data+", ");
			  evenSum += node.data;
			}
		sumOfNodesAtEvenLevel(node.left , level+1);
		sumOfNodesAtEvenLevel(node.right , level+1);

	}

	
	public static void main(String args[]) 
    {

		DifferenceOfSumOfNodesAtOddAndEvenLevel tree = new DifferenceOfSumOfNodesAtOddAndEvenLevel();
  
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
  
        
        
        sumOfNodesAtOddLevel(root,1);
        System.out.println();
        sumOfNodesAtEvenLevel(root,1);
        int result = oddSum - evenSum;
        
        System.out.println("oddSum is "+oddSum +" \nevenSum is "+evenSum+" \nresult is "+ result);
    }
}
