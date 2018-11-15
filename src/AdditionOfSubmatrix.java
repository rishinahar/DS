
public class AdditionOfSubmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 int a[][] ={{1,2,3,0},{4,5,6,1},{7,8,9,1},{1,2,2,1}};
		 int row =4 ;
		 int coln =4;
		 

		 int count =0;
		 int maxcount =0;
		 int rowIndex = -1;
		 for (int i= 0;i<row;i++)
		  {
			 for (int j= 0;j<coln;j++)
			  {
				if (a[i][j] ==1)
				{
					count ++;
					
					if (count > maxcount)
					{
						maxcount =count;
						rowIndex = i;
					}
					
				}
			  } 
			 count =0;
		  }
		 
		 System.out.println("maximum number of ones in a row is = " + maxcount + " at the row index "+ rowIndex);
	}

}
