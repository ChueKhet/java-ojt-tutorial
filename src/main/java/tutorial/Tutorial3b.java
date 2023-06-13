package main.java.tutorial;

import java.util.ArrayList;

public class Tutorial3b {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(34);	
		array.add(23);		   
		array.add(89);		   
		array.add(25);		   
		array.add(68);		   
		System.out.println("Original Array : "+ array);
		   
		  
		array.remove(3)	;	
		    
		System.out.println("After Remove element: "+array);
	}

}
