package proarraystring;


public class Reversearray {

	public static void main(String[] args) {
int sum=0;
for(int i=1;i<=5;i++)
{
	if(i==3)
	{
		sum=sum+i;
		continue;
	}
	
}
System.out.println(sum+"using continue");
int sum1=0;

for(int i=1;i<=5;i++)
{
	if(i==3)
	{
		sum1=sum1+i;
		break;
	}
	
}
System.out.println(sum1+"using break");
	}


}