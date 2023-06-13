package main.java.tutorial;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Tutorial6 {
		public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.print("Enter your password: ");
	    	String password = scanner.nextLine();
	    	
	        if (isStrongPassword(password)) {
	            System.out.println("The password is strong.");
	        } else {
	            System.out.println("The password is weak");
	        }
	        scanner.close();
	    }

	    public static boolean isStrongPassword(String password) {
	        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d)(?=.*[@#$%^&+=]).{8,}$";

	 
	        Pattern regex = Pattern.compile(pattern);

	        Matcher matcher = regex.matcher(password);
	        
	        return matcher.matches();
	    }
}
