package Array;

import java.util.Random;

public class RandomSongsAudioPlayer {
    
	public static void randomSongPlayer (int[] songsIndexes)
	{  
		// set pivot to last index 
		int pivot = songsIndexes.length-1;
		
		Random rand = new Random();
		
		
		while (pivot >0){
			int  n = rand.nextInt(pivot);
			if (n <= pivot)
			 {
				swap(songsIndexes, pivot, n);
				System.out.print(songsIndexes[pivot]+" ");
				pivot--;
			 }

		}
		System.out.print(songsIndexes[pivot]);
	}
	
	public static void swap(int[] songsIndexes, int a , int b)
	{
		int temp = songsIndexes[a];
		songsIndexes[a]= songsIndexes[b];
		songsIndexes[b]= temp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int[] songsIndexes = new int[10];
		
		for (int i=0;i<songsIndexes.length;i++)
			songsIndexes[i] = rand.nextInt(100);
		
		for (int x : songsIndexes)
			System.out.print(x+" ");
		
		System.out.println("\n\nThe random sequences of the array elements is \n ");
		randomSongPlayer(songsIndexes);

	}

}
