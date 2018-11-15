package tree;

class Node 
{
 int data;
 Node left, right;

 public Node(int data) 
 {
     this.data = data;
     left = right = null;
 }
}
public class GenericTreeWithLeftChildAndRootSame {
	static Node root;
	
	public static void leftChildAndRootSame(Node node)
	{
		if (node == null)
			return;
		
		if (node.left != null)
		{
			node.left.data = node.data;
		}
		
		leftChildAndRootSame(node.left);
		leftChildAndRootSame(node.right);

	}
	
	public static void printTree (Node node)
	{   
		if (node == null)
			return;
		
		printTree(node.left);
		System.out.print(node.data +" ");
		printTree(node.right);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericTreeWithLeftChildAndRootSame tree = new GenericTreeWithLeftChildAndRootSame();

        /* Constructed binary tree is
                1
              /   \
             2     3
            /  \   /
           4    5 8 
           			\
           			  9
        */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(8);
        tree.root.right.left.right = new Node(9);
        
        printTree(root);
        leftChildAndRootSame (root);
        System.out.println("\nAfter making the left nodes and root nodes same ");
        printTree(root);

	}

}
