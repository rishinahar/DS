package Array;

import java.util.Arrays;

public class SortTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Sorting 2d array based on the string name !! Watch the same strings are sorted on the basis of second value
		String[][] array= {
				{"Arun", "5"},
				{"Sahil", "1.55"},
				{"Sahil", "-0.5"},
				{"Sachin", "0.6"},
				{"Rishi", "500.9"},
				{"Rishi", "500.6"},
				{"Sachin", "0.85"} };

				java.util.Arrays.sort(array, new java.util.Comparator<String[]>() {
					@Override
					public int compare(String[] a, String[] b) {
						// TODO Auto-generated method stub
						
						if (a[0].compareToIgnoreCase(b[0]) == 0)
						{
							return a[1].compareTo(b[1]);
						}
						return a[0].compareToIgnoreCase(b[0]);
					}
				});
				
				for (final String[] arr : array) {
			        System.out.println(Arrays.toString(arr));
			    }
				System.out.println("||=========||");
		//  Sorting 2d array double type 		
				double[][] array1= {
						{1, 5},
						{13, 1.55},
						{12, 100.6},
						{12.1, .85} };

						java.util.Arrays.sort(array1, new java.util.Comparator<double[]>() {
						    public int compare(double[] a, double[] b) {
						        return Double.compare(a[0], b[0]);
						    }
						});
						
						for (final double[] arr : array1) {
					        System.out.println(Arrays.toString(arr));
					    }	
	}

}
