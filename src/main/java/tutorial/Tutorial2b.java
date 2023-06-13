package main.java.tutorial;
import java.util.Scanner;

public class Tutorial2b {
	public static void main(String[] args) {
		int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the 1st number:");
        x = sc.nextInt();
        System.out.print("Input the 2nd number:");
        y = sc.nextInt();
        System.out.print("Input the 3rd number:");
        z = sc.nextInt();
        if(x > y && x > z)
        {
            System.out.println("The greatest is:"+x);
        }
        else if(y > z)
        {
            System.out.println("The greatest is:"+y);
        }
        else
        {
            System.out.println("The greatest is:"+z);
        }
        sc.close();
	}

}
