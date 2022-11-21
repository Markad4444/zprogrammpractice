package programsonnumber;

import java.util.Scanner;

public class Tocheckoddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a no");
		int num= sc.nextInt();
		if(num%2==0)
		{
		 System.out.println(num + " is an even no");	
		}
		else
		{
		System.out.println(num+ "  is odd no");	
		}
	}

}
