package tree;

//Java program to check is binary tree is symmetric or not
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

class IsMirrorImageOfTree 
{
 Node root;

 // returns true if trees with roots as root1 and root2 are mirror
 boolean isMirror(Node node1, Node node2) 
 {
     // if both trees are empty, then they are mirror image
     if (node1 == null && node2 == null)
         return true;

     // For two trees to be mirror images, the following three
     // conditions must be true
     // 1 - Their root node's data must be same
     // 2 - left subtree of left tree and right subtree
     //      of right tree have to be mirror images
     // 3 - right subtree of left tree and left subtree
     //      of right tree have to be mirror images
     if (node1 != null && node2 != null && node1.data == node2.data)
         return (isMirror(node1.left, node2.right)
                 && isMirror(node1.right, node2.left));

     // if neither of the above conditions is true then
     // root1 and root2 are mirror images
     return false;
 }
 
 // returns mirror tree of a given tree
 Node mirror(Node node)
 {
     if (node == null)
         return node;

     /* do the subtrees */
     Node left = mirror(node.left);
     Node right = mirror(node.right);

     /* swap the left and right pointers */
     node.left = right;
     node.right = left;

     return node;
 }

 // returns true if the tree is symmetric i.e
 // mirror image of itself
 boolean isSymmetric(Node node) 
 {
     // check if tree is mirror of itself
     return isMirror(root, root);
 }

 // Driver program
 public static void main(String args[]) 
 {
	 IsMirrorImageOfTree tree = new IsMirrorImageOfTree();
     tree.root = new Node(1);
     tree.root.left = new Node(2);
     tree.root.right = new Node(2);
     tree.root.left.left = new Node(3);
     tree.root.left.right = new Node(4);
     tree.root.right.left = new Node(4);
     tree.root.right.right = new Node(3);
     boolean output = tree.isSymmetric(tree.root);
     if (output == true)
         System.out.println("1");
     else
         System.out.println("0");
 }
}
