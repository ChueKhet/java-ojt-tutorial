package main.java.tutorial;
import java.util.*;
public class Tutorial1 {
	public static void main(String[]args) {
		int n,i,j;
		int maxnum=7;
		for(i=1 ;i<=maxnum;i++) {
			for(j=1;j<i;j++) {
				System.out.println("");
			}
			for(n=i;n<=maxnum;n++) {
				System.out.println(n+"");
			}
			System.out.println("");
		}
		for(i=maxnum-1;i>=1;i--) {
			for(j=1;j<i;j++) {
				System.out.println("");
			}
			for(n=i;n<=maxnum;n++) {
				System.out.println(n+"");
			}
			System.out.println();
		}

	}

}
