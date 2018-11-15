package Array;

import java.util.Scanner;

public class TransPoseAnArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int i, j;
		System.out.println("Enter total rows and columns: ");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int column = s.nextInt();
		int array[][] = new int[row][column];
		System.out.println("Enter matrix:");
	 	for(i = 0; i < row; i++)
	  	{
	   	    for(j = 0; j < column; j++) 
	     	    {
	        	array[i][j] = s.nextInt();
	        	System.out.print(" ");
	            }
	  	}
		System.out.println("The above matrix before Transpose is ");
	  	for(i = 0; i < row; i++)
	    	{
	      	    for(j = 0; j < column; j++)
	            {
	          	System.out.print(array[i][j]+" ");
	            }
	            System.out.println(" ");
	        }
	 	System.out.println("The above matrix after Transpose is ");
	  	for(i = column-1; i >=0; i--)
	    	{
	      	    for(j = 0; j < row; j++)
	            {
	                System.out.print(array[j][i]+" ");
	            }
	            System.out.println(" ");
	        }
	    }
	}

