
// Youtube video expalined here https://www.youtube.com/watch?v=-7pzsM6gxgY
public class QuickSort {
    
	public static int partition(int a[] ,int low , int high)
	{
		int i = low-1;
		int pivot = a[high];
		for (int j=low;j<=high-1;j++)
		{
			if (a[j] <= pivot)
			{
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		int temp = a[high];
		a[high]  = a[i+1];
		a[i+1]     = temp;
		
		return i+1;
	}
	
	public static void quickSort(int a[] ,int low ,int high)
	{
		if (low<high)
		{
			int pi = partition(a,low , high);
			
			quickSort(a,low ,pi-1);
			quickSort(a,pi+1,high);
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[] = {4,7,2,8,6,1,5};
      
      int n = a.length-1;
      
      quickSort(a ,0, n);
      
      for (int i=0; i<a.length; ++i)
          System.out.print(a[i]+" ");
      System.out.println();
      
	}

}
