package tree;

public class CheckIfBinaryTreeIsSubtreeOfAnotherBinaryTree {
  Node root;
	
  boolean areIdentical(Node root1, Node root2) 
  {
	  /* base cases */
      if (root1 == null && root2 == null)
          return true;

      if (root1 == null || root2 == null)
          return false;

      /* Check if the data of both roots is same and data of left and right
         subtrees are also same */
      return (root1.data == root2.data
              && areIdentical(root1.left, root2.left)
              && areIdentical(root1.right, root2.right));
  
  }
  boolean isSubtree(Node tree , Node subtree)
  {   
	  /* base cases */
	  if (tree == null) 
		  return false;
	  
	  if ( subtree == null)
		  return true;
	  
	  /* Check the tree with root as current node */
	   if (areIdentical(tree, subtree)) 
		   return true;	  
	   
	   /* If the tree with root as current node doesn't match then
	      try left and right subtrees one by one */ 
	   return   isSubtree(tree.left, subtree) || isSubtree(tree.right, subtree);
  }
  
	public static void main(String args[]) 
	  {
		CheckIfBinaryTreeIsSubtreeOfAnotherBinaryTree tree = new CheckIfBinaryTreeIsSubtreeOfAnotherBinaryTree();
		CheckIfBinaryTreeIsSubtreeOfAnotherBinaryTree subtree = new CheckIfBinaryTreeIsSubtreeOfAnotherBinaryTree();

	    
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

	  /*
	    
	      2     
        /  \
       4    5
      /
     7
     */
	    subtree.root = new Node(2);
	    subtree.root.left = new Node(4);
	    subtree.root.right = new Node(5);
	    subtree.root.left.left = new Node(7);
	  
	    System.out.println(tree.isSubtree(tree.root, subtree.root));

	}
	
}
