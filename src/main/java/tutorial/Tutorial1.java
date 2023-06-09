package main.java.tutorial;
import java.util.*;
public class Tutorial1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the number rows: ");
		int rows=sc.nextInt();
		for(i=1 ;i<=rows;i++) {
			for(j=1;j<i;j++) {
				System.out.println("");
			}
			for(n=i;n<=rows;n++) {
				System.out.println(n+"");
			}
			System.out.println("");
		}
		for(i=rows-1;i>=1;i--) {
			for(j=1;j<i;j++) {
				System.out.println("");
			}
			for(n=i;n<=rows;n++) {
				System.out.println(n+"");
			}
			System.out.println();
		}

	}

}
