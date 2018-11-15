package Array;

import java.util.Arrays;

public class JumpingNumbers {
    
	public static void jumpingNumbers(int maxNum)
	{
		/*int max =maxNum;
		int divisor = 10;
		int a[] = new int[max+1];
		
		for (int i=0; i<a.length;i++)
			a[i]=i;
		
		for (int i=0; i<a.length;i++)
		{
			if (a[i]>=0 &&a[i]<=9)
				System.out.print(" " +a[i]);
			
			else if (a[i]>10)
			{
				int ones  = a[i] % divisor;
				int twos = a[i] /  divisor;
				
				if (ones - twos == 1 || ones -twos == -1)
				{
				 System.out.print(" "+twos);
				 System.out.print(ones+" ");
				}
				
			} 
		}*/
		String a[] = new String[500];
		int j =0;
		System.out.println("\n alternate genric approach ");
		for (int i=0; i<=maxNum;i++)
			{
			  if (breakingNumberToDigit(i))
				  {
				    System.out.println(i);
				  }
			
			}
		 //Arrays.sort(a);
		 //for (String x : a)
		 //System.out.println(x+" ");
		 
		
	}
	
	public static boolean breakingNumberToDigit(int maxNum)
	{
		
        int num = maxNum/10;
        int numLastDigit = maxNum % 10;
		while(num > 0)
		 {
			 int numSecondLastDigit = num%10;
			 num = num /10;
		 
			 if ((numLastDigit - numSecondLastDigit) == 1 || (numLastDigit - numSecondLastDigit) == -1)
			   {
				 numLastDigit = numSecondLastDigit;
			   }
			 else
				 return false;
		 }
		return true;
	}
	public static void main(String[] args) {
		jumpingNumbers(100000);
	}

}
