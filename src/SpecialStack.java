

//* Solution fails if min elements have repeat entry in array
public class SpecialStack {
	static int top =-1;
	static int a[] =new int[10]; 
	static int minarray[] = new int[10];
	static int topmin =-1;
	public static void main (String a[]) 
		{
			push(1);
			push(2);
			push(0);
			push(4);
			System.out.println("The min of stack "+minNum());
			pop();
			System.out.println("The min of stack "+minNum());
			pop();
			System.out.println("The min of stack "+minNum());
			pop();
			System.out.println("The min of stack "+minNum());
			push(-1);
			System.out.println("The min of stack "+minNum());
		}

	public static void push (int num)
		 {
			top++;
			a[top] = num;
			
			if (topmin ==-1)
			{
				topmin++;
				minarray[topmin] =num;
			    return;
			}
			if (num < minarray[topmin] && topmin !=-1)
			 {
				topmin++;
				minarray[topmin] =num;
			 }
			
		 }
	public static void pop ()
	 {
		if (minarray[topmin]== a[top])
		{
			top--;
			topmin--;
		}	
		else
			top--;
	 }
	public static int minNum ()
	 {
		return  minarray[topmin];
	 }
}
