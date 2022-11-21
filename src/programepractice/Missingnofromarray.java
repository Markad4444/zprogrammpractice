package programepractice;

public class Missingnofromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {-1,0,1,2,3,4,5,7,8,9};
int sum=0;
for(int i=0;i<a.length;i++)
{
	sum=sum+ a[i];
}
System.out.println(sum);

int sum1=0;
for(int j=-1;j<=9;j++)
{
	sum1=sum1+j;
}
System.out.println(sum1);
System.out.println("missing no is :" + (sum1-sum));
String c[]= {"java","ruby","c","c++","c","java"};
for(int i=0;i<c.length;i++)
{ for(int j=i+1; j<c.length;j++)
{
if(c[i].equals(c[j]))
{
System.out.println("dublicate names:"+c[i]);	
}
}
	//using hash set
}
}
	}


