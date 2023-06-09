package main.java.tutorial;
import java.util.*;
public class Tutorial2c {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the year : ");
		int i; 
		i = input.nextInt();
		if(i%4==0){
		System.out.println(i +" is leap Year");
		}
		else if(i%100==0){
			System.out.println(i +" is leap Year");
			}
		else if(i%400==0){
			System.out.println(i +" is leap Year");
			}
		else{
			System.out.println(i+" is not leap Year");
		}
		input.close();
	}



}
