package programsonnumber;

public class LCFofnumber {
public static void main(String[] args) {
	int a=12;
	int b=16;
	if(a>b)
	{
		for(int i=a; i<=a*b; i++)
		{
			if(i%a==0 && i%b==0)
			{
				System.out.println("LCF is "+i);
				break;
			}
		}
	}
		else
		{
			for(int j=b; j<=a*b; j++)
			{
				if(j%a==0 && j%b==0)
				{
					System.out.println("LCM is"+j);
					break;
				}
			}
		}
	if(a>b) 
	{
		for(int i=a;i>1;i--)
		{
			if(a%i==0 && b%i==0)
			{
				System.out.println("HCF is "+i);
				break;
			}
		}
	}
	else
	{
		for(int j=b; j>1;j--)
		{
			if(a%j==0 && b%j==0)
			{
				System.out.println("HCF is"+j);
				break;
			}
		}
	}
	}
}

