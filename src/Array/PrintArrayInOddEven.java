package Array;

public class PrintArrayInOddEven {
    void printArrayInOddEven(int a[])
    {
    	System.out.print(a[0]+ ", " );
    	int i=1;
    	int j=2;
    	boolean flag = false;
    	while(i<a.length || j< a.length)
    	{
    		if (!flag)
    		{
    	    	System.out.print(a[j] + ", " );
    	    	j=j+2;
    	    	//flag = true;
    		}	
    		
    		else
    		{
    	    	System.out.print(a[i]+ ", " );
    	    	i=i+2;
    	    	//flag = false;
    		}
    		flag = !flag;
    	}	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[] =
	  {10,20,30,40,50,60,70};
  
   new PrintArrayInOddEven().printArrayInOddEven(a);
  //Output You have to print 10, 30, 20, 50, 40, 70, 60
	}

}
