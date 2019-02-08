package tree;

import java.util.HashMap;

public class PrintPost {
	
    
	public int[] Find_post (int input1 , int[] input2 , int[] input3)
	{
		result = new int[input1];
		printPost(input2, input3, 0, input1-1);
		
		for (int i=0; i< input1; i++)
		{
			System.out.print(result[i]+" ");
		}
		
		HashMap map = new HashMap ();
		
        int[] result = {-1};		
				
		return result;
	}

	static int preIndex = 0;
    static int count = 0; 
    int[] result;
    
	void printPost(int[] in, int[] pre, int inStrt, int inEnd) 
    { 
        if (inStrt > inEnd)  
            return;         
  
        // Find index of next item in preorder traversal in 
        // inorder. 
        int inIndex = search(in, inStrt, inEnd, pre[preIndex++]); 
  
        // traverse left tree 
        printPost(in, pre, inStrt, inIndex - 1); 
  
        // traverse right tree 
        printPost(in, pre, inIndex + 1, inEnd); 
  
        // print root node at the end of traversal 
        result[count++] = in[inIndex]; 
    } 
  
    int search(int[] in, int startIn, int endIn, int data) 
    { 
        int i = 0; 
        for (i = startIn; i < endIn; i++)  
            if (in[i] == data)  
                return i;             
        return i; 
    } 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "test";
		String y= new String ("test");
		System.out.println(x==y);
		System.out.println(x.equals(y));
		
		
		int in[] = { 4, 2, 5, 1, 3, 6 }; 
        int pre[] = { 1, 2, 4, 5, 3, 6 }; 
        int len = in.length; 
        // 4 5 2 6 3 1 
        new PrintPost().Find_post(len, in, pre);  
		
	}

}
