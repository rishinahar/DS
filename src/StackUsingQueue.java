
public class StackUsingQueue {
	static int front =-1;
	static int rear =-1;
	static int queue[] = new int[10];
	public static void main (String a[]) 
	{
		enqueue(3);
		enqueue(9);
		enqueue(4);
		enqueue(7);
		enqueue(8);
		pop();
		pop();
        int temp = front;
        while(temp<=rear)
	        {
			   System.out.println(queue[temp]);
			   temp++;
	        }
	}
	
	public static void enqueue(int temp)
		{
		   if (front==9)
		   {
			   System.out.println("Queue is full");
			   return;
		   }
		   else if (front == -1)
			   
		   {
			   front++;
			   rear++;
		       queue[front] = temp;
		   } 
		   else 
			   rear++;
		       queue[rear] = temp;
		} 
	public static void dequeue()
		{
		  if (front == -1 && rear ==-1) 
			  {
			   System.out.println("Queue is empty");
                return;
			  }
		  else
			  front++;
		} 
	public static void pop()
		{
			if (front == -1 && rear ==-1) 
			  {
				   System.out.println("Queue is empty");
	             return;
			  }
			else 
				{
					int temp = front;
					front =rear;
					rear = temp;
					dequeue();
					
					 temp = front;
					front =rear;
					rear = temp;
				}
		} 
}
