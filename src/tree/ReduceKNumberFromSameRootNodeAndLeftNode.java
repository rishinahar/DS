package tree;

class Node 
{
	int data;
	Node left, right;

	Node(int item) 
	{
		data = item;
		left = right = null;
	}
}


public class ReduceKNumberFromSameRootNodeAndLeftNode {
  static Node root;
  
  public  void reduceKNumberFromSameRootNodeAndLeftNode (Node node , int reduceK)
  {
	  if (node == null)
		  return;
	  
	  if (node.left !=null)
	  {
		  if (node.left.data == node.data)
		  {
			  node.left.data = node.data = node.data-reduceK;
		  }
	  }
	  reduceKNumberFromSameRootNodeAndLeftNode(node.left , reduceK);	  
	  reduceKNumberFromSameRootNodeAndLeftNode(node.right , reduceK);

  }
  
  public void printInorder(Node node)
  {  
	  if (node == null)
		  return;
	  printInorder(node.left);
	  System.out.print(node.data + " ");
	  printInorder(node.right);
	  
  }
	public static void main(String[] args) {
		ReduceKNumberFromSameRootNodeAndLeftNode tree = new ReduceKNumberFromSameRootNodeAndLeftNode();
        
	  	  
        /* Constructed binary tree is
                  800
               /      \
             600      900
            /  \     /   \
          600  700  900  950
          / 	/	       \
         400  615	       975
         /
       400  
        */
        tree.root = new Node(800);
        tree.root.left = new Node(600);
        tree.root.right = new Node(900);
        tree.root.left.left = new Node(600);
        tree.root.left.left.left = new Node(400);
        tree.root.left.left.left.left = new Node(400);
        tree.root.left.right = new Node(700);
        tree.root.left.right.left = new Node(615);
        tree.root.right.left = new Node(900);
        tree.root.right.right = new Node(950);
        tree.root.right.right.left = new Node(975);
        
        tree.printInorder(root);
        System.out.println("\nAfter changing the tree with reduce k for same number of nodes");
        tree.reduceKNumberFromSameRootNodeAndLeftNode(root, 150);
        tree.printInorder(root);

	}

}
