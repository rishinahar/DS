package DynamicProgramming;

public class UniqueBinarySearchTree {

	/*
	 * Given an interger N, how many structurally unique binary search trees are there that store values 1...N?
	 * 
	 */
	public static int numTrees(int n) {
		int[] count = new int[n + 1];
	 
		count[0] = 1;
		count[1] = 1;
	 
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= i - 1; j++) {
				count[i] = count[i] + count[j] * count[i - j - 1]; // cataln number
			}
		}
	 
		return count[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n= 3;
		System.out.println(" Number of Unqiue BSTS for  n= "+ n +" is " +numTrees(n));
	}

}
