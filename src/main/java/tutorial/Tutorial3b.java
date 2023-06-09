package main.java.tutorial;

import java.util.Arrays;

public class Tutorial3b {
	public static void main(String[] args) {
		   int[] array = {25, 14, 56, 15, 36};
		   
		   System.out.println("Original Array : "+Arrays.toString(array));     
		   
		  
		   int remove = 0;

		   for(int i = remove; i < array.length -1; i++){
		        array[i] = array[i + 1];
		      }
		
		    System.out.println("After Remove element: "+Arrays.toString(array));
		 }

}
