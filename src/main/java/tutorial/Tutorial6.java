package main.java.tutorial;
import java.util.*;
public class Tutorial6 {
	public static void main(String[] args) {
		int passLength = 8;
		int upperchar = 0;
		int lowerchar = 0;
		int digits = 0;
		
		char character;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password :");
		String pass = sc.nextLine();
		
		int total = pass.length();
		if(total<passLength) {
			System.out.println("The password is invalid");
			return;
		}else {
			for(int i=0;i<total;i++) {
				character = pass.charAt(i);
				if(Character.isUpperCase(character)) {
					upperchar=1;
				}
				else if(Character.isLowerCase(character)) {
					lowerchar =1;
				}
				else if(Character.isDigit(character)) {
					digits=1;
				}
			}
		}if(upperchar==1 && lowerchar==1 & digits==1) {
			System.out.println("Password is Strong");
		}else {
			System.out.println("Password is Not Strong");
		}
	}
}
