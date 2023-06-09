package main.java.tutorial;

public class Tutorial3a {
	public static void main(String[] args) {   
		 
	       int[] num = {3,4,5,7,9};
	       int sum = 0;
	       for(int i=0; i < num.length ; i++)
	        sum = sum + num[i];
	       double average = sum / num.length;
	        System.out.println("Average array elements is : " + average); 
	   }

}
