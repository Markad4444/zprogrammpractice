package programepractice;

import java.util.Scanner;

public class Armstrong3digit {
public static void main(String[] args) {
	
	checkarmstrong();
	checkarmstrong1();
}
public static void checkarmstrong1()
{
	Scanner scan = new Scanner(System.in);

	int number = scan.nextInt();
	int k = number;

	int power = (String.valueOf(number)).length();

	int Amst=0;
	while(k != 0)
	{
		int b = k%10;
		 Amst = (int) (Amst + Math.pow(b, power));

		k = k/10;
	}


	if(number == Amst)
	{
		System.out.println("This Number is Armstrong Number");
	}
	else
	{
		System.out.println("This is not an armstrong number");
	}
}


public static void checkarmstrong()
{

	for(int i=1 ; i<=9; i++)
	{
		for(int j=0 ; j<=9; j++)
		{
			for(int k=0 ; k<=9; k++)
			{
				int no =  (i*100 + j*10 +k);
				int isarmsrtong =  (i*i*i)+(j*j*j)+(k*k*k);
				if(no == isarmsrtong)
				{
					System.out.println(no +"is armstrong number");
				}

			}
			
		}

	}
	
}
}
