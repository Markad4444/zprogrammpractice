package programepractice;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter value");
		int a= sc.nextInt();
		//int a=47;
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{ System.out.println("it is a prime number");
		}
		else
		{
			{ System.out.println("it is not a prime number");

		}
	}
	}

}
