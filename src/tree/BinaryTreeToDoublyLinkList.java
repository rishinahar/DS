package tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//Java program to convert a given Binary Tree to 
//Doubly Linked List

/* Structure for tree and Linked List */
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

class BinaryTreeToDoublyLinkList 
{
	Node root;
    // right pointer is equivalent to next and left is equivalent to previous 
    // head --> Pointer to head node of created doubly linked list
    Node head;
    // Initialize previously visited node as NULL. This is
    // static so that the same value is accessible in all recursive
    // calls
    static Node prev = null;
  
    // A simple recursive function to convert a given Binary tree 
    // to Doubly Linked List
    // root --> Root of Binary Tree
    void BinaryTree2DoubleLinkedList(Node root) 
    {
        // Base case
        if (root == null)
            return;
  
        // Recursively convert left subtree
        BinaryTree2DoubleLinkedList(root.left);
  
        // Now convert this node
        if (prev == null) 
            head = root;
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
  
        // Finally convert right subtree
        BinaryTree2DoubleLinkedList(root.right);
    }
  
    
    // level order traversal and conversion of binary tree to Doubly Linklist
    static Node binaryTree2DoubleLinkedList(Node root)
    {  
    	if (root == null)
            return root;
    	
    	LinkedList<Node> queue = new LinkedList<>();
          queue.add(root);	
          Node List1 = root;
          Node last = null;
          Node node = null;
    	while (!queue.isEmpty())
    	{   
    		node = queue.poll();
    		 
    		if(node.left !=null)
    			queue.add(node.left);	
    		if(node.right !=null)
    			queue.add(node.right);	 
    		
    		   node.left = last;
    		   node.right = queue.peek();
    		   last = node;
    	}
    	return List1;
    }
    
    /* Function to print nodes in a given doubly linked list */
    void printList(Node node)
    {
        while (node != null) 
        {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }
  
    // Driver program to test above functions
    public static void main(String[] args) 
    {
        // Let us create the tree as shown in above diagram
    	BinaryTreeToDoublyLinkList tree = new BinaryTreeToDoublyLinkList();
        tree.root = new Node(10);
        tree.root.left = new Node(12);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(36);
        tree.root.right.right = new Node(45);

        // convert to DLL
        //tree.BinaryTree2DoubleLinkedList(tree.root);
        Node List1 = binaryTree2DoubleLinkedList(tree.root); 
        // Print the converted List
        tree.printList(List1);
  
    }

// This code has been contributed by Mayank Jaiswal(mayank_24)
}