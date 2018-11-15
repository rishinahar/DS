import static org.junit.Assert.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class testMergeSort {

	 private int[] numbers;
	  private final static int SIZE = 7;
	  private final static int MAX = 20;

	  @Before
	  public void setUp() throws Exception {
	    numbers = new int[SIZE];
	    Random generator = new Random();
	    for (int i = 0; i < numbers.length; i++) {
	      numbers[i] = generator.nextInt(MAX);
	    }
	  }
	  

	  @Test
	  public void testMergeSort() {
	    long startTime = System.currentTimeMillis();

	    arrayMergeSort sorter = new arrayMergeSort();
	    sorter.sort(numbers);

	    long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println("Mergesort " + elapsedTime);

	    for (int i = 0; i < numbers.length - 1; i++) {
	      if (numbers[i] > numbers[i + 1]) {
	        fail("Should not happen");
	      }
	    }
	    assertTrue(true);

	  }

	  @Test
	  public void itWorksRepeatably() {
	    for (int i = 0; i < 200; i++) {
	      numbers = new int[SIZE];
	      Random generator = new Random();
	      for (int a = 0; a < numbers.length; a++) {
	        numbers[a] = generator.nextInt(MAX);
	      }
	      arrayMergeSort sorter = new arrayMergeSort();
	      sorter.sort(numbers);
	      for (int j = 0; j < numbers.length - 1; j++) {
	        if (numbers[j] > numbers[j + 1]) {
	          fail("Should not happen");
	        }
	      }
	      assertTrue(true);
	    }
	  }

	  @Test
	  public void testStandardSort() {
	    long startTime = System.currentTimeMillis();
	    Arrays.sort(numbers);
	    long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println("Standard Java sort " + elapsedTime);

	    for (int i = 0; i < numbers.length - 1; i++) {
	      if (numbers[i] > numbers[i + 1]) {
	        fail("Should not happen");
	      }
	    }
	    assertTrue(true);
	  }


}
