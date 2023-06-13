package main.java.tutorial;

import java.util.Scanner;

public class Tutorial2a {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.print("Input number = ");

		int i = input.nextInt();
		if( i<0) {
			System.out.println("Number is negative");
		}
		else if(i>0) {
			System.out.println("Number is positive");
		}
		else{
			System.out.println("Number is zero");
		}
		input.close();
	}

}
