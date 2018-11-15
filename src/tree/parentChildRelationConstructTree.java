package tree;

import java.util.HashMap;

class Relation {
    int parent;
    int child;
    boolean isLeft;
};

/*
 * 
Child Parent IsLeft 
15 20 true
19 80 true
17 20 false
16 80 false
80 50 false
50 null false
20 50 true
 */
public class parentChildRelationConstructTree {
   
	public void printNode(Node node)

	{
		if (node == null)
		 return;
		
		printNode(node.left);
		System.out.println(node.data);
		printNode(node.right);

	}
	
	public void mapToNode (Node root , HashMap map)
	{
		if (map.isEmpty())
			return;
		
		else
			{
			  Node temp = (Node) map.get(root.data);
			  if(temp !=null)
			  {
				  root.left = temp.left;
				  root.right = temp.right;
			  }
			}
		
		map.remove(root.data);
		if(root.left !=null)
		mapToNode(root.left,map);
		if(root.right !=null)
		mapToNode(root.right,map);

	}

	public Node relationTOMap (Relation relation[], HashMap<Integer, Node> map , Node root)
	{
		
		for (int i=0;i<relation.length; i++)
		{
			if (relation[i].parent == Integer.MIN_VALUE)
			{
				root = new Node (relation[i].child);
			}
			else  
			{

				Node node = null;
				if (!map.containsKey(relation[i].parent))
				{
					map.put(relation[i].parent, null);
					node = new Node(relation[i].parent);
				}
				else
					node = map.get(relation[i].parent);

				if (relation[i].isLeft)
				{
					node.left =  new Node(relation[i].child);
				}
				else
					node.right = new Node( relation[i].child);
				
				map.put(relation[i].parent, node);
			}
		}
       return root;
		
	}
	public static void main (String a[])
	{


		Relation[] relation = new Relation[7];

		for (int i=0 ; i<relation.length;i++)
		{
			relation[i] = new Relation();
		}
		relation[0].child = 15;	relation[0].parent = 20; relation[0].isLeft = true;
		relation[1].child = 19; relation[1].parent = 80; relation[1].isLeft = true;
		relation[2].child = 17; relation[2].parent = 20; relation[2].isLeft = false;
		relation[3].child = 16; relation[3].parent = 80; relation[3].isLeft = false;
		relation[4].child = 80; relation[4].parent = 50; relation[4].isLeft = false;
		relation[5].child = 50; relation[5].parent = Integer.MIN_VALUE; relation[5].isLeft = false;
		relation[6].child = 20; relation[6].parent = 50; relation[6].isLeft = true;

		HashMap<Integer, Node> map = new HashMap();
		Node root = null;

		root = new parentChildRelationConstructTree().relationTOMap(relation, map, root);
		
		System.out.println("root value is = "+ root.data);
		
		new parentChildRelationConstructTree().mapToNode(root, map);
		
		System.out.println(" Final tree traversal in inorder ");
		
		new parentChildRelationConstructTree().printNode(root);
	}
}
