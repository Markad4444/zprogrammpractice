package programsonnumber;

public class Armstrongno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arm =153;
		int sum=0;
		for(int i= arm; i>=1;i=i/10)
		{
			int rem=i%10;
			sum=sum+ rem*rem*rem;
		}
System.out.println(sum);
if(arm==sum) {
	System.out.println(arm+" is armstrong no");
	}else
	{
		System.out.println(arm+" is not an armstrong no");
	}
	}
}
