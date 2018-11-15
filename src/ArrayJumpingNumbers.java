
public class ArrayJumpingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max =50;
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
		}
	}

}
