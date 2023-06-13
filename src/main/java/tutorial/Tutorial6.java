package main.java.tutorial;
import java.util.*;
public class Tutorial6 {

	public static void Strongpw(String input)
    {
        int n = input.length();
        boolean lowerChar = false,
        		upperChar = false,
                digit = false,
                specialChar = false;
        Set<Character> set = new HashSet<Character>(
            Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                          '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
            	lowerChar = true;
            if (Character.isUpperCase(i))
            	upperChar = true;
            if (Character.isDigit(i))
                digit = true;
            if (set.contains(i))
                specialChar = true;
        }
       
        // Strength of password
        System.out.print("Strength of password:- ");
        if (digit && lowerChar && upperChar && specialChar && (n >= 8))
            System.out.print(" Strong");
        else if ((lowerChar || upperChar || specialChar) && (n >= 6))
            System.out.print(" Moderate");
        else
            System.out.print(" Weak");
    }
 
    public static void main(String[] args)
    {
        //String input = "Apple@135";
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter password :");
    	String input = sc.nextLine();
        Strongpw(input);
        sc.close();
    }
 
}
