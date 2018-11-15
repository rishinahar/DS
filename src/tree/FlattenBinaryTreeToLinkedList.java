package tree;

import java.util.Stack;


class FlattenBinaryTreeToLinkedList {
	static Node root;
	 public static void flatten(Node root) {
	        Stack<Node> stack = new Stack<Node>();
	        Node p = root;
	 
	        while(p != null || !stack.empty()){
	 
	            if(p.right != null){
	                stack.push(p.right);
	            }
	 
	            if(p.left != null){
	                p.right = p.left;
	                p.left = null;
	            }else if(!stack.empty()){
	                Node temp = stack.pop();
	                p.right=temp;
	            }
	 
	            p = p.right;
	        }
	    }
	 
	 public static void inorder(Node node)
	 {
		 if (node == null)
			 return;
		   inorder(node.left);
		   System.out.print(node.data+" ");
		   inorder(node.right);
		 
	 }
	public static void main(String[] args) {
		
		FlattenBinaryTreeToLinkedList tree = new FlattenBinaryTreeToLinkedList();
		
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
        
        inorder(root);
        flatten(root);
        System.out.println("\nAfter flatenning the tree ");
        inorder(root);
	}
         
}
