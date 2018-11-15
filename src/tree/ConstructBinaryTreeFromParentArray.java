package tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromParentArray {
	Node root;
	 void createNode(int parent[], int i, Node created[]) 
	    {
	        // If this node is already created
	        if (created[i] != null)
	            return;
	  
	        // Create a new node and set created[i]
	        created[i] = new Node(i);
	  
	        // If 'i' is root, change root pointer and return
	        if (parent[i] == -1) 
	        {
	            root = created[i];
	            return;
	        }
	  
	        // If parent is not created, then create parent first
	        if (created[parent[i]] == null)
	            createNode(parent, parent[i], created);
	  
	        // Find parent pointer
	        Node p = created[parent[i]];
	  
	        // If this is first child of parent
	        if (p.left == null)
	            p.left = created[i];
	        else // If second child
	          
	            p.right = created[i];
	    }
	  
	    /* Creates tree from parent[0..n-1] and returns root of 
	       the created tree */
	    Node createTree(int parent[], int n) 
	    {    
	        // Create an array created[] to keep track
	        // of created nodes, initialize all entries
	        // as NULL
	        Node[] created = new Node[n];
	        for (int i = 0; i < n; i++) 
	            created[i] = null;
	  
	        for (int i = 0; i < n; i++)
	            createNode(parent, i, created);
	  
	        return root;
	    }
	  
	void inorder(Node node) 
    {
        if (node != null) 
        {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructBinaryTreeFromParentArray tree = new ConstructBinaryTreeFromParentArray();
		
		int a[] = {-1, 0, 0, 1, 1, 3, 5};
		
		Node root1 = tree.createTree(a, 7);
		tree.inorder(root1);
	}

}
