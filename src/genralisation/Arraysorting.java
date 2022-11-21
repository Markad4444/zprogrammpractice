package genralisation;

import java.util.Arrays;

public class Arraysorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[]= {30,40,50,10,20};
		 System.out.println("before sorting");
		 for(int i=0;i<5;i++)
		 {
			 System.out.println(Arrays.toString(ar));
			 System.out.println(ar[i]);
		 }
		 // array ascending order inbuid class of array-- static method 
		 //sort function-- pass object name to sort function
		 Arrays.sort(ar);
		 System.out.println("after sorting");
		 for(int i=0;i<5;i++)
		 {
			 System.out.println(ar[i]);
		 }
		 
	}

}
