package Array;


public class FindingTheNonRepetativeNumbers {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {1,6,7,2,6,3,1,7};
			
			int result =arr[0];
			int result1 =0;
			
			//result = 1^11;
			for (int i =1;i<arr.length;i++)
			{
				result = result ^ arr[i];
			}
			
			/*for (int i=0;i<arr.length-1;i++)
			{   
				if (result1<0)
				   result1+= arr[i]+arr[i+1];
				else
					result1+= arr[i]-arr[i+1];
					
			}*/
			
			System.out.println(result+" ,"+ result1);
			int num1 = (result +result1)/2;
			int num2 = result -num1;
			
			System.out.println("The two numbers are " + num1 +","+num2);
	}

}
