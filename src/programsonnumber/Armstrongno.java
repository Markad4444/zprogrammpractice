package programsonnumber;

public class Armstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Amsnm =153;
int sum=0;
for(int i=0;i<3;i++)
{
	sum=sum+(Amsnm%10)*(Amsnm%10)*(Amsnm%10);
	Amsnm=Amsnm/10;
}
System.out.println(sum);
if(153==sum)
{
System.out.println(Amsnm + " is armstrong no");	
}else
{
	System.out.println(Amsnm + " is not armstrong no");	

}

	}

}
