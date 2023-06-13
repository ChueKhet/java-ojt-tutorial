package main.java.tutorial;
import java.util.*;
public class Tutorial4b {
	public static void main(String a[])
    {
 
        ArrayList<String> ArrList = new ArrayList<String>();
        ArrList.add("Red");
        ArrList.add("Green");
        ArrList.add("Black");
        ArrList.add("White");
        ArrList.add("Pink");
 
        System.out.println("Before Swap the ArrayList :"+ ArrList);	 
        // Swapping the elements at 1 and 2 indices
        Collections.swap(ArrList, 0, 2);
 
        // display Array List after swap
        System.out.println("After Swap the ArrayList :"+ArrList);
    }

}
