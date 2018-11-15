package Array;

import java.util.PriorityQueue;

public class AMatrixIsWhichIsSortedRowWiseAndColumnWisePrintTheSortedOrder {

	public void printSortedOrder(int m[][])
	{
		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
		for(int i=0;i< m.length;i++)
		{
			for(int j=0;j< m.length;j++)
			{
				pqueue.add(m[i][j]);
			}
			
		}
			
		while(!pqueue.isEmpty())
		{
			System.out.print(pqueue.remove()+" ");
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int mat[][]  =  { {10, 20, 30, 40},
              {15, 25, 35, 45},
              {27, 29, 37, 48},
              {32, 33, 39, 50},
            };
        new AMatrixIsWhichIsSortedRowWiseAndColumnWisePrintTheSortedOrder().printSortedOrder(mat);
	}

}
