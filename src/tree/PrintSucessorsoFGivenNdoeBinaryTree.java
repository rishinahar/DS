package tree;

public class PrintSucessorsoFGivenNdoeBinaryTree {

    Node root;
    
    void printSucessors(Node node, int target)
    {
    	if (node ==null)
    		return ;

    	else if (node.data == target)
    	{
    		printNodes(node.left);
    		printNodes(node.right);
    	}
    	else 
    	{
    		printSucessors(node.left,  target);
    		printSucessors(node.right,  target);

    	}
    	
    }
  
    void  printNodes(Node node)
    {
    	if (node ==null)
    		return ;
    	printNodes(node.left);
    	System.out.print(node.data+ " ");
    	printNodes(node.right);
    }

    
 public static void main(String args[]) 
  {
	 PrintSucessorsoFGivenNdoeBinaryTree tree = new PrintSucessorsoFGivenNdoeBinaryTree();
    
    /* Construct the following binary tree
              1
            /   \
           2     3
          /  \
         4    5
        /
       7
    */
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.left.left.left = new Node(7);

    tree.printSucessors(tree.root, 1);

}

}
