package programsonnumber;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner sc = new Scanner(System.in);
//int num = sc.nextInt();
int num1=100;
int count=0;
System.out.println("enter a number");
for(int i =1;i<=num1;i++)
{
	if(num1%i==0)
	{
		count++;
		//break;
	}
}
if(count==2)
{
	System.out.println("given no is a prime");
	} else
	{
		System.out.println("given no is not a prime");

	}
//sc.close();
	}

}
