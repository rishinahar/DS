package tree;

	public class CountNumberOfOccurrencesWhereThereAreTwoNodesWithSameHorizontalDistance {
	Node root;
	
	class Values
	{  int min, max;
		
	}
	
	void findMinMax(Node node , Values min , Values max , int hd)
	{
	   
		if (node == null)
			return;
	
		if (hd < min.min )
			min.min = hd;
		
		if (hd  > max.max )
			max.max = hd;
		
		findMinMax (node.left ,min ,max , hd-1);
		
		findMinMax (node.right ,min ,max , hd+1);
	
	}
	
	int heightOfNode(Node node , Node node1, int height)
	{
		if(node==null) return 0;
		if(node==node1) return height;
		
		//check if the node is present in the left sub tree
		int level = heightOfNode(node.left,node1,height+1);
		//System.out.println(level);
		if(level!=0) return level;
		
		//check if the node is present in the right sub tree
		return heightOfNode(node.right,node1,height+1);	
	}
	
	String printVerticalOrder(Node node ,int line_no, int hd, String result)
	{     
		if (node == null)
			return "";
	   
	   if (line_no==hd)
	   {
		   System.out.print(node.data +" ");
		    result+=node.data +" ," ;
	   }
	   printVerticalOrder(node.left , line_no, hd-1,result);
	   printVerticalOrder(node.right , line_no, hd+1,result);
	   
	return result;
	}
	void verticalOrder(Node node)
	{   
		Values val = new Values();
		findMinMax(node , val ,val, 0); 
	
		for (int line_no = val.min; line_no<=val.max;line_no++)
		{
			 String result = printVerticalOrder(root , line_no, 0,"");
			//System.out.print(" nodes at same hd are ====>>> "+result);
			System.out.println();
		}
	}
	
	
	
		public static void main(String args[]) 
	    {
			CountNumberOfOccurrencesWhereThereAreTwoNodesWithSameHorizontalDistance tree = new CountNumberOfOccurrencesWhereThereAreTwoNodesWithSameHorizontalDistance();
	  
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
			
			Node x  = new Node(8);
			Node root = new Node(1);
	        tree.root = root;
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.right.left = new Node(6);
	        tree.root.right.right = new Node(7);
	        tree.root.right.left.right = x;
	        tree.root.right.right.right = new Node(9);
	  
	        System.out.println("vertical order traversal is :");
	        tree.verticalOrder(tree.root);
	        System.out.println(tree.heightOfNode(root, x, 1));
	    }
	}
