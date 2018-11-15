package tree;

import java.util.Dictionary;
import java.util.List;

class TNode {
	
	public TNode parent;
    public TNode left;
    public TNode right;
    
}
public class TreeNode {

        
     TNode node; 

        public void addLeftChild(TNode parent, TNode leftChild){
            leftChild.parent = parent;
            parent.left = leftChild;
        }
        
        public void addRightChild(TNode parent, TNode rightChild){
        	rightChild.parent = parent;
            parent.right = rightChild;
        }
        
    public TreeNode ConvertCSPairsToTree(int a[][])
    {
              

        return null;//there was a cycle or the input list was empty
    }
}
